package com.holded.api.invoicing.v1.documents;

import org.junit.Test;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.holded.api.GuiceTestInjector;

public class DocumentsServiceIntTests {

	private Injector injector = GuiceTestInjector.getInstance();
	@Inject
	private DocumentsService documentsService;
	
	/**
	 * Given a document is created
	 * When the documents are listed
	 * Then the list contains the created document
	 */
	@Test
	public void listDocuments() {
		
	}
	
	/**
	 * When a document is created
	 * Then a successful confirmation message is returned
	 */
	@Test
	public void createDocument() {
		
	}
	
	/**
	 * Given a document is created
	 * When the document is requested
	 * Then the document is returned
	 */
	@Test
	public void getDocument() {
		
	}
	
	/**
	 * Given a document is created
	 * When the document is updated
	 * And the document is requested
	 * Then the document is up to date
	 */
	@Test
	public void updateDocument() {
		
	}
	
	/**
	 * Given a document is created
	 * When the document is deleted
	 * And the document is requested
	 * Then the document does not exist
	 */
	@Test
	public void deleteDocument() {
		
	}
	
	/**
	 * Given a document is created
	 * When the document is paid
	 * And the document is requested
	 * Then the document figures out as paid
	 */
	@Test
	public void payDocument() {
		
	}
	
	/**
	 * Given a document is created
	 * When the document is sent
	 * Then a successful confirmation message is returned
	 */
	@Test
	public void sendDocument() {
		
	}
	
	/**
	 * Given a document is created
	 * When the document pdf is requested
	 * Then the document pdf is returned
	 */
	@Test
	public void getDocumentPdf() {
		
	}
	
	/**
	 * Given a sales order document is created
	 * When all the items are shipped
	 * Then all the items figure out as shipped
	 */
	@Test
	public void shipAllItems() {
		
	}
	
	/**
	 * Given a sales order document is created
	 * When the first item is shipped
	 * Then the first item figures out as shipped
	 */
	@Test
	public void shipItemsByLine() {
		
	}
	
	/**
	 * Given a document is created
	 * When a file is attached to the document
	 * Then a successful confirmation message is returned
	 */
	@Test
	public void attachFileToDocument() {
		
	}
}
