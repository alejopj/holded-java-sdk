package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;
import java.util.List;

public class CreateDocumentItem implements Serializable {

	private static final long serialVersionUID = -1680982617571899376L;

	private final String name;
	private final String desc;
	private final Integer units;
	private final transient String sku;
	private final String serviceId;
	private final String accountingAccountId;
	private final Float subtotal;
	private final Float discount;
	private final Integer tax;
	private final Float retention;
	private final Float equivalenceSurcharge;
	private final List<String> tags;
	
	public CreateDocumentItem(String name, String desc, Integer units, String sku, String serviceId,
			String accountingAccountId, Float subtotal, Float discount, Integer tax, Float retention,
			Float equivalenceSurcharge, List<String> tags) {
		this.name = name;
		this.desc = desc;
		this.units = units;
		this.sku = sku;
		this.serviceId = serviceId;
		this.accountingAccountId = accountingAccountId;
		this.subtotal = subtotal;
		this.discount = discount;
		this.tax = tax;
		this.retention = retention;
		this.equivalenceSurcharge = equivalenceSurcharge;
		this.tags = tags;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public Integer getUnits() {
		return units;
	}

	public String getSku() {
		return sku;
	}

	public String getServiceId() {
		return serviceId;
	}

	public String getAccountingAccountId() {
		return accountingAccountId;
	}

	public Float getSubtotal() {
		return subtotal;
	}

	public Float getDiscount() {
		return discount;
	}

	public Integer getTax() {
		return tax;
	}

	public Float getRetention() {
		return retention;
	}

	public Float getEquivalenceSurcharge() {
		return equivalenceSurcharge;
	}

	public List<String> getTags() {
		return tags;
	}
}
