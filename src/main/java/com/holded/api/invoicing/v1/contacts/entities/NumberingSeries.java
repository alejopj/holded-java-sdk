package com.holded.api.invoicing.v1.contacts.entities;

import java.io.Serializable;

public class NumberingSeries implements Serializable {

	private static final long serialVersionUID = -55159675020532557L;
	
	private final String invoice;
	private final String receipt;
	private final String salesOrder;
	private final String purchasesOrder;
	private final String proform;
	private final String waybill;
	
	public NumberingSeries(String invoice, String receipt, String salesOrder, String purchasesOrder, String proform,
			String waybill) {
		this.invoice = invoice;
		this.receipt = receipt;
		this.salesOrder = salesOrder;
		this.purchasesOrder = purchasesOrder;
		this.proform = proform;
		this.waybill = waybill;
	}

	public String getInvoice() {
		return invoice;
	}

	public String getReceipt() {
		return receipt;
	}

	public String getSalesOrder() {
		return salesOrder;
	}

	public String getPurchasesOrder() {
		return purchasesOrder;
	}

	public String getProform() {
		return proform;
	}

	public String getWaybill() {
		return waybill;
	}
}
