package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;
import java.math.BigDecimal;

public class PayDocumentBodyParams implements Serializable {

	private static final long serialVersionUID = 1213358863663054752L;

	private final Integer date;
	private final String treasury;
	private final String desc;
	private final BigDecimal amount;
	
	public PayDocumentBodyParams(Integer date, String treasury, String desc, BigDecimal amount) {
		this.date = date;
		this.treasury = treasury;
		this.desc = desc;
		this.amount = amount;
	}
	
	/**
	 * @return Required. Date.
	 */
	public Integer getDate() {
		return date;
	}
	
	public String getTreasury() {
		return treasury;
	}
	
	public String getDesc() {
		return desc;
	}
	
	/**
	 * @return Required. Amount.
	 */
	public BigDecimal getAmount() {
		return amount;
	}
}
