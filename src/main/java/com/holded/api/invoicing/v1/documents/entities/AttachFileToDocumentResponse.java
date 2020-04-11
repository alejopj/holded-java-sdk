package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;

import com.holded.api.common.entities.ServiceResponse;
import com.holded.api.common.entities.ServiceResponseStatus;

public class AttachFileToDocumentResponse extends ServiceResponse implements Serializable {

	private static final long serialVersionUID = 4881911845540964611L;
	
	public AttachFileToDocumentResponse(ServiceResponseStatus status, String info) {
		super(status, info);
	}
}
