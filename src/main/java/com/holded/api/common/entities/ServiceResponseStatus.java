package com.holded.api.common.entities;

public enum ServiceResponseStatus {
	OK(1),
	KO(0);
	
	private final Integer status;
	
	private ServiceResponseStatus(Integer status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return status.toString();
	}
}
