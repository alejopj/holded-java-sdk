package com.holded.api.invoicing.v1.contacts.entities;

import com.google.gson.annotations.SerializedName;

public enum ContactTaxType {
	@SerializedName("default")
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
