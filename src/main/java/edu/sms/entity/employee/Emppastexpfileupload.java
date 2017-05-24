package edu.sms.entity.employee;
import java.io.Serializable;

import javax.persistence.*;

import org.springframework.web.multipart.MultipartFile;


/**
 * The persistent class for the emppastexpfileupload database table.
 * 
 */
@Entity
@Table(name="emppastexpfileupload")
public class Emppastexpfileupload implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int emp_PEFileUpload_id;

	
	@Column(name="fileName")
	private String fileName;

	@Column(name="filePath")
	private String filePath;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "emp_id", nullable = false)
	private EmployeeEntity employee;

	
	@Transient
	private MultipartFile files;
	
	
	
    public MultipartFile getFiles() {
		return files;
	}

	public void setFiles(MultipartFile files) {
		this.files = files;
	}

	public Emppastexpfileupload() {
    }

	public int getEmp_PEFileUpload_id() {
		return this.emp_PEFileUpload_id;
	}

	public void setEmp_PEFileUpload_id(int emp_PEFileUpload_id) {
		this.emp_PEFileUpload_id = emp_PEFileUpload_id;
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

		
}