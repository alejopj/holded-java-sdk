package com.holded.api.invoicing.v1.contacts.entities;

public enum ContactType {
	CLIENT("client"),
	SUPPLIER("supplier"),
	OPPORTUNITY("opportunity"),
	DEBTOR("debtor"),
	CREDITOR("creditor");
	
	private final String contactType;
	
	private ContactType(String contactType) {
		this.contactType = contactType;
	}
	
	@Override
	public String toString() {
		return contactType;
	}
}
