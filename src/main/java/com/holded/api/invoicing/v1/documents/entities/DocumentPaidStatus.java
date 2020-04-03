package com.holded.api.invoicing.v1.documents.entities;

public enum DocumentPaidStatus {
	NOT_PAID(0),
	PAID(1),
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
