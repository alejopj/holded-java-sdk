package com.holded.api.invoicing.v1.contacts.entities;

import com.google.gson.annotations.SerializedName;

public enum NoteColor {
	@SerializedName("primary")
	PRIMARY("primary");
	
	private String noteColor;
	
	private NoteColor(String noteColor) {
		this.noteColor = noteColor;
	}
	
	@Override
	public String toString() {
		return noteColor;
	}
}
