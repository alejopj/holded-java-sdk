package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;

public class CreateDocumentResponse extends ServiceResponse implements Serializable {

	private static final long serialVersionUID = -7118613196990755760L;
	
	private final String id;
	private final String invoiceNum;
	private final String contactId;
	
	public CreateDocumentResponse(ServiceResponseStatus status, String id, String invoiceNum, String contactId) {
		super(status, null);
		this.id = id;
		this.invoiceNum = invoiceNum;
		this.contactId = contactId;
	}

	public String getId() {
		return id;
	}

	public String getInvoiceNum() {
		return invoiceNum;
	}

	public String getContactId() {
		return contactId;
	}
}
