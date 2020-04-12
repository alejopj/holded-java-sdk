package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;
import java.util.List;

import com.holded.api.common.entities.CustomField;
import com.holded.api.common.entities.Language;

public class UpdateDocumentBodyParams implements Serializable {

	private static final long serialVersionUID = -1539512848118503386L;
	
	private final String desc;
	private final String notes;
	private final Language language;
	private final Long date;
	private final List<UpdateDocumentItem> items;
	private final String salesChannelId;
	private final String expAccountId;
	private final List<CustomField> customFields;
	
	public UpdateDocumentBodyParams(String desc, String notes, Language language, Long date,
			List<UpdateDocumentItem> items, String salesChannelId, String expAccountId,
			List<CustomField> customFields) {
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

	public Language getLanguage() {
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

	public List<CustomField> getCustomFields() {
		return customFields;
	}
}
