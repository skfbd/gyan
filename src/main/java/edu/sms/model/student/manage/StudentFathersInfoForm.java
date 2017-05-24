/**
 * 
 */
package edu.sms.model.student.manage;

/**
 * @author Kundan Suthar
 *
 */


import java.io.Serializable;
import java.util.Date;


public class StudentFathersInfoForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long id;
	private long studentId;
	private String name;
	private Date dob;
	private String mobileNumber;
	private String qualification;
	private String profession;
	private String designation;
	private String officeAddress;
	private String officePhoneNumber;
	private String officeFaxNumber;
	private String emailId;
	private String country;
	private int idDocumentType;
	private String idDocumentNumber;
	private String idDocumentPath;
	private long annualIncome;
	private String imagePath;
	private byte[] imagePathFile;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	public String getOfficePhoneNumber() {
		return officePhoneNumber;
	}
	public void setOfficePhoneNumber(String officePhoneNumber) {
		this.officePhoneNumber = officePhoneNumber;
	}
	public String getOfficeFaxNumber() {
		return officeFaxNumber;
	}
	public void setOfficeFaxNumber(String officeFaxNumber) {
		this.officeFaxNumber = officeFaxNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getIdDocumentType() {
		return idDocumentType;
	}
	public void setIdDocumentType(int idDocumentType) {
		this.idDocumentType = idDocumentType;
	}
	public String getIdDocumentNumber() {
		return idDocumentNumber;
	}
	public void setIdDocumentNumber(String idDocumentNumber) {
		this.idDocumentNumber = idDocumentNumber;
	}
	public String getIdDocumentPath() {
		return idDocumentPath;
	}
	public void setIdDocumentPath(String idDocumentPath) {
		this.idDocumentPath = idDocumentPath;
	}
	public long getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(long annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public byte[] getImagePathFile() {
		return imagePathFile;
	}
	public void setImagePathFile(byte[] imagePathFile) {
		this.imagePathFile = imagePathFile;
	}
	
}