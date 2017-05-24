package edu.sms.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.web.multipart.MultipartFile;

import edu.sms.sample.form.RegistrationForm;



/**
 * The persistent class for the employee database table.
 * 
 */

public class EmployeeFrm  {
	

	private Integer    empId;
	private String empFirstName;
	private String empGender;
	//employee user details stasrt
	private String username;
	private String email;     //email should be unique
	private String passphrase;// this  is the password
	//employee user details ends
	private String empLastName;
	private String empMiddelName;
	private String empMotherName;
	private String height;
	private String hobbies;
	private String birthPlace;
	private String can_read;
	private String can_speak;
	private String can_write;
	private String dateOfAnniversary;
	private String dateOfBirth;
	private String empBloodGrp;
	private String empExistingDisease;
	private String empFatherName;
	private String identification_Mark;
	private String manageSchool;
	private String martialStatus;
	private MultipartFile medicalReport;
	private String medicalReportName;
	private String noOfChildrens;
	private String passportNumber;
	private String spouseBloodGroup;
	private String spouseName;
	private MultipartFile  employeeImge;
	private String uploadImageName;
	private String weight;
	private Integer schoolId;
	
	private Empcommunicationdtl        empcommunicationdtl = new Empcommunicationdtl();
	private List<EmpEducationalFrm>    empeducationaldtl = new ArrayList<EmpEducationalFrm>();
    private List<EmpPastExperianceFrm> emppastexperiancedtls= new ArrayList<EmpPastExperianceFrm>();
	
    private List<EmpPastProjectFrm>    emppastprojects =new ArrayList<EmpPastProjectFrm>();
	private EmpPayrollFrm              emppayrolldetail= new EmpPayrollFrm();
	private EmpOfficialFrm             empofficialdtl=new EmpOfficialFrm();
	
	//for pastExperience 
	private List<FileUploadForm> fileUploadLstPastExp = new ArrayList<FileUploadForm>();
	private List<FileUploadForm> fileUploadLstPastProj = new ArrayList<FileUploadForm>();
	
	
	public EmployeeFrm() {
        
    }
	public EmployeeFrm(List<EmpEducationalFrm>    empeducationaldtl) {
        this.empeducationaldtl = empeducationaldtl;
    }
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	public Empcommunicationdtl getEmpcommunicationdtl() {
		return empcommunicationdtl;
	}
	public void setEmpcommunicationdtl(Empcommunicationdtl empcommunicationdtl) {
		this.empcommunicationdtl = empcommunicationdtl;
	}
	
	public List<EmpEducationalFrm> getEmpeducationaldtl() {
		return empeducationaldtl;
	}
	public void setEmpeducationaldtl(List<EmpEducationalFrm> empeducationaldtl) {
		this.empeducationaldtl = empeducationaldtl;
	}
	public EmpOfficialFrm getEmpofficialdtl() {
		return empofficialdtl;
	}
	public void setEmpofficialdtl(EmpOfficialFrm empofficialdtl) {
		this.empofficialdtl = empofficialdtl;
	}
	public List<EmpPastExperianceFrm> getEmppastexperiancedtls() {
		return emppastexperiancedtls;
	}
	public void setEmppastexperiancedtls(
			List<EmpPastExperianceFrm> emppastexperiancedtls) {
		this.emppastexperiancedtls = emppastexperiancedtls;
	}
	public List<EmpPastProjectFrm> getEmppastprojects() {
		return emppastprojects;
	}
	public void setEmppastprojects(List<EmpPastProjectFrm> emppastprojects) {
		this.emppastprojects = emppastprojects;
	}
	public EmpPayrollFrm getEmppayrolldetail() {
		return emppayrolldetail;
	}
	public void setEmppayrolldetail(EmpPayrollFrm emppayrolldetail) {
		this.emppayrolldetail = emppayrolldetail;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpMiddelName() {
		return empMiddelName;
	}
	public void setEmpMiddelName(String empMiddelName) {
		this.empMiddelName = empMiddelName;
	}
	public String getEmpMotherName() {
		return empMotherName;
	}
	public void setEmpMotherName(String empMotherName) {
		this.empMotherName = empMotherName;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getCan_read() {
		return can_read;
	}
	public void setCan_read(String can_read) {
		this.can_read = can_read;
	}
	public String getCan_speak() {
		return can_speak;
	}
	public void setCan_speak(String can_speak) {
		this.can_speak = can_speak;
	}
	public String getCan_write() {
		return can_write;
	}
	public void setCan_write(String can_write) {
		this.can_write = can_write;
	}
	public String getDateOfAnniversary() {
		return dateOfAnniversary;
	}
	public void setDateOfAnniversary(String dateOfAnniversary) {
		this.dateOfAnniversary = dateOfAnniversary;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmpBloodGrp() {
		return empBloodGrp;
	}
	public void setEmpBloodGrp(String empBloodGrp) {
		this.empBloodGrp = empBloodGrp;
	}
	public String getEmpExistingDisease() {
		return empExistingDisease;
	}
	public void setEmpExistingDisease(String empExistingDisease) {
		this.empExistingDisease = empExistingDisease;
	}
	public String getEmpFatherName() {
		return empFatherName;
	}
	public void setEmpFatherName(String empFatherName) {
		this.empFatherName = empFatherName;
	}
	public String getIdentification_Mark() {
		return identification_Mark;
	}
	public void setIdentification_Mark(String identification_Mark) {
		this.identification_Mark = identification_Mark;
	}
	public String getManageSchool() {
		return manageSchool;
	}
	public void setManageSchool(String manageSchool) {
		this.manageSchool = manageSchool;
	}
	public String getMartialStatus() {
		return martialStatus;
	}
	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}
	
	public MultipartFile getMedicalReport() {
		return medicalReport;
	}
	public void setMedicalReport(MultipartFile medicalReport) {
		this.medicalReport = medicalReport;
	}
	public String getNoOfChildrens() {
		return noOfChildrens;
	}
	public void setNoOfChildrens(String noOfChildrens) {
		this.noOfChildrens = noOfChildrens;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getSpouseBloodGroup() {
		return spouseBloodGroup;
	}
	public void setSpouseBloodGroup(String spouseBloodGroup) {
		this.spouseBloodGroup = spouseBloodGroup;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	
	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassphrase() {
		return passphrase;
	}
	public void setPassphrase(String passphrase) {
		this.passphrase = passphrase;
	}
	public MultipartFile getEmployeeImge() {
		return employeeImge;
	}
	public void setEmployeeImge(MultipartFile employeeImge) {
		this.employeeImge = employeeImge;
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
	public List<FileUploadForm> getFileUploadLstPastExp() {
		return fileUploadLstPastExp;
	}
	public void setFileUploadLstPastExp(List<FileUploadForm> fileUploadLstPastExp) {
		this.fileUploadLstPastExp = fileUploadLstPastExp;
	}
	public List<FileUploadForm> getFileUploadLstPastProj() {
		return fileUploadLstPastProj;
	}
	public void setFileUploadLstPastProj(List<FileUploadForm> fileUploadLstPastProj) {
		this.fileUploadLstPastProj = fileUploadLstPastProj;
	}
	
	
   }