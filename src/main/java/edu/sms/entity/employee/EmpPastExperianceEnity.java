package edu.sms.entity.employee;
import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the emppastexperiancedtl database table.
 * 
 */
@Entity
@Table(name="emppastexperiancedtl")
public class EmpPastExperianceEnity implements Serializable  {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_pExpe_id" ,unique=true, nullable=false)
	private Integer emp_pExpe_id;
	
	@Column(name="Company_Name", length=50)
	private String Company_Name;
	
	
	@Column(name="Company_Address", length=50)
	private String company_Address;

	@Column(name="Company_contact_dtl", length=50)
	private String company_contact_dtl;

	@Column(name="Designation", length=50)
	private String designation;

	@Column(name="Designation0", length=50)
	private String designation0;

	@Column(name="Designation1", length=50)
	private String designation1;

	@Column(name="Duration", length=50)
	private String duration;

	@Column(name="Email", length=50)
	private String email;

	@Column(name="Email1", length=50)
	private String email1;

	@Column(name="Enter_Two_Ref", length=50)
	private String enter_Two_Ref;

	@Column(name="Phone", length=50)
	private String phone;

	@Column(name="Phone1", length=50)
	private String phone1;

	@Column(name="Priority", length=50)
	private String priority;

	@Column(length=50)
	private String refname;

	@Column(length=50)
	private String refname1;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "emp_id", nullable = false)
	private EmployeeEntity employee;

    public EmpPastExperianceEnity() {
    }

	public Integer getEmp_pExpe_id() {
		return this.emp_pExpe_id;
	}

	public void setEmp_pExpe_id(Integer emp_pExpe_id) {
		this.emp_pExpe_id = emp_pExpe_id;
	}

	public String getCompany_Address() {
		return this.company_Address;
	}

	public void setCompany_Address(String company_Address) {
		this.company_Address = company_Address;
	}

	public String getCompany_contact_dtl() {
		return this.company_contact_dtl;
	}

	public void setCompany_contact_dtl(String company_contact_dtl) {
		this.company_contact_dtl = company_contact_dtl;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDesignation0() {
		return this.designation0;
	}

	public void setDesignation0(String designation0) {
		this.designation0 = designation0;
	}

	public String getDesignation1() {
		return this.designation1;
	}

	public void setDesignation1(String designation1) {
		this.designation1 = designation1;
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail1() {
		return this.email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEnter_Two_Ref() {
		return this.enter_Two_Ref;
	}

	public void setEnter_Two_Ref(String enter_Two_Ref) {
		this.enter_Two_Ref = enter_Two_Ref;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone1() {
		return this.phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getRefname() {
		return this.refname;
	}

	public void setRefname(String refname) {
		this.refname = refname;
	}

	public String getRefname1() {
		return this.refname1;
	}

	public void setRefname1(String refname1) {
		this.refname1 = refname1;
	}

	public String getCompany_Name() {
		return Company_Name;
	}

	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}

	
	
}