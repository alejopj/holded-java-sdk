package com.holded.api.invoicing.v1.contacts.entities;

import com.google.gson.annotations.SerializedName;

public enum ContactRetentionType {
	@SerializedName("default")
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
