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

public class StudentParentalCommonInfoForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long id;
	private long studentId;
	private Date anniversaryDate;
	private String smsToSend;
	private boolean emailToBeSentFather;
	private boolean emailToBeSentMother;
	private boolean emailToBeSentGuardian;
	private int isDivorced;
	private boolean parentEmpOfSchool;
	private long schoolId;
	private String employees;
	
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
	public Date getAnniversaryDate() {
		return anniversaryDate;
	}
	public void setAnniversaryDate(Date anniversaryDate) {
		this.anniversaryDate = anniversaryDate;
	}
	public String getSmsToSend() {
		return smsToSend;
	}
	public void setSmsToSend(String smsToSend) {
		this.smsToSend = smsToSend;
	}
	
	public int getIsDivorced() {
		return isDivorced;
	}
	public void setIsDivorced(int isDivorced) {
		this.isDivorced = isDivorced;
	}
	
	public long getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(long schoolId) {
		this.schoolId = schoolId;
	}
	public String getEmployees() {
		return employees;
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	public boolean isEmailToBeSentFather() {
		return emailToBeSentFather;
	}
	public void setEmailToBeSentFather(boolean emailToBeSentFather) {
		this.emailToBeSentFather = emailToBeSentFather;
	}
	public boolean isEmailToBeSentMother() {
		return emailToBeSentMother;
	}
	public void setEmailToBeSentMother(boolean emailToBeSentMother) {
		this.emailToBeSentMother = emailToBeSentMother;
	}
	public boolean isEmailToBeSentGuardian() {
		return emailToBeSentGuardian;
	}
	public void setEmailToBeSentGuardian(boolean emailToBeSentGuardian) {
		this.emailToBeSentGuardian = emailToBeSentGuardian;
	}
	public boolean isParentEmpOfSchool() {
		return parentEmpOfSchool;
	}
	public void setParentEmpOfSchool(boolean parentEmpOfSchool) {
		this.parentEmpOfSchool = parentEmpOfSchool;
	}
	
	
	
}