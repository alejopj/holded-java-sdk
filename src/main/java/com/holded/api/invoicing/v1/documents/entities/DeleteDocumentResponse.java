package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;

public class DeleteDocumentResponse extends ServiceResponse implements Serializable {

	private static final long serialVersionUID = -384109560031188808L;
	
	private final String id;
	
	public DeleteDocumentResponse(ServiceResponseStatus status, String info, String id) {
		super(status, info);
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
