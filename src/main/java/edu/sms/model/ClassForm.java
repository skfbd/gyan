package edu.sms.model;


public class ClassForm {

	private Long id;
	private String name;
	private Long schoolId;
	private String schoolName;
	private Long priority;
	private String description;
    private String schoolIdName;
	public ClassForm(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}

	public Long getPriority() {
		return priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolIdName() {
		return schoolIdName;
	}

	public void setSchoolIdName(String schoolIdName) {
		this.schoolIdName = schoolIdName;
	}

}
