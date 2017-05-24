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
 * @author kundan suthar
 *
 */

@Entity
@Table(name = "Student_Other_Facility")
public class StudentOtherFacilityEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	private long id;
	private long studentId;
	private boolean studentHostelFacility;
	private String studentLaundryNumber;
	private boolean studentTransportFacility;
	private String studentPickupPoint;
	private String studentDropPoint;
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
	
	@Column(name="student_hostel_facility")
	public boolean isStudentHostelFacility() {
		return studentHostelFacility;
	}
	public void setStudentHostelFacility(boolean studentHostelFacility) {
		this.studentHostelFacility = studentHostelFacility;
	}
	
	@Column(name="student_laundry_number")
	public String getStudentLaundryNumber() {
		return studentLaundryNumber;
	}
	public void setStudentLaundryNumber(String studentLaundryNumber) {
		this.studentLaundryNumber = studentLaundryNumber;
	}
	
	@Column(name="student_transport_facility")
	public boolean isStudentTransportFacility() {
		return studentTransportFacility;
	}
	public void setStudentTransportFacility(boolean studentTransportFacility) {
		this.studentTransportFacility = studentTransportFacility;
	}
	
	@Column(name="student_pickup_point")
	public String getStudentPickupPoint() {
		return studentPickupPoint;
	}
	public void setStudentPickupPoint(String studentPickupPoint) {
		this.studentPickupPoint = studentPickupPoint;
	}
	
	@Column(name="student_drop_point")
	public String getStudentDropPoint() {
		return studentDropPoint;
	}
	public void setStudentDropPoint(String studentDropPoint) {
		this.studentDropPoint = studentDropPoint;
	}
	
	@Column(name="creation_date")
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	

}
