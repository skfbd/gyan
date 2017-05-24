package edu.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

@Entity
@Table(name = "school_org_global_config")
public class SchoolOrgGlobalConfigEntity {
	
	private Long    id;
	private String  name;
	private Long    schoolId;
	private String  shortName;	
	private String  prefix;	
	private String  regNoPrefix;
	private String  admissionNoPrefix;
	private String  feeReceiptPrefix;	
	private String  startingReceiptNo;	
	private String  academicYearStartMonth;
	private String  financialStartMonth;
	private String  leaveStartMonth;
	private String  academicSession;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "name")
	public String getName() {	
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "school_id")
	public Long getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}
	
	@Column(name = "short_name")
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	@Column(name = "prefix")
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	
	@Column(name = "reg_no_prefix")
	public String getRegNoPrefix() {
		return regNoPrefix;
	}
	public void setRegNoPrefix(String regNoPrefix) {
		this.regNoPrefix = regNoPrefix;
	}
	
	@Column(name = "admission_no_prefix")
	public String getAdmissionNoPrefix() {
		return admissionNoPrefix;
	}
	public void setAdmissionNoPrefix(String admissionNoPrefix) {
		this.admissionNoPrefix = admissionNoPrefix;
	}
	
	@Column(name = "fee_receipt_prefix")
	public String getFeeReceiptPrefix() {
		return feeReceiptPrefix;
	}
	public void setFeeReceiptPrefix(String feeReceiptPrefix) {
		this.feeReceiptPrefix = feeReceiptPrefix;
	}
	
	@Column(name = "starting_receipt_no")
	public String getStartingReceiptNo() {
		return startingReceiptNo;
	}
	public void setStartingReceiptNo(String startingReceiptNo) {
		this.startingReceiptNo = startingReceiptNo;
	}
	
	@Column(name = "start_month")
	public String getAcademicYearStartMonth() {
		return academicYearStartMonth;
	}
	public void setAcademicYearStartMonth(String academicYearStartMonth) {
		this.academicYearStartMonth = academicYearStartMonth;
	}
	
	@Column(name = "financial_start_month")
	public String getFinancialStartMonth() {
		return financialStartMonth;
	}
	public void setFinancialStartMonth(String financialStartMonth) {
		this.financialStartMonth = financialStartMonth;
	}
	
	@Column(name = "leave_start_month")
	public String getLeaveStartMonth() {
		return leaveStartMonth;
	}
	public void setLeaveStartMonth(String leaveStartMonth) {
		this.leaveStartMonth = leaveStartMonth;
	}
	
	@Column(name = "academic_session")	
	public String getAcademicSession() {
		return academicSession;
	}
	public void setAcademicSession(String academicSession) {
		this.academicSession = academicSession;
	}

	@Transient
	public DetachedCriteria getFilter(){
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(SchoolOrgGlobalConfigEntity.class);
		detachedCriteria.add(Restrictions.eq("id", id)).
		add(Restrictions.eq("name",name)).add(Restrictions.eq("schoolId", schoolId)).addOrder(Order.asc("name"));
		return detachedCriteria;
	}
}
