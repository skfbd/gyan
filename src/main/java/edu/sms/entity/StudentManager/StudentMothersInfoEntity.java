/**
 * 
 */
package edu.sms.entity.StudentManager;

/**
 * @author Kundan Suthar
 *
 */

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Mothers_Info")
public class StudentMothersInfoEntity implements Serializable {
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
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="student_id" , nullable = false)
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="dob")
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Column(name="mobile_number")
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	@Column(name="qualification")
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	@Column(name="profession")
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	@Column(name="designation")
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Column(name="office_address")
	public String getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	
	@Column(name="office_phone_number")
	public String getOfficePhoneNumber() {
		return officePhoneNumber;
	}
	public void setOfficePhoneNumber(String officePhoneNumber) {
		this.officePhoneNumber = officePhoneNumber;
	}
	
	@Column(name="office_fax_number")
	public String getOfficeFaxNumber() {
		return officeFaxNumber;
	}
	public void setOfficeFaxNumber(String officeFaxNumber) {
		this.officeFaxNumber = officeFaxNumber;
	}
	
	@Column(name="email_id")
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Column(name="country")
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Column(name="id_document_type")
	public int getIdDocumentType() {
		return idDocumentType;
	}
	public void setIdDocumentType(int idDocumentType) {
		this.idDocumentType = idDocumentType;
	}
	
	@Column(name="id_document_number")
	public String getIdDocumentNumber() {
		return idDocumentNumber;
	}
	public void setIdDocumentNumber(String idDocumentNumber) {
		this.idDocumentNumber = idDocumentNumber;
	}
	
	@Column(name="id_document_path")
	public String getIdDocumentPath() {
		return idDocumentPath;
	}
	public void setIdDocumentPath(String idDocumentPath) {
		this.idDocumentPath = idDocumentPath;
	}
	
	@Column(name="annual_income")
	public long getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(long annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	@Column(name="image_path")
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
