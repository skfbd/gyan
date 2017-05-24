package edu.sms.model;

public class AdmissionDocumentForm {
	Integer admissionDocId;
	String documentName;
	String documentDescription;

	public Integer getAdmissionDocId() {
		return admissionDocId;
	}

	public void setAdmissionDocId(Integer admissionDocId) {
		this.admissionDocId = admissionDocId;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentDescription() {
		return documentDescription;
	}

	public void setDocumentDescription(String documentDescription) {
		this.documentDescription = documentDescription;
	}
}
