package com.holded.api.invoicing.v1.documents.entities;

import com.google.gson.annotations.SerializedName;

public enum DocumentType {
	@SerializedName("invoice")
	INVOICE("invoice"),
	@SerializedName("salesreceipt")
	SALES_RECEIPT("salesreceipt"),
	@SerializedName("creditnote")
	CREDIT_NOTE("creditnote"),
	@SerializedName("salesorder")
	SALES_ORDER("salesorder"),
	@SerializedName("proform")
	PROFORM("proform"),
	@SerializedName("waybill")
	WAYBILL("waybill"),
	@SerializedName("estimate")
	ESTIMATE("estimate"),
	@SerializedName("purchase")
	PURCHASE("purchase"),
	@SerializedName("purchaseorder")
	PURCHASE_ORDER("purchaseorder"),
	@SerializedName("purchaserefund")
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
