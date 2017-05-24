package edu.sms.model;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;

public class AcademicSessionForm {
	
	private Long 		id;
	private String 		name;
	private Long 		schoolId;
	private String      schoolName;
	private String      schoolIdName;
	private String 		session;
	private String      startYear;
	private String      endYear;
	private String 		sessionStartDate;
	private String 		sessionEndDate;
	private String 	    subjectWiseAttendance;
	private String 		feeStartMonth;
	private String 		prospectusString;
	private Boolean     notApplicable;
	/*public AcademicSessionForm (HttpServletRequest request){
		id=Long.valueOf(request.getParameter("id"));
		name=request.getParameter("name");
		schoolId=Long.valueOf(request.getParameter("schoolId"));
		session=request.getParameter("session");
		sessionStartDate=Date.valueOf(request.getParameter("sessionStartDate"));
		sessionEndDate=Date.valueOf(request.getParameter("sessionEndDate"));
		subjectWiseAttendance=request.getParameter("subjectWiseAttendance").toString();
		feeStartMonth=request.getParameter("feeStartMonth");
		prospectusString=request.getParameter("prospectusString");
	}
	*/
	public AcademicSessionForm(){}
	
	

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getEndYear() {
		return endYear;
	}

	public void setEndYear(String endYear) {
		this.endYear = endYear;
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
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getSessionStartDate() {
		return sessionStartDate;
	}
	public void setSessionStartDate(String sessionStartDate) {
		this.sessionStartDate = sessionStartDate;
	}
	public String getSessionEndDate() {
		return sessionEndDate;
	}
	public void setSessionEndDate(String sessionEndDate) {
		this.sessionEndDate = sessionEndDate;
	}
	
	public String getSubjectWiseAttendance() {
		return subjectWiseAttendance;
	}

	public void setSubjectWiseAttendance(String subjectWiseAttendance) {
		this.subjectWiseAttendance = subjectWiseAttendance;
	}

	public String getFeeStartMonth() {
		return feeStartMonth;
	}
	public void setFeeStartMonth(String feeStartMonth) {
		this.feeStartMonth = feeStartMonth;
	}
	public String getProspectusString() {
		return prospectusString;
	}
	public void setProspectusString(String prospectusString) {
		this.prospectusString = prospectusString;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Boolean getNotApplicable() {
		return notApplicable;
	}

	public void setNotApplicable(Boolean notApplicable) {
		this.notApplicable = notApplicable;
	}

	public String getSchoolIdName() {
		return schoolIdName;
	}

	public void setSchoolIdName(String schoolIdName) {
		this.schoolIdName = schoolIdName;
	}
	
}
		