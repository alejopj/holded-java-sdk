package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;

import com.holded.api.common.entities.ServiceResponse;
import com.holded.api.common.entities.ServiceResponseStatus;

public class SendDocumentResponse extends ServiceResponse implements Serializable {

	private static final long serialVersionUID = 7430667819904580827L;
	
	public SendDocumentResponse(ServiceResponseStatus status, String info) {
		super(status, info);
	}
}
