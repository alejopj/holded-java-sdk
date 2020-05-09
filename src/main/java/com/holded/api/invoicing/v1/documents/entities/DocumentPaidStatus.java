package com.holded.api.invoicing.v1.documents.entities;

import com.google.gson.annotations.SerializedName;

public enum DocumentPaidStatus {
	@SerializedName("0")
	NOT_PAID(0),
	@SerializedName("1")
	PAID(1),
	@SerializedName("2")
	PARTIALLY_PAID(2);
	
	private final Integer documentPaidStatus;
	
	private DocumentPaidStatus(Integer documentPaidStatus) {
		this.documentPaidStatus = documentPaidStatus;
	}
	
	@Override
	public String toString() {
		return documentPaidStatus.toString();
	}
}
