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
		return FAKER.internet().uuid().replace("-", "");
	}
	
	public static Integer getIntegerId() {
		return getInteger(Integer.MAX_VALUE);
	}
	
	public static Long getLongId() {
		return Math.abs(FAKER.random().nextLong());
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
		return "9" + FAKER.regexify("[0-9]{8}");
	}
	
	public static String getCellPhone() {
		return "6" + FAKER.regexify("[0-9]{8}");
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
		return FAKER.idNumber().ssnValid().replace("-", "");
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
		return FAKER.regexify("[A-Z0-9]{35}");
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
	
	public static Integer getPastDateAsInteger() {
		return Math.abs(getPastDate().intValue());
	}
	
	public static Integer getFutureDateAsInteger() {
		return Math.abs(getFutureDate().intValue());
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
	
	public static Float getCurrencyExchangeRate() {
		return getFloat();
	}
	
	// Number
	
	public static Integer getPercentage() {
		return getInteger(100);
	}
	
	public static Integer getInteger(int n) {
		return FAKER.random().nextInt(n);
	}
	
	public static Float getFloat() {
		return Math.abs(getNumber().floatValue());
	}
	
	public static BigDecimal getNumber() {
		int multiplier = getInteger(Integer.MAX_VALUE);
		double zeroToOneDouble = FAKER.random().nextDouble();
		double multipliedDouble = multiplier * zeroToOneDouble;
		double twoDecimalsDouble = Math.round(multipliedDouble * 100.0) / 100.0;
		return new BigDecimal(twoDecimalsDouble).abs();
	}
	
	// Product
	
	public static String getProductName() {
		return FAKER.food().dish();
	}
}
