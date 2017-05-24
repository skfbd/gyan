package edu.sms.entity.employee;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;


/**
 * The persistent class for the empedufileupload database table.
 * 
 */
@Entity
@Table(name="empedufileupload")
public class Empedufileupload implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "emp_EEduFileUpload_id" ,unique=true, nullable=false)
	private int emp_EEduFileUpload_id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "emp_edu_id", nullable = false)
	private EmpEducationalEntity empEducational;
	
	@Column(name="emp_id")
	private Integer empId;

	@Column(name="fileName")
	private String fileName;

	@Column(name="filePath")
	private String filePath;

	@Transient
	 private MultipartFile files;
	
   
	public Empedufileupload() {
    }

	public int getEmp_EEduFileUpload_id() {
		return this.emp_EEduFileUpload_id;
	}

	public void setEmp_EEduFileUpload_id(int emp_EEduFileUpload_id) {
		this.emp_EEduFileUpload_id = emp_EEduFileUpload_id;
	}

	

	public EmpEducationalEntity getEmpEducational() {
		return empEducational;
	}

	public void setEmpEducational(EmpEducationalEntity empEducational) {
		this.empEducational = empEducational;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
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
	 public MultipartFile getFiles() {
			return files;
		}

		public void setFiles(MultipartFile files) {
			this.files = files;
		}

}