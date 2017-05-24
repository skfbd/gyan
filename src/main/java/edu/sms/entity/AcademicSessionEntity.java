package edu.sms.entity;

import java.sql.Date;

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
@Table(name = "academic_session")
public class AcademicSessionEntity {

	private Long 		id;
	private String 		name;
	private Long 		schoolId;
	private String 		session;
	private String 		sessionStartDate;
	private String 		sessionEndDate;
	private String 	    subjectWiseAttendance;
	private String 		feeStartMonth;
	private String 		prospectusString;
	private String      startYear;
	private String      endYear;
	private Boolean     notApplicable;
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Transient
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="school_id")
	public Long getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}
	
	@Column(name="session")
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	
	@Column(name="session_start_date")
	public String getSessionStartDate() {
		return sessionStartDate;
	}
	public void setSessionStartDate(String sessionStartDate) {
		this.sessionStartDate = sessionStartDate;
	}
	
	@Column(name="session_end_date")
	public String getSessionEndDate() {
		return sessionEndDate;
	}
	public void setSessionEndDate(String sessionEndDate) {
		this.sessionEndDate = sessionEndDate;
	}
	
	@Column(name="subject_wise_attendance")
	public String isSubjectWiseAttendance() {
		return subjectWiseAttendance;
	}
	public void setSubjectWiseAttendance(String subjectWiseAttendance) {
		this.subjectWiseAttendance = subjectWiseAttendance;
	}
	
	@Column(name="fee_start_month")
	public String getFeeStartMonth() {
		return feeStartMonth;
	}
	public void setFeeStartMonth(String feeStartMonth) {
		this.feeStartMonth = feeStartMonth;
	}
	
	@Column(name="prospectus_string")
	public String getProspectusString() {
		return prospectusString;
	}
	public void setProspectusString(String prospectusString) {
		this.prospectusString = prospectusString;
	}
	
		
	
	@Column(name="startyear")
	public String getStartYear() {
		return startYear;
	}
	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}
	@Column(name="endyear")
	public String getEndYear() {
		return endYear;
	}
	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}
	
	@Column(name="notapplicable")
	public Boolean getNotApplicable() {
		return notApplicable;
	}
	public void setNotApplicable(Boolean notApplicable) {
		this.notApplicable = notApplicable;
	}
	
	@Transient
	public DetachedCriteria getFilter(){
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(AcademicSessionEntity.class);
		detachedCriteria.add(Restrictions.eq("id", id)).
		add(Restrictions.eq("name",name)).add(Restrictions.eq("schoolId", schoolId)).addOrder(Order.asc("name"));
		return detachedCriteria;
	}
	
}
