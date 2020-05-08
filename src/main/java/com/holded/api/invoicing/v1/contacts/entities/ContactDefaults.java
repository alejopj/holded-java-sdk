package com.holded.api.invoicing.v1.contacts.entities;

import java.io.Serializable;
import java.util.Currency;

import com.holded.api.common.entities.Language;
import com.holded.api.common.entities.PaymentMethod;

public class ContactDefaults implements Serializable {

	private static final long serialVersionUID = 2209964184299889100L;
	
	private final Long salesChannel;
	private final Long expensesAccount;
	private final Integer dueDays;
	private final PaymentMethod paymentMethod;
	private final Integer discount;
	private final Language language;
	private final String currency;
	private final ContactTaxType tax;
	private final ContactRetentionType retention;
	
	public ContactDefaults(Long salesChannel, Long expensesAccount, Integer dueDays, PaymentMethod paymentMethod,
			Integer discount, Language language, String currency, ContactTaxType tax, ContactRetentionType retention) {
		this.salesChannel = salesChannel;
		this.expensesAccount = expensesAccount;
		this.dueDays = dueDays;
		this.paymentMethod = paymentMethod;
		this.discount = discount;
		this.language = language;
		this.currency = currency;
		this.tax = tax;
		this.retention = retention;
	}

	public Long getSalesChannel() {
		return salesChannel;
	}

	public Long getExpensesAccount() {
		return expensesAccount;
	}

	public Integer getDueDays() {
		return dueDays;
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
	
	public Currency getCurrency() {
		return Currency.getInstance(currency);
	}
	
	public ContactTaxType getTax() {
		return tax;
	}

	public ContactRetentionType getRetention() {
		return retention;
	}
}
