package com.holded.api.invoicing.v1.contacts.entities;

public enum ContactRetentionType {
	DEFAULT("default");
	
	private final String contactRetentionType;
	
	private ContactRetentionType(String contactRetentionType) {
		this.contactRetentionType = contactRetentionType;
	}

	@Override
	public String toString() {
		return contactRetentionType;
	}
}
