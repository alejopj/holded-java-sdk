package com.holded.api.invoicing.v1.contacts;

import java.util.List;

import com.holded.api.invoicing.v1.contacts.entities.Contact;
import com.holded.api.invoicing.v1.contacts.entities.CreateContactBodyParams;
import com.holded.api.invoicing.v1.contacts.entities.CreateContactResponse;
import com.holded.api.invoicing.v1.contacts.entities.DeleteContactResponse;
import com.holded.api.invoicing.v1.contacts.entities.UpdateContactBodyParams;
import com.holded.api.invoicing.v1.contacts.entities.UpdateContactResponse;

/**
 * Manage your clients and providers.
 * Exclusive panels to view all their sales, purchases and related info.
 * Add shipping addresses, social networks and create your customized fields.
 */
public interface ContactsService {

	/**
	 * Get all your contact.
	 * @return Contacts.
	 */
	List<Contact> listContacts();
	
	/**
	 * Create a new contact.
	 * @param bodyParams Body parameters.
	 * @return Response.
	 */
	CreateContactResponse createContact(CreateContactBodyParams bodyParams);
	
	/**
	 * Get a specific contact.
	 * @param contactId Contact id.
	 * @return Contact.
	 */
	Contact getContact(String contactId);
	
	/**
	 * Update a specific contact.
	 * Only the parameters included in the operation will update the contact.
	 * @param contactId Contact id.
	 * @param bodyParams Body parameters.
	 * @return Response.
	 */
	UpdateContactResponse updateContact(String contactId, UpdateContactBodyParams bodyParams);
	
	/**
	 * Delete a specific contact.
	 * @param contactId Contact id.
	 * @return Response.
	 */
	DeleteContactResponse deleteContact(String contactId);
}
