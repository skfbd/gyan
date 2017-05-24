/**
 * 
 */
package edu.sms.service.student.manage.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.UnhandledException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import edu.sms.dao.student.manage.StudentDao;
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
import edu.sms.model.student.manage.StudentEnclosedDocumentsForm;
import edu.sms.model.student.manage.StudentHealthDetailsForm;
import edu.sms.model.student.manage.StudentListForm;
import edu.sms.model.student.manage.StudentMasterForm;
import edu.sms.service.student.manage.StudentService;

/**
 * @author Remedies
 *
 */
public class StudentServiceImpl implements StudentService {

	private static final Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);
	private StudentDao studentDao;
	
	
	@Transactional
	public void createStudent(StudentMasterForm studentMasterForm,HttpServletRequest request) {
		try{
			StudentMasterEntity studentMasterEntity = new StudentMasterEntity();
			BeanUtils.copyProperties(studentMasterForm , studentMasterEntity);
			studentDao.createStudent(studentMasterEntity);
			
			StudentAcademicDetailsEntity StudentAcademicDetailsEntity = new StudentAcademicDetailsEntity();
			studentMasterForm.getStudentAcademicDetailsForm().setStudentId(studentMasterEntity.getStudentId());
			BeanUtils.copyProperties(studentMasterForm.getStudentAcademicDetailsForm() , StudentAcademicDetailsEntity);
			
			 StudentAddressEntity studentAddressEntity = new StudentAddressEntity();
			 studentMasterForm.getStudentAddressForm().setStudentId(studentMasterEntity.getStudentId());
			 BeanUtils.copyProperties(studentMasterForm.getStudentAddressForm() , studentAddressEntity);
			 
			 StudentFathersInfoEntity studentFathersInfoEntity = new StudentFathersInfoEntity();
			 studentMasterForm.getStudentFathersInfoForm().setStudentId(studentMasterEntity.getStudentId());
			 BeanUtils.copyProperties(studentMasterForm.getStudentFathersInfoForm() , studentFathersInfoEntity);
			 
			 StudentLocalGuardianInfoEntity studentLocalGuardianInfoEntity = new StudentLocalGuardianInfoEntity();
			 studentMasterForm.getStudentLocalGuardianInfoForm().setStudentId(studentMasterEntity.getStudentId());
			 BeanUtils.copyProperties(studentMasterForm.getStudentLocalGuardianInfoForm() , studentLocalGuardianInfoEntity);
			 
			 StudentMothersInfoEntity studentMothersInfoEntity = new StudentMothersInfoEntity();
			 studentMasterForm.getStudentMothersInfoForm().setStudentId(studentMasterEntity.getStudentId());
			 BeanUtils.copyProperties(studentMasterForm.getStudentMothersInfoForm() , studentMothersInfoEntity);
			 
			 StudentParentalCommonInfoEntity studentParentalCommonInfoEntity = new StudentParentalCommonInfoEntity();
			 studentMasterForm.getStudentParentalCommonInfoForm().setStudentId(studentMasterEntity.getStudentId());
			 BeanUtils.copyProperties(studentMasterForm.getStudentParentalCommonInfoForm() , studentParentalCommonInfoEntity);
			 
			 StudentPersonalDetailsEntity studentPersonalDetailsEntity = new StudentPersonalDetailsEntity();
			 studentMasterForm.getStudentPersonalDetailsForm().setStudentId(studentMasterEntity.getStudentId());
			 studentMasterForm.getStudentPersonalDetailsForm().setStudentCurrentlyInSession(studentMasterForm.getStudentAcademicDetailsForm().getStudentCurrentlyInSession());
			 studentMasterForm.getStudentPersonalDetailsForm().setStudentHouse(studentMasterForm.getStudentAcademicDetailsForm().getStudentHouse());
			 studentMasterForm.getStudentPersonalDetailsForm().setStudentSection(studentMasterForm.getStudentAcademicDetailsForm().getStudentSection());
			 studentMasterForm.getStudentPersonalDetailsForm().setStudentClass(studentMasterForm.getStudentAcademicDetailsForm().getStudentClass());
			 BeanUtils.copyProperties(studentMasterForm.getStudentPersonalDetailsForm() , studentPersonalDetailsEntity);
			 
			 StudentSibblingInfoEntity studentSibblingInfoEntity = new StudentSibblingInfoEntity();
			 studentMasterForm.getStudentSibblingInfoForm().setStudentId(studentMasterEntity.getStudentId());
			 BeanUtils.copyProperties(studentMasterForm.getStudentSibblingInfoForm() , studentSibblingInfoEntity);
			 
			 StudentOtherInfoEntity studentOtherInfoEntity = new StudentOtherInfoEntity();
			 studentMasterForm.getStudentOtherInfoForm().setStudentId(studentMasterEntity.getStudentId());
			 BeanUtils.copyProperties(studentMasterForm.getStudentOtherInfoForm() , studentOtherInfoEntity);
			 
			 StudentOtherFacilityEntity studentOtherFacilityEntity = new StudentOtherFacilityEntity();
			 studentMasterForm.getStudentOtherFacilityForm().setStudentId(studentMasterEntity.getStudentId());
			 BeanUtils.copyProperties(studentMasterForm.getStudentOtherFacilityForm() , studentOtherFacilityEntity);
			 
			 StudentLastAcademicDetailsEntity studentLastAcademicDetailsEntity = new StudentLastAcademicDetailsEntity();
			 studentMasterForm.getStudentLastAcademicDetailsForm().setStudentId(studentMasterEntity.getStudentId());
			 BeanUtils.copyProperties(studentMasterForm.getStudentLastAcademicDetailsForm() , studentLastAcademicDetailsEntity);
			 
			 StudentEnclosedDocumentsEntity studentEnclosedDocumentsEntity = new StudentEnclosedDocumentsEntity();
			 studentMasterForm.getStudentEnclosedDocumentsForm().setStudentId(studentMasterEntity.getStudentId());
			 BeanUtils.copyProperties(studentMasterForm.getStudentEnclosedDocumentsForm() , studentEnclosedDocumentsEntity);
			 
			 StudentExtraDetailsEntity studentExtraDetailsEntity = new StudentExtraDetailsEntity();
			 studentMasterForm.getStudentExtraDetailsForm().setStudentId(studentMasterEntity.getStudentId());
			 BeanUtils.copyProperties(studentMasterForm.getStudentExtraDetailsForm() , studentExtraDetailsEntity);
			 
			 StudentInfectiousDetailsEntity studentInfectiousDetailsEntity = new StudentInfectiousDetailsEntity();
			 studentMasterForm.getStudentInfectiousDetailsForm().setStudentId(studentMasterEntity.getStudentId());
			 BeanUtils.copyProperties(studentMasterForm.getStudentInfectiousDetailsForm() , studentInfectiousDetailsEntity);
			 
			 StudentNonInfectiousDetailsEntity studentNonInfectiousDetailsEntity = new StudentNonInfectiousDetailsEntity();
			 studentMasterForm.getStudentNonInfectiousDetailsForm().setStudentId(studentMasterEntity.getStudentId());
			 BeanUtils.copyProperties(studentMasterForm.getStudentNonInfectiousDetailsForm() , studentNonInfectiousDetailsEntity);
			 
			 StudentHealthDetailsEntity studentHealthDetailsEntity = new StudentHealthDetailsEntity();
			 studentMasterForm.getStudentHealthDetailsForm().setStudentId(studentMasterEntity.getStudentId());
			 BeanUtils.copyProperties(studentMasterForm.getStudentHealthDetailsForm() , studentHealthDetailsEntity);
			 
			 	studentDao.createStudentAcademicDetails(StudentAcademicDetailsEntity);
				studentDao.createStudentAddress(studentAddressEntity);
				studentDao.createStudentFathersInfo(studentFathersInfoEntity);
				studentDao.createStudentLocalGuardianInfo(studentLocalGuardianInfoEntity);
				studentDao.createStudentMothersInfo(studentMothersInfoEntity);
				studentDao.createStudentParentalCommonInfo(studentParentalCommonInfoEntity);
				studentDao.createStudentPersonalDetails(studentPersonalDetailsEntity);
				studentDao.createStudentSibblingInfo(studentSibblingInfoEntity);
				studentDao.createStudentOtherInfo(studentOtherInfoEntity);
				studentDao.createStudentOtherFacility(studentOtherFacilityEntity);
				studentDao.createStudentLastAcademicDetails(studentLastAcademicDetailsEntity);
				studentDao.createStudentEnclosedDocuments(studentEnclosedDocumentsEntity);
				studentDao.createStudentExtraDetails(studentExtraDetailsEntity);
				studentDao.createStudentInfectiousDetails(studentInfectiousDetailsEntity);
				studentDao.createStudentNonInfectiousDetails(studentNonInfectiousDetailsEntity);
				studentDao.createStudentHealthDetails(studentHealthDetailsEntity);
				
				studentMasterForm.setStudentId(studentMasterEntity.getStudentId());
				studentMasterForm.getStudentAcademicDetailsForm().setId(StudentAcademicDetailsEntity.getId());
				 studentMasterForm.getStudentAddressForm().setId(studentAddressEntity.getId());
				 studentMasterForm.getStudentFathersInfoForm().setId(studentFathersInfoEntity.getId());
				 studentMasterForm.getStudentLocalGuardianInfoForm().setId(studentLocalGuardianInfoEntity.getId());
				 studentMasterForm.getStudentMothersInfoForm().setId(studentMothersInfoEntity.getId());
				 studentMasterForm.getStudentParentalCommonInfoForm().setId(studentParentalCommonInfoEntity.getId());
				 studentMasterForm.getStudentPersonalDetailsForm().setId(studentPersonalDetailsEntity.getId());
				 studentMasterForm.getStudentSibblingInfoForm().setId(studentSibblingInfoEntity.getId());
				 studentMasterForm.getStudentOtherInfoForm().setId(studentOtherInfoEntity.getId());
				 studentMasterForm.getStudentOtherFacilityForm().setId(studentOtherFacilityEntity.getId());
				 studentMasterForm.getStudentLastAcademicDetailsForm().setId(studentLastAcademicDetailsEntity.getId());
				 studentMasterForm.getStudentEnclosedDocumentsForm().setId(studentEnclosedDocumentsEntity.getId());
				 studentMasterForm.getStudentExtraDetailsForm().setId(studentExtraDetailsEntity.getId());
				 studentMasterForm.getStudentInfectiousDetailsForm().setId(studentInfectiousDetailsEntity.getId());
				 studentMasterForm.getStudentNonInfectiousDetailsForm().setId(studentNonInfectiousDetailsEntity.getId());
				 studentMasterForm.getStudentHealthDetailsForm().setId(studentHealthDetailsEntity.getId());
				 
				 String sRootPath = ".";
				 saveStudentEnclosedDetails(sRootPath , studentMasterForm,request);

		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Transactional
	public StudentMasterForm loadAll(long studentId) {
		StudentMasterForm studentMasterForm = new StudentMasterForm();
		try{
			StudentMasterEntity studentMasterEntity = studentDao.loadStudentMasterEntity(studentId);
			ArrayList<StudentAcademicDetailsEntity> studentAcademicDetailsEntityList = studentDao.loadStudentAcademicDetailsEntity(studentId);
			ArrayList<StudentAddressEntity> studentAddressEntityList = studentDao.loadStudentAddressEntity(studentId);
			ArrayList<StudentFathersInfoEntity> studentFathersInfoEntityList = studentDao.loadStudentFathersInfoEntity(studentId);
			ArrayList<StudentLocalGuardianInfoEntity> studentLocalGuardianInfoEntityList = studentDao.loadStudentLocalGuardianInfoEntity(studentId);
			ArrayList<StudentMothersInfoEntity> studentMothersInfoEntityList = studentDao.loadStudentMothersInfoEntity(studentId);
			ArrayList<StudentParentalCommonInfoEntity> studentParentalCommonInfoEntityList = studentDao.loadStudentParentalCommonInfoEntity(studentId);
			ArrayList<StudentPersonalDetailsEntity> studentPersonalDetailsEntityList = studentDao.loadStudentPersonalDetailsEntity(studentId);
			ArrayList<StudentSibblingInfoEntity> studentSibblingInfoEntityList = studentDao.loadStudentSibblingInfoEntity(studentId);
			ArrayList<StudentOtherInfoEntity> studentOtherInfoEntityList = studentDao.loadStudentOtherInfoEntity(studentId);
			ArrayList<StudentOtherFacilityEntity> studentOtherFacilityEntityList = studentDao.loadStudentOtherFacilityEntity(studentId);
			ArrayList<StudentLastAcademicDetailsEntity> studentLastAcademicDetailsEntityList = studentDao.loadStudentLastAcademicDetailsEntity(studentId);
			ArrayList<StudentEnclosedDocumentsEntity> studentEnclosedDocumentsEntityList = studentDao.loadStudentEnclosedDocumentsEntity(studentId);
			ArrayList<StudentExtraDetailsEntity> studentExtraDetailsEntityList = studentDao.loadStudentExtraDetailsEntity(studentId);
			ArrayList<StudentInfectiousDetailsEntity> studentInfectiousDetailsEntityList = studentDao.loadStudentInfectiousDetailsEntity(studentId);
			ArrayList<StudentNonInfectiousDetailsEntity> studentNonInfectiousDetailsEntityList = studentDao.loadStudentNonInfectiousDetailsEntity(studentId);
			ArrayList<StudentHealthDetailsEntity> studentHealthDetailsEntityList = studentDao.loadStudentHealthDetailsEntity(studentId);
			
			/*Collections.sort(studentAcademicDetailsEntityList, new GenericComparator("id", false));
			Collections.sort(studentAddressEntityList, new GenericComparator("id", false));
			Collections.sort(studentFathersInfoEntityList, new GenericComparator("id", false));
			Collections.sort(studentLocalGuardianInfoEntityList, new GenericComparator("id", false));
			Collections.sort(studentMothersInfoEntityList, new GenericComparator("id", false));
			Collections.sort(studentParentalCommonInfoEntityList, new GenericComparator("id", false));
			Collections.sort(studentPersonalDetailsEntityList, new GenericComparator("id", false));
			Collections.sort(studentSibblingInfoEntityList, new GenericComparator("id", false));
			Collections.sort(studentOtherInfoEntityList, new GenericComparator("id", false));
			Collections.sort(studentOtherFacilityEntityList, new GenericComparator("id", false));
			Collections.sort(studentLastAcademicDetailsEntityList, new GenericComparator("id", false));
			Collections.sort(studentEnclosedDocumentsEntityList, new GenericComparator("id", false));
			Collections.sort(studentExtraDetailsEntityList, new GenericComparator("id", false));
			Collections.sort(studentInfectiousDetailsEntityList, new GenericComparator("id", false));
			Collections.sort(studentNonInfectiousDetailsEntityList, new GenericComparator("id", false));
			Collections.sort(studentHealthDetailsEntityList, new GenericComparator("id", false));*/
			
			StudentAcademicDetailsEntity studentAcademicDetailsEntity = studentAcademicDetailsEntityList.get(0);
			StudentAddressEntity studentAddressEntity  = studentAddressEntityList.get(0);
			StudentFathersInfoEntity studentFathersInfoEntity  = studentFathersInfoEntityList.get(0);
			StudentLocalGuardianInfoEntity studentLocalGuardianInfoEntity  = studentLocalGuardianInfoEntityList.get(0);
			StudentMothersInfoEntity studentMothersInfoEntity  = studentMothersInfoEntityList.get(0);
			StudentParentalCommonInfoEntity studentParentalCommonInfoEntity  = studentParentalCommonInfoEntityList.get(0);
			StudentPersonalDetailsEntity studentPersonalDetailsEntity  = studentPersonalDetailsEntityList.get(0);
			StudentSibblingInfoEntity studentSibblingInfoEntity  = studentSibblingInfoEntityList.get(0);
			StudentOtherInfoEntity studentOtherInfoEntity  = studentOtherInfoEntityList.get(0);
			StudentOtherFacilityEntity studentOtherFacilityEntity  = studentOtherFacilityEntityList.get(0);
			StudentLastAcademicDetailsEntity studentLastAcademicDetailsEntity  = studentLastAcademicDetailsEntityList.get(0);
			StudentEnclosedDocumentsEntity studentEnclosedDocumentsEntity  = studentEnclosedDocumentsEntityList.get(0);
			StudentExtraDetailsEntity studentExtraDetailsEntity  = studentExtraDetailsEntityList.get(0);
			StudentInfectiousDetailsEntity studentInfectiousDetailsEntity = studentInfectiousDetailsEntityList.get(0);
			StudentNonInfectiousDetailsEntity studentNonInfectiousDetailsEntity  = studentNonInfectiousDetailsEntityList.get(0);
			StudentHealthDetailsEntity studentHealthDetailsEntity = studentHealthDetailsEntityList.get(0);
			
			BeanUtils.copyProperties(studentAcademicDetailsEntity , studentMasterForm.getStudentAcademicDetailsForm());
			BeanUtils.copyProperties(studentAddressEntity , studentMasterForm.getStudentAddressForm());
			BeanUtils.copyProperties(studentFathersInfoEntity , studentMasterForm.getStudentFathersInfoForm());
			BeanUtils.copyProperties(studentLocalGuardianInfoEntity , studentMasterForm.getStudentLocalGuardianInfoForm());
			BeanUtils.copyProperties(studentMothersInfoEntity , studentMasterForm.getStudentMothersInfoForm());
			BeanUtils.copyProperties(studentParentalCommonInfoEntity , studentMasterForm.getStudentParentalCommonInfoForm());
			BeanUtils.copyProperties(studentPersonalDetailsEntity , studentMasterForm.getStudentPersonalDetailsForm());
			BeanUtils.copyProperties(studentSibblingInfoEntity , studentMasterForm.getStudentSibblingInfoForm());
			BeanUtils.copyProperties(studentOtherInfoEntity , studentMasterForm.getStudentOtherInfoForm());
			BeanUtils.copyProperties(studentOtherFacilityEntity , studentMasterForm.getStudentOtherFacilityForm());
			BeanUtils.copyProperties(studentLastAcademicDetailsEntity , studentMasterForm.getStudentLastAcademicDetailsForm());
			BeanUtils.copyProperties(studentEnclosedDocumentsEntity , studentMasterForm.getStudentEnclosedDocumentsForm());
			BeanUtils.copyProperties(studentExtraDetailsEntity , studentMasterForm.getStudentExtraDetailsForm());
			BeanUtils.copyProperties(studentInfectiousDetailsEntity , studentMasterForm.getStudentInfectiousDetailsForm());
			BeanUtils.copyProperties(studentNonInfectiousDetailsEntity , studentMasterForm.getStudentNonInfectiousDetailsForm());
			BeanUtils.copyProperties(studentHealthDetailsEntity , studentMasterForm.getStudentHealthDetailsForm());
			
			studentMasterForm.setObsolete(studentMasterEntity.getObsolete());
			//studentMasterForm.setOrganizationId(studentMasterEntity.getObsolete());
			studentMasterForm.setSchoolId(studentMasterEntity.getSchoolId());
			studentMasterForm.setStatus(studentMasterEntity.getStatus());
			studentMasterForm.setStudentCreatedBy(studentMasterEntity.getStudentCreatedBy());
			studentMasterForm.setStudentId(studentMasterEntity.getStudentId());
			studentMasterForm.setStudentCreationDate(studentMasterEntity.getStudentCreationDate());
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return studentMasterForm;
	}

	@Transactional
	public void updateStudent(StudentMasterForm studentMasterForm,HttpServletRequest request) {
		try{
			StudentMasterEntity studentMasterEntity = new StudentMasterEntity();
			BeanUtils.copyProperties(studentMasterForm , studentMasterEntity);
			studentDao.updateStudent(studentMasterEntity);
			studentMasterForm.getStudentPersonalDetailsForm().setStudentCurrentlyInSession(studentMasterForm.getStudentAcademicDetailsForm().getStudentCurrentlyInSession());
			 studentMasterForm.getStudentPersonalDetailsForm().setStudentHouse(studentMasterForm.getStudentAcademicDetailsForm().getStudentHouse());
			 studentMasterForm.getStudentPersonalDetailsForm().setStudentSection(studentMasterForm.getStudentAcademicDetailsForm().getStudentSection());
			 studentMasterForm.getStudentPersonalDetailsForm().setStudentClass(studentMasterForm.getStudentAcademicDetailsForm().getStudentClass());
			 
			StudentAcademicDetailsEntity StudentAcademicDetailsEntity = new StudentAcademicDetailsEntity();
			BeanUtils.copyProperties(studentMasterForm.getStudentAcademicDetailsForm() , StudentAcademicDetailsEntity);
			
			 StudentAddressEntity studentAddressEntity = new StudentAddressEntity();
			 BeanUtils.copyProperties(studentMasterForm.getStudentAddressForm() , studentAddressEntity);
			 
			 StudentFathersInfoEntity studentFathersInfoEntity = new StudentFathersInfoEntity();
			 BeanUtils.copyProperties(studentMasterForm.getStudentFathersInfoForm() , studentFathersInfoEntity);
			 
			 StudentLocalGuardianInfoEntity studentLocalGuardianInfoEntity = new StudentLocalGuardianInfoEntity();
			 BeanUtils.copyProperties(studentMasterForm.getStudentLocalGuardianInfoForm() , studentLocalGuardianInfoEntity);
			 
			 StudentMothersInfoEntity studentMothersInfoEntity = new StudentMothersInfoEntity();
			 BeanUtils.copyProperties(studentMasterForm.getStudentMothersInfoForm() , studentMothersInfoEntity);
			 
			 StudentParentalCommonInfoEntity studentParentalCommonInfoEntity = new StudentParentalCommonInfoEntity();
			 BeanUtils.copyProperties(studentMasterForm.getStudentParentalCommonInfoForm() , studentParentalCommonInfoEntity);
			 
			 StudentPersonalDetailsEntity studentPersonalDetailsEntity = new StudentPersonalDetailsEntity();
			 BeanUtils.copyProperties(studentMasterForm.getStudentPersonalDetailsForm() , studentPersonalDetailsEntity);
			 
			 StudentSibblingInfoEntity studentSibblingInfoEntity = new StudentSibblingInfoEntity();
			 BeanUtils.copyProperties(studentMasterForm.getStudentSibblingInfoForm() , studentSibblingInfoEntity);
			 
			 StudentOtherInfoEntity studentOtherInfoEntity = new StudentOtherInfoEntity();
			 BeanUtils.copyProperties(studentMasterForm.getStudentOtherInfoForm() , studentOtherInfoEntity);
			 
			 StudentOtherFacilityEntity studentOtherFacilityEntity = new StudentOtherFacilityEntity();
			 BeanUtils.copyProperties(studentMasterForm.getStudentOtherFacilityForm() , studentOtherFacilityEntity);
			 
			 StudentLastAcademicDetailsEntity studentLastAcademicDetailsEntity = new StudentLastAcademicDetailsEntity();
			 BeanUtils.copyProperties(studentMasterForm.getStudentLastAcademicDetailsForm() , studentLastAcademicDetailsEntity);
			 
			 StudentEnclosedDocumentsEntity studentEnclosedDocumentsEntity = new StudentEnclosedDocumentsEntity();
			 BeanUtils.copyProperties(studentMasterForm.getStudentEnclosedDocumentsForm() , studentEnclosedDocumentsEntity);
			 
			 StudentExtraDetailsEntity studentExtraDetailsEntity = new StudentExtraDetailsEntity();
			 BeanUtils.copyProperties(studentMasterForm.getStudentExtraDetailsForm() , studentExtraDetailsEntity);
			 
			 StudentInfectiousDetailsEntity studentInfectiousDetailsEntity = new StudentInfectiousDetailsEntity();
			 BeanUtils.copyProperties(studentMasterForm.getStudentInfectiousDetailsForm() , studentInfectiousDetailsEntity);
			 
			 StudentNonInfectiousDetailsEntity studentNonInfectiousDetailsEntity = new StudentNonInfectiousDetailsEntity();
			 BeanUtils.copyProperties(studentMasterForm.getStudentNonInfectiousDetailsForm() , studentNonInfectiousDetailsEntity);
			 
			 StudentHealthDetailsEntity studentHealthDetailsEntity = new StudentHealthDetailsEntity();
			 BeanUtils.copyProperties(studentMasterForm.getStudentHealthDetailsForm() , studentHealthDetailsEntity);
			 
			 	studentDao.updateStudentAcademicDetails(StudentAcademicDetailsEntity);
				studentDao.updateStudentAddress(studentAddressEntity);
				studentDao.updateStudentFathersInfo(studentFathersInfoEntity);
				studentDao.updateStudentLocalGuardianInfo(studentLocalGuardianInfoEntity);
				studentDao.updateStudentMothersInfo(studentMothersInfoEntity);
				studentDao.updateStudentParentalCommonInfo(studentParentalCommonInfoEntity);
				studentDao.updateStudentPersonalDetails(studentPersonalDetailsEntity);
				studentDao.updateStudentSibblingInfo(studentSibblingInfoEntity);
				studentDao.updateStudentOtherInfo(studentOtherInfoEntity);
				studentDao.updateStudentOtherFacility(studentOtherFacilityEntity);
				studentDao.updateStudentLastAcademicDetails(studentLastAcademicDetailsEntity);
				studentDao.updateStudentEnclosedDocuments(studentEnclosedDocumentsEntity);
				studentDao.updateStudentExtraDetails(studentExtraDetailsEntity);
				studentDao.updateStudentInfectiousDetails(studentInfectiousDetailsEntity);
				studentDao.updateStudentNonInfectiousDetails(studentNonInfectiousDetailsEntity);
				studentDao.updateStudentHealthDetails(studentHealthDetailsEntity);
				
				String sRootPath = "./";
				 saveStudentEnclosedDetails(sRootPath , studentMasterForm,request);

		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void saveStudentEnclosedDetails(String sRootPath ,StudentMasterForm studentMasterForm,HttpServletRequest request){
		StudentEnclosedDocumentsForm studentEnclosedDocumentsForm = studentMasterForm.getStudentEnclosedDocumentsForm();
		long studentEnclosedDocDetailId = studentEnclosedDocumentsForm.getId();
		long studentId = studentMasterForm.getStudentId();
		String dirPath = sRootPath + "usr/Documents/Student/Manage/EnclosedDoc/"+studentId+"/";
		File files = new File(dirPath);
		if(!files.exists()){
			files.mkdirs();
		}
		
		if(studentEnclosedDocumentsForm.isBirthCertificatePathBool()){
			String fileName = studentEnclosedDocumentsForm.getBirthCertificatePathFile().getOriginalFilename();
			String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			StringBuffer destinationFile = new StringBuffer();
			destinationFile.append(dirPath + File.separator);
			destinationFile.append("Student" + "_" + studentId + "_" + studentEnclosedDocDetailId + "_BCP" + ext);
	        File destFile = new File(destinationFile.toString());
	        try {
	            studentEnclosedDocumentsForm.getBirthCertificatePathFile().transferTo(destFile);
	         }
	         catch (IOException e) {
	            throw new UnhandledException(e);
	         }
	         
		}
		if(studentEnclosedDocumentsForm.isTransferCertiPathBool()){
			String fileName = studentEnclosedDocumentsForm.getTransferCertiPathFile().toString();
			String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			StringBuffer destinationFile = new StringBuffer();
			destinationFile.append(dirPath + File.separator);
			destinationFile.append("Student" + "_" + studentId + "_" + studentEnclosedDocDetailId + "_TCP" + ext);
	        File destFile = new File(destinationFile.toString());
	        try {
	            studentEnclosedDocumentsForm.getTransferCertiPathFile().transferTo(destFile);
	         }
	         catch (IOException e) {
	            throw new UnhandledException(e);
	         }
		}
		if(studentEnclosedDocumentsForm.isCasteCertiPathBool()){
			String fileName = studentEnclosedDocumentsForm.getCasteCertiPathFile().toString();
			String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			StringBuffer destinationFile = new StringBuffer();
			destinationFile.append(dirPath + File.separator);
			destinationFile.append("Student" + "_" + studentId + "_" + studentEnclosedDocDetailId + "_CCP" + ext);
	        File destFile = new File(destinationFile.toString());
	        try {
	            studentEnclosedDocumentsForm.getCasteCertiPathFile().transferTo(destFile);
	         }
	         catch (IOException e) {
	            throw new UnhandledException(e);
	         }
		}
		if(studentEnclosedDocumentsForm.isCharacterCertiPathBool()){
			String fileName = studentEnclosedDocumentsForm.getCharacterCertiPathFile().toString();
			String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			StringBuffer destinationFile = new StringBuffer();
			destinationFile.append(dirPath + File.separator);
			destinationFile.append("Student" + "_" + studentId + "_" + studentEnclosedDocDetailId + "_CHCP" + ext);
	        File destFile = new File(destinationFile.toString());
	        try {
	            studentEnclosedDocumentsForm.getCharacterCertiPathFile().transferTo(destFile);
	         }
	         catch (IOException e) {
	            throw new UnhandledException(e);
	         }
		}
		if(studentEnclosedDocumentsForm.isMarksheetPathBool()){
			String fileName = studentEnclosedDocumentsForm.getMarksheetPathFile().toString();
			String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			StringBuffer destinationFile = new StringBuffer();
			destinationFile.append(dirPath + File.separator);
			destinationFile.append("Student" + "_" + studentId + "_" + studentEnclosedDocDetailId + "_MSP" + ext);
	        File destFile = new File(destinationFile.toString());
	        try {
	            studentEnclosedDocumentsForm.getMarksheetPathFile().transferTo(destFile);
	         }
	         catch (IOException e) {
	            throw new UnhandledException(e);
	         }
		}
		if(studentEnclosedDocumentsForm.isMedicalCertiPathBool()){
			String fileName = studentEnclosedDocumentsForm.getMedicalCertiPathFile().toString();
			String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			StringBuffer destinationFile = new StringBuffer();
			destinationFile.append(dirPath + File.separator);
			destinationFile.append("Student" + "_" + studentId + "_" + studentEnclosedDocDetailId + "_MCP" + ext);
	        File destFile = new File(destinationFile.toString());
	        try {
	            studentEnclosedDocumentsForm.getMedicalCertiPathFile().transferTo(destFile);
	         }
	         catch (IOException e) {
	            throw new UnhandledException(e);
	         }
		}
		if(studentEnclosedDocumentsForm.isITRPathBool()){
			String fileName = studentEnclosedDocumentsForm.getITRPathFile().toString();
			String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			StringBuffer destinationFile = new StringBuffer();
			destinationFile.append(dirPath + File.separator);
			destinationFile.append("Student" + "_" + studentId + "_" + studentEnclosedDocDetailId + "_ITRP" + ext);
	        File destFile = new File(destinationFile.toString());
	        try {
	            studentEnclosedDocumentsForm.getITRPathFile().transferTo(destFile);
	         }
	         catch (IOException e) {
	            throw new UnhandledException(e);
	         }
		}
		if(studentEnclosedDocumentsForm.isAddressProofPathBool()){
			String fileName = studentEnclosedDocumentsForm.getAddressProofPathFile().toString();
			String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			StringBuffer destinationFile = new StringBuffer();
			destinationFile.append(dirPath + File.separator);
			destinationFile.append("Student" + "_" + studentId + "_" + studentEnclosedDocDetailId + "_APP" + ext);
	        File destFile = new File(destinationFile.toString());
	        try {
	            studentEnclosedDocumentsForm.getAddressProofPathFile().transferTo(destFile);
	         }
	         catch (IOException e) {
	            throw new UnhandledException(e);
	         }
		}
		if(studentEnclosedDocumentsForm.isProgressReportPathBool()){
			String fileName = studentEnclosedDocumentsForm.getProgressReportPathFile().toString();
			String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			StringBuffer destinationFile = new StringBuffer();
			destinationFile.append(dirPath + File.separator);
			destinationFile.append("Student" + "_" + studentId + "_" + studentEnclosedDocDetailId + "_PRP" + ext);
	        File destFile = new File(destinationFile.toString());
	        try {
	            studentEnclosedDocumentsForm.getProgressReportPathFile().transferTo(destFile);
	         }
	         catch (IOException e) {
	            throw new UnhandledException(e);
	         }
		}
		if(studentEnclosedDocumentsForm.isFatherPhotoPathBool()){
			String fileName = studentEnclosedDocumentsForm.getFatherPhotoPathFile().toString();
			String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			StringBuffer destinationFile = new StringBuffer();
			destinationFile.append(dirPath + File.separator);
			destinationFile.append("Student" + "_" + studentId + "_" + studentEnclosedDocDetailId + "_FPP" + ext);
	        File destFile = new File(destinationFile.toString());
	        try {
	            studentEnclosedDocumentsForm.getFatherPhotoPathFile().transferTo(destFile);
	         }
	         catch (IOException e) {
	            throw new UnhandledException(e);
	         }
		}
		if(studentEnclosedDocumentsForm.isMotherPhotoPathBool()){
			String fileName = studentEnclosedDocumentsForm.getMotherPhotoPathFile().toString();
			String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			StringBuffer destinationFile = new StringBuffer();
			destinationFile.append(dirPath + File.separator);
			destinationFile.append("Student" + "_" + studentId + "_" + studentEnclosedDocDetailId + "_MPP" + ext);
	        File destFile = new File(destinationFile.toString());
	        try {
	            studentEnclosedDocumentsForm.getMotherPhotoPathFile().transferTo(destFile);
	         }
	         catch (IOException e) {
	            throw new UnhandledException(e);
	         }
		}
		if(studentEnclosedDocumentsForm.isGuardianPhotoPathBool()){
			String fileName = studentEnclosedDocumentsForm.getGuardianPhotoPathFile().toString();
			String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			StringBuffer destinationFile = new StringBuffer();
			destinationFile.append(dirPath + File.separator);
			destinationFile.append("Student" + "_" + studentId + "_" + studentEnclosedDocDetailId + "_GPP" + ext);
	        File destFile = new File(destinationFile.toString());
	        try {
	            studentEnclosedDocumentsForm.getGuardianPhotoPathFile().transferTo(destFile);
	         }
	         catch (IOException e) {
	            throw new UnhandledException(e);
	         }
		}
		if(studentEnclosedDocumentsForm.isNRIVisaDetailPathBool()){
			String fileName = studentEnclosedDocumentsForm.getNRIVisaDetailPathFile().toString();
			String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			StringBuffer destinationFile = new StringBuffer();
			destinationFile.append(dirPath + File.separator);
			destinationFile.append("Student" + "_" + studentId + "_" + studentEnclosedDocDetailId + "_NVDP" + ext);
	        File destFile = new File(destinationFile.toString());
	        try {
	            studentEnclosedDocumentsForm.getNRIVisaDetailPathFile().transferTo(destFile);
	         }
	         catch (IOException e) {
	            throw new UnhandledException(e);
	         }
		}
		if(studentEnclosedDocumentsForm.isMigrationCertiPathBool()){
			String fileName = studentEnclosedDocumentsForm.getMigrationCertiPathFile().toString();
			String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			StringBuffer destinationFile = new StringBuffer();
			destinationFile.append(dirPath + File.separator);
			destinationFile.append("Student" + "_" + studentId + "_" + studentEnclosedDocDetailId + "_MICP" + ext);
	        File destFile = new File(destinationFile.toString());
	        try {
	            studentEnclosedDocumentsForm.getMigrationCertiPathFile().transferTo(destFile);
	         }
	         catch (IOException e) {
	            throw new UnhandledException(e);
	         }
		}
		if(studentEnclosedDocumentsForm.isLocalGuardianUndertakingCertiPathBool()){
			String fileName = studentEnclosedDocumentsForm.getLocalGuardianUndertakingCertiPathFile().toString();
			String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			StringBuffer destinationFile = new StringBuffer();
			destinationFile.append(dirPath + File.separator);
			destinationFile.append("Student" + "_" + studentId + "_" + studentEnclosedDocDetailId + "_LGUCP" + ext);
	        File destFile = new File(destinationFile.toString());
	        try {
	            studentEnclosedDocumentsForm.getLocalGuardianUndertakingCertiPathFile().transferTo(destFile);
	         }
	         catch (IOException e) {
	            throw new UnhandledException(e);
	         }
		}
		if(studentEnclosedDocumentsForm.isParentUndertakingPathBool()){
			String fileName = studentEnclosedDocumentsForm.getParentUndertakingPathFile().toString();
			String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			StringBuffer destinationFile = new StringBuffer();
			destinationFile.append(dirPath + File.separator);
			destinationFile.append("Student" + "_" + studentId + "_" + studentEnclosedDocDetailId + "_PUP" + ext);
	        File destFile = new File(destinationFile.toString());
	        try {
	            studentEnclosedDocumentsForm.getParentUndertakingPathFile().transferTo(destFile);
	         }
	         catch (IOException e) {
	            throw new UnhandledException(e);
	         }
		}
		if(studentEnclosedDocumentsForm.isBondOfIndemnityPathBool()){
			String fileName = studentEnclosedDocumentsForm.getBondOfIndemnityPathFile().toString();
			String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			StringBuffer destinationFile = new StringBuffer();
			destinationFile.append(dirPath + File.separator);
			destinationFile.append("Student" + "_" + studentId + "_" + studentEnclosedDocDetailId + "_BOIP" + ext);
	        File destFile = new File(destinationFile.toString());
	        try {
	            studentEnclosedDocumentsForm.getBondOfIndemnityPathFile().transferTo(destFile);
	         }
	         catch (IOException e) {
	            throw new UnhandledException(e);
	         }
		}
		
		
	}
	
	@Transactional
	public List listByForeignId(StudentListForm studentListForm) {
		List list = studentDao.getListByCriteria(studentListForm);
		return list;
	}
	
	
	public StudentDao getStudentDao() {
		return studentDao;
	}


	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}


}
