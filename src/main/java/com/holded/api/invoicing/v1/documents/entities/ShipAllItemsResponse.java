package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;

public class ShipAllItemsResponse extends ServiceResponse implements Serializable {

	private static final long serialVersionUID = -8567317673936878858L;
	
	public ShipAllItemsResponse(ServiceResponseStatus status, String info) {
		super(status, info);
	}
}
