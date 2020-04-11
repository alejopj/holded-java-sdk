package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;

import com.holded.api.common.entities.ServiceResponse;
import com.holded.api.common.entities.ServiceResponseStatus;

public class UpdateDocumentResponse extends ServiceResponse implements Serializable {

	private static final long serialVersionUID = 4816853458301262639L;
	
	private final String id;
	
	public UpdateDocumentResponse(ServiceResponseStatus status, String info, String id) {
		super(status, info);
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
