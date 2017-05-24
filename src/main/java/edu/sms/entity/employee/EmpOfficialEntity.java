package edu.sms.entity.employee;
import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * The persistent class for the empofficialdtl database table.
 * 
 */
@Entity
@Table(name="empofficialdtl")
public class EmpOfficialEntity implements Serializable,CommonEmployeeEntity  {
	private static final long serialVersionUID = 1L;

	@Id  
	@Column(name = "emp_official_id")  
	@GeneratedValue(generator = "gen")  
	@GenericGenerator(name = "gen", strategy = "foreign", parameters = @Parameter(name = "property", value = "employee")) 
	private int empOfficialId;

	@Column(name="Designation", length=50)
	private String designation;

	@Column(name="Dt_of_Join", length=50)
	private String dt_of_Join;

	@Column(name="Emp_Code", length=50)
	private String Emp_Code;

	@Column(name="Emp_Category", length=50)
	private String emp_Category;

	@Column(name="Employee_Type", length=50)
	private String employee_Type;

	@Column(name="No_of_Month_Prob_Notice_Per", length=50)
	private String no_of_Month_Prob_Notice_Per;

	@Column(name="No_of_Month_Prob_Per", length=50)
	private String no_of_Month_Prob_Per;

	@Column(name="Prob_Per_Actual_End_Dt", length=50)
	private String prob_Per_Actual_End_Dt;

	@Column(name="Prob_Per_End_Dt", length=50)
	private String prob_Per_End_Dt;

	@Column(name="Resignation_Dt", length=50)
	private String resignation_Dt;

	@Column(name="Staff_Type", length=50)
	private String staff_Type;

	@OneToOne  
	@PrimaryKeyJoinColumn
	private EmployeeEntity employee;
	

    public EmpOfficialEntity() {
    }

	public int getEmpOfficialId() {
		return this.empOfficialId;
	}

	public void setEmpOfficialId(int empOfficialId) {
		this.empOfficialId = empOfficialId;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDt_of_Join() {
		return this.dt_of_Join;
	}

	public void setDt_of_Join(String dt_of_Join) {
		this.dt_of_Join = dt_of_Join;
	}

	public String getEmp_Code() {
		return this.Emp_Code;
	}

	public void set_Emp_Code_(String Emp_Code) {
		this.Emp_Code = Emp_Code;
	}

	public String getEmp_Category() {
		return this.emp_Category;
	}

	public void setEmp_Category(String emp_Category) {
		this.emp_Category = emp_Category;
	}

	

	public String getEmployee_Type() {
		return employee_Type;
	}

	public void setEmployee_Type(String employee_Type) {
		this.employee_Type = employee_Type;
	}

	public String getNo_of_Month_Prob_Notice_Per() {
		return this.no_of_Month_Prob_Notice_Per;
	}

	public void setNo_of_Month_Prob_Notice_Per(String no_of_Month_Prob_Notice_Per) {
		this.no_of_Month_Prob_Notice_Per = no_of_Month_Prob_Notice_Per;
	}

	public String getNo_of_Month_Prob_Per() {
		return this.no_of_Month_Prob_Per;
	}

	public void setNo_of_Month_Prob_Per(String no_of_Month_Prob_Per) {
		this.no_of_Month_Prob_Per = no_of_Month_Prob_Per;
	}

	public String getProb_Per_Actual_End_Dt() {
		return this.prob_Per_Actual_End_Dt;
	}

	public void setProb_Per_Actual_End_Dt(String prob_Per_Actual_End_Dt) {
		this.prob_Per_Actual_End_Dt = prob_Per_Actual_End_Dt;
	}

	public String getProb_Per_End_Dt() {
		return this.prob_Per_End_Dt;
	}

	public void setProb_Per_End_Dt(String prob_Per_End_Dt) {
		this.prob_Per_End_Dt = prob_Per_End_Dt;
	}

	public String getResignation_Dt() {
		return this.resignation_Dt;
	}

	public void setResignation_Dt(String resignation_Dt) {
		this.resignation_Dt = resignation_Dt;
	}

	public String getStaff_Type() {
		return this.staff_Type;
	}

	public void setStaff_Type(String staff_Type) {
		this.staff_Type = staff_Type;
	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}

	public void setEmp_Code(String emp_Code) {
		Emp_Code = emp_Code;
	}

	
	
}