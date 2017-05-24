package edu.sms.entity.StudentManager;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Student_Last_Academic_Details")
public class StudentLastAcademicDetailsEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	private long id;
	private long studentId;
	private String last_school_name;
	private String lastClassPassed;
	private Date lastSchoolStartDate;
	private Date lastSchoolEndDate;
	private String lastClassPercentage;
	private String lastSchoolMedium;
	private String lastSchoolBoard;
	private String passingYear;
	private String reasonOfLeaving;
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
	
	@Column(name="last_school_name")
	public String getLast_school_name() {
		return last_school_name;
	}
	public void setLast_school_name(String last_school_name) {
		this.last_school_name = last_school_name;
	}
	
	@Column(name="last_class_passed")
	public String getLastClassPassed() {
		return lastClassPassed;
	}
	public void setLastClassPassed(String lastClassPassed) {
		this.lastClassPassed = lastClassPassed;
	}
	
	@Column(name="last_school_start_date")
	public Date getLastSchoolStartDate() {
		return lastSchoolStartDate;
	}
	public void setLastSchoolStartDate(Date lastSchoolStartDate) {
		this.lastSchoolStartDate = lastSchoolStartDate;
	}
	
	@Column(name="last_school_end_date")
	public Date getLastSchoolEndDate() {
		return lastSchoolEndDate;
	}
	public void setLastSchoolEndDate(Date lastSchoolEndDate) {
		this.lastSchoolEndDate = lastSchoolEndDate;
	}
	
	@Column(name="last_class_percentage")
	public String getLastClassPercentage() {
		return lastClassPercentage;
	}
	public void setLastClassPercentage(String lastClassPercentage) {
		this.lastClassPercentage = lastClassPercentage;
	}
	
	@Column(name="last_school_medium")
	public String getLastSchoolMedium() {
		return lastSchoolMedium;
	}
	public void setLastSchoolMedium(String lastSchoolMedium) {
		this.lastSchoolMedium = lastSchoolMedium;
	}
	
	@Column(name="last_school_board")
	public String getLastSchoolBoard() {
		return lastSchoolBoard;
	}
	public void setLastSchoolBoard(String lastSchoolBoard) {
		this.lastSchoolBoard = lastSchoolBoard;
	}
	
	@Column(name="passing_year")
	public String getPassingYear() {
		return passingYear;
	}
	public void setPassingYear(String passingYear) {
		this.passingYear = passingYear;
	}
	
	@Column(name="reason_of_leaving")
	public String getReasonOfLeaving() {
		return reasonOfLeaving;
	}
	public void setReasonOfLeaving(String reasonOfLeaving) {
		this.reasonOfLeaving = reasonOfLeaving;
	}
	
	@Column(name="creation_date")
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	
}
