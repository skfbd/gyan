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
@Table(name = "Student_Personal_Details")
public class StudentPersonalDetailsEntity implements Serializable {
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
	
	@Column(name = "student_id", nullable = false)
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "student_first_name")
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	
	@Column(name = "student_middle_name")
	public String getStudentMiddleName() {
		return studentMiddleName;
	}
	public void setStudentMiddleName(String studentMiddleName) {
		this.studentMiddleName = studentMiddleName;
	}
	
	@Column(name = "student_last_name")
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	
	@Column(name = "student_gender")
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	
	@Column(name = "student_dob")
	public Date getStudentDob() {
		return studentDob;
	}
	public void setStudentDob(Date studentDob) {
		this.studentDob = studentDob;
	}
	
	@Column(name = "student_birth_place")
	public String getStudentBirthPlace() {
		return studentBirthPlace;
	}
	public void setStudentBirthPlace(String studentBirthPlace) {
		this.studentBirthPlace = studentBirthPlace;
	}
	
	@Column(name = "student_nationality")
	public String getStudentNationality() {
		return studentNationality;
	}
	public void setStudentNationality(String studentNationality) {
		this.studentNationality = studentNationality;
	}
	
	@Column(name = "student_mother_tongue")
	public String getStudentMotherTongue() {
		return studentMotherTongue;
	}
	public void setStudentMotherTongue(String studentMotherTongue) {
		this.studentMotherTongue = studentMotherTongue;
	}
	
	@Column(name = "student_fee_category")
	public int getStudentFeeCategory() {
		return studentFeeCategory;
	}
	public void setStudentFeeCategory(int studentFeeCategory) {
		this.studentFeeCategory = studentFeeCategory;
	}
	
	@Column(name = "student_caste_category")
	public int getStudentCasteCategory() {
		return studentCasteCategory;
	}
	public void setStudentCasteCategory(int studentCasteCategory) {
		this.studentCasteCategory = studentCasteCategory;
	}
	
	@Column(name = "student_religion")
	public String getStudentReligion() {
		return studentReligion;
	}
	public void setStudentReligion(String studentReligion) {
		this.studentReligion = studentReligion;
	}
	
	@Column(name = "student_religion_caste")
	public String getStudentReligionCaste() {
		return studentReligionCaste;
	}
	public void setStudentReligionCaste(String studentReligionCaste) {
		this.studentReligionCaste = studentReligionCaste;
	}
	
	@Column(name = "student_locality")
	public String getStudentLocality() {
		return studentLocality;
	}
	public void setStudentLocality(String studentLocality) {
		this.studentLocality = studentLocality;
	}
	
	@Column(name = "student_blood_group")
	public int getStudentBloodGroup() {
		return studentBloodGroup;
	}
	public void setStudentBloodGroup(int studentBloodGroup) {
		this.studentBloodGroup = studentBloodGroup;
	}
	
	@Column(name = "student_email_id")
	public String getStudentEmailId() {
		return studentEmailId;
	}
	public void setStudentEmailId(String studentEmailId) {
		this.studentEmailId = studentEmailId;
	}
	
	@Column(name = "student_alt_email_id")
	public String getStudentAltEmailId() {
		return studentAltEmailId;
	}
	public void setStudentAltEmailId(String studentAltEmailId) {
		this.studentAltEmailId = studentAltEmailId;
	}
	
	@Column(name = "student_age")
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	@Column(name = "student_fee_reciept")
	public String getStudentFeeReciept() {
		return studentFeeReciept;
	}
	public void setStudentFeeReciept(String studentFeeReciept) {
		this.studentFeeReciept = studentFeeReciept;
	}
	
	@Column(name = "creation_date")
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	@Column(name = "student_currently_in_session")
	public String getStudentCurrentlyInSession() {
		return studentCurrentlyInSession;
	}
	public void setStudentCurrentlyInSession(String studentCurrentlyInSession) {
		this.studentCurrentlyInSession = studentCurrentlyInSession;
	}
	
	@Column(name = "student_class")
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	
	@Column(name = "student_section")
	public String getStudentSection() {
		return studentSection;
	}
	public void setStudentSection(String studentSection) {
		this.studentSection = studentSection;
	}
	
	@Column(name = "student_house")
	public String getStudentHouse() {
		return studentHouse;
	}
	public void setStudentHouse(String studentHouse) {
		this.studentHouse = studentHouse;
	}
}
