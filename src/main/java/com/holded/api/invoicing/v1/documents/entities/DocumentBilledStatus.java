package com.holded.api.invoicing.v1.documents.entities;

public enum DocumentBilledStatus {
	NOT_BILLED(0),
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
