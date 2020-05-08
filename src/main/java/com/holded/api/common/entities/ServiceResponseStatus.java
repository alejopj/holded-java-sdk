package com.holded.api.common.entities;

import com.google.gson.annotations.SerializedName;

public enum ServiceResponseStatus {
	@SerializedName("1")
	OK(1),
	@SerializedName("0")
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
