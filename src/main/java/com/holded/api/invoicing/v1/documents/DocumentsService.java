package com.holded.api.invoicing.v1.documents;

import java.util.List;

import com.holded.api.invoicing.v1.documents.entities.AttachFileToDocumentFormData;
import com.holded.api.invoicing.v1.documents.entities.AttachFileToDocumentResponse;
import com.holded.api.invoicing.v1.documents.entities.CreateDocumentBodyParams;
import com.holded.api.invoicing.v1.documents.entities.CreateDocumentResponse;
import com.holded.api.invoicing.v1.documents.entities.DeleteDocumentResponse;
import com.holded.api.invoicing.v1.documents.entities.Document;
import com.holded.api.invoicing.v1.documents.entities.DocumentType;
import com.holded.api.invoicing.v1.documents.entities.GetDocumentPdfResponse;
import com.holded.api.invoicing.v1.documents.entities.ListDocumentsQueryParams;
import com.holded.api.invoicing.v1.documents.entities.PayDocumentBodyParams;
import com.holded.api.invoicing.v1.documents.entities.PayDocumentResponse;
import com.holded.api.invoicing.v1.documents.entities.SendDocumentBodyParams;
import com.holded.api.invoicing.v1.documents.entities.SendDocumentResponse;
import com.holded.api.invoicing.v1.documents.entities.ShipAllItemsResponse;
import com.holded.api.invoicing.v1.documents.entities.ShipItemsByLineBodyParams;
import com.holded.api.invoicing.v1.documents.entities.ShipItemsByLineResponse;
import com.holded.api.invoicing.v1.documents.entities.UpdateDocumentBodyParams;
import com.holded.api.invoicing.v1.documents.entities.UpdateDocumentResponse;

/**
 * Manage your sales and purchases in detail.
 * Control the entire process from a budget or order to the invoice and its collection as well as your orders to
 * supplier, receipts of goods or services and their corresponding invoice and payment.
 * Access the information of each contact visually and easily and manage your administration easily and intuitively.
 * @see https://developers.holded.com/reference#documents
 * @version v1
 */
public interface DocumentsService {

	/**
	 * Get all your documents by type.
	 * @param docType Required. docType should be one of: {invoice, salesreceipt, creditnote, salesorder, proform,
	 * waybill, estimate, purchase, purchaseorder or purchaserefund}.
	 * @param queryParams Query parameters.
	 * @return Documents.
	 */
	List<Document> listDocuments(DocumentType docType, ListDocumentsQueryParams queryParams);
	
	/**
	 * Create a new document type.
	 * @param docType Required. docType should be one of: {invoice, salesreceipt, creditnote, salesorder, proform,
	 * waybill, estimate, purchase, purchaseorder or purchaserefund}.
	 * @param bodyParams Body parameters.
	 * @return Response.
	 */
	CreateDocumentResponse createDocument(DocumentType docType, CreateDocumentBodyParams bodyParams);
	
	/**
	 * Get a specific document.
	 * @param docType Required. Document type.
	 * @param documentId Required. Document id.
	 * @return Document.
	 */
	Document getDocument(DocumentType docType, String documentId);
	
	/**
	 * Update a specific document. {lotSku} field is only needed when {kind} is lots.
	 * @param docType Required. Document type.
	 * @param documentId Required. Document id.
	 * @param bodyParams Body parameters.
	 * @return Response.
	 */
	UpdateDocumentResponse updateDocument(DocumentType docType, String documentId, UpdateDocumentBodyParams bodyParams);
	
	/**
	 * Delete specific document type.
	 * @param docType Required. Document type.
	 * @param documentId Required. Document id.
	 * @return Response.
	 */
	DeleteDocumentResponse deleteDocument(DocumentType docType, String documentId);
	
	/**
	 * Pay one specific document.
	 * @param docType Required. Document type.
	 * @param documentId Required. Document id.
	 * @param bodyParams Body parameters.
	 * @return Response.
	 */
	PayDocumentResponse payDocument(DocumentType docType, String documentId, PayDocumentBodyParams bodyParams);
	
	/**
	 * Send a specific document by email.
	 * @param docType Required. Document type.
	 * @param documentId Required. Document id.
	 * @param bodyParams Body parameters.
	 * @return Response.
	 */
	SendDocumentResponse sendDocument(DocumentType docType, String documentId, SendDocumentBodyParams bodyParams);
	
	/**
	 * Get a specific document pdf.
	 * @param docType Required. Document type.
	 * @param documentId Required. Document id.
	 * @return Response.
	 */
	GetDocumentPdfResponse getDocumentPdf(DocumentType docType, String documentId);
	
	/**
	 * Ship all the items of a specific sales order.
	 * @param documentId Required. Document id.
	 * @return Response.
	 */
	ShipAllItemsResponse shipAllItems(String documentId);
	
	/**
	 * Ship a specific item of a specific sales order (itemLinePosition starts at 0).
	 * @param documentId Required. Document id.
	 * @param bodyParams Body parameters.
	 * @return Response.
	 */
	ShipItemsByLineResponse shipItemsByLine(String documentId, ShipItemsByLineBodyParams bodyParams);
	
	/**
	 * Attach file to a specific document.
	 * @param docType Required. Document type.
	 * @param documentId Required. Document id.
	 * @param formData Form data.
	 * @return Response.
	 */
	AttachFileToDocumentResponse attachFileToDocument(DocumentType docType, String documentId, AttachFileToDocumentFormData formData);
}
