package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;

public class SalesOrderShippedItem implements Serializable {

	private static final long serialVersionUID = 8454232123320723544L;
	
	private final Integer itemLinePosition;
	private final Integer units;
	
	public SalesOrderShippedItem(Integer itemLinePosition, Integer units) {
		this.itemLinePosition = itemLinePosition;
		this.units = units;
	}
	
	public Integer getItemLinePosition() {
		return itemLinePosition;
	}
	
	public Integer getUnits() {
		return units;
	}
}
