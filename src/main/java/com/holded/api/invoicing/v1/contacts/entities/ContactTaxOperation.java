package com.holded.api.invoicing.v1.contacts.entities;

import com.google.gson.annotations.SerializedName;

public enum ContactTaxOperation {
	@SerializedName("general")
	GENERAL("general"),
	@SerializedName("intra")
	INTRACOMMUNITY("intra"),
	@SerializedName("impexp")
	IMPORT_EXPORT("impexp"),
	@SerializedName("nosujeto")
	NOT_SUBJECT("nosujeto"),
	@SerializedName("receq")
	SURCHARGE_EQUIVALENCE("receq"),
	@SerializedName("exento")
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
