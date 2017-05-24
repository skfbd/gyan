/**
 * 
 */
package edu.sms.model.student.manage;

import java.io.Serializable;


public class StudentSibblingInfoForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long id;
	private long studentId;
	private boolean studentPermanentAdd;
	private String sibblingSession;
	private long sibblingSchool;
	private String sibblingClass;
	private String sibblingName;
	private long sibblingStudentId;
	
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
	public String getSibblingSession() {
		return sibblingSession;
	}
	public void setSibblingSession(String sibblingSession) {
		this.sibblingSession = sibblingSession;
	}
	public long getSibblingSchool() {
		return sibblingSchool;
	}
	public void setSibblingSchool(long sibblingSchool) {
		this.sibblingSchool = sibblingSchool;
	}
	public String getSibblingClass() {
		return sibblingClass;
	}
	public void setSibblingClass(String sibblingClass) {
		this.sibblingClass = sibblingClass;
	}
	public String getSibblingName() {
		return sibblingName;
	}
	public void setSibblingName(String sibblingName) {
		this.sibblingName = sibblingName;
	}
	public long getSibblingStudentId() {
		return sibblingStudentId;
	}
	public void setSibblingStudentId(long sibblingStudentId) {
		this.sibblingStudentId = sibblingStudentId;
	}
	public boolean isStudentPermanentAdd() {
		return studentPermanentAdd;
	}
	public void setStudentPermanentAdd(boolean studentPermanentAdd) {
		this.studentPermanentAdd = studentPermanentAdd;
	}
	
	
}