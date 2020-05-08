package com.holded.api.invoicing.v1.documents;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.holded.api.Configurations;
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
	
	private static final String WEB_TARGET = Configurations.getEndpoint();
	private static final String KEY = "key";
	private static final String API_KEY = Configurations.getApiKey();
	private static final String API = "invoicing";
	private static final String VERSION = "v1";
	private static final String RESOURCE = "documents";
	private static final Gson GSON = new Gson();
	
	private Client client = ClientBuilder.newClient();
	private WebTarget baseWebTarget = client.target(WEB_TARGET).path(API).path(VERSION).path(RESOURCE);

	@Override
	public List<Document> listDocuments(DocumentType docType, ListDocumentsQueryParams queryParams) {
		
		WebTarget webTarget = baseWebTarget.path(docType.toString());
		
		webTarget.queryParam("starttmp", queryParams.getStarttmp());
		webTarget.queryParam("endtmp", queryParams.getEndtmp());
		webTarget.queryParam("contactid", queryParams.getContactId());
		webTarget.queryParam("paid", queryParams.getPaidStatus().toString());
		webTarget.queryParam("billed", queryParams.getBilledStatus().toString());
		
		return GSON.fromJson(webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY).get(String.class),
				new TypeToken<List<Document>>(){}.getType());
	}

	@Override
	public CreateDocumentResponse createDocument(DocumentType docType, CreateDocumentBodyParams bodyParams) {
		
		WebTarget webTarget = baseWebTarget.path(docType.toString());
		
		return GSON.fromJson(webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.post(Entity.json(bodyParams), String.class), CreateDocumentResponse.class);
	}

	@Override
	public Document getDocument(DocumentType docType, String documentId) {
		
		WebTarget webTarget = baseWebTarget.path(docType.toString()).path(documentId);
		
		return GSON.fromJson(webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.get(String.class), Document.class);
	}

	@Override
	public UpdateDocumentResponse updateDocument(DocumentType docType, String documentId,
			UpdateDocumentBodyParams bodyParams) {
		
		WebTarget webTarget = baseWebTarget.path(docType.toString()).path(documentId);
		
		return GSON.fromJson(webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.put(Entity.json(bodyParams), String.class), UpdateDocumentResponse.class);
	}

	@Override
	public DeleteDocumentResponse deleteDocument(DocumentType docType, String documentId) {
		
		WebTarget webTarget = baseWebTarget.path(docType.toString()).path(documentId);
		
		return GSON.fromJson(webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.delete(String.class), DeleteDocumentResponse.class);
	}

	@Override
	public PayDocumentResponse payDocument(DocumentType docType, String documentId, PayDocumentBodyParams bodyParams) {
		
		WebTarget webTarget = baseWebTarget.path(docType.toString()).path(documentId).path("pay");
		
		return GSON.fromJson(webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.post(Entity.json(bodyParams), String.class), PayDocumentResponse.class);
	}

	@Override
	public SendDocumentResponse sendDocument(DocumentType docType, String documentId,
			SendDocumentBodyParams bodyParams) {
		
		WebTarget webTarget = baseWebTarget.path(docType.toString()).path(documentId).path("send");
		
		return GSON.fromJson(webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.post(Entity.json(bodyParams), String.class), SendDocumentResponse.class);
	}

	@Override
	public GetDocumentPdfResponse getDocumentPdf(DocumentType docType, String documentId) {
		
		WebTarget webTarget = baseWebTarget.path(docType.toString()).path(documentId).path("pdf");
		
		return GSON.fromJson(webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.get(String.class), GetDocumentPdfResponse.class);
	}

	@Override
	public ShipAllItemsResponse shipAllItems(String documentId) {
		
		WebTarget webTarget = baseWebTarget.path(DocumentType.SALES_ORDER.toString()).path(documentId).path("shipall");
		
		return GSON.fromJson(webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.post(Entity.json(null), String.class), ShipAllItemsResponse.class);
	}

	@Override
	public ShipItemsByLineResponse shipItemsByLine(String documentId, ShipItemsByLineBodyParams bodyParams) {
		
		WebTarget webTarget = baseWebTarget.path(DocumentType.SALES_ORDER.toString()).path(documentId).path("shipbylines");
		
		return GSON.fromJson(webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.post(Entity.json(bodyParams), String.class), ShipItemsByLineResponse.class);
	}

	@Override
	public AttachFileToDocumentResponse attachFileToDocument(DocumentType docType, String documentId,
			AttachFileToDocumentFormData formData) {
		
		WebTarget webTarget = baseWebTarget.path(docType.toString()).path(documentId).path("attach");
		
		return GSON.fromJson(webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.post(Entity.entity(formData, MediaType.MULTIPART_FORM_DATA), String.class), AttachFileToDocumentResponse.class);
	}

}
