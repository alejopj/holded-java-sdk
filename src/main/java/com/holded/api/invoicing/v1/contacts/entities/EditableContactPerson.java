package com.holded.api.invoicing.v1.contacts.entities;

import java.io.Serializable;

public class EditableContactPerson implements Serializable {

	private static final long serialVersionUID = 3145240663739213161L;
	
	private final String name;
	private final String phone;
	private final String email;
	
	public EditableContactPerson(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}
}
