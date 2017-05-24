package edu.sms.server;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import edu.sms.dao.appModules.PerRoleListDAO;
import edu.sms.entity.appModules.RoleEntity;
import edu.sms.entity.appModules.ShiroUserRole;
import edu.sms.entity.appModules.ShiroUserRolePK;
import edu.sms.entity.employee.EmpEducationalEntity;
import edu.sms.entity.employee.EmpPastExperianceEnity;
import edu.sms.entity.employee.EmpPastProjectEntity;
import edu.sms.entity.employee.Empedufileupload;
import edu.sms.entity.employee.EmployeeEntity;
import edu.sms.model.EmpDesignationFrm;
import edu.sms.model.EmpEducationalFrm;
import edu.sms.model.EmpPastExperianceFrm;
import edu.sms.model.EmpPastProjectFrm;
import edu.sms.model.EmployeeFrm;
import edu.sms.model.FileUploadForm;
import edu.sms.model.ModuleListForm;
import edu.sms.model.RoleFrm;
import edu.sms.model.SchoolForm;
import edu.sms.model.SubModLstForm;
import edu.sms.organization.OrgService;
import edu.sms.sample.domain.Identity;
import edu.sms.sample.form.RegistrationForm;
import edu.sms.sample.service.IdentityService;
import edu.sms.service.LookupService;
import edu.sms.service.SchoolService;
import edu.sms.service.employee.EmpService;



@MultipartConfig(maxFileSize = 2097152)
@Controller
@RequestMapping("/employee")
public class EmployeDtlController {
	  
	     @Autowired(required = true)
	     private IdentityService identityService;
	    
	     @Autowired(required = true)
	     private PerRoleListDAO     perRoleListDAO;
	
	     @Autowired(required = true)
	     private SchoolService schoolService;
	     
	     @Autowired(required = true)
	     private LookupService lookupService;
	     
	     private OrgService orgService;
	     private EmpService empService;
	  
	   
	   	//This is to get the list empllyee type
	@RequestMapping(value = "modulesEdit")
		public  ModelAndView loadEditRole(HttpServletRequest request, HttpServletResponse response, ModuleListForm moduleListForm) {
			ModelAndView mav = new ModelAndView("modulesEdit");
			//List<RoleEntity> roleList = orgService.loadEditRole(moduleListForm);
			//mav.addObject("roleList", roleList);
			return mav;
		}
		   
		
		//This is to get the list empllyee type
		@RequestMapping(value = "modulesEditList")
		public @ResponseBody List<RoleFrm> loadEditRoleList(HttpServletRequest request, HttpServletResponse response, RoleFrm roleFrm) {
				Map<String,String> searchList= new HashMap<String,String>();
				
				searchList.put("userName", StringUtils.isEmpty(roleFrm.getPerName())?null:roleFrm.getPerName());
				
				if("-1".equals(roleFrm.getModuleId()) || StringUtils.isEmpty( roleFrm.getModuleId())){
					searchList.put("moduleId", null);
				}else{
					searchList.put("moduleId", roleFrm.getModuleId());
					}
				if("-1".equals(roleFrm.getMenuId()) || StringUtils.isEmpty( roleFrm.getModuleId()) ){
					searchList.put("menuId",null);
				}else{
					searchList.put("menuId",roleFrm.getMenuId() );
				}
				
				List<RoleFrm> roleList = orgService.getUserTypeSearchList(searchList);
				
				return roleList;
		}
		
		
		
		@SuppressWarnings("unchecked")
		@RequestMapping(value = "mainModuleLst")
		public @ResponseBody List<ModuleListForm> moduleLst(HttpServletRequest request, HttpServletResponse response) {
			HttpSession session = request.getSession(false);
			@SuppressWarnings("unchecked")
			List<ModuleListForm> modLst= (List<ModuleListForm>)session.getAttribute("listofElement");
			List<ModuleListForm> modNewLst=new ArrayList<ModuleListForm>();
			
			for(ModuleListForm exModfrm:modLst){
				    ModuleListForm moduleLstFrm = new ModuleListForm();
					moduleLstFrm.setModuleValue(exModfrm.getModuleValue());
					moduleLstFrm.setModuleCaption(exModfrm.getModuleCaption());
				
					
				modNewLst.add(moduleLstFrm);
				
			}
			   ModuleListForm moduleLstFrm = new ModuleListForm();
				moduleLstFrm.setModuleValue("-1");
				moduleLstFrm.setModuleCaption("Please Select");
				modNewLst.add(moduleLstFrm);
			return modNewLst;
		}
				
		
		@RequestMapping(value = "subModuleLst")
		public @ResponseBody List<SubModLstForm> subModLst(HttpServletRequest request, HttpServletResponse response) {
			HttpSession session = request.getSession(false);
			String id=(String)request.getParameter("id");
			@SuppressWarnings("unchecked")
			List<ModuleListForm> modLst = (List<ModuleListForm>)session.getAttribute("listofElement");
			List<SubModLstForm> submodLst = new ArrayList<SubModLstForm>();
			for(ModuleListForm modLstFrm:modLst){
				if(Integer.valueOf(modLstFrm.getModuleValue()).intValue()==Integer.valueOf(id).intValue())
				   {
					submodLst=modLstFrm.getSubfrmList();
				   }
			}
			
			List<SubModLstForm> submodNewLst = new ArrayList<SubModLstForm>();
			for(SubModLstForm submodLstFrm:submodLst){
				submodNewLst.add(submodLstFrm);
			}
			SubModLstForm subModLstForm = new SubModLstForm();
			subModLstForm.setModuleValue("-1");
			subModLstForm.setModuleCaption("Please Select");
			submodNewLst.add(subModLstForm);
		    return submodNewLst;
		}
		
		//End of employee Type
		
		@RequestMapping(value = "empDesigList")
		public ModelAndView getEmpDesigShow(HttpServletRequest request, HttpServletResponse response, EmpDesignationFrm designationFrm) {
				ModelAndView mav = new ModelAndView("empDesigList");
				mav.addObject("designationFrm",designationFrm);
				return mav;
		}
		
		
	   @RequestMapping(value = "empDesigListView")
		public @ResponseBody List<EmpDesignationFrm> getEmpDesigList(HttpServletRequest request, HttpServletResponse response, EmpDesignationFrm designationFrm) {
				Map<String,String> paramList = new HashMap<String,String>();
				paramList.put("userName", StringUtils.isEmpty(designationFrm.getDesig_Name())?null:designationFrm.getDesig_Name());
				
				if("-1".equals(designationFrm.getModuleId()) || StringUtils.isEmpty( designationFrm.getModuleId())){
					paramList.put("moduleId", null);
				}else{
					paramList.put("moduleId", designationFrm.getModuleId());
					}
				if("-1".equals(designationFrm.getMenuId()) || StringUtils.isEmpty( designationFrm.getModuleId()) ){
					paramList.put("menuId",null);
				}else{
					paramList.put("menuId",designationFrm.getMenuId() );
				}
				
				List<EmpDesignationFrm> empDesignationlist=empService.getEmployeeDesigList(paramList);
				for(EmpDesignationFrm tempfrm:empDesignationlist){
					if(tempfrm.getStaff_type().equals(1)){
						tempfrm.setStaff_typeCaption("Teaching");
					}else if (tempfrm.getStaff_type().equals(2)){
						tempfrm.setStaff_typeCaption("Non Teaching");
					}
				}
				
				return empDesignationlist;
		}
	   
	   
	    
		@RequestMapping(value = "empDesigNew")
		public ModelAndView getEmpDesigNew(HttpServletRequest request, HttpServletResponse response,@ModelAttribute EmpDesignationFrm designationFrm) {
			ModelAndView mav = new ModelAndView("empDesigView");
			ModuleListForm  modListForm = new ModuleListForm();
			List<RoleEntity> roleList = orgService.loadEditRole(modListForm);
			mav.addObject("designationFrm",designationFrm);
			mav.addObject("roleList", roleList);
			return mav;
		}
		
		 
		@RequestMapping(value = "empDesigEdit")
		public ModelAndView getEmpDesigEdit(HttpServletRequest request, HttpServletResponse response,@ModelAttribute EmpDesignationFrm designationFrm) {
			ModelAndView mav = new ModelAndView("empDesigView");
			String empDesigId = (String) request.getParameter("desigId");
			EmpDesignationFrm empDesignationFrm =null;
		    empDesignationFrm =empService.loadEmployeeDtl(Integer.parseInt(empDesigId));
			ModuleListForm moduleListForm = new ModuleListForm();
			List<RoleEntity> roleList = orgService.loadEditRole(moduleListForm);
			mav.addObject("roleList", roleList);
			mav.addObject("designationFrm",empDesignationFrm);
		    return mav;
		}
		
			
		@RequestMapping(value = "empDesigSaveUpdate")
		public ModelAndView getEmpDesigSave(HttpServletRequest request, HttpServletResponse response,@ModelAttribute EmpDesignationFrm designationFrm) {
			ModelAndView mav = new ModelAndView("empDesigView");
			empService.saveorupdate(designationFrm);
			mav.addObject("designationFrm",designationFrm);
			return mav;
		}
		
		
		@RequestMapping(value = "empDesigDelete")
		public ModelAndView getEmpDesigDelete(HttpServletRequest request, HttpServletResponse response,EmpDesignationFrm designationFrm) {
			ModelAndView mav = new ModelAndView("empDesigList");
			String empDesigId= (String) request.getParameter("desigId");
			empService.deleteDesig(Integer.parseInt(empDesigId));
			Map<String,String> paramList = new HashMap<String,String>();
			List<EmpDesignationFrm> empDesignationlist=empService.getEmployeeDesigList(paramList);
			mav.addObject("designationFrm",designationFrm);
			mav.addObject("empDesignationlist",empDesignationlist);
			return mav;
		}
		
		
		
		@RequestMapping(value = "configDashBoard")
		public ModelAndView configDashBoard(HttpServletRequest request, HttpServletResponse response,EmpDesignationFrm designationFrm) {
			ModelAndView mav = new ModelAndView("configDashBoard");
			return mav;
		}
		
		
		
		
		
		//Start Employee details new form
		@RequestMapping(value = "empNewListing")
		public ModelAndView getEmpNewPage(HttpServletRequest request, HttpServletResponse response,ModuleListForm moduleListForm) {
				ModelAndView mav = new ModelAndView("empNewListing");
				Map<String,String> paramVal= new HashMap<String,String>();
				mav.addObject("employeeList",empService.loadEmployeeList(paramVal));
				return mav;
		}
		
		
		@RequestMapping(value = "empNewListingPage")
		public @ResponseBody List<EmployeeFrm> getEmpNewListing(HttpServletRequest request, HttpServletResponse response) {
				Map<String,String> paramVal= new HashMap<String,String>();
				return empService.loadEmployeeList(paramVal);
				
		}
		
		
		@RequestMapping(value = "employeeNew")
		public ModelAndView getEmpNew(HttpServletRequest request, HttpServletResponse response,@ModelAttribute EmployeeFrm employeefrm) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			ModelAndView mav = new ModelAndView("empNewView");
			Map<String,String> paramVal=new HashMap<String,String>();
			
			ModuleListForm moduleListForm=null;
			List<RoleEntity> roleList = orgService.loadEditRole(moduleListForm);
			List<RoleFrm> roleLst= new ArrayList<RoleFrm>();
			for(RoleEntity roleenityfrm:roleList){
				if(!("SUPERADMIN").equals(roleenityfrm.getPerName())){
				RoleFrm rolefrm= new RoleFrm();
				BeanUtils.copyProperties(roleenityfrm, rolefrm);
				roleLst.add(rolefrm);
				}
			}
		
			List<SchoolForm> schoolLst=schoolService.getSchoolList();
			mav.addObject("countries", lookupService.lookup("CountryEntity", 0));
			mav.addObject("states", lookupService.lookup("StateEntity", 0));
			mav.addObject("cities", lookupService.lookup("CityEntity", 0));
			mav.addObject("schoolLst",schoolLst);  
			mav.addObject("roleLst",roleLst);                   //Employee type
			mav.addObject("employeefrm",employeefrm);
			return mav;
		}
		
		@RequestMapping(value = "getDesignationList")
		public @ResponseBody List<EmpDesignationFrm> getDesignationList(HttpServletRequest request, HttpServletResponse response) {
				Map<String,String> paramList = new HashMap<String,String>();
				paramList.put("roleId", request.getParameter("emptypeId"));
				List<EmpDesignationFrm> empDesignationlist=empService.getEmployeeDesigList(paramList);
				return empDesignationlist;
				
		}
		
		
		
		@RequestMapping(value = "employeeEdit")
		public ModelAndView getEmpDetailsEdit(HttpServletRequest request, HttpServletResponse response,@ModelAttribute EmployeeFrm employeefrm) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			ModelAndView mav = new ModelAndView("empNewView");
			String employeeId= (String) request.getParameter("employeeId");
			EmployeeFrm employeeFrm=empService.loadEmployee(Integer.parseInt(employeeId));
            List<SchoolForm> schoolLst=schoolService.getSchoolList();
            ModuleListForm moduleListForm=null;
			List<RoleEntity> roleList = orgService.loadEditRole(moduleListForm);
			List<RoleFrm> roleLst= new ArrayList<RoleFrm>();
			for(RoleEntity roleenityfrm:roleList){
				if(!("SUPERADMIN").equals(roleenityfrm.getPerName())){
				RoleFrm rolefrm= new RoleFrm();
				BeanUtils.copyProperties(roleenityfrm, rolefrm);
				roleLst.add(rolefrm);
				}
			}
            
            mav.addObject("countries", lookupService.lookup("CountryEntity", 0));
			mav.addObject("states", lookupService.lookup("StateEntity", 0));
			mav.addObject("cities", lookupService.lookup("CityEntity", 0));
			mav.addObject("roleLst",roleLst);   
			mav.addObject("schoolLst",schoolLst);  
			mav.addObject("employeefrm",employeeFrm);
			return mav;
		}
				
		
		
		@RequestMapping(value = "employeeSaveUpdate")
		public ModelAndView getEmpDetailsSaveUpdate(HttpServletRequest request, HttpServletResponse response,@ModelAttribute EmployeeFrm employeefrm) {
			ModelAndView mav = new ModelAndView("empNewView");
			EmployeeEntity employeeEntity=empService.saveorupateEmp(employeefrm);
			
			//user details
			if(null==employeefrm.getEmpId()){
			 RegistrationForm registration = new RegistrationForm();
			  //get the algorithmic username  
			 String username=empService.getUserNames();
			 String email =	"OR"+"SC"+username+"@gmail.com";	 
			 registration.setUsername("OR"+"SC"+username);
			 registration.setEmail(email);
			 registration.setPassphrase("tcs1305%");//employeefrm.getPassphrase()
			 Identity identity = this.identityService.registerIdentity(registration);
			  
			 //save role entity
			
			 ShiroUserRole shiroUsrRole=new ShiroUserRole();
			 ShiroUserRolePK shiropk = new ShiroUserRolePK();
			 shiropk.setUserId(new Integer(identity.getId()));
			 if(!StringUtils.isEmpty(employeeEntity.getEmpofficialdtl().getEmployee_Type())){
			  shiropk.setRoleId(new Integer(employeeEntity.getEmpofficialdtl().getEmployee_Type()));
			 }
			 shiroUsrRole.setId(shiropk);
			 shiroUsrRole.setEntityId(employeeEntity.getEmpId());
			 shiroUsrRole.setEntityType("Employee");
			 perRoleListDAO.saveUser(shiroUsrRole);
			}	 
			employeefrm.setEmpId(employeeEntity.getEmpId());
			//save role user role 
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
			
			List<EmpPastExperianceFrm> empPastExpdtl= new ArrayList<EmpPastExperianceFrm>();
			for(EmpPastExperianceEnity empPastExp:employeeEntity.getEmppastexperiancedtls()){
				EmpPastExperianceFrm empPastExperienceFrm = new EmpPastExperianceFrm();
				BeanUtils.copyProperties(empPastExp, empPastExperienceFrm,ignorEmpPro);
				empPastExpdtl.add(empPastExperienceFrm);
			}
			
			List<EmpPastProjectFrm> empPastProjLst= new ArrayList<EmpPastProjectFrm>();
			for(EmpPastProjectEntity empPastProj:employeeEntity.getEmppastprojects()){
				EmpPastProjectFrm empPastProjExp = new EmpPastProjectFrm();
				BeanUtils.copyProperties(empPastProj,empPastProjExp,ignorEmpPro);
				empPastProjLst.add(empPastProjExp);
			}
			
			
			employeefrm.setEmpeducationaldtl(empEduFrmLst);
			employeefrm.setEmppastexperiancedtls(empPastExpdtl);
			employeefrm.setEmppastprojects(empPastProjLst);
			mav.addObject("employeefrm",employeefrm);
			return mav;
		}
		
		
		@RequestMapping(value = "employeeDelete")
		public ModelAndView getEmpDetailsDelete(HttpServletRequest request, HttpServletResponse response,@ModelAttribute ModuleListForm moduleListForm) {
			ModelAndView mav = new ModelAndView("empNewListing");
			String employeeId= (String) request.getParameter("employeeId");
			empService.deleteEmp(Integer.parseInt(employeeId));
			Map<String,String> paramVal= new HashMap<String,String>();
			mav.addObject("employeeList",empService.loadEmployeeList(paramVal));
			mav.addObject("moduleListForm",moduleListForm);
			return mav;
		}
		
		@RequestMapping(value = "empExpanderData")
		public ModelAndView getExpanderData(HttpServletRequest request, HttpServletResponse response,@ModelAttribute ModuleListForm moduleListForm) {
			ModelAndView mav = new ModelAndView("empExpanderView");
			String employeeId= (String) request.getParameter("employeeId");
			EmployeeFrm employeeFrm=empService.loadEmployee(Integer.parseInt(employeeId));
			mav.addObject("employeefrm",employeeFrm);
			return mav;
		}
		
		
		public void setEmpService(EmpService empService) {
			this.empService = empService;
		}


		public void setOrgService(OrgService orgService) {
			this.orgService = orgService;
		}
				
}
