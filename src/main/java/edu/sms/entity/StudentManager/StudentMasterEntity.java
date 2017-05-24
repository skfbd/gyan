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
@Table(name = "Student_Master")
public class StudentMasterEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long studentId;
	private long schoolId;
	private Date studentCreationDate;
	private long studentCreatedBy;
	private String status;
	private int obsolete;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "student_id", unique = true, nullable = false)
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	
	@Column(name = "school_id")
	public long getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(long schoolId) {
		this.schoolId = schoolId;
	}
	
	@Column(name = "student_creation_date")
	public Date getStudentCreationDate() {
		return studentCreationDate;
	}
	public void setStudentCreationDate(Date studentCreationDate) {
		this.studentCreationDate = studentCreationDate;
	}
	
	@Column(name = "student_created_by")
	public long getStudentCreatedBy() {
		return studentCreatedBy;
	}
	public void setStudentCreatedBy(long studentCreatedBy) {
		this.studentCreatedBy = studentCreatedBy;
	}
	
	@Column(name = "status")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Column(name = "obsolete")
	public int getObsolete() {
		return obsolete;
	}
	public void setObsolete(int obsolete) {
		this.obsolete = obsolete;
	}
	
	
}
