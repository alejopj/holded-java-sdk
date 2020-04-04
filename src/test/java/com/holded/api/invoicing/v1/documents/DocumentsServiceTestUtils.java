package com.holded.api.invoicing.v1.documents;

import java.io.File;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.holded.api.invoicing.v1.documents.entities.AttachFileToDocumentFormData;
import com.holded.api.invoicing.v1.documents.entities.CreateDocumentBodyParams;
import com.holded.api.invoicing.v1.documents.entities.CreateDocumentItem;
import com.holded.api.invoicing.v1.documents.entities.DocumentCustomField;
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
	
	// TODO Randomize data.
	public static SendDocumentBodyParams getSendDocumentBodyParams(String documentId) {
		String mailTemplateId = null;
		String emails = null;
		String subject = null;
		String message = null;
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
	
	// TODO Randomize data.
	public static AttachFileToDocumentFormData getAttachFileToDocumentFormData() {
		File file = null;
		Boolean setMain = null;
		return new AttachFileToDocumentFormData(file, setMain);
	}
	
	// Create document

	// TODO Randomize data.
	private static CreateDocumentBodyParams getSalesOrderCreateDocumentBodyParams() {
		String contactCode = null;
		String contactName = null;
		String contactEmail = null;
		String contactAddress = null;
		String contactCity = null;
		String contactPostalCode = null;
		String contactProvince = null;
		String contactCountry = null;
		String contactCountryCode = null;
		String description = null;
		Integer date = null;
		String notes = null;
		String salesChannelId = null;
		String paymentMethodId = null;
		String designId = null;
		String language = null;
		List<CreateDocumentItem> items = new ArrayList<>();
		List<DocumentCustomField> customFields = new ArrayList<>();
		String invoiceNum = null;
		String numSerieId = null;
		String currency = null;
		BigDecimal currencyChange = null;
		List<String> tags = new ArrayList<>();
		LocalDate dueDate = null;
		String shippingAddress = null;
		String shippingPostalCode = null;
		String shippingCity = null;
		String shippingProvince = null;
		String shippingCountry = null;
		Integer salesChannel = null;
		return new CreateDocumentBodyParams(
				contactCode, contactName, contactEmail,
				contactAddress, contactCity, contactPostalCode, contactProvince, contactCountry, contactCountryCode,
				description, date, notes, salesChannelId, paymentMethodId, designId, language, items, customFields,
				invoiceNum, numSerieId, currency, currencyChange, tags, dueDate,
				shippingAddress, shippingPostalCode, shippingCity, shippingProvince, shippingCountry, salesChannel);
	}
	
	// Update document

	// TODO Randomize data.
	private static UpdateDocumentBodyParams getSalesOrderUpdateDocumentBodyParams() {
		String desc = null;
		String notes = null;
		String language = null;
		Integer date = null;
		List<UpdateDocumentItem> items = new ArrayList<>();
		String salesChannelId = null;
		String expAccountId = null;
		List<DocumentCustomField> customFields = new ArrayList<>();
		return new UpdateDocumentBodyParams(desc, notes, language, date, items, salesChannelId, expAccountId, customFields);
	}
}
