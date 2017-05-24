package edu.sms.entity.employee;
import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the empdesignation database table.
 * 
 */
@Entity
@Table(name="empdesignation")
public class EmpDesignationEntity implements Serializable,CommonEmployeeEntity  {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_desig_id", unique=true, nullable=false)
	private int empDesigId;

	@Column(name="Description", length=25)
	private String description;

	@Column(name="Desig_Name", length=50)
	private String desig_Name;

	@Column(name="Emp_type", length=50)
	private String emp_type;

	@Column(name="Priority", length=25)
	private String priority;

	@Column(name="Staff_type", length=25)
	private String staff_type;

	
	
    public EmpDesignationEntity() {
    }

	public int getEmpDesigId() {
		return this.empDesigId;
	}

	public void setEmpDesigId(int empDesigId) {
		this.empDesigId = empDesigId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDesig_Name() {
		return this.desig_Name;
	}

	public void setDesig_Name(String desig_Name) {
		this.desig_Name = desig_Name;
	}

	public String getEmp_type() {
		return this.emp_type;
	}

	public void setEmp_type(String emp_type) {
		this.emp_type = emp_type;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStaff_type() {
		return this.staff_type;
	}

	public void setStaff_type(String staff_type) {
		this.staff_type = staff_type;
	}

}