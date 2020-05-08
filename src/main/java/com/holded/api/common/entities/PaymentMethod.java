package com.holded.api.common.entities;

import com.google.gson.annotations.SerializedName;

public enum PaymentMethod {
	@SerializedName("5e5a9c6a6a97287bf9542e3b")
	WIRE_TRANSFER("5e5a9c6a6a97287bf9542e3b"),
	@SerializedName("5e5a9c6a6a97287bf9542e3c")
	CASH_PAYMENT("5e5a9c6a6a97287bf9542e3c");

	private final String paymentMethodId;
	
	private PaymentMethod(String paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	@Override
	public String toString() {
		return paymentMethodId;
	}
}
