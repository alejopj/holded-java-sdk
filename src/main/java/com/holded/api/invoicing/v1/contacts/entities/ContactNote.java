package com.holded.api.invoicing.v1.contacts.entities;

import java.io.Serializable;

public class ContactNote implements Serializable {

	private static final long serialVersionUID = 2119673875054406304L;
	
	private final String noteId;
	private final String name;
	private final String description;
	private final NoteColor color;
	private final Long updatedAt;
	private final String userId;
	
	public ContactNote(String noteId, String name, String description, NoteColor color, Long updatedAt, String userId) {
		this.noteId = noteId;
		this.name = name;
		this.description = description;
		this.color = color;
		this.updatedAt = updatedAt;
		this.userId = userId;
	}

	public String getNoteId() {
		return noteId;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public NoteColor getColor() {
		return color;
	}

	public Long getUpdatedAt() {
		return updatedAt;
	}

	public String getUserId() {
		return userId;
	}
}
