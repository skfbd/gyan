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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Address")
public class StudentAddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long id;
	private long studentId;
	private String studentCommAddress;
	private String studentPermanentAdd;
	private String studentCountry;
	private String studentState;
	private String studentCity;
	private String studentPinCode;
	private String studentResidencePhNumber;
	private String studentEmergencyContact;
	private String studentResidenceFaxNumber;
	
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
	
	@Column(name="student_comm_address")
	public String getStudentCommAddress() {
		return studentCommAddress;
	}
	public void setStudentCommAddress(String studentCommAddress) {
		this.studentCommAddress = studentCommAddress;
	}
	
	@Column(name="student_permanent_add")
	public String getStudentPermanentAdd() {
		return studentPermanentAdd;
	}
	public void setStudentPermanentAdd(String studentPermanentAdd) {
		this.studentPermanentAdd = studentPermanentAdd;
	}
	
	@Column(name="student_country")
	public String getStudentCountry() {
		return studentCountry;
	}
	public void setStudentCountry(String studentCountry) {
		this.studentCountry = studentCountry;
	}
	
	@Column(name="student_state")
	public String getStudentState() {
		return studentState;
	}
	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}
	
	@Column(name="student_city")
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	
	@Column(name="student_pin_code")
	public String getStudentPinCode() {
		return studentPinCode;
	}
	public void setStudentPinCode(String studentPinCode) {
		this.studentPinCode = studentPinCode;
	}
	
	@Column(name="student_residence_ph_number")
	public String getStudentResidencePhNumber() {
		return studentResidencePhNumber;
	}
	public void setStudentResidencePhNumber(String studentResidencePhNumber) {
		this.studentResidencePhNumber = studentResidencePhNumber;
	}
	
	@Column(name="student_emergency_contact")
	public String getStudentEmergencyContact() {
		return studentEmergencyContact;
	}
	public void setStudentEmergencyContact(String studentEmergencyContact) {
		this.studentEmergencyContact = studentEmergencyContact;
	}
	
	@Column(name="student_residence_fax_number")
	public String getStudentResidenceFaxNumber() {
		return studentResidenceFaxNumber;
	}
	public void setStudentResidenceFaxNumber(String studentResidenceFaxNumber) {
		this.studentResidenceFaxNumber = studentResidenceFaxNumber;
	}	
}
