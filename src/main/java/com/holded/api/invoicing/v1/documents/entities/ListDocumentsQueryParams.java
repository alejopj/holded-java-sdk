package com.holded.api.invoicing.v1.documents.entities;

import java.io.Serializable;
import java.time.Instant;

public class ListDocumentsQueryParams implements Serializable {

	private static final long serialVersionUID = 6230012595963489864L;
	
	private final Instant starttmp;
	private final Instant endtmp;
	private final String contactid;
	private final DocumentPaidStatus paid;
	private final DocumentBilledStatus billed;
	
	public ListDocumentsQueryParams(Instant starttmp, Instant endtmp, String contactid,
			DocumentPaidStatus paid, DocumentBilledStatus billed) {
		this.starttmp = starttmp;
		this.endtmp = endtmp;
		this.contactid = contactid;
		this.paid = paid;
		this.billed = billed;
	}

	/**
	 * @return Starting timestamp
	 */
	public Instant getStarttmp() {
		return starttmp;
	}

	/**
	 * @return Ending timestamp
	 */
	public Instant getEndtmp() {
		return endtmp;
	}

	/**
	 * @return Filtering by contact Id
	 */
	public String getContactId() {
		return contactid;
	}

	/**
	 * @return Filtering by paid status. 0 = not paid, 1 = paid, 2 = partially paid
	 */
	public DocumentPaidStatus getPaidStatus() {
		return paid;
	}

	/**
	 * @return Filtering by billed status. 0 = not billed, 1 = billed
	 */
	public DocumentBilledStatus getBilledStatus() {
		return billed;
	}
}
