package com.holded.api.invoicing.v1.documents;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.holded.api.common.CommonTestUtils;
import com.holded.api.common.TestDataGenerator;
import com.holded.api.common.entities.CustomField;
import com.holded.api.common.entities.Language;
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
		Integer date = TestDataGenerator.getPastDateAsInteger();
		String notes = TestDataGenerator.getShortText();
		String salesChannelId = TestDataGenerator.getAlphaNumericId();
		PaymentMethod paymentMethodId = TestDataGenerator.getPaymentMethod();
		String designId = TestDataGenerator.getAlphaNumericId();
		Language language = TestDataGenerator.getLanguage();
		List<CreateDocumentItem> items = getCreateDocumentItems();
		List<CustomField> customFields = CommonTestUtils.getCustomFields();
		String invoiceNum = TestDataGenerator.getAlphaNumericId();
		String numSerieId = TestDataGenerator.getAlphaNumericId();
		String currency = TestDataGenerator.getCurrency();
		Float currencyChange = TestDataGenerator.getCurrencyExchangeRate();
		List<String> tags = CommonTestUtils.getTags();
		Integer dueDate = TestDataGenerator.getFutureDateAsInteger();
		String shippingAddress = TestDataGenerator.getAddress();
		String shippingPostalCode = TestDataGenerator.getPostalCode();
		String shippingCity = TestDataGenerator.getCity();
		String shippingProvince = TestDataGenerator.getProvince();
		String shippingCountry = TestDataGenerator.getCountry();
		Float salesChannel = TestDataGenerator.getFloat();
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
		Integer n = TestDataGenerator.getInteger(CommonTestUtils.MEDIUM_LIST_SIZE) + 1;
		for (int i = 0; i < n; i++) {
			CreateDocumentItem item = getCreateDocumentItem();
			items.add(item);
		}
		return items;
	}
	
	private static CreateDocumentItem getCreateDocumentItem() {
		String name = TestDataGenerator.getProductName();
		String desc = TestDataGenerator.getShortText();
		Integer units = TestDataGenerator.getInteger(CommonTestUtils.MAX_UNITS) + 1;
		String sku = TestDataGenerator.getAlphaNumericId();
		String serviceId = TestDataGenerator.getAlphaNumericId();
		String accountingAccountId = TestDataGenerator.getAlphaNumericId();
		Float subtotal = TestDataGenerator.getFloat();
		Float discount = TestDataGenerator.getFloat();
		Integer tax = TestDataGenerator.getPercentage();
		Float retention = TestDataGenerator.getFloat();
		Float equivalenceSurcharge = TestDataGenerator.getFloat();
		List<String> tags = CommonTestUtils.getTags();
		return new CreateDocumentItem(name, desc, units, sku, serviceId, accountingAccountId, subtotal, discount, tax,
				retention, equivalenceSurcharge, tags);
	}

	private static UpdateDocumentBodyParams getSalesOrderUpdateDocumentBodyParams() {
		String desc = TestDataGenerator.getShortText();
		String notes = TestDataGenerator.getShortText();
		Language language = TestDataGenerator.getLanguage();
		Long date = TestDataGenerator.getPastDate();
		List<UpdateDocumentItem> items = getUpdateDocumentItems();
		String salesChannelId = TestDataGenerator.getAlphaNumericId();
		String expAccountId = TestDataGenerator.getAlphaNumericId();
		List<CustomField> customFields = CommonTestUtils.getCustomFields();
		return new UpdateDocumentBodyParams(desc, notes, language, date, items, salesChannelId, expAccountId, customFields);
	}

	private static List<UpdateDocumentItem> getUpdateDocumentItems() {
		List<UpdateDocumentItem> items = new ArrayList<>();
		Integer n = TestDataGenerator.getInteger(CommonTestUtils.SHORT_LIST_SIZE) + 1;
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
		List<String> tags = CommonTestUtils.getTags();
		Integer units = TestDataGenerator.getInteger(CommonTestUtils.MAX_UNITS) + 1;
		BigDecimal discount = TestDataGenerator.getNumber();
		String kind = TestDataGenerator.getWord();
		String sku = TestDataGenerator.getAlphaNumericId();
		String lotSku = TestDataGenerator.getAlphaNumericId();
		return new UpdateDocumentItem(name, desc, subtotal, tax, tags, units, discount, kind, sku, lotSku); 
	}
}
