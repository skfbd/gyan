/**
 * 
 */
package edu.sms.dao.student.manage;

import java.util.ArrayList;
import java.util.List;

import edu.sms.entity.StudentManager.StudentAcademicDetailsEntity;
import edu.sms.entity.StudentManager.StudentAddressEntity;
import edu.sms.entity.StudentManager.StudentEnclosedDocumentsEntity;
import edu.sms.entity.StudentManager.StudentExtraDetailsEntity;
import edu.sms.entity.StudentManager.StudentFathersInfoEntity;
import edu.sms.entity.StudentManager.StudentHealthDetailsEntity;
import edu.sms.entity.StudentManager.StudentInfectiousDetailsEntity;
import edu.sms.entity.StudentManager.StudentLastAcademicDetailsEntity;
import edu.sms.entity.StudentManager.StudentLocalGuardianInfoEntity;
import edu.sms.entity.StudentManager.StudentMasterEntity;
import edu.sms.entity.StudentManager.StudentMothersInfoEntity;
import edu.sms.entity.StudentManager.StudentNonInfectiousDetailsEntity;
import edu.sms.entity.StudentManager.StudentOtherFacilityEntity;
import edu.sms.entity.StudentManager.StudentOtherInfoEntity;
import edu.sms.entity.StudentManager.StudentParentalCommonInfoEntity;
import edu.sms.entity.StudentManager.StudentPersonalDetailsEntity;
import edu.sms.entity.StudentManager.StudentSibblingInfoEntity;
import edu.sms.model.student.manage.StudentListForm;

/**
 * @author Kundan Suthar
 *
 */
public interface StudentDao{
	
	public void createStudent(StudentMasterEntity studentMasterEntity);
	public void createStudentAcademicDetails(StudentAcademicDetailsEntity studentAcademicDetailsEntity);
	public void createStudentAddress(StudentAddressEntity studentAddressEntity);
	public void createStudentFathersInfo(StudentFathersInfoEntity studentFathersInfoEntity);
	public void createStudentLocalGuardianInfo(StudentLocalGuardianInfoEntity studentLocalGuardianInfoEntity);
	public void createStudentMothersInfo(StudentMothersInfoEntity studentMothersInfoEntity);
	public void createStudentParentalCommonInfo(StudentParentalCommonInfoEntity studentParentalCommonInfoEntity);
	public void createStudentPersonalDetails(StudentPersonalDetailsEntity studentPersonalDetailsEntity);
	public void createStudentSibblingInfo(StudentSibblingInfoEntity studentSibblingInfoEntity);
	public void createStudentOtherInfo(StudentOtherInfoEntity studentOtherInfoEntity);
	public void createStudentOtherFacility(StudentOtherFacilityEntity studentOtherFacilityEntity);
	public void createStudentLastAcademicDetails(StudentLastAcademicDetailsEntity studentLastAcademicDetailsEntity);
	public void createStudentEnclosedDocuments(StudentEnclosedDocumentsEntity studentEnclosedDocumentsEntity);
	public void createStudentExtraDetails(StudentExtraDetailsEntity studentExtraDetailsEntity);
	public void createStudentInfectiousDetails(StudentInfectiousDetailsEntity studentInfectiousDetailsEntity);
	public void createStudentNonInfectiousDetails(StudentNonInfectiousDetailsEntity studentNonInfectiousDetailsEntity);
	public void createStudentHealthDetails(StudentHealthDetailsEntity studentHealthDetailsEntity);
	
	
	public  StudentMasterEntity loadStudentMasterEntity(long studentId);
	public  ArrayList<StudentAcademicDetailsEntity> loadStudentAcademicDetailsEntity(long studentId);
	public  ArrayList<StudentAddressEntity> loadStudentAddressEntity(long studentId);
	public  ArrayList<StudentFathersInfoEntity> loadStudentFathersInfoEntity(long studentId);
	public  ArrayList<StudentLocalGuardianInfoEntity> loadStudentLocalGuardianInfoEntity(long studentId);
	public  ArrayList<StudentMothersInfoEntity> loadStudentMothersInfoEntity(long studentId);
	public  ArrayList<StudentParentalCommonInfoEntity> loadStudentParentalCommonInfoEntity(long studentId);
	public  ArrayList<StudentPersonalDetailsEntity> loadStudentPersonalDetailsEntity(long studentId);
	public  ArrayList<StudentSibblingInfoEntity> loadStudentSibblingInfoEntity(long studentId);
	public  ArrayList<StudentOtherInfoEntity> loadStudentOtherInfoEntity(long studentId);
	public  ArrayList<StudentOtherFacilityEntity> loadStudentOtherFacilityEntity(long studentId);
	public  ArrayList<StudentLastAcademicDetailsEntity> loadStudentLastAcademicDetailsEntity(long studentId);
	public  ArrayList<StudentEnclosedDocumentsEntity> loadStudentEnclosedDocumentsEntity(long studentId);
	public  ArrayList<StudentExtraDetailsEntity> loadStudentExtraDetailsEntity(long studentId);
	public  ArrayList<StudentInfectiousDetailsEntity> loadStudentInfectiousDetailsEntity(long studentId);
	public  ArrayList<StudentNonInfectiousDetailsEntity> loadStudentNonInfectiousDetailsEntity(long studentId);
	public  ArrayList<StudentHealthDetailsEntity> loadStudentHealthDetailsEntity(long studentId);
	
	
	public void updateStudent(StudentMasterEntity studentMasterEntity);
	public void updateStudentAcademicDetails(StudentAcademicDetailsEntity studentAcademicDetailsEntity);
	public void updateStudentAddress(StudentAddressEntity studentAddressEntity);
	public void updateStudentFathersInfo(StudentFathersInfoEntity studentFathersInfoEntity);
	public void updateStudentLocalGuardianInfo(StudentLocalGuardianInfoEntity studentLocalGuardianInfoEntity);
	public void updateStudentMothersInfo(StudentMothersInfoEntity studentMothersInfoEntity);
	public void updateStudentParentalCommonInfo(StudentParentalCommonInfoEntity studentParentalCommonInfoEntity);
	public void updateStudentPersonalDetails(StudentPersonalDetailsEntity studentPersonalDetailsEntity);
	public void updateStudentSibblingInfo(StudentSibblingInfoEntity studentSibblingInfoEntity);
	public void updateStudentOtherInfo(StudentOtherInfoEntity studentOtherInfoEntity);
	public void updateStudentOtherFacility(StudentOtherFacilityEntity studentOtherFacilityEntity);
	public void updateStudentLastAcademicDetails(StudentLastAcademicDetailsEntity studentLastAcademicDetailsEntity);
	public void updateStudentEnclosedDocuments(StudentEnclosedDocumentsEntity studentEnclosedDocumentsEntity);
	public void updateStudentExtraDetails(StudentExtraDetailsEntity studentExtraDetailsEntity);
	public void updateStudentInfectiousDetails(StudentInfectiousDetailsEntity studentInfectiousDetailsEntity);
	public void updateStudentNonInfectiousDetails(StudentNonInfectiousDetailsEntity studentNonInfectiousDetailsEntity);
	public void updateStudentHealthDetails(StudentHealthDetailsEntity studentHealthDetailsEntity);
	public List getListByCriteria(StudentListForm studentListForm);
	
}
