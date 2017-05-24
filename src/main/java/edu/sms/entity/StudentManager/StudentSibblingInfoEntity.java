/**
 * 
 */
package edu.sms.entity.StudentManager;

/**
 * @author Remedies
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
@Table(name = "Student_Sibbling_Info")
public class StudentSibblingInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long id;
	private long studentId;
	private boolean studentPermanentAdd;
	private String sibblingSession;
	private long sibblingSchool;
	private String sibblingClass;
	private String sibblingName;
	private long sibblingStudentId;
	
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
	
	@Column(name="sibbling_session")
	public String getSibblingSession() {
		return sibblingSession;
	}
	public void setSibblingSession(String sibblingSession) {
		this.sibblingSession = sibblingSession;
	}
	
	@Column(name="sibbling_school")
	public long getSibblingSchool() {
		return sibblingSchool;
	}
	public void setSibblingSchool(long sibblingSchool) {
		this.sibblingSchool = sibblingSchool;
	}
	
	@Column(name="sibbling_class")
	public String getSibblingClass() {
		return sibblingClass;
	}
	public void setSibblingClass(String sibblingClass) {
		this.sibblingClass = sibblingClass;
	}
	
	@Column(name="sibbling_name")
	public String getSibblingName() {
		return sibblingName;
	}
	public void setSibblingName(String sibblingName) {
		this.sibblingName = sibblingName;
	}
	
	@Column(name="sibbling_student_id")
	public long getSibblingStudentId() {
		return sibblingStudentId;
	}
	public void setSibblingStudentId(long sibblingStudentId) {
		this.sibblingStudentId = sibblingStudentId;
	}
	
	@Column(name="student_perm_add")
	public boolean isStudentPermanentAdd() {
		return studentPermanentAdd;
	}
	public void setStudentPermanentAdd(boolean studentPermanentAdd) {
		this.studentPermanentAdd = studentPermanentAdd;
	}
}