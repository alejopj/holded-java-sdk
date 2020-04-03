package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;

public class PayDocumentResponse extends ServiceResponse implements Serializable {

	private static final long serialVersionUID = 3847226673886257032L;
	
	private final String invoiceId;
	private final String invoiceNum;
	private final String paymentId;
	
	public PayDocumentResponse(ServiceResponseStatus status, String invoiceId, String invoiceNum, String paymentId) {
		super(status, null);
		this.invoiceId = invoiceId;
		this.invoiceNum = invoiceNum;
		this.paymentId = paymentId;
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public String getInvoiceNum() {
		return invoiceNum;
	}

	public String getPaymentId() {
		return paymentId;
	}
}
