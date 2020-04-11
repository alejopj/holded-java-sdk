package com.holded.api.invoicing.v1.contacts.entities;

import java.io.Serializable;

public class ContactPerson implements Serializable {

	private static final long serialVersionUID = 3139771564357105208L;
	
	private final String personId;
	private final String name;
	private final String job;
	private final String phone;
	private final String email;
	private final Boolean sendDocumentsByDefault;
	private final String linkedin;
	
	public ContactPerson(String personId, String name, String job, String phone, String email,
			Boolean sendDocumentsByDefault, String linkedin) {
		this.personId = personId;
		this.name = name;
		this.job = job;
		this.phone = phone;
		this.email = email;
		this.sendDocumentsByDefault = sendDocumentsByDefault;
		this.linkedin = linkedin;
	}

	public String getPersonId() {
		return personId;
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public Boolean getSendDocumentsByDefault() {
		return sendDocumentsByDefault;
	}

	public String getLinkedin() {
		return linkedin;
	}
}
