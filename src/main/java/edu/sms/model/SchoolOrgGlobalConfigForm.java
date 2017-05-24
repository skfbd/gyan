package edu.sms.model;


public class SchoolOrgGlobalConfigForm {

	private Long id;
	private String name;
	private Long schoolId;
	private String shortName;
	private String prefix;
	private String regNoPrefix;
	private String admissionNoPrefix;
	private String feeReceiptPrefix;
	private String startingReceiptNo;
	private String academicYearStartMonth;
	private String financialStartMonth;
	private String leaveStartMonth;
	private String academicSession;

	/*public SchoolOrgGlobalConfigForm(HttpServletRequest request) {
		id = Long.valueOf(request.getParameter("id"));
		name = request.getParameter("name");
		schoolId = Long.valueOf(request.getParameter("schoolId"));
		shortName = request.getParameter("shortName");
		prefix = request.getParameter("prefix");
		regNoPrefix = request.getParameter("regNoPrefix");
		admissionNoPrefix = request.getParameter("admissionNoPrefix");
		feeReceiptPrefix = request.getParameter("feeReceiptPrefix");
		startingReceiptNo = Long.valueOf(request.getParameter("startingReceiptNo"));
		academicYearStartMonth = request.getParameter("academicYearStartMonth");
		financialStartMonth = request.getParameter("financialStartMonth");
		leaveStartMonth = request.getParameter("leaveStartMonth");
		academicSession = request.getParameter("academicSession");
	}*/
	
	public SchoolOrgGlobalConfigForm(){}

	public String getStartingReceiptNo() {
		return startingReceiptNo;
	}

	public void setStartingReceiptNo(String startingReceiptNo) {
		this.startingReceiptNo = startingReceiptNo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getRegNoPrefix() {
		return regNoPrefix;
	}

	public void setRegNoPrefix(String regNoPrefix) {
		this.regNoPrefix = regNoPrefix;
	}

	public String getAdmissionNoPrefix() {
		return admissionNoPrefix;
	}

	public void setAdmissionNoPrefix(String admissionNoPrefix) {
		this.admissionNoPrefix = admissionNoPrefix;
	}

	public String getFeeReceiptPrefix() {
		return feeReceiptPrefix;
	}

	public void setFeeReceiptPrefix(String feeReceiptPrefix) {
		this.feeReceiptPrefix = feeReceiptPrefix;
	}

	public String getAcademicYearStartMonth() {
		return academicYearStartMonth;
	}

	public void setAcademicYearStartMonth(String academicYearStartMonth) {
		this.academicYearStartMonth = academicYearStartMonth;
	}

	public String getFinancialStartMonth() {
		return financialStartMonth;
	}

	public void setFinancialStartMonth(String financialStartMonth) {
		this.financialStartMonth = financialStartMonth;
	}

	public String getLeaveStartMonth() {
		return leaveStartMonth;
	}

	public void setLeaveStartMonth(String leaveStartMonth) {
		this.leaveStartMonth = leaveStartMonth;
	}

	public String getAcademicSession() {
		return academicSession;
	}

	public void setAcademicSession(String academicSession) {
		this.academicSession = academicSession;
	}

}
