package com.holded.api;

import java.io.File;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import com.github.javafaker.Faker;

public class TestDataGenerator {
	
	private static Faker FAKER = new Faker();
	
	// Id

	public static String getAlphaNumericId() {
		return FAKER.internet().uuid();
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
	
	// File

	public static File getFile() {
		File file = new File("");
		// TODO Write some content.
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

	public static String getAddress() {
		return FAKER.address().streetAddress();
	}

	public static String getCity() {
		return FAKER.address().city();
	}

	public static String getPostalCode() {
		return FAKER.address().zipCode();
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
	
	public static String getLanguage() {
		Locale[] availableLocales = Locale.getAvailableLocales();
		int i = FAKER.random().nextInt(availableLocales.length);
		return availableLocales[i].toLanguageTag();
	}
	
	// Currency
	
	public static String getCurrency() {
		return FAKER.currency().code();
	}
	
	public static BigDecimal getCurrencyExchangeRate() {
		return getNumber();
	}
	
	// Number
	
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
