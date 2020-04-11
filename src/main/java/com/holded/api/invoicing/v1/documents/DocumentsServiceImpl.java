package com.holded.api.invoicing.v1.documents;

import java.util.List;
import java.util.ResourceBundle;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

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
	
	private static final ResourceBundle endpointResourceBundle = ResourceBundle.getBundle("endpoint.properties");
	private static final ResourceBundle apiKeyResourceBundle = ResourceBundle.getBundle("apikey.properties");
	private static final String WEB_TARGET = endpointResourceBundle.getString("url");
	private static final String KEY = "key";
	private static final String API_KEY = apiKeyResourceBundle.getString("key");
	private static final String API = "invoicing";
	private static final String VERSION = "v1";
	private static final String RESOURCE = "documents";
	
	private Client client = ClientBuilder.newClient();
	private WebTarget baseWebTarget = client.target(WEB_TARGET).path(API).path(VERSION).path(RESOURCE);

	public List<Document> listDocuments(DocumentType docType, ListDocumentsQueryParams queryParams) {
		
		WebTarget webTarget = baseWebTarget.path(docType.toString());
		
		webTarget.queryParam("starttmp", queryParams.getStarttmp());
		webTarget.queryParam("endtmp", queryParams.getEndtmp());
		webTarget.queryParam("contactid", queryParams.getContactId());
		webTarget.queryParam("paid", queryParams.getPaidStatus().toString());
		webTarget.queryParam("billed", queryParams.getBilledStatus().toString());
		
		return webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.get(new GenericType<List<Document>>() {});
	}

	public CreateDocumentResponse createDocument(DocumentType docType, CreateDocumentBodyParams bodyParams) {
		
		WebTarget webTarget = baseWebTarget.path(docType.toString());
		
		return webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.post(Entity.json(bodyParams), CreateDocumentResponse.class);
	}

	public Document getDocument(DocumentType docType, String documentId) {
		
		WebTarget webTarget = baseWebTarget.path(docType.toString()).path(documentId);
		
		return webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.get(Document.class);
	}

	public UpdateDocumentResponse updateDocument(DocumentType docType, String documentId,
			UpdateDocumentBodyParams bodyParams) {
		
		WebTarget webTarget = baseWebTarget.path(docType.toString()).path(documentId);
		
		return webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.put(Entity.json(bodyParams), UpdateDocumentResponse.class);
	}

	public DeleteDocumentResponse deleteDocument(DocumentType docType, String documentId) {
		
		WebTarget webTarget = baseWebTarget.path(docType.toString()).path(documentId);
		
		return webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.delete(DeleteDocumentResponse.class);
	}

	public PayDocumentResponse payDocument(DocumentType docType, String documentId, PayDocumentBodyParams bodyParams) {
		
		WebTarget webTarget = baseWebTarget.path(docType.toString()).path(documentId).path("pay");
		
		return webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.post(Entity.json(bodyParams), PayDocumentResponse.class);
	}

	public SendDocumentResponse sendDocument(DocumentType docType, String documentId,
			SendDocumentBodyParams bodyParams) {
		
		WebTarget webTarget = baseWebTarget.path(docType.toString()).path(documentId).path("send");
		
		return webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.post(Entity.json(bodyParams), SendDocumentResponse.class);
	}

	public GetDocumentPdfResponse getDocumentPdf(DocumentType docType, String documentId) {
		
		WebTarget webTarget = baseWebTarget.path(docType.toString()).path(documentId).path("pdf");
		
		return webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.get(GetDocumentPdfResponse.class);
	}

	public ShipAllItemsResponse shipAllItems(String documentId) {
		
		WebTarget webTarget = baseWebTarget.path(DocumentType.SALES_ORDER.toString()).path(documentId).path("shipall");
		
		return webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.post(Entity.json(null), ShipAllItemsResponse.class);
	}

	public ShipItemsByLineResponse shipItemsByLine(String documentId, ShipItemsByLineBodyParams bodyParams) {
		
		WebTarget webTarget = baseWebTarget.path(DocumentType.SALES_ORDER.toString()).path(documentId).path("shipbylines");
		
		return webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.post(Entity.json(bodyParams), ShipItemsByLineResponse.class);
	}

	public AttachFileToDocumentResponse attachFileToDocument(DocumentType docType, String documentId,
			AttachFileToDocumentFormData formData) {
		
		WebTarget webTarget = baseWebTarget.path(docType.toString()).path(documentId).path("attach");
		
		return webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.post(Entity.entity(formData, MediaType.MULTIPART_FORM_DATA), AttachFileToDocumentResponse.class);
	}

}
