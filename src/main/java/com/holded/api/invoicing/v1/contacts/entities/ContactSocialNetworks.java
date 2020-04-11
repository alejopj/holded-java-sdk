package com.holded.api.invoicing.v1.contacts.entities;

import java.io.Serializable;

public class ContactSocialNetworks implements Serializable {

	private static final long serialVersionUID = 1763442086632947884L;
	
	private final String website;

	public ContactSocialNetworks(String website) {
		this.website = website;
	}

	public String getWebsite() {
		return website;
	}
}
