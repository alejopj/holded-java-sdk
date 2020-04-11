package com.holded.api.invoicing.v1.contacts.entities;

public enum ContactTaxOperation {
	GENERAL("general"),
	INTRACOMMUNITY("intra"),
	IMPORT_EXPORT("impexp"),
	NOT_SUBJECT("nosujeto"),
	SURCHARGE_EQUIVALENCE("receq"),
	EXEMPT("exento");
	
	private final String contactTaxOperation;

	private ContactTaxOperation(String contactTaxOperation) {
		this.contactTaxOperation = contactTaxOperation;
	}
	
	@Override
	public String toString() {
		return contactTaxOperation;
	}
}
