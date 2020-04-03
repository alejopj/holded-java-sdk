package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;

public class ServiceResponse implements Serializable {

	private static final long serialVersionUID = 7717401455000326425L;

	private final ServiceResponseStatus status;
	private final String info;
	
	public ServiceResponse(ServiceResponseStatus status, String info) {
		super();
		this.status = status;
		this.info = info;
	}

	public ServiceResponseStatus getStatus() {
		return status;
	}

	public String getInfo() {
		return info;
	}
}
