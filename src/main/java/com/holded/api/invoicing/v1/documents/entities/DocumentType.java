package com.holded.api.invoicing.v1.documents.entities;

public enum DocumentType {
	INVOICE("invoice"),
	SALES_RECEIPT("salesreceipt"),
	CREDIT_NOTE("creditnote"),
	SALES_ORDER("salesorder"),
	PROFORM("proform"),
	WAYBILL("waybill"),
	ESTIMATE("estimate"),
	PURCHASE("purchase"),
	PURCHASE_ORDER("purchaseorder"),
	PURCHASE_REFUND("purchaserefund");
	
	private final String documentType;
	
	private DocumentType(String documentType) {
		this.documentType = documentType;
	}
	
	@Override
	public String toString() {
		return documentType;
	}
}
