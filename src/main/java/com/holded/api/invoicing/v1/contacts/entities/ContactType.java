package com.holded.api.invoicing.v1.contacts.entities;

import com.google.gson.annotations.SerializedName;

public enum ContactType {
	@SerializedName("client")
	CLIENT("client"),
	@SerializedName("supplier")
	SUPPLIER("supplier"),
	@SerializedName("opportunity")
	OPPORTUNITY("opportunity"),
	@SerializedName("debtor")
	DEBTOR("debtor"),
	@SerializedName("creditor")
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
