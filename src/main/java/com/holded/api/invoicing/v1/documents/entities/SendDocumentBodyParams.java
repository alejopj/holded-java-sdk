package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;

public class SendDocumentBodyParams implements Serializable {

	private static final long serialVersionUID = 1145534089353630838L;

	private final String mailTemplateId;
	private final String emails;
	private final String subject;
	private final String message;
	private final String docIds;
	
	public SendDocumentBodyParams(String mailTemplateId, String emails, String subject, String message, String docIds) {
		this.mailTemplateId = mailTemplateId;
		this.emails = emails;
		this.subject = subject;
		this.message = message;
		this.docIds = docIds;
	}

	public String getMailTemplateId() {
		return mailTemplateId;
	}

	public String getEmails() {
		return emails;
	}

	public String getSubject() {
		return subject;
	}

	public String getMessage() {
		return message;
	}

	public String getDocIds() {
		return docIds;
	}
}
