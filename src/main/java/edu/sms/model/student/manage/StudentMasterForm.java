/**
 * 
 */
package edu.sms.model.student.manage;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Kundan Suthar
 *
 */

public class StudentMasterForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long studentId;
	private long schoolId;
	private long organizationId;
	private Date studentCreationDate;
	private long studentCreatedBy;
	private String status;
	private int obsolete;
	private StudentAddressForm studentAddressForm = new StudentAddressForm();
	private StudentFathersInfoForm studentFathersInfoForm = new StudentFathersInfoForm();
	private StudentLocalGuardianInfoForm studentLocalGuardianInfoForm = new StudentLocalGuardianInfoForm();
	private StudentMothersInfoForm studentMothersInfoForm = new StudentMothersInfoForm();
	private StudentParentalCommonInfoForm studentParentalCommonInfoForm = new StudentParentalCommonInfoForm();
	private StudentPersonalDetailsForm studentPersonalDetailsForm = new StudentPersonalDetailsForm();
	private StudentSibblingInfoForm studentSibblingInfoForm = new StudentSibblingInfoForm();
	private StudentOtherInfoForm studentOtherInfoForm = new StudentOtherInfoForm();
	private StudentAcademicDetailsForm studentAcademicDetailsForm = new StudentAcademicDetailsForm();
	private StudentOtherFacilityForm studentOtherFacilityForm = new StudentOtherFacilityForm();
	private StudentLastAcademicDetailsForm studentLastAcademicDetailsForm = new StudentLastAcademicDetailsForm();
	private StudentEnclosedDocumentsForm studentEnclosedDocumentsForm = new StudentEnclosedDocumentsForm();
	private StudentExtraDetailsForm studentExtraDetailsForm = new StudentExtraDetailsForm();
	private StudentInfectiousDetailsForm studentInfectiousDetailsForm = new StudentInfectiousDetailsForm();
	private StudentNonInfectiousDetailsForm studentNonInfectiousDetailsForm = new StudentNonInfectiousDetailsForm();
	private StudentHealthDetailsForm studentHealthDetailsForm = new StudentHealthDetailsForm();
	
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public long getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(long schoolId) {
		this.schoolId = schoolId;
	}
	public Date getStudentCreationDate() {
		return studentCreationDate;
	}
	public void setStudentCreationDate(Date studentCreationDate) {
		this.studentCreationDate = studentCreationDate;
	}
	public long getStudentCreatedBy() {
		return studentCreatedBy;
	}
	public void setStudentCreatedBy(long studentCreatedBy) {
		this.studentCreatedBy = studentCreatedBy;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getObsolete() {
		return obsolete;
	}
	public void setObsolete(int obsolete) {
		this.obsolete = obsolete;
	}
	
	public StudentAddressForm getStudentAddressForm() {
		return studentAddressForm;
	}
	public void setStudentAddressForm(StudentAddressForm studentAddressForm) {
		this.studentAddressForm = studentAddressForm;
	}
	public StudentFathersInfoForm getStudentFathersInfoForm() {
		return studentFathersInfoForm;
	}
	public void setStudentFathersInfoForm(StudentFathersInfoForm studentFathersInfoForm) {
		this.studentFathersInfoForm = studentFathersInfoForm;
	}
	public StudentLocalGuardianInfoForm getStudentLocalGuardianInfoForm() {
		return studentLocalGuardianInfoForm;
	}
	public void setStudentLocalGuardianInfoForm(StudentLocalGuardianInfoForm studentLocalGuardianInfoForm) {
		this.studentLocalGuardianInfoForm = studentLocalGuardianInfoForm;
	}
	public StudentMothersInfoForm getStudentMothersInfoForm() {
		return studentMothersInfoForm;
	}
	public void setStudentMothersInfoForm(StudentMothersInfoForm studentMothersInfoForm) {
		this.studentMothersInfoForm = studentMothersInfoForm;
	}
	public StudentParentalCommonInfoForm getStudentParentalCommonInfoForm() {
		return studentParentalCommonInfoForm;
	}
	public void setStudentParentalCommonInfoForm(StudentParentalCommonInfoForm studentParentalCommonInfoForm) {
		this.studentParentalCommonInfoForm = studentParentalCommonInfoForm;
	}
	public StudentPersonalDetailsForm getStudentPersonalDetailsForm() {
		return studentPersonalDetailsForm;
	}
	public void setStudentPersonalDetailsForm(StudentPersonalDetailsForm studentPersonalDetailsForm) {
		this.studentPersonalDetailsForm = studentPersonalDetailsForm;
	}
	public StudentSibblingInfoForm getStudentSibblingInfoForm() {
		return studentSibblingInfoForm;
	}
	public void setStudentSibblingInfoForm(StudentSibblingInfoForm studentSibblingInfoForm) {
		this.studentSibblingInfoForm = studentSibblingInfoForm;
	}
	public StudentOtherInfoForm getStudentOtherInfoForm() {
		return studentOtherInfoForm;
	}
	public void setStudentOtherInfoForm(StudentOtherInfoForm studentOtherInfoForm) {
		this.studentOtherInfoForm = studentOtherInfoForm;
	}
	public StudentAcademicDetailsForm getStudentAcademicDetailsForm() {
		return studentAcademicDetailsForm;
	}
	public void setStudentAcademicDetailsForm(StudentAcademicDetailsForm studentAcademicDetailsForm) {
		this.studentAcademicDetailsForm = studentAcademicDetailsForm;
	}
	public StudentOtherFacilityForm getStudentOtherFacilityForm() {
		return studentOtherFacilityForm;
	}
	public void setStudentOtherFacilityForm(StudentOtherFacilityForm studentOtherFacilityForm) {
		this.studentOtherFacilityForm = studentOtherFacilityForm;
	}
	public StudentLastAcademicDetailsForm getStudentLastAcademicDetailsForm() {
		return studentLastAcademicDetailsForm;
	}
	public void setStudentLastAcademicDetailsForm(StudentLastAcademicDetailsForm studentLastAcademicDetailsForm) {
		this.studentLastAcademicDetailsForm = studentLastAcademicDetailsForm;
	}
	public StudentEnclosedDocumentsForm getStudentEnclosedDocumentsForm() {
		return studentEnclosedDocumentsForm;
	}
	public void setStudentEnclosedDocumentsForm(StudentEnclosedDocumentsForm studentEnclosedDocumentsForm) {
		this.studentEnclosedDocumentsForm = studentEnclosedDocumentsForm;
	}
	public StudentExtraDetailsForm getStudentExtraDetailsForm() {
		return studentExtraDetailsForm;
	}
	public void setStudentExtraDetailsForm(StudentExtraDetailsForm studentExtraDetailsForm) {
		this.studentExtraDetailsForm = studentExtraDetailsForm;
	}
	public StudentInfectiousDetailsForm getStudentInfectiousDetailsForm() {
		return studentInfectiousDetailsForm;
	}
	public void setStudentInfectiousDetailsForm(StudentInfectiousDetailsForm studentInfectiousDetailsForm) {
		this.studentInfectiousDetailsForm = studentInfectiousDetailsForm;
	}
	public StudentNonInfectiousDetailsForm getStudentNonInfectiousDetailsForm() {
		return studentNonInfectiousDetailsForm;
	}
	public void setStudentNonInfectiousDetailsForm(StudentNonInfectiousDetailsForm studentNonInfectiousDetailsForm) {
		this.studentNonInfectiousDetailsForm = studentNonInfectiousDetailsForm;
	}
	public StudentHealthDetailsForm getStudentHealthDetailsForm() {
		return studentHealthDetailsForm;
	}
	public void setStudentHealthDetailsForm(StudentHealthDetailsForm studentHealthDetailsForm) {
		this.studentHealthDetailsForm = studentHealthDetailsForm;
	}
	public long getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(long organizationId) {
		this.organizationId = organizationId;
	}
	
}
