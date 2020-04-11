package com.holded.api.invoicing.v1.contacts.entities;

import java.io.Serializable;

public class ShippingAddress implements Serializable {

	private static final long serialVersionUID = -3896017184686978079L;
	
	private final String shippingId;
	private final String name;
	private final String address;
	private final String city;
	private final Integer postalCode;
	private final String province;
	private final String country;
	private final String countryCode;
	private final String notes;
	private final String privateNotes;
	
	public ShippingAddress(String shippingId, String name, String address, String city, Integer postalCode,
			String province, String country, String countryCode, String notes, String privateNotes) {
		this.shippingId = shippingId;
		this.name = name;
		this.address = address;
		this.city = city;
		this.postalCode = postalCode;
		this.province = province;
		this.country = country;
		this.countryCode = countryCode;
		this.notes = notes;
		this.privateNotes = privateNotes;
	}

	public String getShippingId() {
		return shippingId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public Integer getPostalCode() {
		return postalCode;
	}

	public String getProvince() {
		return province;
	}

	public String getCountry() {
		return country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getNotes() {
		return notes;
	}

	public String getPrivateNotes() {
		return privateNotes;
	}
}
