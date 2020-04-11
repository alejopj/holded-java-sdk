package com.holded.api.invoicing.v1.documents;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.holded.api.GuiceTestInjector;
import com.holded.api.common.entities.ServiceResponseStatus;
import com.holded.api.invoicing.v1.documents.entities.AttachFileToDocumentFormData;
import com.holded.api.invoicing.v1.documents.entities.CreateDocumentBodyParams;
import com.holded.api.invoicing.v1.documents.entities.CreateDocumentResponse;
import com.holded.api.invoicing.v1.documents.entities.DeleteDocumentResponse;
import com.holded.api.invoicing.v1.documents.entities.Document;
import com.holded.api.invoicing.v1.documents.entities.DocumentPaidStatus;
import com.holded.api.invoicing.v1.documents.entities.DocumentType;
import com.holded.api.invoicing.v1.documents.entities.GetDocumentPdfResponse;
import com.holded.api.invoicing.v1.documents.entities.ListDocumentsQueryParams;
import com.holded.api.invoicing.v1.documents.entities.SendDocumentBodyParams;
import com.holded.api.invoicing.v1.documents.entities.ShipAllItemsResponse;
import com.holded.api.invoicing.v1.documents.entities.ShipItemsByLineBodyParams;
import com.holded.api.invoicing.v1.documents.entities.ShipItemsByLineResponse;
import com.holded.api.invoicing.v1.documents.entities.UpdateDocumentBodyParams;
import com.holded.api.invoicing.v1.documents.entities.UpdateDocumentResponse;

public class DocumentsServiceIntTests {

	private Injector injector = GuiceTestInjector.getInstance();
	@Inject
	private DocumentsService documentsService;
	
	@Before
	public void before() {
		
		for (DocumentType documentType : DocumentType.values()) {
			
			ListDocumentsQueryParams listDocumentsQueryParams = new ListDocumentsQueryParams(null, null, null, null, null);
			List<Document> documents = documentsService.listDocuments(documentType, listDocumentsQueryParams);
			
			for (Document document : documents) {
				// TODO Get id from document.
				String documentId = "";
				DeleteDocumentResponse deleteDocumentResponse = documentsService.deleteDocument(documentType, documentId);
			}
		}
	}
	
	/**
	 * Given a document is created
	 * When the documents are listed
	 * Then the list contains the created document
	 */
	@Test
	public void listDocuments() {
		
		DocumentType documentType = DocumentType.SALES_ORDER;
		CreateDocumentBodyParams createDocumentBodyParams = DocumentsServiceTestUtils.getCreateDocumentBodyParams(documentType);
		CreateDocumentResponse createDocumentResponse = documentsService.createDocument(documentType, createDocumentBodyParams);
		
		assertEquals(ServiceResponseStatus.OK, createDocumentResponse.getStatus());
		
		ListDocumentsQueryParams listDocumentsQueryParams = new ListDocumentsQueryParams(null, null, null, null, null);
		List<Document> documents = documentsService.listDocuments(documentType, listDocumentsQueryParams);
		
		// TODO Gets ids from documents.
		assertTrue(documents.contains(createDocumentResponse.getId()));
	}
	
	/**
	 * When a document is created
	 * Then a successful confirmation message is returned
	 */
	@Test
	public void createDocument() {
		
		DocumentType documentType = DocumentType.SALES_ORDER;
		CreateDocumentBodyParams createDocumentBodyParams = DocumentsServiceTestUtils.getCreateDocumentBodyParams(documentType);
		CreateDocumentResponse createDocumentResponse = documentsService.createDocument(documentType, createDocumentBodyParams);
		
		assertEquals(ServiceResponseStatus.OK, createDocumentResponse.getStatus());
	}
	
	/**
	 * Given a document is created
	 * When the document is requested
	 * Then the document is returned
	 */
	@Test
	public void getDocument() {
		
		DocumentType documentType = DocumentType.SALES_ORDER;
		CreateDocumentBodyParams createDocumentBodyParams = DocumentsServiceTestUtils.getCreateDocumentBodyParams(documentType);
		CreateDocumentResponse createDocumentResponse = documentsService.createDocument(documentType, createDocumentBodyParams);
		
		assertEquals(ServiceResponseStatus.OK, createDocumentResponse.getStatus());
		
		String documentId = createDocumentResponse.getId();
		Document document = documentsService.getDocument(documentType, documentId);
		
		// TODO Gets id from document.
		assertEquals(documentId, document);
	}
	
	/**
	 * Given a document is created
	 * When the document is updated
	 * And the document is requested
	 * Then the document is up to date
	 */
	@Test
	public void updateDocument() {
		
		DocumentType documentType = DocumentType.SALES_ORDER;
		CreateDocumentBodyParams createDocumentBodyParams = DocumentsServiceTestUtils.getCreateDocumentBodyParams(documentType);
		CreateDocumentResponse createDocumentResponse = documentsService.createDocument(documentType, createDocumentBodyParams);
		
		assertEquals(ServiceResponseStatus.OK, createDocumentResponse.getStatus());
		
		String documentId = createDocumentResponse.getId();
		UpdateDocumentBodyParams updateDocumentBodyParams = DocumentsServiceTestUtils.getUpdateDocumentBodyParams(documentType);
		UpdateDocumentResponse updateDocumentResponse = documentsService.updateDocument(documentType, documentId, updateDocumentBodyParams);
		
		assertEquals(ServiceResponseStatus.OK, updateDocumentResponse.getStatus());
		
		Document document = documentsService.getDocument(documentType, documentId);
		
		// TODO Assert the document is up to date.
	}
	
	/**
	 * Given a document is created
	 * When the document is deleted
	 * And the document is requested
	 * Then the document does not exist
	 */
	@Test
	public void deleteDocument() {
		
		DocumentType documentType = DocumentType.SALES_ORDER;
		CreateDocumentBodyParams createDocumentBodyParams = DocumentsServiceTestUtils.getCreateDocumentBodyParams(documentType);
		CreateDocumentResponse createDocumentResponse = documentsService.createDocument(documentType, createDocumentBodyParams);
		
		assertEquals(ServiceResponseStatus.OK, createDocumentResponse.getStatus());
		
		String documentId = createDocumentResponse.getId();
		DeleteDocumentResponse deleteDocumentResponse = documentsService.deleteDocument(documentType, documentId);
		
		assertEquals(ServiceResponseStatus.OK, deleteDocumentResponse.getStatus());
		
		Document document = documentsService.getDocument(documentType, documentId);
		
		// TODO Assert the document does not exist.
		assertNotEquals(ServiceResponseStatus.OK, document);
	}
	
	/**
	 * Given a document is created
	 * When the document is paid
	 * And the document is requested
	 * Then the document is listed as paid
	 */
	@Test
	public void payDocument() {
		
		DocumentType documentType = DocumentType.SALES_ORDER;
		CreateDocumentBodyParams createDocumentBodyParams = DocumentsServiceTestUtils.getCreateDocumentBodyParams(documentType);
		CreateDocumentResponse createDocumentResponse = documentsService.createDocument(documentType, createDocumentBodyParams);
		
		assertEquals(ServiceResponseStatus.OK, createDocumentResponse.getStatus());
		
		String documentId = createDocumentResponse.getId();
		DeleteDocumentResponse deleteDocumentResponse = documentsService.deleteDocument(documentType, documentId);
		
		assertEquals(ServiceResponseStatus.OK, deleteDocumentResponse.getStatus());
		
		Document document = documentsService.getDocument(documentType, documentId);
		
		// TODO Assert the document is listed as paid.
		assertEquals(DocumentPaidStatus.PAID, document);
	}
	
	/**
	 * Given a document is created
	 * When the document is sent
	 * Then a successful confirmation message is returned
	 */
	@Test
	public void sendDocument() {
		
		DocumentType documentType = DocumentType.SALES_ORDER;
		CreateDocumentBodyParams createDocumentBodyParams = DocumentsServiceTestUtils.getCreateDocumentBodyParams(documentType);
		CreateDocumentResponse createDocumentResponse = documentsService.createDocument(documentType, createDocumentBodyParams);
		
		assertEquals(ServiceResponseStatus.OK, createDocumentResponse.getStatus());
		
		String documentId = createDocumentResponse.getId();
		SendDocumentBodyParams bodyParams = DocumentsServiceTestUtils.getSendDocumentBodyParams(documentId);
		documentsService.sendDocument(documentType, documentId, bodyParams );
	}
	
	/**
	 * Given a document is created
	 * When the document pdf is requested
	 * Then the document pdf is returned
	 */
	@Test
	public void getDocumentPdf() {
		
		DocumentType documentType = DocumentType.SALES_ORDER;
		CreateDocumentBodyParams createDocumentBodyParams = DocumentsServiceTestUtils.getCreateDocumentBodyParams(documentType);
		CreateDocumentResponse createDocumentResponse = documentsService.createDocument(documentType, createDocumentBodyParams);
		
		assertEquals(ServiceResponseStatus.OK, createDocumentResponse.getStatus());
		
		String documentId = createDocumentResponse.getId();
		GetDocumentPdfResponse getDocumentPdfResponse = documentsService.getDocumentPdf(documentType, documentId);
		
		assertEquals(ServiceResponseStatus.OK, getDocumentPdfResponse.getStatus());
		assertNotNull(getDocumentPdfResponse.getData());
		assertFalse(getDocumentPdfResponse.getData().isEmpty());
	}
	
	/**
	 * Given a sales order document is created
	 * When all the items are shipped
	 * Then all the items are listed as shipped
	 */
	@Test
	public void shipAllItems() {
		
		DocumentType documentType = DocumentType.SALES_ORDER;
		CreateDocumentBodyParams createDocumentBodyParams = DocumentsServiceTestUtils.getCreateDocumentBodyParams(documentType);
		CreateDocumentResponse createDocumentResponse = documentsService.createDocument(documentType, createDocumentBodyParams);
		
		assertEquals(ServiceResponseStatus.OK, createDocumentResponse.getStatus());
		
		String documentId = createDocumentResponse.getId();
		ShipAllItemsResponse shipAllItemsResponse = documentsService.shipAllItems(documentId);
		
		assertEquals(ServiceResponseStatus.OK, shipAllItemsResponse.getStatus());
		
		Document document = documentsService.getDocument(documentType, documentId);
		
		// TODO Assert all the items are listed as shipped.
	}
	
	/**
	 * Given a sales order document is created
	 * When all the items are shipped by line
	 * Then all the items are listed as shipped
	 */
	@Test
	public void shipItemsByLine() {
		
		DocumentType documentType = DocumentType.SALES_ORDER;
		CreateDocumentBodyParams createDocumentBodyParams = DocumentsServiceTestUtils.getCreateDocumentBodyParams(documentType);
		CreateDocumentResponse createDocumentResponse = documentsService.createDocument(documentType, createDocumentBodyParams);
		
		assertEquals(ServiceResponseStatus.OK, createDocumentResponse.getStatus());
		
		String documentId = createDocumentResponse.getId();
		ShipItemsByLineBodyParams shipItemsByLineBodyParams = DocumentsServiceTestUtils.getShipItemsByLineBodyParams(createDocumentBodyParams);
		ShipItemsByLineResponse shipItemsByLineResponse = documentsService.shipItemsByLine(documentId, shipItemsByLineBodyParams);
		
		assertEquals(ServiceResponseStatus.OK, shipItemsByLineResponse.getStatus());
		
		Document document = documentsService.getDocument(documentType, documentId);
		
		// TODO Assert all the items are listed as shipped.
	}
	
	/**
	 * Given a document is created
	 * When a file is attached to the document
	 * Then a successful confirmation message is returned
	 */
	@Test
	public void attachFileToDocument() {
		
		DocumentType documentType = DocumentType.SALES_ORDER;
		CreateDocumentBodyParams createDocumentBodyParams = DocumentsServiceTestUtils.getCreateDocumentBodyParams(documentType);
		CreateDocumentResponse createDocumentResponse = documentsService.createDocument(documentType, createDocumentBodyParams);
		
		assertEquals(ServiceResponseStatus.OK, createDocumentResponse.getStatus());
		
		String documentId = createDocumentResponse.getId();
		AttachFileToDocumentFormData formData = DocumentsServiceTestUtils.getAttachFileToDocumentFormData();
		documentsService.attachFileToDocument(documentType, documentId, formData);
	}
}
