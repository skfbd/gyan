package edu.sms.entity.employee;
import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * The persistent class for the emppayrolldetails database table.
 * 
 */
@Entity
@Table(name="emppayrolldetails")
public class EmpPayRollEntity implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Id  
	@Column(name = "emp_payroll_id")  
	@GeneratedValue(generator = "gen")  
	@GenericGenerator(name = "gen", strategy = "foreign", parameters = @Parameter(name = "property", value = "employee"))  
	private int empPayrollId;

	@Column(name="Bank_Acc_No", length=50)
	private String Bank_Acc_No;

	@Column(name="Bank_Branch", length=50)
	private String bank_Branch;

	@Column(name="Bank_Name", length=50)
	private String bank_Name;

	@Column(name="tan_number", length=50)
	private String tan_number;
	
	

	@Column(name="ESI_Dispensary",length=50)
	private String ESI_Dispensary;

	@Column(name="ESI_Num",length=50)
	private String ESI_Num;

	@Column(name="Form_Sixteen", length=50)
	private String form_Sixteen;

	@Column(name="ITR_File",length=50)
	private String ITR_File;

	@Column(name="Nominee_for_Gratuity", length=50)
	private String nominee_for_Gratuity;

	@Column(name="Nominee_for_pension", length=50)
	private String nominee_for_pension;

	@Column(name="PAN_Card_Num",length=50)
	private String PAN_Card_Num;

	@Column(name="PAN_Ward_Circle",length=50)
	private String PAN_Ward_Circle;

	@Column(name="PF_Dep_File_Num",length=50)
	private String PF_Dep_File_Num;

	@Column(name="PF_Num",length=50)
	private String PF_Num;

	
	@OneToOne  
	@PrimaryKeyJoinColumn
	private EmployeeEntity employee;
	
    

	public EmpPayRollEntity() {
    }

	public int getEmpPayrollId() {
		return this.empPayrollId;
	}

	public void setEmpPayrollId(int empPayrollId) {
		this.empPayrollId = empPayrollId;
	}

	

	public String getBank_Acc_No() {
		return Bank_Acc_No;
	}

	public void setBank_Acc_No(String bank_Acc_No) {
		Bank_Acc_No = bank_Acc_No;
	}

	public String getBank_Branch() {
		return this.bank_Branch;
	}

	public void setBank_Branch(String bank_Branch) {
		this.bank_Branch = bank_Branch;
	}

	public String getBank_Name() {
		return this.bank_Name;
	}

	public void setBank_Name(String bank_Name) {
		this.bank_Name = bank_Name;
	}

	

	public String getESI_Dispensary() {
		return this.ESI_Dispensary;
	}

	public void setESI_Dispensary(String ESI_Dispensary) {
		this.ESI_Dispensary = ESI_Dispensary;
	}

	public String getESI_Num() {
		return this.ESI_Num;
	}

	public void setESI_Num(String ESI_Num) {
		this.ESI_Num = ESI_Num;
	}

	public String getForm_Sixteen() {
		return this.form_Sixteen;
	}

	public void setForm_Sixteen(String form_Sixteen) {
		this.form_Sixteen = form_Sixteen;
	}

	public String getITR_File() {
		return this.ITR_File;
	}

	public void setITR_File(String ITR_File) {
		this.ITR_File = ITR_File;
	}

	public String getNominee_for_Gratuity() {
		return this.nominee_for_Gratuity;
	}

	public void setNominee_for_Gratuity(String nominee_for_Gratuity) {
		this.nominee_for_Gratuity = nominee_for_Gratuity;
	}

	public String getNominee_for_pension() {
		return this.nominee_for_pension;
	}

	public void setNominee_for_pension(String nominee_for_pension) {
		this.nominee_for_pension = nominee_for_pension;
	}

	public String getPAN_Card_Num() {
		return this.PAN_Card_Num;
	}

	public void setPAN_Card_Num(String PAN_Card_Num) {
		this.PAN_Card_Num = PAN_Card_Num;
	}

	public String getPAN_Ward_Circle() {
		return this.PAN_Ward_Circle;
	}

	public void setPAN_Ward_Circle(String PAN_Ward_Circle) {
		this.PAN_Ward_Circle = PAN_Ward_Circle;
	}

	public String getPF_Dep_File_Num() {
		return this.PF_Dep_File_Num;
	}

	public void setPF_Dep_File_Num(String PF_Dep_File_Num) {
		this.PF_Dep_File_Num = PF_Dep_File_Num;
	}

	public String getPF_Num() {
		return this.PF_Num;
	}

	public void setPF_Num(String PF_Num) {
		this.PF_Num = PF_Num;
	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}
	
	
	public String getTan_number() {
		return tan_number;
	}

	public void setTan_number(String tan_number) {
		this.tan_number = tan_number;
	}
	
}