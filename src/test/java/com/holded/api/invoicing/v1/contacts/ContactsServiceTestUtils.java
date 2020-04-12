package com.holded.api.invoicing.v1.contacts;

import java.util.ArrayList;
import java.util.List;

import com.holded.api.common.CommonTestUtils;
import com.holded.api.common.TestDataGenerator;
import com.holded.api.common.entities.Language;
import com.holded.api.common.entities.PaymentMethod;
import com.holded.api.invoicing.v1.contacts.entities.BillingAddress;
import com.holded.api.invoicing.v1.contacts.entities.ContactSocialNetworks;
import com.holded.api.invoicing.v1.contacts.entities.ContactTaxOperation;
import com.holded.api.invoicing.v1.contacts.entities.ContactType;
import com.holded.api.invoicing.v1.contacts.entities.CreatableShippingAddress;
import com.holded.api.invoicing.v1.contacts.entities.CreateContactBodyParams;
import com.holded.api.invoicing.v1.contacts.entities.EditableContactDefaults;
import com.holded.api.invoicing.v1.contacts.entities.EditableContactPerson;
import com.holded.api.invoicing.v1.contacts.entities.NumberingSeries;
import com.holded.api.invoicing.v1.contacts.entities.UpdatableShippingAddress;
import com.holded.api.invoicing.v1.contacts.entities.UpdateContactBodyParams;

public class ContactsServiceTestUtils {
	
	private static final Integer DUE_DATES = 7;
	
	public static CreateContactBodyParams getCreateContactBodyParams(String contactGroupId, Long clientRecord,
			Long supplierRecord) {
		String customId = TestDataGenerator.getAlphaNumericId();
		String name = TestDataGenerator.getContactName();
		String code = TestDataGenerator.getContactCode();
		String email = TestDataGenerator.getEmail();
		String mobile = TestDataGenerator.getCellPhone();
		String phone = TestDataGenerator.getPhone();
		ContactType type = TestDataGenerator.getContactType();
		String iban = TestDataGenerator.getIban();
		String swift = TestDataGenerator.getSwift();
		String sepaRef = TestDataGenerator.getSepaReferenceNumber();
		ContactTaxOperation taxOperation = TestDataGenerator.getContactTaxOperation();
		Long sepaDate = TestDataGenerator.getFutureDate();
		BillingAddress billAddress = getBillingAddress();
		NumberingSeries numberingSeries = getNumberingSeries();
		List<CreatableShippingAddress> shippingAddresses = getCreatableShippingAddresses();
		EditableContactDefaults defaults = getEditableContactDefaults();
		ContactSocialNetworks socialNetworks = getContactSocialNetworks();
		List<String> tags = CommonTestUtils.getTags();
		String note = TestDataGenerator.getShortText();
		List<EditableContactPerson> contactPersons = getEditableContactPeople();
		return new CreateContactBodyParams(customId, name, code, email, mobile, phone, type, iban, swift, sepaRef,
				contactGroupId, taxOperation, sepaDate, clientRecord, supplierRecord, billAddress, numberingSeries,
				shippingAddresses, defaults, socialNetworks, tags, note, contactPersons);
	}

	public static UpdateContactBodyParams getUpdateContactBodyParams(String contactGroupId, Long clientRecord,
			Long supplierRecord) {
		String name = TestDataGenerator.getContactName();
		String code = TestDataGenerator.getContactCode();
		String tradeName = TestDataGenerator.getContactName();
		String email = TestDataGenerator.getEmail();
		String mobile = TestDataGenerator.getCellPhone();
		String phone = TestDataGenerator.getPhone();
		ContactType type = TestDataGenerator.getContactType();
		String iban = TestDataGenerator.getIban();
		String swift = TestDataGenerator.getSwift();
		String sepaRef = TestDataGenerator.getSepaReferenceNumber();
		Long sepaDate = TestDataGenerator.getFutureDate();
		ContactTaxOperation taxOperation = TestDataGenerator.getContactTaxOperation();
		BillingAddress billAddress = getBillingAddress();
		List<UpdatableShippingAddress> shippingAddresses = getUpdatableShippingAddresses();
		NumberingSeries numberingSeries = getNumberingSeries();
		ContactSocialNetworks socialNetworks = getContactSocialNetworks();
		return new UpdateContactBodyParams(name, code, tradeName, email, mobile, phone, type, iban, swift, sepaRef,
				sepaDate, clientRecord, supplierRecord, contactGroupId, taxOperation, billAddress, shippingAddresses,
				socialNetworks, numberingSeries);
	}

	private static BillingAddress getBillingAddress() {
		String address = TestDataGenerator.getAddress();
		String city = TestDataGenerator.getCity();
		Integer postalCode = TestDataGenerator.getIntegerPostalCode();
		String province = TestDataGenerator.getProvince();
		String country = TestDataGenerator.getCountry();
		String countryCode = TestDataGenerator.getCountryCode();
		String info = TestDataGenerator.getShortText();
		return new BillingAddress(address, city, postalCode, province, country, countryCode, info);
	}

	private static NumberingSeries getNumberingSeries() {
		// By default.
		String invoice = null;
		String receipt = null;
		String salesOrder = null;
		String purchasesOrder = null;
		String proform = null;
		String waybill = null;
		return new NumberingSeries(invoice, receipt, salesOrder, purchasesOrder, proform, waybill);
	}
	
	private static List<CreatableShippingAddress> getCreatableShippingAddresses() {
		List<CreatableShippingAddress> items = new ArrayList<>();
		Integer n = TestDataGenerator.getInteger(CommonTestUtils.SHORT_LIST_SIZE) + 1;
		for (int i = 0; i < n; i++) {
			CreatableShippingAddress item = getCreatableShippingAddress();
			items.add(item);
		}
		return items;
	}
	
	private static CreatableShippingAddress getCreatableShippingAddress() {
		String name = TestDataGenerator.getContactName();
		String address = TestDataGenerator.getAddress();
		String city = TestDataGenerator.getCity();
		Integer postalCode = TestDataGenerator.getIntegerPostalCode();
		String province = TestDataGenerator.getProvince();
		String country = TestDataGenerator.getCountryCode();
		String note = TestDataGenerator.getShortText();
		String privateNote = TestDataGenerator.getShortText();
		return new CreatableShippingAddress(name, address, city, postalCode, province, country, note, privateNote);
	}
	
	private static EditableContactDefaults getEditableContactDefaults() {
		// TODO Validate if it is possible to create accounts from here.
		Long expensesAccountRecord = TestDataGenerator.getLongId();
		String expensesAccountName = TestDataGenerator.getWord();
		Long salesAccountRecord = TestDataGenerator.getLongId();
		String salesAccountName = TestDataGenerator.getWord();
		Integer dueDays = TestDataGenerator.getInteger(DUE_DATES);
		Integer salesTax = TestDataGenerator.getPercentage();
		Integer purchasesTax = TestDataGenerator.getPercentage();
		PaymentMethod paymentMethod = TestDataGenerator.getPaymentMethod();
		Integer discount = TestDataGenerator.getPercentage();
		Language language = TestDataGenerator.getLanguage();
		Boolean showTradeNameOnDocs = TestDataGenerator.getBoolean();
		Boolean showCountryOnDocs = TestDataGenerator.getBoolean();
		return new EditableContactDefaults(expensesAccountRecord, expensesAccountName, salesAccountRecord,
				salesAccountName, dueDays, salesTax, purchasesTax, paymentMethod, discount, language,
				showTradeNameOnDocs, showCountryOnDocs);
	}
	
	private static ContactSocialNetworks getContactSocialNetworks() {
		String website = TestDataGenerator.getWebsite();
		return new ContactSocialNetworks(website);
	}
	
	private static List<EditableContactPerson> getEditableContactPeople() {
		List<EditableContactPerson> items = new ArrayList<>();
		Integer n = TestDataGenerator.getInteger(CommonTestUtils.SHORT_LIST_SIZE) + 1;
		for (int i = 0; i < n; i++) {
			EditableContactPerson item = getEditableContactPerson();
			items.add(item);
		}
		return items;
	}
	
	private static EditableContactPerson getEditableContactPerson() {
		String name = TestDataGenerator.getContactName();
		String phone = TestDataGenerator.getPhone();
		String email = TestDataGenerator.getEmail();
		return new EditableContactPerson(name, phone, email);
	}
	
	private static List<UpdatableShippingAddress> getUpdatableShippingAddresses() {
		List<UpdatableShippingAddress> items = new ArrayList<>();
		Integer n = TestDataGenerator.getInteger(CommonTestUtils.SHORT_LIST_SIZE) + 1;
		for (int i = 0; i < n; i++) {
			UpdatableShippingAddress item = getUpdatableShippingAddress();
			items.add(item);
		}
		return items;
	}

	private static UpdatableShippingAddress getUpdatableShippingAddress() {
		String name = TestDataGenerator.getContactName();
		String address = TestDataGenerator.getAddress();
		String city = TestDataGenerator.getCity();
		Integer postalCode = TestDataGenerator.getIntegerPostalCode();
		String province = TestDataGenerator.getProvince();
		String country = TestDataGenerator.getCountryCode();
		String notes = TestDataGenerator.getShortText();
		String privateNote = TestDataGenerator.getShortText();
		return new UpdatableShippingAddress(name, address, city, postalCode, province, country, notes, privateNote);
	}
}
