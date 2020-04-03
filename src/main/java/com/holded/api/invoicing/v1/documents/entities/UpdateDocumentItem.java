package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class UpdateDocumentItem implements Serializable {

	private static final long serialVersionUID = 3132526494128295935L;
	
	private final String name;
	private final String desc;
	private final BigDecimal subtotal;
	private final BigDecimal tax;
	private final List<String> tags;
	private final Integer units;
	private final BigDecimal discount;
	private final String kind;
	private final String sku;
	private final String lotSku;
	
	public UpdateDocumentItem(String name, String desc, BigDecimal subtotal, BigDecimal tax, List<String> tags,
			Integer units, BigDecimal discount, String kind, String sku, String lotSku) {
		this.name = name;
		this.desc = desc;
		this.subtotal = subtotal;
		this.tax = tax;
		this.tags = tags;
		this.units = units;
		this.discount = discount;
		this.kind = kind;
		this.sku = sku;
		this.lotSku = lotSku;
	}

	public String getName() {
		return name;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	
	public BigDecimal getTax() {
		return tax;
	}
	
	public List<String> getTags() {
		return tags;
	}
	
	public Integer getUnits() {
		return units;
	}
	
	public BigDecimal getDiscount() {
		return discount;
	}
	
	public String getKind() {
		return kind;
	}
	
	public String getSku() {
		return sku;
	}
	
	public String getLotSku() {
		return lotSku;
	}
}
