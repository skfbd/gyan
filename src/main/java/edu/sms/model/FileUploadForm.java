package edu.sms.model;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadForm {
    private int emp_EEduFileUpload_id;
	
	private int emp_PEFileUpload_id;
	private int emp_PPFileUpload_id;
	//private MultipartFile[] files;
    private MultipartFile files;
	private String filePath;
	private String fileName;
    
    
    
    public int getEmp_PPFileUpload_id() {
		return emp_PPFileUpload_id;
	}


	public void setEmp_PPFileUpload_id(int emp_PPFileUpload_id) {
		this.emp_PPFileUpload_id = emp_PPFileUpload_id;
	}


	public int getEmp_PEFileUpload_id() {
		return emp_PEFileUpload_id;
	}


	public void setEmp_PEFileUpload_id(int emp_PEFileUpload_id) {
		this.emp_PEFileUpload_id = emp_PEFileUpload_id;
	}


	public FileUploadForm() {
    
	}

	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public MultipartFile getFiles() {
		return files;
	}


	public void setFiles(MultipartFile files) {
		this.files = files;
	}


	public int getEmp_EEduFileUpload_id() {
		return emp_EEduFileUpload_id;
	}


	public void setEmp_EEduFileUpload_id(int emp_EEduFileUpload_id) {
		this.emp_EEduFileUpload_id = emp_EEduFileUpload_id;
	}


	public String getFilePath() {
		return filePath;
	}


	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}


	/*public MultipartFile[] getFiles() {
		return files;
	}


	public void setFiles(MultipartFile[] files) {
		this.files = files;
	}

	*/

	
}
