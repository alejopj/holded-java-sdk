package com.holded.api.invoicing.v1.contacts;

import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.holded.api.GuiceTestInjector;
import com.holded.api.common.entities.ServiceResponseStatus;
import com.holded.api.invoicing.v1.contacts.entities.Contact;
import com.holded.api.invoicing.v1.contacts.entities.CreateContactBodyParams;
import com.holded.api.invoicing.v1.contacts.entities.CreateContactResponse;
import com.holded.api.invoicing.v1.contacts.entities.DeleteContactResponse;
import com.holded.api.invoicing.v1.contacts.entities.UpdateContactBodyParams;
import com.holded.api.invoicing.v1.contacts.entities.UpdateContactResponse;

public class ContactsServiceIntTests {

	private Injector injector = GuiceTestInjector.getInstance();
	@Inject
	private ContactsService contactsService;
	
	@Before
	public void before() {
		
		List<Contact> contacts = contactsService.listContacts();
		
		for (Contact contact : contacts) {
			contactsService.deleteContact(contact.getId());
		}
	}
	
	/**
	 * Given a contact is created
	 * When the contacts are listed
	 * Then the list contains the created contact
	 */
	@Test
	public void listContacts() {
		
		// TODO Get random values from the API.
		String contactGroupId = null;
		Long clientRecord = null;
		Long supplierRecord = null;
		CreateContactBodyParams createContactBodyParams =
				ContactsServiceTestUtils.getCreateContactBodyParams(contactGroupId, clientRecord, supplierRecord);
		CreateContactResponse createContactResponse = contactsService.createContact(createContactBodyParams);
		
		assertEquals(ServiceResponseStatus.OK, createContactResponse.getStatus());
		
		List<Contact> contacts = contactsService.listContacts();
		
		List<String> contactIds = contacts.stream().map(contact -> contact.getId()).collect(Collectors.toList());
		assertTrue(contactIds.contains(createContactResponse.getId()));
	}
	
	/**
	 * When a contact is created
	 * Then a successful confirmation message is returned
	 */
	@Test
	public void createContact() {
		
		// TODO Get random values from the API.
		String contactGroupId = null;
		Long clientRecord = null;
		Long supplierRecord = null;
		CreateContactBodyParams createContactBodyParams =
				ContactsServiceTestUtils.getCreateContactBodyParams(contactGroupId, clientRecord, supplierRecord);
		CreateContactResponse createContactResponse = contactsService.createContact(createContactBodyParams);
		
		assertEquals(ServiceResponseStatus.OK, createContactResponse.getStatus());
	}
	
	/**
	 * Given a contact is created
	 * When the contact is requested
	 * Then the contact is returned
	 */
	@Test
	public void getContact() {
		
		// TODO Get random values from the API.
		String contactGroupId = null;
		Long clientRecord = null;
		Long supplierRecord = null;
		CreateContactBodyParams createContactBodyParams =
				ContactsServiceTestUtils.getCreateContactBodyParams(contactGroupId, clientRecord, supplierRecord);
		CreateContactResponse createContactResponse = contactsService.createContact(createContactBodyParams);
		
		assertEquals(ServiceResponseStatus.OK, createContactResponse.getStatus());
		
		String contactId = createContactResponse.getId();
		Contact contact = contactsService.getContact(contactId);
		
		assertEquals(contactId, contact.getId());
	}
	
	/**
	 * Given a contact is created
	 * When the contact is updated
	 * And the contact is requested
	 * Then the contact is up to date
	 */
	@Test
	public void updateContact() {
		
		// TODO Get random values from the API.
		String contactGroupId = null;
		Long clientRecord = null;
		Long supplierRecord = null;
		CreateContactBodyParams createContactBodyParams =
				ContactsServiceTestUtils.getCreateContactBodyParams(contactGroupId, clientRecord, supplierRecord);
		CreateContactResponse createContactResponse = contactsService.createContact(createContactBodyParams);
		
		assertEquals(ServiceResponseStatus.OK, createContactResponse.getStatus());
		
		String contactId = createContactResponse.getId();
		UpdateContactBodyParams updateContactBodyParams =
				ContactsServiceTestUtils.getUpdateContactBodyParams(contactGroupId, clientRecord, supplierRecord);
		UpdateContactResponse updateContactResponse = contactsService.updateContact(contactId, updateContactBodyParams);
		
		assertEquals(ServiceResponseStatus.OK, updateContactResponse.getStatus());
		
		Contact contact = contactsService.getContact(contactId);
		
		String newName = updateContactBodyParams.getName();
		assertEquals(newName, contact.getName());
	}
	
	/**
	 * Given a contact is created
	 * When the contact is deleted
	 * And the contact is requested
	 * Then the contact does not exist
	 */
	@Test
	public void deleteContact() {
		
		// TODO Get random values from the API.
		String contactGroupId = null;
		Long clientRecord = null;
		Long supplierRecord = null;
		CreateContactBodyParams createContactBodyParams =
				ContactsServiceTestUtils.getCreateContactBodyParams(contactGroupId, clientRecord, supplierRecord);
		CreateContactResponse createContactResponse = contactsService.createContact(createContactBodyParams);
		
		assertEquals(ServiceResponseStatus.OK, createContactResponse.getStatus());
		
		String contactId = createContactResponse.getId();
		DeleteContactResponse deleteContactResponse = contactsService.deleteContact(contactId);
		
		assertEquals(ServiceResponseStatus.OK, deleteContactResponse.getStatus());
		
		Contact contact = contactsService.getContact(contactId);
		
		assertNull(contact);
	}
}
