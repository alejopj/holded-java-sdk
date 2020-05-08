package com.holded.api.invoicing.v1.contacts;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.holded.api.Configurations;
import com.holded.api.invoicing.v1.contacts.entities.Contact;
import com.holded.api.invoicing.v1.contacts.entities.CreateContactBodyParams;
import com.holded.api.invoicing.v1.contacts.entities.CreateContactResponse;
import com.holded.api.invoicing.v1.contacts.entities.DeleteContactResponse;
import com.holded.api.invoicing.v1.contacts.entities.UpdateContactBodyParams;
import com.holded.api.invoicing.v1.contacts.entities.UpdateContactResponse;

public class ContactsServiceImpl implements ContactsService {
	
	private static final String WEB_TARGET = Configurations.getEndpoint();
	private static final String KEY = "key";
	private static final String API_KEY = Configurations.getApiKey();
	private static final String API = "invoicing";
	private static final String VERSION = "v1";
	private static final String RESOURCE = "contacts";
	private static final Gson GSON = new Gson();
	
	private Client client = ClientBuilder.newClient();
	private WebTarget baseWebTarget = client.target(WEB_TARGET).path(API).path(VERSION).path(RESOURCE);

	@Override
	public List<Contact> listContacts() {
		
		WebTarget webTarget = baseWebTarget;
		
		return GSON.fromJson(webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY).get(String.class),
				new TypeToken<List<Contact>>(){}.getType());
	}

	@Override
	public CreateContactResponse createContact(CreateContactBodyParams bodyParams) {
		
		WebTarget webTarget = baseWebTarget;
		
		return GSON.fromJson(webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.post(Entity.json(bodyParams), String.class), CreateContactResponse.class);
	}

	@Override
	public Contact getContact(String contactId) {
		
		WebTarget webTarget = baseWebTarget.path(contactId);
		
		return GSON.fromJson(webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.get(String.class), Contact.class);
	}

	@Override
	public UpdateContactResponse updateContact(String contactId, UpdateContactBodyParams bodyParams) {
		
		WebTarget webTarget = baseWebTarget.path(contactId);
		
		return GSON.fromJson(webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.put(Entity.json(bodyParams), String.class), UpdateContactResponse.class);
	}

	@Override
	public DeleteContactResponse deleteContact(String contactId) {
		
		WebTarget webTarget = baseWebTarget.path(contactId);
		
		return GSON.fromJson(webTarget.request(MediaType.APPLICATION_JSON).header(KEY, API_KEY)
				.delete(String.class), DeleteContactResponse.class);
	}

}
