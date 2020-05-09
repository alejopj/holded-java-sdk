package com.holded.api.invoicing.v1.contacts.entities;

import java.io.Serializable;
import java.util.Currency;

import com.holded.api.common.entities.Language;
import com.holded.api.common.entities.PaymentMethod;

public class ContactDefaults implements Serializable {

	private static final long serialVersionUID = 2209964184299889100L;
	// TODO Ignored due to API's issue. Not RFC 8259 compliant. When data is present it randomly returns a string or an object. Otherwise it returns an integer.
	private final transient String salesChannel;
	// TODO Ignored due to API's issue. Not RFC 8259 compliant. When data is present it randomly returns a string or an object. Otherwise it returns an integer.
	private final transient String expensesAccount;
	private final Integer dueDays;
	private final PaymentMethod paymentMethod;
	private final Integer discount;
	private final Language language;
	private final String currency;
	private final ContactTaxType tax;
	private final ContactRetentionType retention;
	
	public ContactDefaults(String salesChannel, String expensesAccount, Integer dueDays, PaymentMethod paymentMethod,
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

	public String getSalesChannel() {
		return salesChannel;
	}

	public String getExpensesAccount() {
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
