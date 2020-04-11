package com.holded.api.invoicing.v1.contacts.entities;

import java.io.Serializable;

public class CreatableShippingAddress implements Serializable {

	private static final long serialVersionUID = -1961024172702960759L;
	
	private final String name;
	private final String address;
	private final String city;
	private final Integer postalCode;
	private final String province;
	private final String country;
	private final String note;
	private final String privateNote;
	
	public CreatableShippingAddress(String name, String address, String city, Integer postalCode, String province,
			String country, String note, String privateNote) {
		this.name = name;
		this.address = address;
		this.city = city;
		this.postalCode = postalCode;
		this.province = province;
		this.country = country;
		this.note = note;
		this.privateNote = privateNote;
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

	public String getNote() {
		return note;
	}

	public String getPrivateNote() {
		return privateNote;
	}
}
