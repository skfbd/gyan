/**
 * 
 */
package edu.sms.model.student.manage;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Kundan Suthar
 *
 */
public class StudentHealthDetailsForm  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long id;
	private long studentId;
	private String infectiousDisease;
	private String nonInfectiousDisease;
	private String eyes;
	private String ears;
	private String teeth;
	private String generalHealth;
	private String doctorsRemark;
	private String doctorsName;
	private String doctorsPhoneNumber;
	private String doctorsEmailId;
	private String doctorsAddress;
	private String reportPath;
	private Date creationDate;
	
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
	public String getInfectiousDisease() {
		return infectiousDisease;
	}
	public void setInfectiousDisease(String infectiousDisease) {
		this.infectiousDisease = infectiousDisease;
	}
	public String getNonInfectiousDisease() {
		return nonInfectiousDisease;
	}
	public void setNonInfectiousDisease(String nonInfectiousDisease) {
		this.nonInfectiousDisease = nonInfectiousDisease;
	}
	public String getEyes() {
		return eyes;
	}
	public void setEyes(String eyes) {
		this.eyes = eyes;
	}
	public String getEars() {
		return ears;
	}
	public void setEars(String ears) {
		this.ears = ears;
	}
	public String getTeeth() {
		return teeth;
	}
	public void setTeeth(String teeth) {
		this.teeth = teeth;
	}
	public String getGeneralHealth() {
		return generalHealth;
	}
	public void setGeneralHealth(String generalHealth) {
		this.generalHealth = generalHealth;
	}
	public String getDoctorsRemark() {
		return doctorsRemark;
	}
	public void setDoctorsRemark(String doctorsRemark) {
		this.doctorsRemark = doctorsRemark;
	}
	public String getDoctorsName() {
		return doctorsName;
	}
	public void setDoctorsName(String doctorsName) {
		this.doctorsName = doctorsName;
	}
	public String getDoctorsPhoneNumber() {
		return doctorsPhoneNumber;
	}
	public void setDoctorsPhoneNumber(String doctorsPhoneNumber) {
		this.doctorsPhoneNumber = doctorsPhoneNumber;
	}
	public String getDoctorsEmailId() {
		return doctorsEmailId;
	}
	public void setDoctorsEmailId(String doctorsEmailId) {
		this.doctorsEmailId = doctorsEmailId;
	}
	public String getDoctorsAddress() {
		return doctorsAddress;
	}
	public void setDoctorsAddress(String doctorsAddress) {
		this.doctorsAddress = doctorsAddress;
	}
	public String getReportPath() {
		return reportPath;
	}
	public void setReportPath(String reportPath) {
		this.reportPath = reportPath;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	

}
