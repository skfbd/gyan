/**
 * 
 */
package edu.sms.model.student.manage;

import java.io.Serializable;
import java.util.Date;

/**
 * @author kundan suthar
 *
 */
public class StudentOtherFacilityForm implements Serializable{
	private static final long serialVersionUID = 1L;

	private long id;
	private long studentId;
	private boolean studentHostelFacility;
	private String studentLaundryNumber;
	private boolean studentTransportFacility;
	private String studentPickupPoint;
	private String studentDropPoint;
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
	public boolean isStudentHostelFacility() {
		return studentHostelFacility;
	}
	public void setStudentHostelFacility(boolean studentHostelFacility) {
		this.studentHostelFacility = studentHostelFacility;
	}
	public String getStudentLaundryNumber() {
		return studentLaundryNumber;
	}
	public void setStudentLaundryNumber(String studentLaundryNumber) {
		this.studentLaundryNumber = studentLaundryNumber;
	}
	public boolean isStudentTransportFacility() {
		return studentTransportFacility;
	}
	public void setStudentTransportFacility(boolean studentTransportFacility) {
		this.studentTransportFacility = studentTransportFacility;
	}
	public String getStudentPickupPoint() {
		return studentPickupPoint;
	}
	public void setStudentPickupPoint(String studentPickupPoint) {
		this.studentPickupPoint = studentPickupPoint;
	}
	public String getStudentDropPoint() {
		return studentDropPoint;
	}
	public void setStudentDropPoint(String studentDropPoint) {
		this.studentDropPoint = studentDropPoint;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	

}
