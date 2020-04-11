package com.holded.api.invoicing.v1.contacts.entities;

import java.io.Serializable;
import java.util.List;

public class CreateContactBodyParams implements Serializable {

	private static final long serialVersionUID = -565929840896923999L;

	private final String customId;
	private final String name;
	private final String code;
	private final String email;
	private final String mobile;
	private final String phone;
	private final ContactType type;
	private final String iban;
	private final String swift;
	private final String sepaRef;
	private final String groupId;
	private final ContactTaxOperation taxOperation;
	private final Long sepaDate;
	private final Long clientRecord;
	private final Long supplierRecord;
	private final BillingAddress billAddress;
	private final NumberingSeries numberingSeries;
	private final List<CreatableShippingAddress> shippingAddresses;
	private final EditableContactDefaults defaults;
	private final ContactSocialNetworks socialNetworks;
	private final List<String> tags;
	private final String note;
	private final List<EditableContactPerson> contactPersons;
	
	public CreateContactBodyParams(String customId, String name, String code, String email, String mobile, String phone,
			ContactType type, String iban, String swift, String sepaRef, String groupId,
			ContactTaxOperation taxOperation, Long sepaDate, Long clientRecord, Long supplierRecord,
			BillingAddress billAddress, NumberingSeries numberingSeries, List<CreatableShippingAddress> shippingAddresses,
			EditableContactDefaults defaults, ContactSocialNetworks socialNetworks, List<String> tags, String note,
			List<EditableContactPerson> contactPersons) {
		this.customId = customId;
		this.name = name;
		this.code = code;
		this.email = email;
		this.mobile = mobile;
		this.phone = phone;
		this.type = type;
		this.iban = iban;
		this.swift = swift;
		this.sepaRef = sepaRef;
		this.groupId = groupId;
		this.taxOperation = taxOperation;
		this.sepaDate = sepaDate;
		this.clientRecord = clientRecord;
		this.supplierRecord = supplierRecord;
		this.billAddress = billAddress;
		this.numberingSeries = numberingSeries;
		this.shippingAddresses = shippingAddresses;
		this.defaults = defaults;
		this.socialNetworks = socialNetworks;
		this.tags = tags;
		this.note = note;
		this.contactPersons = contactPersons;
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

	public String getSepaRef() {
		return sepaRef;
	}

	public String getGroupId() {
		return groupId;
	}

	public ContactTaxOperation getTaxOperation() {
		return taxOperation;
	}

	public Long getSepaDate() {
		return sepaDate;
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

	public NumberingSeries getNumberingSeries() {
		return numberingSeries;
	}

	public List<CreatableShippingAddress> getShippingAddresses() {
		return shippingAddresses;
	}

	public EditableContactDefaults getDefaults() {
		return defaults;
	}

	public ContactSocialNetworks getSocialNetworks() {
		return socialNetworks;
	}

	public List<String> getTags() {
		return tags;
	}

	public String getNote() {
		return note;
	}

	public List<EditableContactPerson> getContactPersons() {
		return contactPersons;
	}
}
