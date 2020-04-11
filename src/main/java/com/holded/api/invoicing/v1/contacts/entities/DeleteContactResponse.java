package com.holded.api.invoicing.v1.contacts.entities;

import java.io.Serializable;

import com.holded.api.common.entities.ServiceResponse;
import com.holded.api.common.entities.ServiceResponseStatus;

public class DeleteContactResponse extends ServiceResponse implements Serializable {

	private static final long serialVersionUID = -7662373947780984223L;
	
	private final String id;
	
	public DeleteContactResponse(ServiceResponseStatus status, String info, String id) {
		super(status, info);
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
