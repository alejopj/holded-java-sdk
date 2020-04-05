package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;
import java.util.List;

public class UpdateDocumentBodyParams implements Serializable {

	private static final long serialVersionUID = -1539512848118503386L;
	
	private final String desc;
	private final String notes;
	private final String language;
	private final Long date;
	private final List<UpdateDocumentItem> items;
	private final String salesChannelId;
	private final String expAccountId;
	private final List<DocumentCustomField> customFields;
	
	public UpdateDocumentBodyParams(String desc, String notes, String language, Long date,
			List<UpdateDocumentItem> items, String salesChannelId, String expAccountId,
			List<DocumentCustomField> customFields) {
		this.desc = desc;
		this.notes = notes;
		this.language = language;
		this.date = date;
		this.items = items;
		this.salesChannelId = salesChannelId;
		this.expAccountId = expAccountId;
		this.customFields = customFields;
	}

	public String getDesc() {
		return desc;
	}

	public String getNotes() {
		return notes;
	}

	public String getLanguage() {
		return language;
	}

	public Long getDate() {
		return date;
	}

	public List<UpdateDocumentItem> getItems() {
		return items;
	}

	public String getSalesChannelId() {
		return salesChannelId;
	}

	public String getExpAccountId() {
		return expAccountId;
	}

	public List<DocumentCustomField> getCustomFields() {
		return customFields;
	}
}
