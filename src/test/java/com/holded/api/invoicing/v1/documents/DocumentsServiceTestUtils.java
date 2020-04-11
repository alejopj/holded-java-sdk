package com.holded.api.invoicing.v1.documents;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.holded.api.TestDataGenerator;
import com.holded.api.common.entities.CustomField;
import com.holded.api.common.entities.PaymentMethod;
import com.holded.api.invoicing.v1.documents.entities.AttachFileToDocumentFormData;
import com.holded.api.invoicing.v1.documents.entities.CreateDocumentBodyParams;
import com.holded.api.invoicing.v1.documents.entities.CreateDocumentItem;
import com.holded.api.invoicing.v1.documents.entities.DocumentType;
import com.holded.api.invoicing.v1.documents.entities.SalesOrderShippedItem;
import com.holded.api.invoicing.v1.documents.entities.SendDocumentBodyParams;
import com.holded.api.invoicing.v1.documents.entities.ShipItemsByLineBodyParams;
import com.holded.api.invoicing.v1.documents.entities.UpdateDocumentBodyParams;
import com.holded.api.invoicing.v1.documents.entities.UpdateDocumentItem;

public class DocumentsServiceTestUtils {
	
	private static Integer SHORT_LIST_SIZE = 5;
	private static Integer MEDIUM_LIST_SIZE = 10;
	private static Integer MAX_UNITS = 10;

	public static CreateDocumentBodyParams getCreateDocumentBodyParams(DocumentType documentType) {
		switch (documentType) {
		case CREDIT_NOTE:
			return null;
		case ESTIMATE:
			return null;
		case INVOICE:
			return null;
		case PROFORM:
			return null;
		case PURCHASE:
			return null;
		case PURCHASE_ORDER:
			return null;
		case PURCHASE_REFUND:
			return null;
		case SALES_ORDER:
			return getSalesOrderCreateDocumentBodyParams();
		case SALES_RECEIPT:
			return null;
		case WAYBILL:
			return null;
		default:
			return null;
		}
	}
	
	public static UpdateDocumentBodyParams getUpdateDocumentBodyParams(DocumentType documentType) {
		switch (documentType) {
		case CREDIT_NOTE:
			return null;
		case ESTIMATE:
			return null;
		case INVOICE:
			return null;
		case PROFORM:
			return null;
		case PURCHASE:
			return null;
		case PURCHASE_ORDER:
			return null;
		case PURCHASE_REFUND:
			return null;
		case SALES_ORDER:
			return getSalesOrderUpdateDocumentBodyParams();
		case SALES_RECEIPT:
			return null;
		case WAYBILL:
			return null;
		default:
			return null;
		}
	}
	
	public static SendDocumentBodyParams getSendDocumentBodyParams(String documentId) {
		String mailTemplateId = TestDataGenerator.getAlphaNumericId();
		String emails = TestDataGenerator.getEmail();
		String subject = TestDataGenerator.getEmailSubject();
		String message = TestDataGenerator.getEmailMessage();
		String docIds = documentId;
		return new SendDocumentBodyParams(mailTemplateId, emails, subject, message, docIds);
	}
	
	public static ShipItemsByLineBodyParams getShipItemsByLineBodyParams(CreateDocumentBodyParams createDocumentBodyParams) {
		List<SalesOrderShippedItem> lines = new ArrayList<>();
		List<CreateDocumentItem> items = createDocumentBodyParams.getItems();
		for (int i = 0; i < items.size(); i++) {
			CreateDocumentItem item = items.get(i);
			lines.add(new SalesOrderShippedItem(i, item.getUnits()));
		}
		return new ShipItemsByLineBodyParams(lines);
	}
	
	public static AttachFileToDocumentFormData getAttachFileToDocumentFormData() {
		File file = TestDataGenerator.getFile();
		Boolean setMain = TestDataGenerator.getBoolean();
		return new AttachFileToDocumentFormData(file, setMain);
	}
	
	// Create document

	private static CreateDocumentBodyParams getSalesOrderCreateDocumentBodyParams() {
		String contactCode = TestDataGenerator.getContactCode();
		String contactName = TestDataGenerator.getContactName();
		String contactEmail = TestDataGenerator.getEmail();
		String contactAddress = TestDataGenerator.getAddress();
		String contactCity = TestDataGenerator.getCity();
		String contactPostalCode = TestDataGenerator.getPostalCode();
		String contactProvince = TestDataGenerator.getProvince();
		String contactCountry = TestDataGenerator.getCountry();
		String contactCountryCode = TestDataGenerator.getCountryCode();
		String description = TestDataGenerator.getShortText();
		Long date = TestDataGenerator.getPastDate();
		String notes = TestDataGenerator.getShortText();
		String salesChannelId = TestDataGenerator.getAlphaNumericId();
		PaymentMethod paymentMethodId = TestDataGenerator.getPaymentMethod();
		String designId = TestDataGenerator.getAlphaNumericId();
		String language = TestDataGenerator.getLanguage();
		List<CreateDocumentItem> items = getCreateDocumentItems();
		List<CustomField> customFields = getCustomFields();
		String invoiceNum = TestDataGenerator.getAlphaNumericId();
		String numSerieId = TestDataGenerator.getAlphaNumericId();
		String currency = TestDataGenerator.getCurrency();
		BigDecimal currencyChange = TestDataGenerator.getCurrencyExchangeRate();
		List<String> tags = getTags();
		Long dueDate = TestDataGenerator.getFutureDate();
		String shippingAddress = TestDataGenerator.getAddress();
		String shippingPostalCode = TestDataGenerator.getPostalCode();
		String shippingCity = TestDataGenerator.getCity();
		String shippingProvince = TestDataGenerator.getProvince();
		String shippingCountry = TestDataGenerator.getCountry();
		BigDecimal salesChannel = TestDataGenerator.getNumber();
		return new CreateDocumentBodyParams(
				contactCode, contactName, contactEmail,
				contactAddress, contactCity, contactPostalCode, contactProvince, contactCountry, contactCountryCode,
				description, date, notes, salesChannelId, paymentMethodId, designId, language, items, customFields,
				invoiceNum, numSerieId, currency, currencyChange, tags, dueDate,
				shippingAddress, shippingPostalCode, shippingCity, shippingProvince, shippingCountry, salesChannel);
	}
	
	// Update document

	private static List<CreateDocumentItem> getCreateDocumentItems() {
		List<CreateDocumentItem> items = new ArrayList<>();
		Integer n = TestDataGenerator.getInteger(MEDIUM_LIST_SIZE) + 1;
		for (int i = 0; i < n; i++) {
			CreateDocumentItem item = getCreateDocumentItem();
			items.add(item);
		}
		return items;
	}
	
	private static CreateDocumentItem getCreateDocumentItem() {
		String name = TestDataGenerator.getProductName();
		String desc = TestDataGenerator.getShortText();
		Integer units = TestDataGenerator.getInteger(MAX_UNITS) + 1;
		String sku = TestDataGenerator.getAlphaNumericId();
		String serviceId = TestDataGenerator.getAlphaNumericId();
		String accountingAccountId = TestDataGenerator.getAlphaNumericId();
		BigDecimal subtotal = TestDataGenerator.getNumber();
		BigDecimal discount = TestDataGenerator.getNumber();
		BigDecimal tax = TestDataGenerator.getNumber();
		BigDecimal retention = TestDataGenerator.getNumber();
		BigDecimal equivalenceSurcharge = TestDataGenerator.getNumber();
		List<String> tags = getTags();
		return new CreateDocumentItem(name, desc, units, sku, serviceId, accountingAccountId, subtotal, discount, tax,
				retention, equivalenceSurcharge, tags);
	}

	private static List<String> getTags() {
		List<String> tags = new ArrayList<>();
		Integer n = TestDataGenerator.getInteger(SHORT_LIST_SIZE) + 1;
		for (int i = 0; i < n; i++) {
			String tag = TestDataGenerator.getWord();
			tags.add(tag);
		}
		return tags;
	}
	
	private static List<CustomField> getCustomFields() {
		List<CustomField> customFields = new ArrayList<>();
		Integer n = TestDataGenerator.getInteger(SHORT_LIST_SIZE) + 1;
		for (int i = 0; i < n; i++) {
			CustomField customField = getCustomField();
			customFields.add(customField);
		}
		return customFields;
	}

	private static CustomField getCustomField() {
		String field = TestDataGenerator.getWord();
		String value = String.valueOf(TestDataGenerator.getInteger(MAX_UNITS) + 1);
		return new CustomField(field, value);
	}

	private static UpdateDocumentBodyParams getSalesOrderUpdateDocumentBodyParams() {
		String desc = TestDataGenerator.getShortText();
		String notes = TestDataGenerator.getShortText();
		String language = TestDataGenerator.getLanguage();
		Long date = TestDataGenerator.getPastDate();
		List<UpdateDocumentItem> items = getUpdateDocumentItems();
		String salesChannelId = TestDataGenerator.getAlphaNumericId();
		String expAccountId = TestDataGenerator.getAlphaNumericId();
		List<CustomField> customFields = getCustomFields();
		return new UpdateDocumentBodyParams(desc, notes, language, date, items, salesChannelId, expAccountId, customFields);
	}

	private static List<UpdateDocumentItem> getUpdateDocumentItems() {
		List<UpdateDocumentItem> items = new ArrayList<>();
		Integer n = TestDataGenerator.getInteger(SHORT_LIST_SIZE) + 1;
		for (int i = 0; i < n; i++) {
			UpdateDocumentItem item = getUpdateDocumentItem();
			items.add(item);
		}
		return items;
	}

	private static UpdateDocumentItem getUpdateDocumentItem() {
		String name = TestDataGenerator.getProductName();
		String desc = TestDataGenerator.getShortText();
		BigDecimal subtotal = TestDataGenerator.getNumber();
		BigDecimal tax = TestDataGenerator.getNumber();
		List<String> tags = getTags();
		Integer units = TestDataGenerator.getInteger(MAX_UNITS) + 1;
		BigDecimal discount = TestDataGenerator.getNumber();
		String kind = TestDataGenerator.getWord();
		String sku = TestDataGenerator.getAlphaNumericId();
		String lotSku = TestDataGenerator.getAlphaNumericId();
		return new UpdateDocumentItem(name, desc, subtotal, tax, tags, units, discount, kind, sku, lotSku); 
	}
}
