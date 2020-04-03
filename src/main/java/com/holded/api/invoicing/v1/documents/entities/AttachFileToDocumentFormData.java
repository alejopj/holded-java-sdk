package com.holded.api.invoicing.v1.documents.entities;

import java.io.File;
import java.io.Serializable;

public class AttachFileToDocumentFormData implements Serializable {

	private static final long serialVersionUID = 416003651005540638L;

	private final File file;
	private final Boolean setMain;
	
	public AttachFileToDocumentFormData(File file, Boolean setMain) {
		this.file = file;
		this.setMain = setMain;
	}

	/**
	 * @return The file to upload.
	 */
	public File getFile() {
		return file;
	}

	public Boolean getSetMain() {
		return setMain;
	}
}
