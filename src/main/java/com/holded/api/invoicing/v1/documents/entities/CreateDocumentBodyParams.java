package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.holded.api.common.entities.CustomField;
import com.holded.api.common.entities.Language;
import com.holded.api.common.entities.PaymentMethod;

/**
 * - Matching products or services
 * To match products or services you have already created inside Holded, you can use the "sku" field for products,
 * or the "serviceId" field for services.
 * - Purchase notes / Purchases receipts 
 * If you want to create a purchase receipt, you will need to set the docType as purchase and add this field in your
 * JSON:
 * "isReceipt": true
 */
public class CreateDocumentBodyParams implements Serializable {

	private static final long serialVersionUID = -9172126890323639438L;
	
	private Boolean applyContactDefaults = true;
	private final String contactCode;
	private final String contactName;
	private final String contactEmail;
	private final String contactAddress;
	private final String contactCity;
	private final String contactCp;
	private final String contactProvince;
	private final String contactCountry;
	private final String contactCountryCode;
	private final String desc;
	private final Long date;
	private final String notes;
	private final String salesChannelId;
	private final PaymentMethod paymentMethodId;
	private final String designId;
	private final Language language;
	private final List<CreateDocumentItem> items;
	private final List<CustomField> customFields;
	private final String invoiceNum;
	private final String numSerieId;
	private final String currency;
	private final BigDecimal currencyChange;
	private final List<String> tags;
	private final Long dueDate;
	private final String shippingAddress;
	private final String shippingPostalCode;
	private final String shippingCity;
	private final String shippingProvince;
	private final String shippingCountry;
	// TODO Probable API documentation error.
	private final BigDecimal salesChannel;
	private Boolean isReceipt;
	
	public CreateDocumentBodyParams(String contactCode, String contactName,
			String contactEmail, String contactAddress, String contactCity, String contactPostalCode,
			String contactProvince, String contactCountry, String contactCountryCode, String description, Long date,
			String notes, String salesChannelId, PaymentMethod paymentMethodId, String designId, Language language,
			List<CreateDocumentItem> items, List<CustomField> customFields, String invoiceNum, String numSerieId,
			String currency, BigDecimal currencyChange, List<String> tags, Long dueDate, String shippingAddress,
			String shippingPostalCode, String shippingCity, String shippingProvince, String shippingCountry,
			BigDecimal salesChannel) {
		this(true, contactCode, contactName, contactEmail, contactAddress, contactCity,
				contactPostalCode, contactProvince, contactCountry, contactCountryCode, description, date, notes,
				salesChannelId, paymentMethodId, designId, language, items, customFields, invoiceNum, numSerieId,
				currency, currencyChange, tags, dueDate, shippingAddress, shippingPostalCode, shippingCity,
				shippingProvince, shippingCountry, salesChannel);
	}
	
	public CreateDocumentBodyParams(String contactCode, String contactName,
			String contactEmail, String contactAddress, String contactCity, String contactPostalCode,
			String contactProvince, String contactCountry, String contactCountryCode, String description, Long date,
			String notes, String salesChannelId, PaymentMethod paymentMethodId, String designId, Language language,
			List<CreateDocumentItem> items, List<CustomField> customFields, String invoiceNum, String numSerieId,
			String currency, BigDecimal currencyChange, List<String> tags, Long dueDate, String shippingAddress,
			String shippingPostalCode, String shippingCity, String shippingProvince, String shippingCountry,
			BigDecimal salesChannel, Boolean isReceipt) {
		this(true, contactCode, contactName, contactEmail, contactAddress, contactCity,
				contactPostalCode, contactProvince, contactCountry, contactCountryCode, description, date, notes,
				salesChannelId, paymentMethodId, designId, language, items, customFields, invoiceNum, numSerieId,
				currency, currencyChange, tags, dueDate, shippingAddress, shippingPostalCode, shippingCity,
				shippingProvince, shippingCountry, salesChannel, isReceipt);
	}
	
	public CreateDocumentBodyParams(Boolean applyContactDefaults, String contactCode, String contactName,
			String contactEmail, String contactAddress, String contactCity, String contactPostalCode,
			String contactProvince, String contactCountry, String contactCountryCode, String description, Long date,
			String notes, String salesChannelId, PaymentMethod paymentMethodId, String designId, Language language,
			List<CreateDocumentItem> items, List<CustomField> customFields, String invoiceNum, String numSerieId,
			String currency, BigDecimal currencyChange, List<String> tags, Long dueDate, String shippingAddress,
			String shippingPostalCode, String shippingCity, String shippingProvince, String shippingCountry,
			BigDecimal salesChannel) {
		this(applyContactDefaults, contactCode, contactName, contactEmail, contactAddress, contactCity,
				contactPostalCode, contactProvince, contactCountry, contactCountryCode, description, date, notes,
				salesChannelId, paymentMethodId, designId, language, items, customFields, invoiceNum, numSerieId,
				currency, currencyChange, tags, dueDate, shippingAddress, shippingPostalCode, shippingCity,
				shippingProvince, shippingCountry, salesChannel, null);
	}

	public CreateDocumentBodyParams(Boolean applyContactDefaults, String contactCode, String contactName,
			String contactEmail, String contactAddress, String contactCity, String contactCp,
			String contactProvince, String contactCountry, String contactCountryCode, String desc, Long date,
			String notes, String salesChannelId, PaymentMethod paymentMethodId, String designId, Language language,
			List<CreateDocumentItem> items, List<CustomField> customFields, String invoiceNum, String numSerieId,
			String currency, BigDecimal currencyChange, List<String> tags, Long dueDate, String shippingAddress,
			String shippingPostalCode, String shippingCity, String shippingProvince, String shippingCountry,
			BigDecimal salesChannel, Boolean isReceipt) {
		this.applyContactDefaults = applyContactDefaults;
		this.contactCode = contactCode;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.contactAddress = contactAddress;
		this.contactCity = contactCity;
		this.contactCp = contactCp;
		this.contactProvince = contactProvince;
		this.contactCountry = contactCountry;
		this.contactCountryCode = contactCountryCode;
		this.desc = desc;
		this.date = date;
		this.notes = notes;
		this.salesChannelId = salesChannelId;
		this.paymentMethodId = paymentMethodId;
		this.designId = designId;
		this.language = language;
		this.items = items;
		this.customFields = customFields;
		this.invoiceNum = invoiceNum;
		this.numSerieId = numSerieId;
		this.currency = currency;
		this.currencyChange = currencyChange;
		this.tags = tags;
		this.dueDate = dueDate;
		this.shippingAddress = shippingAddress;
		this.shippingPostalCode = shippingPostalCode;
		this.shippingCity = shippingCity;
		this.shippingProvince = shippingProvince;
		this.shippingCountry = shippingCountry;
		this.salesChannel = salesChannel;
		this.isReceipt = isReceipt;
	}

	/**
	 * @return Contact defaults are applied by default. If you don't want to apply it, set this field to false.
	 */
	public Boolean getApplyContactDefaults() {
		return applyContactDefaults;
	}

	/**
	 * @return (NIF / CIF / VAT)
	 */
	public String getContactCode() {
		return contactCode;
	}

	public String getContactName() {
		return contactName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public String getContactCity() {
		return contactCity;
	}

	public String getContactCp() {
		return contactCp;
	}

	public String getContactProvince() {
		return contactProvince;
	}

	public String getContactCountry() {
		return contactCountry;
	}

	public String getContactCountryCode() {
		return contactCountryCode;
	}

	public String getDesc() {
		return desc;
	}

	/**
	 * @return Required. Date.
	 */
	public Long getDate() {
		return date;
	}

	public String getNotes() {
		return notes;
	}

	public String getSalesChannelId() {
		return salesChannelId;
	}

	public PaymentMethod getPaymentMethodId() {
		return paymentMethodId;
	}

	public String getDesignId() {
		return designId;
	}

	public Language getLanguage() {
		return language;
	}

	public List<CreateDocumentItem> getItems() {
		return items;
	}

	public List<CustomField> getCustomFields() {
		return customFields;
	}

	public String getInvoiceNum() {
		return invoiceNum;
	}

	public String getNumSerieId() {
		return numSerieId;
	}

	public String getCurrency() {
		return currency;
	}

	public BigDecimal getCurrencyChange() {
		return currencyChange;
	}

	public List<String> getTags() {
		return tags;
	}

	public Long getDueDate() {
		return dueDate;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public String getShippingPostalCode() {
		return shippingPostalCode;
	}

	public String getShippingCity() {
		return shippingCity;
	}

	public String getShippingProvince() {
		return shippingProvince;
	}

	public String getShippingCountry() {
		return shippingCountry;
	}

	public BigDecimal getSalesChannel() {
		return salesChannel;
	}

	/**
	 * @return If you want to create a purchase receipt, you will need to set the docType as purchase and add this field in your JSON:
	 * "isReceipt": true
	 */
	public Boolean getIsReceipt() {
		return isReceipt;
	}
}
