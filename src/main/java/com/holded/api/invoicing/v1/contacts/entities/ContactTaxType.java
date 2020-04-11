package com.holded.api.invoicing.v1.contacts.entities;

public enum ContactTaxType {
	DEFAULT("default");
	
	private final String contactTaxType;
	
	private ContactTaxType(String contactTaxType) {
		this.contactTaxType = contactTaxType;
	}

	@Override
	public String toString() {
		return contactTaxType;
	}
}
