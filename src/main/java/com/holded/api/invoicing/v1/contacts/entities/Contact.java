package com.holded.api.invoicing.v1.contacts.entities;

import java.io.Serializable;
import java.util.List;

import com.holded.api.common.entities.CustomField;

public class Contact implements Serializable {

	private static final long serialVersionUID = 144787874843203305L;

	private final String id;
	private final String customId;
	private final String name;
	private final String code;
	private final String tradeName;
	private final String email;
	private final String mobile;
	private final String phone;
	private final ContactType type;
	private final String iban;
	private final String swift;
	private final Long clientRecord;
	private final Long supplierRecord;
	private final BillingAddress billAddress;
	private final ContactDefaults defaults;
	private final ContactSocialNetworks socialNetworks;
	private final List<String> tags;
	private final List<ContactNote> notes;
	private final List<ContactPerson> contactPersons;
	private final List<ShippingAddress> shippingAddresses;
	private final List<CustomField> customFields;
	
	public Contact(String id, String customId, String name, String code, String tradeName, String email, String mobile,
			String phone, ContactType type, String iban, String swift, Long clientRecord, Long supplierRecord,
			BillingAddress billAddress, ContactDefaults defaults, ContactSocialNetworks socialNetworks,
			List<String> tags, List<ContactNote> notes, List<ContactPerson> contactPersons,
			List<ShippingAddress> shippingAddresses, List<CustomField> customFields) {
		this.id = id;
		this.customId = customId;
		this.name = name;
		this.code = code;
		this.tradeName = tradeName;
		this.email = email;
		this.mobile = mobile;
		this.phone = phone;
		this.type = type;
		this.iban = iban;
		this.swift = swift;
		this.clientRecord = clientRecord;
		this.supplierRecord = supplierRecord;
		this.billAddress = billAddress;
		this.defaults = defaults;
		this.socialNetworks = socialNetworks;
		this.tags = tags;
		this.notes = notes;
		this.contactPersons = contactPersons;
		this.shippingAddresses = shippingAddresses;
		this.customFields = customFields;
	}

	public String getId() {
		return id;
	}

	public String getCustomId() {
		return customId;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public String getTradeName() {
		return tradeName;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return mobile;
	}

	public String getPhone() {
		return phone;
	}

	public ContactType getType() {
		return type;
	}

	public String getIban() {
		return iban;
	}

	public String getSwift() {
		return swift;
	}

	public Long getClientRecord() {
		return clientRecord;
	}

	public Long getSupplierRecord() {
		return supplierRecord;
	}

	public BillingAddress getBillAddress() {
		return billAddress;
	}

	public ContactDefaults getDefaults() {
		return defaults;
	}

	public ContactSocialNetworks getSocialNetworks() {
		return socialNetworks;
	}

	public List<String> getTags() {
		return tags;
	}

	public List<ContactNote> getNotes() {
		return notes;
	}

	public List<ContactPerson> getContactPersons() {
		return contactPersons;
	}

	public List<ShippingAddress> getShippingAddresses() {
		return shippingAddresses;
	}

	public List<CustomField> getCustomFields() {
		return customFields;
	}
}
