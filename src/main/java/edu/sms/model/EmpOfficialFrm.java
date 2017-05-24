package edu.sms.model;




public class EmpOfficialFrm   {
	private int    empOfficialId;
	private String Emp_Code;
	 private String dt_of_Join;
	 private String employee_Type;
	 private String designation;
	 private String staff_Type;
	 private String emp_Category;
	 private String resignation_Dt;
	 private String no_of_Month_Prob_Per;
	 private String no_of_Month_Prob_Notice_Per;
	 private String prob_Per_End_Dt;
	 private String prob_Per_Actual_End_Dt;
	

	public EmpOfficialFrm() {
    }

	public int getEmpOfficialId() {
		return empOfficialId;
	}

	public void setEmpOfficialId(int empOfficialId) {
		this.empOfficialId = empOfficialId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDt_of_Join() {
		return dt_of_Join;
	}

	public void setDt_of_Join(String dt_of_Join) {
		this.dt_of_Join = dt_of_Join;
	}

	public String getEmp_Code() {
		return Emp_Code;
	}

	public void setEmp_Code(String emp_Code) {
		Emp_Code = emp_Code;
	}

	public String getEmp_Category() {
		return emp_Category;
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
		return no_of_Month_Prob_Notice_Per;
	}

	public void setNo_of_Month_Prob_Notice_Per(String no_of_Month_Prob_Notice_Per) {
		this.no_of_Month_Prob_Notice_Per = no_of_Month_Prob_Notice_Per;
	}

	public String getNo_of_Month_Prob_Per() {
		return no_of_Month_Prob_Per;
	}

	public void setNo_of_Month_Prob_Per(String no_of_Month_Prob_Per) {
		this.no_of_Month_Prob_Per = no_of_Month_Prob_Per;
	}

	public String getProb_Per_Actual_End_Dt() {
		return prob_Per_Actual_End_Dt;
	}

	public void setProb_Per_Actual_End_Dt(String prob_Per_Actual_End_Dt) {
		this.prob_Per_Actual_End_Dt = prob_Per_Actual_End_Dt;
	}

	public String getProb_Per_End_Dt() {
		return prob_Per_End_Dt;
	}

	public void setProb_Per_End_Dt(String prob_Per_End_Dt) {
		this.prob_Per_End_Dt = prob_Per_End_Dt;
	}

	public String getResignation_Dt() {
		return resignation_Dt;
	}

	public void setResignation_Dt(String resignation_Dt) {
		this.resignation_Dt = resignation_Dt;
	}

	public String getStaff_Type() {
		return staff_Type;
	}

	public void setStaff_Type(String staff_Type) {
		this.staff_Type = staff_Type;
	}

		
}