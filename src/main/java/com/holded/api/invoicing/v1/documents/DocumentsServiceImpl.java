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

public class DocumentsServiceImpl implements DocumentsService {

	public List<Document> listDocuments(DocumentType docType, ListDocumentsQueryParams queryParams) {
		// TODO Auto-generated method stub
		return null;
	}

	public CreateDocumentResponse createDocument(DocumentType docType, CreateDocumentBodyParams bodyParams) {
		// TODO Auto-generated method stub
		return null;
	}

	public Document getDocument(DocumentType docType, String documentId) {
		// TODO Auto-generated method stub
		return null;
	}

	public UpdateDocumentResponse updateDocument(DocumentType docType, String documentId,
			UpdateDocumentBodyParams bodyParams) {
		// TODO Auto-generated method stub
		return null;
	}

	public DeleteDocumentResponse deleteDocument(DocumentType docType, String documentId) {
		// TODO Auto-generated method stub
		return null;
	}

	public PayDocumentResponse payDocument(DocumentType docType, String documentId, PayDocumentBodyParams bodyParams) {
		// TODO Auto-generated method stub
		return null;
	}

	public SendDocumentResponse sendDocument(DocumentType docType, String documentId,
			SendDocumentBodyParams bodyParams) {
		// TODO Auto-generated method stub
		return null;
	}

	public GetDocumentPdfResponse getDocumentPdf(DocumentType docType, String documentId) {
		// TODO Auto-generated method stub
		return null;
	}

	public ShipAllItemsResponse shipAllItems(String documentId) {
		// TODO Auto-generated method stub
		return null;
	}

	public ShipItemsByLineResponse shipItemsByLine(String documentId, ShipItemsByLineBodyParams bodyParams) {
		// TODO Auto-generated method stub
		return null;
	}

	public AttachFileToDocumentResponse attachFileToDocument(DocumentType docType, String documentId,
			AttachFileToDocumentFormData formData) {
		// TODO Auto-generated method stub
		return null;
	}

}
