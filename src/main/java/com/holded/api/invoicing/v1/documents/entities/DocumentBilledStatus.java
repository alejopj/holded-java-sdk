package com.holded.api.invoicing.v1.documents.entities;

import com.google.gson.annotations.SerializedName;

public enum DocumentBilledStatus {
	@SerializedName("0")
	NOT_BILLED(0),
	@SerializedName("1")
	BILLED(1);
	
	private final Integer documentBilledStatus;
	
	private DocumentBilledStatus(Integer documentBilledStatus) {
		this.documentBilledStatus = documentBilledStatus;
	}
	
	@Override
	public String toString() {
		return documentBilledStatus.toString();
	}
}
