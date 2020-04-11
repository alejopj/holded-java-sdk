package com.holded.api.invoicing.v1.contacts.entities;

import java.io.Serializable;

import com.holded.api.common.entities.Language;
import com.holded.api.common.entities.PaymentMethod;

public class EditableContactDefaults implements Serializable {

	private static final long serialVersionUID = -6378160976971992728L;
	
	private final Long expensesAccountRecord;
	private final String expensesAccountName;
	private final Long salesAccountRecord;
	private final String salesAccountName;
	private final Integer dueDays;
	private final Integer salesTax;
	private final Integer purchasesTax;
	private final PaymentMethod paymentMethod;
	private final Integer discount;
	private final Language language;
	private final Boolean showTradeNameOnDocs;
	private final Boolean showCountryOnDocs;
	
	public EditableContactDefaults(Long expensesAccountRecord, String expensesAccountName, Long salesAccountRecord,
			String salesAccountName, Integer dueDays, Integer salesTax, Integer purchasesTax,
			PaymentMethod paymentMethod, Integer discount, Language language, Boolean showTradeNameOnDocs,
			Boolean showCountryOnDocs) {
		this.expensesAccountRecord = expensesAccountRecord;
		this.expensesAccountName = expensesAccountName;
		this.salesAccountRecord = salesAccountRecord;
		this.salesAccountName = salesAccountName;
		this.dueDays = dueDays;
		this.salesTax = salesTax;
		this.purchasesTax = purchasesTax;
		this.paymentMethod = paymentMethod;
		this.discount = discount;
		this.language = language;
		this.showTradeNameOnDocs = showTradeNameOnDocs;
		this.showCountryOnDocs = showCountryOnDocs;
	}

	public Long getExpensesAccountRecord() {
		return expensesAccountRecord;
	}

	public String getExpensesAccountName() {
		return expensesAccountName;
	}

	public Long getSalesAccountRecord() {
		return salesAccountRecord;
	}

	public String getSalesAccountName() {
		return salesAccountName;
	}

	public Integer getDueDays() {
		return dueDays;
	}

	public Integer getSalesTax() {
		return salesTax;
	}

	public Integer getPurchasesTax() {
		return purchasesTax;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public Integer getDiscount() {
		return discount;
	}

	public Language getLanguage() {
		return language;
	}

	public Boolean getShowTradeNameOnDocs() {
		return showTradeNameOnDocs;
	}

	public Boolean getShowCountryOnDocs() {
		return showCountryOnDocs;
	}
}
