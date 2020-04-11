package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;

import com.holded.api.common.entities.ServiceResponse;
import com.holded.api.common.entities.ServiceResponseStatus;

public class GetDocumentPdfResponse extends ServiceResponse implements Serializable {

	private static final long serialVersionUID = -5496017469454997880L;
	
	private final String data;
	
	public GetDocumentPdfResponse(ServiceResponseStatus status, String data) {
		super(status, null);
		this.data = data;
	}

	/**
	 * Format: <<base64_encode('file content')>>
	 */
	public String getData() {
		return data;
	}
	
}
