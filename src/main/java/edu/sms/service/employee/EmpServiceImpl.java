package edu.sms.service.employee;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Hibernate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import edu.sms.dao.appModules.employee.EmployeeDAO;
import edu.sms.entity.employee.EmpCommunicationEntity;
import edu.sms.entity.employee.EmpDesignationEntity;
import edu.sms.entity.employee.EmpEducationalEntity;
import edu.sms.entity.employee.EmpOfficialEntity;
import edu.sms.entity.employee.EmpPastExperianceEnity;
import edu.sms.entity.employee.EmpPastProjectEntity;
import edu.sms.entity.employee.EmpPayRollEntity;
import edu.sms.entity.employee.Empedufileupload;
import edu.sms.entity.employee.EmployeeEntity;
import edu.sms.entity.employee.Emppastexpfileupload;
import edu.sms.entity.employee.Emppastprojectfileupload;
import edu.sms.model.EmpDesignationFrm;
import edu.sms.model.EmpEducationalFrm;
import edu.sms.model.EmpOfficialFrm;
import edu.sms.model.EmpPastExperianceFrm;
import edu.sms.model.EmpPastProjectFrm;
import edu.sms.model.EmpPayrollFrm;
import edu.sms.model.Empcommunicationdtl;
import edu.sms.model.EmployeeFrm;
import edu.sms.model.FileUploadForm;

public class EmpServiceImpl implements EmpService {
	private static final Logger logger = LoggerFactory.getLogger(EmpServiceImpl.class);
	 EmployeeDAO employedao;
	
	
	@Transactional
	public List<EmpDesignationFrm> getEmployeeDesigList(Map<String,String> paramVal) {
		List<EmpDesignationEntity> empDesEntityLst=employedao.loadAll(paramVal);
		List<EmpDesignationFrm> empDesFrmLst = new ArrayList<EmpDesignationFrm>();
		for(EmpDesignationEntity EmpDesEntity:empDesEntityLst){
			EmpDesignationFrm empDesigFrm = new EmpDesignationFrm();
			BeanUtils.copyProperties(EmpDesEntity, empDesigFrm);
			empDesFrmLst.add(empDesigFrm);
		}
		return empDesFrmLst;
	}


	public EmpDesignationFrm loadEmployeeDtl(Integer empDesignationId) {
		EmpDesignationEntity empDesEntity=employedao.get(empDesignationId);
		EmpDesignationFrm empDesigFrm = new EmpDesignationFrm();
		BeanUtils.copyProperties(empDesEntity, empDesigFrm);
		return empDesigFrm;
	}


	public void saveorupdate(EmpDesignationFrm empdesignationfrm) {
		EmpDesignationEntity desEntity = new EmpDesignationEntity();
		BeanUtils.copyProperties(empdesignationfrm, desEntity);
		employedao.saveEmployeeDesignation(desEntity);
	}

	@Transactional
	public void deleteDesig(Integer empDesigId) {
		EmpDesignationEntity desEntity = new EmpDesignationEntity();
		desEntity.setEmpDesigId(empDesigId);
		employedao.delete(desEntity);
		
	}

	@Transactional
	public List<EmployeeFrm> loadEmployeeList(Map<String,String> paramVal) {
		List<EmployeeEntity> empEntityLst=employedao.loadEmployeeList(paramVal);
		
		List<EmployeeFrm> emplist= new ArrayList<EmployeeFrm>();
		String[] ignorProperty={"empcommunicationdtl","empeducationaldtl","empofficialdtl","emppastexperiancedtls","emppastprojects","emppayrolldetail"};
		for(EmployeeEntity empEntity:empEntityLst){
			EmployeeFrm employee= new EmployeeFrm();
			BeanUtils.copyProperties(empEntity, employee, ignorProperty);
		    emplist.add(employee);
		}
		return emplist;
	}

	@Transactional
	public EmployeeFrm loadEmployee(Integer employeeId) {
		EmployeeEntity employeeEntity=employedao.loadEmployee(employeeId);
		EmployeeFrm employee= new EmployeeFrm();
		
		String[] ignorProperty={"empcommunicationdtl","empeducationaldtl","empofficialdtl","emppastexperiancedtls","emppastprojects","emppayrolldetail"};
		BeanUtils.copyProperties(employeeEntity, employee, ignorProperty);
		
		//Education details
		List<EmpEducationalFrm> empEduFrmLst= new ArrayList<EmpEducationalFrm>(); 
		
		String[] ignorEmpPro={"employee"};
		for(EmpEducationalEntity empEducationalEntity:employeeEntity.getEmpeducationaldtl()){
			EmpEducationalFrm empEduFrm = new EmpEducationalFrm();
			BeanUtils.copyProperties(empEducationalEntity, empEduFrm,ignorEmpPro);
			List<FileUploadForm> fileUpdLst=new ArrayList<FileUploadForm>(); 
			for(Empedufileupload empedufile:empEducationalEntity.getEmpedufileUpload()){
				FileUploadForm fileUplFrm= new FileUploadForm();
				BeanUtils.copyProperties(empedufile, fileUplFrm);
				fileUpdLst.add(fileUplFrm);
			}
			empEduFrm.setFileUploadLst(fileUpdLst);
			empEduFrmLst.add(empEduFrm);
		}
		//Employee communication details
		Empcommunicationdtl        empcommundtl = new Empcommunicationdtl();
		BeanUtils.copyProperties(employeeEntity.getEmpcommunicationdtl(),empcommundtl);
		
		//Employee past experince dtl
		List<EmpPastExperianceFrm> empPastExpdtl= new ArrayList<EmpPastExperianceFrm>();
		for(EmpPastExperianceEnity empPastExp:employeeEntity.getEmppastexperiancedtls()){
			EmpPastExperianceFrm empPastExperienceFrm = new EmpPastExperianceFrm();
			BeanUtils.copyProperties(empPastExp, empPastExperienceFrm,ignorEmpPro);
			empPastExpdtl.add(empPastExperienceFrm);
		}
		
		List<FileUploadForm> fileUploadlistpe=new ArrayList<FileUploadForm>();
		for(Emppastexpfileupload emppastexpfileupload:employeeEntity.getEmppastexpfileupload()){
			FileUploadForm fileUplFrmpastExp= new FileUploadForm();
			BeanUtils.copyProperties(emppastexpfileupload, fileUplFrmpastExp);
			fileUploadlistpe.add(fileUplFrmpastExp);
		}
		employee.setFileUploadLstPastExp(fileUploadlistpe);
		
		
		//Past Project Details
		List<EmpPastProjectFrm> empPastProjLst= new ArrayList<EmpPastProjectFrm>();
		for(EmpPastProjectEntity empPastProj:employeeEntity.getEmppastprojects()){
			EmpPastProjectFrm empPastProjfrm = new EmpPastProjectFrm();
			BeanUtils.copyProperties(empPastProj,empPastProjfrm,ignorEmpPro);
			empPastProjLst.add(empPastProjfrm);
		}
		
		List<FileUploadForm> fileUploadlistpp=new ArrayList<FileUploadForm>();
		for(Emppastprojectfileupload emppastprojfileupload:employeeEntity.getEmppastprojfileupload()){
			FileUploadForm fileUplFrmpastproj= new FileUploadForm();
			BeanUtils.copyProperties(emppastprojfileupload, fileUplFrmpastproj);
			fileUploadlistpp.add(fileUplFrmpastproj);
		}
		employee.setFileUploadLstPastProj(fileUploadlistpp);
		
		
		
		//Employee Payroll Details
		EmpPayrollFrm empPastProjectFrm = new EmpPayrollFrm();
		BeanUtils.copyProperties(employeeEntity.getEmpPayRollEntity(),empPastProjectFrm);
				
		
		//Employee Offical Details
		EmpOfficialFrm    empOfficialFrm = new EmpOfficialFrm();
		BeanUtils.copyProperties(employeeEntity.getEmpofficialdtl(),empOfficialFrm);
				
		employee.setEmpcommunicationdtl(empcommundtl);
		employee.setEmpeducationaldtl(empEduFrmLst);
		employee.setEmppastexperiancedtls(empPastExpdtl);
		employee.setEmppastprojects(empPastProjLst);
		employee.setEmppayrolldetail(empPastProjectFrm);
		employee.setEmpofficialdtl(empOfficialFrm);
		return employee;
	}

	@Transactional
	public EmployeeEntity saveorupateEmp(EmployeeFrm employee) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		EmpCommunicationEntity empCommunicationEntity = new EmpCommunicationEntity();
		EmpPayRollEntity empPayRollEntity = new EmpPayRollEntity();
		EmpOfficialEntity employofficalEntity = new EmpOfficialEntity();
	
		
		List<EmpEducationalEntity> empEduEntitLst= new ArrayList<EmpEducationalEntity>(); 
		String[] ignorEmpPro={"employee"};
		List<EmpEducationalFrm> empEduLst= employee.getEmpeducationaldtl();
		
		for(EmpEducationalFrm empEdufrm:empEduLst){
			EmpEducationalEntity empEduEntity = new EmpEducationalEntity();
			BeanUtils.copyProperties(empEdufrm,empEduEntity,ignorEmpPro);
			List<Empedufileupload> empedufileUpload=new ArrayList<Empedufileupload> ();
			for(FileUploadForm fileUpload:empEdufrm.getFileUploadLst()){
				Empedufileupload empedufileupload = new Empedufileupload();
				empedufileupload.setEmp_EEduFileUpload_id(fileUpload.getEmp_EEduFileUpload_id());
				empedufileupload.setEmpId(employee.getEmpId());
				empedufileupload.setFileName(fileUpload.getFileName());
				if(null!=fileUpload.getFiles()){
				 empedufileupload.setFilePath(((MultipartFile)fileUpload.getFiles()).getOriginalFilename());
				 empedufileupload.setFiles(fileUpload.getFiles());
				}
				empedufileupload.setEmpEducational(empEduEntity);
				empedufileUpload.add(empedufileupload);
			}
			empEduEntity.setEmpedufileUpload(empedufileUpload);
			empEduEntity.setEmployee(employeeEntity);
			empEduEntitLst.add(empEduEntity);
		}
		
		BeanUtils.copyProperties(employee.getEmpcommunicationdtl(),empCommunicationEntity,ignorEmpPro);
		
		
		List<EmpPastExperianceEnity> empPastExperianceEnityLst= new ArrayList<EmpPastExperianceEnity>(); 
		List<EmpPastExperianceFrm> empPastExperianceLst = employee.getEmppastexperiancedtls();
		for(EmpPastExperianceFrm empPastExp:empPastExperianceLst){
			EmpPastExperianceEnity empEduEntity = new EmpPastExperianceEnity();
			BeanUtils.copyProperties(empPastExp,empEduEntity,ignorEmpPro);
			empEduEntity.setEmployee(employeeEntity);
			empPastExperianceEnityLst.add(empEduEntity);
		}
		
		List<Emppastexpfileupload> empPastExpEnityLst= new ArrayList<Emppastexpfileupload>(); 
		for(FileUploadForm fileuploadPastExp:employee.getFileUploadLstPastExp()){
			Emppastexpfileupload emppastexpfileupload= new Emppastexpfileupload();
			
			emppastexpfileupload.setFileName(fileuploadPastExp.getFileName());
			if(null!=fileuploadPastExp.getFiles()){
			  emppastexpfileupload.setFilePath(((MultipartFile)fileuploadPastExp.getFiles()).getOriginalFilename());
			  emppastexpfileupload.setFiles(fileuploadPastExp.getFiles());
			}
			emppastexpfileupload.setEmployee(employeeEntity);
			empPastExpEnityLst.add(emppastexpfileupload);
		}
		employeeEntity.setEmppastexpfileupload(empPastExpEnityLst);
			
		
		List<EmpPastProjectEntity> empPastProjectEntityLst = new ArrayList<EmpPastProjectEntity>();
		List<EmpPastProjectFrm> empPastProjLst=  employee.getEmppastprojects();
		for(EmpPastProjectFrm  empPastProj:empPastProjLst){
			EmpPastProjectEntity  empPastProjExp= new EmpPastProjectEntity();
			BeanUtils.copyProperties(empPastProj,empPastProjExp,ignorEmpPro);
			empPastProjExp.setEmployee(employeeEntity);
			empPastProjectEntityLst.add(empPastProjExp);
		}
		
		List<Emppastprojectfileupload> empPastProjEnityLst= new ArrayList<Emppastprojectfileupload>();
		for(FileUploadForm fileUploadPastProjFrm:employee.getFileUploadLstPastProj()){
			Emppastprojectfileupload emppastprojfileupload  = new Emppastprojectfileupload();
			emppastprojfileupload.setFileName(fileUploadPastProjFrm.getFileName());
			if(null!=fileUploadPastProjFrm.getFiles()){
			 emppastprojfileupload.setFilePath(((MultipartFile)fileUploadPastProjFrm.getFiles()).getOriginalFilename());
			 emppastprojfileupload.setFiles(fileUploadPastProjFrm.getFiles());
			}
			emppastprojfileupload.setEmployee(employeeEntity);
			empPastProjEnityLst.add(emppastprojfileupload);			
		}
		employeeEntity.setEmppastprojfileupload(empPastProjEnityLst);
		
		BeanUtils.copyProperties(employee.getEmppayrolldetail(),empPayRollEntity,ignorEmpPro);
		
		BeanUtils.copyProperties(employee.getEmpofficialdtl(),employofficalEntity,ignorEmpPro);
		
			
		String[] ignorProperty={"empcommunicationdtl","empeducationaldtl","empPayRollEntity","empofficialdtl","emppastexperiancedtls","emppastprojects"};
		BeanUtils.copyProperties(employee, employeeEntity, ignorProperty);
		/*empCommunicationEntity.setEmpCommId(employee.getEmpId().intValue());
		empPayRollEntity.setEmpPayrollId(employee.getEmpId().intValue());
		employofficalEntity.setEmpOfficialId(employee.getEmpId().intValue());
	*/	
		employeeEntity.setEmpcommunicationdtl(empCommunicationEntity);
		employeeEntity.setEmpPayRollEntity(empPayRollEntity);
		employeeEntity.setEmpofficialdtl(employofficalEntity);
		employeeEntity.setEmppastexperiancedtls(empPastExperianceEnityLst);
		employeeEntity.setEmppastprojects(empPastProjectEntityLst);
		employeeEntity.setEmpeducationaldtl(empEduEntitLst);
		
		empCommunicationEntity.setEmployee(employeeEntity);
		empPayRollEntity.setEmployee(employeeEntity);
		employofficalEntity.setEmployee(employeeEntity);
		if(null!=employee.getMedicalReport()){
		employeeEntity.setMedicalReportName(employee.getMedicalReport().getOriginalFilename());
		}
		if(null!=employee.getEmployeeImge()){
		 employeeEntity.setUploadImageName( employee.getEmployeeImge().getOriginalFilename());
		}
		
		//This is the save function done by hiberate to save or update the employee entity
		EmployeeEntity empEntity =employedao.saveEmployee(employeeEntity);
		
		
		//save past experience images start
		for(Emppastexpfileupload empPastExp:empEntity.getEmppastexpfileupload()){
			MultipartFile filesPastExp = empPastExp.getFiles();
			if(null != filesPastExp) {
				String fileName = empEntity.getEmpId()+"_PastExp_"+empPastExp.getEmp_PEFileUpload_id()+"_"+filesPastExp.getOriginalFilename();
				//Handle file content - multipartFile.getInputStream()
				if (!filesPastExp.isEmpty()) {
					try {
						byte[] bytes = filesPastExp.getBytes();
	
						// Creating the directory to store file
						String rootPath = System.getProperty("catalina.home");
						File dir = new File(rootPath + File.separator + "PastExperianceDoc");
						if (!dir.exists())
							dir.mkdirs();
	
						// Create the file on server
						File serverFile = new File(dir.getAbsolutePath()+ File.separator + fileName);
						BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
						stream.write(bytes);
						stream.close();
						logger.info("Server File Location=" + serverFile.getAbsolutePath());
					} catch (Exception e) {
						logger.info("You failed to upload " + fileName + " => " + e.getMessage());
					}
				} else {
					logger.info("You failed to upload " + fileName	+ " because the file was empty.");
				}
		      }
		}
		//save end project experince
		
		//save past project images start
		for(Emppastprojectfileupload emppastprojupload:empEntity.getEmppastprojfileupload()){
			MultipartFile fileProjUpload = emppastprojupload.getFiles();
			if(null != fileProjUpload) {
				String fileName = empEntity.getEmpId()+"_PastProj_"+emppastprojupload.getEmp_PPFileUpload_id()+"_"+fileProjUpload.getOriginalFilename();
				//Handle file content - multipartFile.getInputStream()
				if (!fileProjUpload.isEmpty()) {
					try {
						byte[] bytes = fileProjUpload.getBytes();
	
						// Creating the directory to store file
						String rootPath = System.getProperty("catalina.home");
						File dir = new File(rootPath + File.separator + "PastProjectDoc");
						if (!dir.exists())
							dir.mkdirs();
	
						// Create the file on server
						File serverFile = new File(dir.getAbsolutePath()+ File.separator + fileName);
						BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
						stream.write(bytes);
						stream.close();
						logger.info("Server File Location=" + serverFile.getAbsolutePath());
					} catch (Exception e) {
						logger.info("You failed to upload " + fileName + " => " + e.getMessage());
					}
				} else {
					logger.info("You failed to upload " + fileName	+ " because the file was empty.");
				}
	    	}
		}
		
		//save End
		for(EmpEducationalEntity empEduEntity:empEntity.getEmpeducationaldtl()){
			for(Empedufileupload empedufile:empEduEntity.getEmpedufileUpload()){
					MultipartFile filesEducDoc = empedufile.getFiles();
					if(null != filesEducDoc) {
						String fileName = empEduEntity.getEmp_edu_id()+"_Education_"+empedufile.getEmp_EEduFileUpload_id()+"_"+filesEducDoc.getOriginalFilename();
						//fileNames.add(fileName);
						//Handle file content - multipartFile.getInputStream()
						if (!filesEducDoc.isEmpty()) {
							try {
								byte[] bytes = filesEducDoc.getBytes();
		
								// Creating the directory to store file
								String rootPath = System.getProperty("catalina.home");
								File dir = new File(rootPath + File.separator + "employeeDoc/EducationDoc");
								if (!dir.exists())
									dir.mkdirs();
		
								// Create the file on server
								File serverFile = new File(dir.getAbsolutePath()+ File.separator + fileName);
								BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
								stream.write(bytes);
								stream.close();
								logger.info("Server File Location=" + serverFile.getAbsolutePath());
							} catch (Exception e) {
								logger.info("You failed to upload " + fileName + " => " + e.getMessage());
							}
						} else {
							logger.info("You failed to upload " + fileName	+ " because the file was empty.");
						}
					
					//}
				}
		     } //inner for loop
		}//Last for loop
		
		//Medical images upload
				MultipartFile filesMedical = employee.getMedicalReport();
				if(null != filesMedical) {
					String fileName = empEntity.getEmpId()+"_Medical_"+filesMedical.getOriginalFilename();
					//fileNames.add(fileName);
					//Handle file content - multipartFile.getInputStream()
					if (!filesMedical.isEmpty()) {
						try {
							byte[] bytes = filesMedical.getBytes();

							// Creating the directory to store file
							String rootPath = System.getProperty("catalina.home");
							File dir = new File(rootPath + File.separator + "employeeDoc/PersonalDoc/MedicalDoc");
							if (!dir.exists())
								dir.mkdirs();

							// Create the file on server
							File serverFile = new File(dir.getAbsolutePath()+ File.separator + fileName);
							BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
							stream.write(bytes);
							stream.close();
							logger.info("Server File Location=" + serverFile.getAbsolutePath());
						} catch (Exception e) {
							logger.info("You failed to upload " + fileName + " => " + e.getMessage());
						}
					} else {
						logger.info("You failed to upload " + fileName	+ " because the file was empty.");
					}
				
				//}
			}
				
				
				
				MultipartFile files = employee.getEmployeeImge();
				if(null != files) {
						String fileName =empEntity.getEmpId()+"_Employee_" + files.getOriginalFilename();
						//fileNames.add(fileName);
						//Handle file content - multipartFile.getInputStream()
						if (!files.isEmpty()) {
							try {
								byte[] bytes = files.getBytes();

								// Creating the directory to store file
								String rootPath = System.getProperty("catalina.home");
								File dir = new File(rootPath + File.separator + "employeeDoc/PersonalDoc/EmployeeImg");
								if (!dir.exists())
									dir.mkdirs();

								// Create the file on server
								File serverFile = new File(dir.getAbsolutePath()+ File.separator + fileName);
								BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
								stream.write(bytes);
								stream.close();
								logger.info("Server File Location=" + serverFile.getAbsolutePath());
							} catch (Exception e) {
								logger.info("You failed to upload " + fileName + " => " + e.getMessage());
							}
						} else {
							logger.info("You failed to upload " + fileName	+ " because the file was empty.");
						}
					
					//}
				}
				
				
				
				return empEntity;
	}


	@Transactional
	public void setEmpPasswordMapping(String userid,String userType,Integer empId) {
		employedao.setEmpPasswordMapping(userid, userType, empId);
		
	}
	
	@Transactional
	public void deleteEmp(Integer employeeId) {
		EmployeeEntity employeeEntity=employedao.loadEmployee(employeeId);
		employedao.deleteEmp(employeeEntity);
		
	}
	 
	
	 @Transactional
	 public String getUserNames() {
			String userName=employedao.getUserNames();
			return userName;
		}
	
	
	
	public void setEmployedao(EmployeeDAO employedao) {
		this.employedao = employedao;
	}

}
