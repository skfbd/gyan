package edu.sms.model;

public class EmpDesignationFrm extends Searchfrm {
	
	private int    empDesigId;
	private String description;
	private String desig_Name;
	private String emp_type;
	private String priority;
	private String staff_type;
	private String staff_typeCaption;
	
    public EmpDesignationFrm() {
    }

	public int getEmpDesigId() {
		return empDesigId;
	}

	public void setEmpDesigId(int empDesigId) {
		this.empDesigId = empDesigId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDesig_Name() {
		return desig_Name;
	}

	public void setDesig_Name(String desig_Name) {
		this.desig_Name = desig_Name;
	}

	public String getEmp_type() {
		return emp_type;
	}

	public void setEmp_type(String emp_type) {
		this.emp_type = emp_type;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStaff_type() {
		return staff_type;
	}

	public void setStaff_type(String staff_type) {
		this.staff_type = staff_type;
	}

	public String getStaff_typeCaption() {
		return staff_typeCaption;
	}

	public void setStaff_typeCaption(String staff_typeCaption) {
		this.staff_typeCaption = staff_typeCaption;
	}
	
}