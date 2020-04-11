package com.holded.api.common.entities;

import java.io.Serializable;

public class CustomField implements Serializable {

	private static final long serialVersionUID = 4820702602674017896L;

	private final String field;
	private final String value;
	
	public CustomField(String field, String value) {
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
