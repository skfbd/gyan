package edu.sms.entity.employee;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@Table(name="employee")
public class EmployeeEntity implements Serializable,CommonEmployeeEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id", unique=true, nullable=false)
	private Integer empId;

	@Column(name="birth_place", length=50)
	private String birthPlace;

	@Column(name="Can_read", length=50)
	private String can_read;

	@Column(name="Can_speak", length=50)
	private String can_speak;

	@Column(name="Can_write", length=50)
	private String can_write;

	@Column(name="date_of_anniversary", length=50)
	private String dateOfAnniversary;

	@Column(name="date_of_birth", length=50)
	private String dateOfBirth;

	@Column(name="emp_blood_grp", length=50)
	private String empBloodGrp;

	@Column(name="emp_existing_disease", length=50)
	private String empExistingDisease;

	@Column(name="emp_father_name", length=50)
	private String empFatherName;

	@Column(name="emp_first_name", length=50)
	private String empFirstName;

	@Column(name="emp_gender", length=25)
	private String empGender;

	@Column(name="emp_last_name", length=50)
	private String empLastName;

	@Column(name="emp_middel_name", length=50)
	private String empMiddelName;

	@Column(name="emp_mother_name", length=50)
	private String empMotherName;

	@Column(length=50)
	private String height;

	@Column(name="Hobbies", length=50)
	private String hobbies;

	@Column(name="Identification_Mark", length=50)
	private String identification_Mark;

	@Column(name="manage_school", length=50)
	private String manageSchool;

	@Column(name="martial_status", length=50)
	private String martialStatus;

	@Column(name="medical_report", length=50)
	private String medicalReportName;

	@Column(name="no_of_childrens", length=50)
	private String noOfChildrens;

	@Column(name="passport_number", length=50)
	private String passportNumber;

	@Column(name="spouse_blood_group", length=50)
	private String spouseBloodGroup;

	@Column(name="spouse_name", length=50)
	private String spouseName;

	@Column(name="upload_image", length=50)
	private String uploadImageName;

	@Column(name="Weight", length=50)
	private String weight;

	@Column(name="schoolId", length=50)
	private Integer schoolId;

	
	
	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)  
	private EmpCommunicationEntity empcommunicationdtl ;

	
	@OneToMany(fetch=FetchType.LAZY, targetEntity=EmpEducationalEntity.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "emp_id", referencedColumnName="emp_id")
	private List<EmpEducationalEntity> empeducationaldtl =new ArrayList<EmpEducationalEntity>();

		
	@OneToMany(fetch=FetchType.LAZY, targetEntity=EmpPastExperianceEnity.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "emp_id", referencedColumnName="emp_id")
	private List<EmpPastExperianceEnity> emppastexperiancedtls = new ArrayList<EmpPastExperianceEnity>();


	@OneToMany(fetch=FetchType.LAZY, targetEntity=Emppastexpfileupload.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "emp_id", referencedColumnName="emp_id")
	private List<Emppastexpfileupload> emppastexpfileupload = new ArrayList<Emppastexpfileupload>();

	
	
	@OneToMany(fetch=FetchType.LAZY, targetEntity=EmpPastProjectEntity.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "emp_id", referencedColumnName="emp_id")
	private List<EmpPastProjectEntity> emppastprojects = new ArrayList<EmpPastProjectEntity>();

	@OneToMany(fetch=FetchType.LAZY, targetEntity=Emppastprojectfileupload.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "emp_id", referencedColumnName="emp_id")
	private List<Emppastprojectfileupload> emppastprojfileupload = new ArrayList<Emppastprojectfileupload>();

	
	
	
	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL) 
	private EmpPayRollEntity empPayRollEntity;
	
	

	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL) 
	private EmpOfficialEntity empofficialdtl;




    public EmployeeEntity() {
    }

	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getBirthPlace() {
		return this.birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getCan_read() {
		return this.can_read;
	}

	public void setCan_read(String can_read) {
		this.can_read = can_read;
	}

	public String getCan_speak() {
		return this.can_speak;
	}

	public void setCan_speak(String can_speak) {
		this.can_speak = can_speak;
	}

	public String getCan_write() {
		return this.can_write;
	}

	public void setCan_write(String can_write) {
		this.can_write = can_write;
	}

	public String getDateOfAnniversary() {
		return this.dateOfAnniversary;
	}

	public void setDateOfAnniversary(String dateOfAnniversary) {
		this.dateOfAnniversary = dateOfAnniversary;
	}

	public String getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmpBloodGrp() {
		return this.empBloodGrp;
	}

	public void setEmpBloodGrp(String empBloodGrp) {
		this.empBloodGrp = empBloodGrp;
	}

	public String getEmpExistingDisease() {
		return this.empExistingDisease;
	}

	public void setEmpExistingDisease(String empExistingDisease) {
		this.empExistingDisease = empExistingDisease;
	}

	public String getEmpFatherName() {
		return this.empFatherName;
	}

	public void setEmpFatherName(String empFatherName) {
		this.empFatherName = empFatherName;
	}

	public String getEmpFirstName() {
		return this.empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpGender() {
		return this.empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public String getEmpLastName() {
		return this.empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmpMiddelName() {
		return this.empMiddelName;
	}

	public void setEmpMiddelName(String empMiddelName) {
		this.empMiddelName = empMiddelName;
	}

	public String getEmpMotherName() {
		return this.empMotherName;
	}

	public void setEmpMotherName(String empMotherName) {
		this.empMotherName = empMotherName;
	}

	public String getHeight() {
		return this.height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getHobbies() {
		return this.hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getIdentification_Mark() {
		return this.identification_Mark;
	}

	public void setIdentification_Mark(String identification_Mark) {
		this.identification_Mark = identification_Mark;
	}

	public String getManageSchool() {
		return this.manageSchool;
	}

	public void setManageSchool(String manageSchool) {
		this.manageSchool = manageSchool;
	}

	public String getMartialStatus() {
		return this.martialStatus;
	}

	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}

	

	public String getNoOfChildrens() {
		return this.noOfChildrens;
	}

	public void setNoOfChildrens(String noOfChildrens) {
		this.noOfChildrens = noOfChildrens;
	}

	public String getPassportNumber() {
		return this.passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getSpouseBloodGroup() {
		return this.spouseBloodGroup;
	}

	public void setSpouseBloodGroup(String spouseBloodGroup) {
		this.spouseBloodGroup = spouseBloodGroup;
	}

	public String getSpouseName() {
		return this.spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	
	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public EmpCommunicationEntity getEmpcommunicationdtl() {
		return empcommunicationdtl;
	}

	public void setEmpcommunicationdtl(EmpCommunicationEntity empcommunicationdtl) {
		this.empcommunicationdtl = empcommunicationdtl;
	}

	

	public List<EmpEducationalEntity> getEmpeducationaldtl() {
		return empeducationaldtl;
	}

	public void setEmpeducationaldtl(List<EmpEducationalEntity> empeducationaldtl) {
		this.empeducationaldtl = empeducationaldtl;
	}

	public EmpOfficialEntity getEmpofficialdtl() {
		return empofficialdtl;
	}

	public void setEmpofficialdtl(EmpOfficialEntity empofficialdtl) {
		this.empofficialdtl = empofficialdtl;
	}
	
	
	public List<EmpPastExperianceEnity> getEmppastexperiancedtls() {
		return emppastexperiancedtls;
	}

	public void setEmppastexperiancedtls(
			List<EmpPastExperianceEnity> emppastexperiancedtls) {
		this.emppastexperiancedtls = emppastexperiancedtls;
	}

	public List<EmpPastProjectEntity> getEmppastprojects() {
		return emppastprojects;
	}

	public void setEmppastprojects(List<EmpPastProjectEntity> emppastprojects) {
		this.emppastprojects = emppastprojects;
	}

	public EmpPayRollEntity getEmpPayRollEntity() {
		return empPayRollEntity;
	}

	public void setEmpPayRollEntity(EmpPayRollEntity empPayRollEntity) {
		this.empPayRollEntity = empPayRollEntity;
	}

	public String getMedicalReportName() {
		return medicalReportName;
	}

	public void setMedicalReportName(String medicalReportName) {
		this.medicalReportName = medicalReportName;
	}

	public String getUploadImageName() {
		return uploadImageName;
	}

	public void setUploadImageName(String uploadImageName) {
		this.uploadImageName = uploadImageName;
	}

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	public List<Emppastexpfileupload> getEmppastexpfileupload() {
		return emppastexpfileupload;
	}

	public void setEmppastexpfileupload(
			List<Emppastexpfileupload> emppastexpfileupload) {
		this.emppastexpfileupload = emppastexpfileupload;
	}

	public List<Emppastprojectfileupload> getEmppastprojfileupload() {
		return emppastprojfileupload;
	}

	public void setEmppastprojfileupload(
			List<Emppastprojectfileupload> emppastprojfileupload) {
		this.emppastprojfileupload = emppastprojfileupload;
	}
	
	
	
	
}