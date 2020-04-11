package com.holded.api.invoicing.v1.contacts.entities;

import java.io.Serializable;

import com.holded.api.common.entities.ServiceResponse;
import com.holded.api.common.entities.ServiceResponseStatus;

public class UpdateContactResponse extends ServiceResponse implements Serializable {

	private static final long serialVersionUID = 5821765958548085396L;
	
	private final String id;
	
	public UpdateContactResponse(ServiceResponseStatus status, String info, String id) {
		super(status, info);
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
