package com.holded.api.common.entities;

public enum Language {
	ES("es"),
	EN("en"),
	FR("fr"),
	DE("de"),
	IT("it"),
	CA("ca"),
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
