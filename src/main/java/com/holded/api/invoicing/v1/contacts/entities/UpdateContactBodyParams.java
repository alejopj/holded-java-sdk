package com.holded.api.invoicing.v1.contacts.entities;

import java.io.Serializable;
import java.util.List;

public class UpdateContactBodyParams implements Serializable {

	private static final long serialVersionUID = 8424938366628291723L;
	
	private final String name;
	private final String code;
	private final String tradeName;
	private final String email;
	private final String mobile;
	private final String phone;
	private final ContactType type;
	private final String iban;
	private final String swift;
	private final String sepaRef;
	private final Long sepaDate;
	private final Long clientRecord;
	private final Long supplierRecord;
	private final String groupId;
	private final ContactTaxOperation taxOperation;
	private final BillingAddress billAddress;
	private final List<UpdatableShippingAddress> shippingAddresses;
	private final ContactSocialNetworks socialNetworks;
	private final NumberingSeries numberingSeries;
	
	public UpdateContactBodyParams(String name, String code, String tradeName, String email, String mobile,
			String phone, ContactType type, String iban, String swift, String sepaRef, Long sepaDate, Long clientRecord,
			Long supplierRecord, String groupId, ContactTaxOperation taxOperation, BillingAddress billAddress,
			List<UpdatableShippingAddress> shippingAddresses, ContactSocialNetworks socialNetworks,
			NumberingSeries numberingSeries) {
		this.name = name;
		this.code = code;
		this.tradeName = tradeName;
		this.email = email;
		this.mobile = mobile;
		this.phone = phone;
		this.type = type;
		this.iban = iban;
		this.swift = swift;
		this.sepaRef = sepaRef;
		this.sepaDate = sepaDate;
		this.clientRecord = clientRecord;
		this.supplierRecord = supplierRecord;
		this.groupId = groupId;
		this.taxOperation = taxOperation;
		this.billAddress = billAddress;
		this.shippingAddresses = shippingAddresses;
		this.socialNetworks = socialNetworks;
		this.numberingSeries = numberingSeries;
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

	public String getSepaRef() {
		return sepaRef;
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

	public String getGroupId() {
		return groupId;
	}

	public ContactTaxOperation getTaxOperation() {
		return taxOperation;
	}

	public BillingAddress getBillAddress() {
		return billAddress;
	}

	public List<UpdatableShippingAddress> getShippingAddresses() {
		return shippingAddresses;
	}

	public ContactSocialNetworks getSocialNetworks() {
		return socialNetworks;
	}

	public NumberingSeries getNumberingSeries() {
		return numberingSeries;
	}
}
