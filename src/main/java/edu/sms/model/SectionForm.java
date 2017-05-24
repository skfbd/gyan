package edu.sms.model;

import javax.servlet.http.HttpServletRequest;

public class SectionForm {
	private Long 	id;
	private Long    schoolId;
	private String  schoolName;
	private String  schoolIdName;
	private Long    academicSessionId; 
	private String  academicSessionName;
	private Long    classId;
	private Long    classTeacherId;
	private Long    secondClassTeacherId;
	private String  name;
	private String  description;
	
  

	public SectionForm(HttpServletRequest request) {
		if(null!=request.getParameter("id")){
		id = request.getParameter("id")!=null? Long.valueOf(request.getParameter("id")): null;
		}else{
			id=null;
		}
		name = request.getParameter("name");
		schoolId = Long.valueOf(request.getParameter("schoolId"));
		academicSessionId = Long.valueOf(request.getParameter("academicSessionId"));
		classId = Long.valueOf(request.getParameter("classId"));
		classTeacherId = Long.valueOf(request.getParameter("classTeacherId"));
		secondClassTeacherId = Long.valueOf(request.getParameter("secondClassTeacherId"));
	}

	public SectionForm() {
	}

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

	public Long getAcademicSessionId() {
		return academicSessionId;
	}

	public void setAcademicSessionId(Long academicSessionId) {
		this.academicSessionId = academicSessionId;
	}

	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Long getClassTeacherId() {
		return classTeacherId;
	}

	public void setClassTeacherId(Long classTeacherId) {
		this.classTeacherId = classTeacherId;
	}

	public Long getSecondClassTeacherId() {
		return secondClassTeacherId;
	}

	public void setSecondClassTeacherId(Long secondClassTeacherId) {
		this.secondClassTeacherId = secondClassTeacherId;
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

	public String getAcademicSessionName() {
		return academicSessionName;
	}

	public void setAcademicSessionName(String academicSessionName) {
		this.academicSessionName = academicSessionName;
	}
	 public String getSchoolIdName() {
			return schoolIdName;
		}

	public void setSchoolIdName(String schoolIdName) {
			this.schoolIdName = schoolIdName;
		}
}
