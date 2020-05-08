package com.holded.api.invoicing.v1.contacts.entities;

import java.io.Serializable;

public class BillingAddress implements Serializable {

	private static final long serialVersionUID = 5709056675534912494L;
	
	private String address;
	private String city;
	private Integer postalCode;
	private String province;
	private String country;
	private String countryCode;
	private String info;

	public BillingAddress() {
		
	}
	
	public BillingAddress(String address, String city, Integer postalCode, String province, String country,
			String countryCode, String info) {
		this.address = address;
		this.city = city;
		this.postalCode = postalCode;
		this.province = province;
		this.country = country;
		this.countryCode = countryCode;
		this.info = info;
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

	public String getInfo() {
		return info;
	}
}
