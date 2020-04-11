package com.holded.api.invoicing.v1.contacts.entities;

import java.io.Serializable;

import com.holded.api.common.entities.ServiceResponse;
import com.holded.api.common.entities.ServiceResponseStatus;

public class CreateContactResponse extends ServiceResponse implements Serializable {

	private static final long serialVersionUID = 7028939326999242775L;
	
	private final String id;
	
	public CreateContactResponse(ServiceResponseStatus status, String info, String id) {
		super(status, info);
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
