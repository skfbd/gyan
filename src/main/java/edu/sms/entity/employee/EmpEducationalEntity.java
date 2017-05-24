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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="empeducationaldtl")
public class EmpEducationalEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_edu_id" ,unique=true, nullable=false)
	private Integer emp_edu_id;

	@Column(name="qualificationName" ,length=50)
	private String qualificationName;

	@Column(name="institCollSchool" ,length=50)
	private String institCollSchool;
	
	
	@Column(name="boardcollUniver" ,length=50)
	private String boardcollUniver;

	@Column(name="cgpaPercentage",  length=50)
	private String cgpaPercentage;

	@Column(name="criteria_university", length=50)
	private String criteriaUniversity;

	@Column(name="division" ,length=50)
	private String division;

	@Column(name="electives" ,length=50)
	private String electives;

	@Column(name="medium" ,length=50)
	private String medium;

	@Column(name="remark" ,length=50)
	private String remark;

	@Column(name="yearofpassing" ,length=25)
	private String yearofpassing;

	@OneToMany(fetch=FetchType.LAZY, targetEntity=Empedufileupload.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "emp_edu_id", referencedColumnName="emp_edu_id")
	private List<Empedufileupload> empedufileUpload =new ArrayList<Empedufileupload>();
	
	

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "emp_id", nullable = false)
	private EmployeeEntity employee;

    public EmpEducationalEntity() {
    }

	

	public Integer getEmp_edu_id() {
		return emp_edu_id;
	}



	public void setEmp_edu_id(Integer emp_edu_id) {
		this.emp_edu_id = emp_edu_id;
	}



	public String getBoardcollUniver() {
		return this.boardcollUniver;
	}

	public void setBoardcollUniver(String boardcollUniver) {
		this.boardcollUniver = boardcollUniver;
	}

	public String getCgpaPercentage() {
		return this.cgpaPercentage;
	}

	public void setCgpaPercentage(String cgpaPercentage) {
		this.cgpaPercentage = cgpaPercentage;
	}

	public String getCriteriaUniversity() {
		return this.criteriaUniversity;
	}

	public void setCriteriaUniversity(String criteriaUniversity) {
		this.criteriaUniversity = criteriaUniversity;
	}

	public String getDivision() {
		return this.division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getElectives() {
		return this.electives;
	}

	public void setElectives(String electives) {
		this.electives = electives;
	}

	public String getMedium() {
		return this.medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getQualificationName() {
		return this.qualificationName;
	}

	public void setQualificationName(String qualificationName) {
		this.qualificationName = qualificationName;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getYearofpassing() {
		return this.yearofpassing;
	}

	public void setYearofpassing(String yearofpassing) {
		this.yearofpassing = yearofpassing;
	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}

	public List<Empedufileupload> getEmpedufileUpload() {
		return empedufileUpload;
	}

	public void setEmpedufileUpload(List<Empedufileupload> empedufileUpload) {
		this.empedufileUpload = empedufileUpload;
	}

	
	public String getInstitCollSchool() {
		return institCollSchool;
	}



	public void setInstitCollSchool(String institCollSchool) {
		this.institCollSchool = institCollSchool;
	}
	
}