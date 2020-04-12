package com.holded.api.common;

import java.util.ArrayList;
import java.util.List;

import com.holded.api.common.TestDataGenerator;
import com.holded.api.common.entities.CustomField;

public class CommonTestUtils {
	
	public static Integer SHORT_LIST_SIZE = 5;
	public static Integer MEDIUM_LIST_SIZE = 10;
	public static Integer MAX_UNITS = 10;

	public static List<String> getTags() {
		List<String> tags = new ArrayList<>();
		Integer n = TestDataGenerator.getInteger(SHORT_LIST_SIZE) + 1;
		for (int i = 0; i < n; i++) {
			String tag = TestDataGenerator.getWord();
			tags.add(tag);
		}
		return tags;
	}
	
	public static List<CustomField> getCustomFields() {
		List<CustomField> customFields = new ArrayList<>();
		Integer n = TestDataGenerator.getInteger(SHORT_LIST_SIZE) + 1;
		for (int i = 0; i < n; i++) {
			CustomField customField = getCustomField();
			customFields.add(customField);
		}
		return customFields;
	}

	public static CustomField getCustomField() {
		String field = TestDataGenerator.getWord();
		String value = String.valueOf(TestDataGenerator.getInteger(MAX_UNITS) + 1);
		return new CustomField(field, value);
	}
}
