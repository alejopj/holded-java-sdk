package com.holded.api.common.entities;

import com.google.gson.annotations.SerializedName;

public enum Language {
	@SerializedName("es")
	ES("es"),
	@SerializedName("en")
	EN("en"),
	@SerializedName("fr")
	FR("fr"),
	@SerializedName("de")
	DE("de"),
	@SerializedName("it")
	IT("it"),
	@SerializedName("ca")
	CA("ca"),
	@SerializedName("eu")
	EU("eu");
	
	private final String language;
	
	private Language(String language) {
		this.language = language;
	}
	
	@Override
	public String toString() {
		return language;
	}
}
