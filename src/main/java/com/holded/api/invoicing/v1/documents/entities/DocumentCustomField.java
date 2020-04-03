package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;

public class DocumentCustomField implements Serializable {

	private static final long serialVersionUID = 4820702602674017896L;

	private final String field;
	private final String value;
	
	public DocumentCustomField(String field, String value) {
		this.field = field;
		this.value = value;
	}
	
	public String getField() {
		return field;
	}
	
	public String getValue() {
		return value;
	}
}
