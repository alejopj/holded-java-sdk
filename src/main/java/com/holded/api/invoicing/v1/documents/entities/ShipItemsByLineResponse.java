package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;

import com.holded.api.common.entities.ServiceResponse;
import com.holded.api.common.entities.ServiceResponseStatus;

public class ShipItemsByLineResponse extends ServiceResponse implements Serializable {

	private static final long serialVersionUID = -794562962368067721L;
	
	public ShipItemsByLineResponse(ServiceResponseStatus status, String info) {
		super(status, info);
	}
}
