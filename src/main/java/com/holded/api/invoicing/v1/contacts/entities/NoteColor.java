package com.holded.api.invoicing.v1.contacts.entities;

public enum NoteColor {
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
