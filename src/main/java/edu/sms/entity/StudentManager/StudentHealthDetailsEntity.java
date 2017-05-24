/**
 * 
 */
package edu.sms.entity.StudentManager;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Kundan Suthar
 *
 */

@Entity
@Table(name = "Student_Health_Details")
public class StudentHealthDetailsEntity  implements Serializable{
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
	
	@Column(name="Infectious_disease")
	public String getInfectiousDisease() {
		return infectiousDisease;
	}
	public void setInfectiousDisease(String infectiousDisease) {
		this.infectiousDisease = infectiousDisease;
	}
	
	@Column(name="Non_infectious_disease")
	public String getNonInfectiousDisease() {
		return nonInfectiousDisease;
	}
	public void setNonInfectiousDisease(String nonInfectiousDisease) {
		this.nonInfectiousDisease = nonInfectiousDisease;
	}
	
	@Column(name="eyes")
	public String getEyes() {
		return eyes;
	}
	public void setEyes(String eyes) {
		this.eyes = eyes;
	}
	
	@Column(name="ears")
	public String getEars() {
		return ears;
	}
	public void setEars(String ears) {
		this.ears = ears;
	}
	
	@Column(name="teeth")
	public String getTeeth() {
		return teeth;
	}
	public void setTeeth(String teeth) {
		this.teeth = teeth;
	}
	
	@Column(name="general_health")
	public String getGeneralHealth() {
		return generalHealth;
	}
	public void setGeneralHealth(String generalHealth) {
		this.generalHealth = generalHealth;
	}
	
	@Column(name="doctors_remark")
	public String getDoctorsRemark() {
		return doctorsRemark;
	}
	public void setDoctorsRemark(String doctorsRemark) {
		this.doctorsRemark = doctorsRemark;
	}
	
	@Column(name="doctors_name")
	public String getDoctorsName() {
		return doctorsName;
	}
	public void setDoctorsName(String doctorsName) {
		this.doctorsName = doctorsName;
	}
	
	@Column(name="doctors_phone_number")
	public String getDoctorsPhoneNumber() {
		return doctorsPhoneNumber;
	}
	public void setDoctorsPhoneNumber(String doctorsPhoneNumber) {
		this.doctorsPhoneNumber = doctorsPhoneNumber;
	}
	
	@Column(name="doctors_email_id")
	public String getDoctorsEmailId() {
		return doctorsEmailId;
	}
	public void setDoctorsEmailId(String doctorsEmailId) {
		this.doctorsEmailId = doctorsEmailId;
	}
	
	@Column(name="doctors_address")
	public String getDoctorsAddress() {
		return doctorsAddress;
	}
	public void setDoctorsAddress(String doctorsAddress) {
		this.doctorsAddress = doctorsAddress;
	}
	
	@Column(name="report_path")
	public String getReportPath() {
		return reportPath;
	}
	public void setReportPath(String reportPath) {
		this.reportPath = reportPath;
	}
	
	@Column(name="creation_date")
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	

}
