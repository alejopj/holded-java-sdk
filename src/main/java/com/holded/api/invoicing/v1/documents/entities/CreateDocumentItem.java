package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class CreateDocumentItem implements Serializable {

	private static final long serialVersionUID = -1680982617571899376L;

	private final String name;
	private final String desc;
	private final Integer units;
	private final String sku;
	private final String serviceId;
	private final String accountingAccountId;
	private final BigDecimal subtotal;
	private final BigDecimal discount;
	private final BigDecimal tax;
	private final BigDecimal retention;
	private final BigDecimal equivalenceSurcharge;
	private final List<String> tags;
	
	public CreateDocumentItem(String name, String desc, Integer units, String sku, String serviceId,
			String accountingAccountId, BigDecimal subtotal, BigDecimal discount, BigDecimal tax, BigDecimal retention,
			BigDecimal equivalenceSurcharge, List<String> tags) {
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

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public BigDecimal getRetention() {
		return retention;
	}

	public BigDecimal getEquivalenceSurcharge() {
		return equivalenceSurcharge;
	}

	public List<String> getTags() {
		return tags;
	}
}
