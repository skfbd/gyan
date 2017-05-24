package edu.sms.model.student.manage;

import java.io.Serializable;
import java.util.Date;

public class StudentLastAcademicDetailsForm implements Serializable{
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
	public String getLast_school_name() {
		return last_school_name;
	}
	public void setLast_school_name(String last_school_name) {
		this.last_school_name = last_school_name;
	}
	public String getLastClassPassed() {
		return lastClassPassed;
	}
	public void setLastClassPassed(String lastClassPassed) {
		this.lastClassPassed = lastClassPassed;
	}
	public Date getLastSchoolStartDate() {
		return lastSchoolStartDate;
	}
	public void setLastSchoolStartDate(Date lastSchoolStartDate) {
		this.lastSchoolStartDate = lastSchoolStartDate;
	}
	public Date getLastSchoolEndDate() {
		return lastSchoolEndDate;
	}
	public void setLastSchoolEndDate(Date lastSchoolEndDate) {
		this.lastSchoolEndDate = lastSchoolEndDate;
	}
	public String getLastClassPercentage() {
		return lastClassPercentage;
	}
	public void setLastClassPercentage(String lastClassPercentage) {
		this.lastClassPercentage = lastClassPercentage;
	}
	public String getLastSchoolMedium() {
		return lastSchoolMedium;
	}
	public void setLastSchoolMedium(String lastSchoolMedium) {
		this.lastSchoolMedium = lastSchoolMedium;
	}
	public String getLastSchoolBoard() {
		return lastSchoolBoard;
	}
	public void setLastSchoolBoard(String lastSchoolBoard) {
		this.lastSchoolBoard = lastSchoolBoard;
	}
	public String getPassingYear() {
		return passingYear;
	}
	public void setPassingYear(String passingYear) {
		this.passingYear = passingYear;
	}
	public String getReasonOfLeaving() {
		return reasonOfLeaving;
	}
	public void setReasonOfLeaving(String reasonOfLeaving) {
		this.reasonOfLeaving = reasonOfLeaving;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	
}
