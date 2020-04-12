package com.holded.api.common;

import java.io.File;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;

import com.github.javafaker.Faker;
import com.holded.api.common.entities.Language;
import com.holded.api.common.entities.PaymentMethod;
import com.holded.api.invoicing.v1.contacts.entities.ContactTaxOperation;
import com.holded.api.invoicing.v1.contacts.entities.ContactType;

public class TestDataGenerator {
	
	private static Faker FAKER = new Faker();
	
	// Id

	public static String getAlphaNumericId() {
		return FAKER.internet().uuid();
	}
	
	public static Long getLongId() {
		return FAKER.random().nextLong();
	}
	
	// Email
	
	public static String getEmail() {
		return FAKER.internet().safeEmailAddress();
	}
	
	public static String getEmailSubject() {
		return FAKER.book().title();
	}
	
	public static String getEmailMessage() {
		return FAKER.lorem().sentence();
	}
	
	// Website
	
	public static String getWebsite() {
		return FAKER.internet().domainName();
	}
	
	// Phone
	
	public static String getPhone() {
		return FAKER.phoneNumber().phoneNumber();
	}
	
	public static String getCellPhone() {
		return FAKER.phoneNumber().cellPhone();
	}
	
	// File

	public static File getFile() {
		File file = new File("");
		try {
			Path path = Files.createTempFile(FAKER.file().fileName(), null);
			file = path.toFile();
			String text = FAKER.lorem().paragraph();
			Files.writeString(path, text);
		} catch (Exception e) {
		}
		return file;
	}
	
	// Boolean
	
	public static Boolean getBoolean() {
		return FAKER.bool().bool();
	}
	
	// Contact
	
	public static String getContactCode() {
		return FAKER.idNumber().ssnValid();
	}

	public static String getContactName() {
		return FAKER.name().fullName();
	}
	
	public static ContactType getContactType() {
		ContactType[] contactTypes = ContactType.values();
		int i = FAKER.random().nextInt(contactTypes.length);
		return contactTypes[i];
	}
	
	public static ContactTaxOperation getContactTaxOperation() {
		ContactTaxOperation[] contactTaxOperations = ContactTaxOperation.values();
		int i = FAKER.random().nextInt(contactTaxOperations.length);
		return contactTaxOperations[i];
	}
	
	// Address

	public static String getAddress() {
		return FAKER.address().streetAddress();
	}

	public static String getCity() {
		return FAKER.address().city();
	}

	public static String getPostalCode() {
		return FAKER.address().zipCode();
	}
	
	public static Integer getIntegerPostalCode() {
		return getInteger((100000) + 10000) % 100000;
	}

	public static String getProvince() {
		return FAKER.address().state();
	}

	public static String getCountry() {
		return FAKER.address().country();
	}

	public static String getCountryCode() {
		return FAKER.address().countryCode();
	}
	
	// Payment method
	
	public static PaymentMethod getPaymentMethod() {
		PaymentMethod[] paymentMethods = PaymentMethod.values();
		int i = FAKER.random().nextInt(paymentMethods.length);
		return paymentMethods[i];
	}
	
	// Bank account
	
	public static String getIban() {
		return FAKER.finance().iban();
	}
	
	public static String getSwift() {
		return FAKER.finance().bic() + FAKER.finance().iban();
	}
	
	public static String getSepaReferenceNumber() {
		return FAKER.bothify("[A-Z0-9]{35}");
	}
	
	// Text
	
	public static String getShortText() {
		return FAKER.lorem().sentence();
	}
	
	public static String getWord() {
		return FAKER.lorem().word();
	}
	
	// Date

	public static Long getPastDate() {
		return FAKER.date().past(1, TimeUnit.SECONDS).toInstant().toEpochMilli();
	}
	
	public static Long getFutureDate() {
		return FAKER.date().future(1, TimeUnit.SECONDS).toInstant().toEpochMilli();
	}

	// Language
	
	public static Language getLanguage() {
		Language[] availableLanguages = Language.values();
		int i = FAKER.random().nextInt(availableLanguages.length);
		return availableLanguages[i];
	}
	
	// Currency
	
	public static String getCurrency() {
		return FAKER.currency().code();
	}
	
	public static BigDecimal getCurrencyExchangeRate() {
		return getNumber();
	}
	
	// Number
	
	public static Integer getPercentage() {
		return getInteger(100);
	}
	
	public static Integer getInteger(int n) {
		return FAKER.random().nextInt(n);
	}
	
	public static BigDecimal getNumber() {
		return new BigDecimal(FAKER.random().nextDouble());
	}
	
	// Product
	
	public static String getProductName() {
		return FAKER.food().dish();
	}
}
