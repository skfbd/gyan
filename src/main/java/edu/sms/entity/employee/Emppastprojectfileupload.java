package edu.sms.entity.employee;
import java.io.Serializable;

import javax.persistence.*;

import org.springframework.web.multipart.MultipartFile;


/**
 * The persistent class for the emppastprojectfileupload database table.
 * 
 */
@Entity
@Table(name="emppastprojectfileupload")
public class Emppastprojectfileupload implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int emp_PPFileUpload_id;

	
	@Column(name="fileName")
	private String fileName;

	@Column(name="filePath")
	private String filePath;

	@Transient
	private MultipartFile files;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "emp_id", nullable = false)
	private EmployeeEntity employee;

	
	
    public Emppastprojectfileupload() {
    }

	public int getEmp_PPFileUpload_id() {
		return this.emp_PPFileUpload_id;
	}

	public void setEmp_PPFileUpload_id(int emp_PPFileUpload_id) {
		this.emp_PPFileUpload_id = emp_PPFileUpload_id;
	}

	
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}

	public MultipartFile getFiles() {
		return files;
	}

	public void setFiles(MultipartFile files) {
		this.files = files;
	}
	
	
	
	
	
}