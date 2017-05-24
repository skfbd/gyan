package edu.sms.entity.employee;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the emppastproject database table.
 * 
 */
@Entity
@Table(name="emppastproject")
public class EmpPastProjectEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private Integer emp_pastProj_id;

	@Column(name = "projectName")
	private String projectName;
	
	@Column(name = "projectDescription")
	private String projectDescription;

	
	//bi-directional many-to-one association to Employee
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "emp_id", nullable = false)
	private EmployeeEntity employee;

    public EmpPastProjectEntity() {
    }

	public Integer getEmp_pastProj_id() {
		return this.emp_pastProj_id;
	}

	public void setEmp_pastProj_id(Integer emp_pastProj_id) {
		this.emp_pastProj_id = emp_pastProj_id;
	}

	public String getProjectDescription() {
		return this.projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	
	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}

	
}