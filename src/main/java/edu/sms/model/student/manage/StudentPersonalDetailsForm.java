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

public class StudentPersonalDetailsForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long studentId;
	private long id;
	private String studentFirstName;
	private String studentMiddleName;
	private String studentLastName;
	private String studentGender;
	private Date studentDob;
	private String studentBirthPlace;
	private String studentNationality;
	private String studentMotherTongue;
	private int studentFeeCategory;
	private int studentCasteCategory;
	private String studentReligion;
	private String studentReligionCaste;
	private String studentLocality;
	private int studentBloodGroup;
	private String studentEmailId;
	private String studentAltEmailId;
	private int studentAge;
	private String studentFeeReciept;
	private String studentCurrentlyInSession;
	private String studentClass;
	private String studentSection;
	private String studentHouse;
	private Date creationDate;
	
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	public String getStudentMiddleName() {
		return studentMiddleName;
	}
	public void setStudentMiddleName(String studentMiddleName) {
		this.studentMiddleName = studentMiddleName;
	}
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public Date getStudentDob() {
		return studentDob;
	}
	public void setStudentDob(Date studentDob) {
		this.studentDob = studentDob;
	}
	public String getStudentBirthPlace() {
		return studentBirthPlace;
	}
	public void setStudentBirthPlace(String studentBirthPlace) {
		this.studentBirthPlace = studentBirthPlace;
	}
	public String getStudentNationality() {
		return studentNationality;
	}
	public void setStudentNationality(String studentNationality) {
		this.studentNationality = studentNationality;
	}
	public String getStudentMotherTongue() {
		return studentMotherTongue;
	}
	public void setStudentMotherTongue(String studentMotherTongue) {
		this.studentMotherTongue = studentMotherTongue;
	}
	public int getStudentFeeCategory() {
		return studentFeeCategory;
	}
	public void setStudentFeeCategory(int studentFeeCategory) {
		this.studentFeeCategory = studentFeeCategory;
	}
	public int getStudentCasteCategory() {
		return studentCasteCategory;
	}
	public void setStudentCasteCategory(int studentCasteCategory) {
		this.studentCasteCategory = studentCasteCategory;
	}
	public String getStudentReligion() {
		return studentReligion;
	}
	public void setStudentReligion(String studentReligion) {
		this.studentReligion = studentReligion;
	}
	public String getStudentReligionCaste() {
		return studentReligionCaste;
	}
	public void setStudentReligionCaste(String studentReligionCaste) {
		this.studentReligionCaste = studentReligionCaste;
	}
	public String getStudentLocality() {
		return studentLocality;
	}
	public void setStudentLocality(String studentLocality) {
		this.studentLocality = studentLocality;
	}
	public int getStudentBloodGroup() {
		return studentBloodGroup;
	}
	public void setStudentBloodGroup(int studentBloodGroup) {
		this.studentBloodGroup = studentBloodGroup;
	}
	public String getStudentEmailId() {
		return studentEmailId;
	}
	public void setStudentEmailId(String studentEmailId) {
		this.studentEmailId = studentEmailId;
	}
	public String getStudentAltEmailId() {
		return studentAltEmailId;
	}
	public void setStudentAltEmailId(String studentAltEmailId) {
		this.studentAltEmailId = studentAltEmailId;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentFeeReciept() {
		return studentFeeReciept;
	}
	public void setStudentFeeReciept(String studentFeeReciept) {
		this.studentFeeReciept = studentFeeReciept;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getStudentCurrentlyInSession() {
		return studentCurrentlyInSession;
	}
	public void setStudentCurrentlyInSession(String studentCurrentlyInSession) {
		this.studentCurrentlyInSession = studentCurrentlyInSession;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public String getStudentSection() {
		return studentSection;
	}
	public void setStudentSection(String studentSection) {
		this.studentSection = studentSection;
	}
	public String getStudentHouse() {
		return studentHouse;
	}
	public void setStudentHouse(String studentHouse) {
		this.studentHouse = studentHouse;
	}
	
	
}
