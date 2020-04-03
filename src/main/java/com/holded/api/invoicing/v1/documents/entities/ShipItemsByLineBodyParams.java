package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;
import java.util.List;

public class ShipItemsByLineBodyParams implements Serializable {

	private static final long serialVersionUID = -4934972128374437896L;

	private final List<SalesOrderShippedItem> lines;

	public ShipItemsByLineBodyParams(List<SalesOrderShippedItem> lines) {
		this.lines = lines;
	}

	public List<SalesOrderShippedItem> getLines() {
		return lines;
	}
	
}
