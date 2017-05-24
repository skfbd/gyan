package edu.sms.server;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;
import org.springframework.web.servlet.ModelAndView;

import edu.sms.constants.City;
import edu.sms.constants.OrganizationType;
import edu.sms.constants.State;
import edu.sms.dao.appModules.PerRoleListDAO;
import edu.sms.entity.AcademicSessionEntity;
import edu.sms.entity.appModules.ModSubPerMissionEntity;
import edu.sms.entity.appModules.ModulesEntity;
import edu.sms.entity.appModules.PermissionEntity;
import edu.sms.entity.appModules.RoleEntity;
import edu.sms.entity.appModules.SubModulesEntity;
import edu.sms.entity.organization.OrganizationEntity;
import edu.sms.model.AcademicSessionForm;
import edu.sms.model.ClassForm;
import edu.sms.model.ModuleListForm;
import edu.sms.model.OrganizationForm;
import edu.sms.model.PerModLstForm;
import edu.sms.model.SchoolForm;
import edu.sms.model.SchoolOrgGlobalConfigForm;
import edu.sms.model.SearchForm;
import edu.sms.model.Searchfrm;
import edu.sms.model.SectionForm;
import edu.sms.model.StudentFeeCategoryForm;
import edu.sms.model.SubModLstForm;
import edu.sms.organization.OrgService;
import edu.sms.sample.form.LoginForm;
import edu.sms.service.AcademicSessionService;
import edu.sms.service.ClassService;
import edu.sms.service.LookupService;
import edu.sms.service.SchoolOrgService;
import edu.sms.service.SchoolService;
import edu.sms.service.SectionService;
import edu.sms.service.StudentFeeCategoryService;

@MultipartConfig(maxFileSize = 2097152)
@Controller
@RequestMapping("/admin")
public class AdminController {

	private OrgService    orgService;
	private SchoolService schoolService;
	private LookupService lookupService;
	private ClassService   classService;
	private AcademicSessionService academicSessionService;
	private SchoolOrgService schoolOrgService;
	private StudentFeeCategoryService studentFeeCategoryService;
	private SectionService sectionService;

	 @Autowired(required = true)
	  private PerRoleListDAO     perRoleListDAO;
	  
	
	
	
	// FOR ORGANISTION SECTION
	@RequestMapping(value = "menuList")
	public ModelAndView getMenuDetails(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("menuList");
		HttpSession session = request.getSession(false);
		Subject currentUser = SecurityUtils.getSubject();
		
		Integer userTypeId=perRoleListDAO.getUserTypeId(currentUser.getPrincipal().toString()); 
		
		List<ModulesEntity> modList = orgService.getModuleList();
		List<ModSubPerMissionEntity> checkList = orgService.loadEditModule(userTypeId);

		List<ModuleListForm> moduleListForm = new ArrayList<ModuleListForm>();
		for (ModulesEntity modEntity : modList) {
			ModuleListForm modLstFrm = new ModuleListForm();
			modLstFrm.setModuleName(modEntity.getStockName());
			modLstFrm.setModuleCaption(modEntity.getModCaption());
			modLstFrm.setModuleValue(modEntity.getStockId().toString());

			for (SubModulesEntity subModulesEntity : modEntity.getSubRecord()) {
				SubModLstForm modSubFrm = new SubModLstForm();
				modSubFrm.setModuleName(subModulesEntity.getStockName());
				modSubFrm.setModuleCaption(subModulesEntity.getSubModCaption());
				modSubFrm.setModuleValue(subModulesEntity.getSubStockId().toString());
				modSubFrm.setLinkUrl(subModulesEntity.getLinkUrl().trim() + "?modVal=" + modLstFrm.getModuleValue() + "&" + "subMod=" + modSubFrm.getModuleValue());
				for (PermissionEntity subPerEntity : subModulesEntity.getPerStock()) {
					PerModLstForm modPermFrm1 = new PerModLstForm();
					modPermFrm1.setModuleName(subPerEntity.getPerName());
					modPermFrm1.setModuleValue(subPerEntity.getPerName() + "_" + subModulesEntity.getSubStockId().toString() + "_" + modEntity.getStockId().toString() + "_"
							+ subModulesEntity.getStockCode());
					for (ModSubPerMissionEntity modId : checkList) {
						// modLstFrm.setUserType(modId.getUserTypeId());//
						// incase of edit
						if (Integer.valueOf(modId.getModVal()).equals(Integer.valueOf(modEntity.getStockId()))) {
							modLstFrm.setCheckflag(true);
						}

						if (StringUtils.isNumeric(modId.getSubMod()) &&  Integer.valueOf(modId.getSubMod()).equals(Integer.valueOf(subModulesEntity.getSubStockId()))) {
							modSubFrm.setCheckflag(true);
						}

						for (String permStr : modId.getPermiss().split("-")) {
							if (permStr.equals(modPermFrm1.getModuleValue())) {
								modPermFrm1.setCheckflag(true);
							}
						}
					}
					modSubFrm.getPerfrmList().add(modPermFrm1);

				}
				modLstFrm.getSubfrmList().add(modSubFrm);
			}
			moduleListForm.add(modLstFrm);
		}
		session.setAttribute("listofElement", moduleListForm);
		
		mav.addObject("moduleListForm", new ModuleListForm());
		// mav.addObject("modList",moduleListForm);
		session.setAttribute("userName", currentUser.getPrincipal());
		return mav;

	}

	// FOR ORGANISTION SECTION two function are required orgList for mav n second for data
	@RequestMapping(value = "orgList")
	public ModelAndView getOrgDetails(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("orgList");
		return mav;
	}

	@RequestMapping("getOrgs")
	public @ResponseBody List getOrgs(HttpServletRequest request, HttpServletResponse response) {
		OrganizationForm orgForm = new OrganizationForm();
		List<OrganizationEntity> orgEntiyList = orgService.getOrgList();
		List orgFromList = new ArrayList();
		for (OrganizationEntity orgEntity : orgEntiyList) {
			orgForm = new OrganizationForm();
			BeanUtils.copyProperties(orgEntity, orgForm);
			orgForm.setStateString(State.find(orgEntity.getState()));
			orgForm.setDistrictString(City.find(orgEntity.getDistrict()));
			orgFromList.add(orgForm);
		}
		return orgFromList;
	}

	
	@RequestMapping("orgEdit")
	public  ModelAndView  getOrgsEdit(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("organizationForm") OrganizationForm organizationForm) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ModelAndView mav = new ModelAndView("orgEdit");
		OrganizationForm orgForm = new OrganizationForm();
		OrganizationEntity orgEntiy = orgService.getOrganization(organizationForm.getOrgId());
		BeanUtils.copyProperties(orgEntiy, orgForm);
		mav.addObject("countries", lookupService.lookup("CountryEntity", 0));
		mav.addObject("states", lookupService.lookup("StateEntity", 0));
		mav.addObject("cities", lookupService.lookup("CityEntity", 0));
		mav.addObject("orgTypes", Arrays.asList(OrganizationType.values()));
		mav.addObject("OrgHead", lookupService.lookup("OrgHead", 0));	
	
		organizationForm.setCountry("1");
		mav.addObject("organizationForm", orgForm);
		return mav;
	}
	
	
	@RequestMapping(value = "orgNew")
	public ModelAndView orgEditDetails(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("organizationForm") OrganizationForm organizationForm) throws NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ModelAndView mav = new ModelAndView("orgEdit");
		mav.addObject("countries", lookupService.lookup("CountryEntity", 0));
		mav.addObject("states", lookupService.lookup("StateEntity", 0));
		mav.addObject("cities", lookupService.lookup("CityEntity", 0));
		mav.addObject("orgTypes", Arrays.asList(OrganizationType.values()));
		mav.addObject("OrgHead", lookupService.lookup("OrgHead", 0));	
	
		organizationForm.setCountry("1");
		
		return mav;
	}

	@RequestMapping(value = "saveOrg")
	public ModelAndView saveOrg(HttpServletRequest request, HttpServletResponse response, @ModelAttribute OrganizationForm organizationForm) {
		ModelAndView mav = new ModelAndView("orgEdit");
		OrganizationForm OrgFrm=orgService.saveOrg(organizationForm);
		mav.addObject("organizationForm",OrgFrm);
		return mav;
	}

	@RequestMapping(value = "deleteOrg")
	public ModelAndView deleteOrg(HttpServletRequest request, HttpServletResponse response, @ModelAttribute OrganizationForm organizationForm) {
		ModelAndView mav = new ModelAndView("orgEdit");
		orgService.deleteOrg(organizationForm);
		return mav;
	}

	// FOR SCHOOL SECTION
	@RequestMapping(value = "schoolList")
	public ModelAndView getSchoolDetails(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("schoolList");
		return mav;
	}

	@RequestMapping("getSchools")
	public @ResponseBody List<SchoolForm> getSchools(HttpServletRequest request, HttpServletResponse response) {
		List<SchoolForm> schoolLst=schoolService.getSchoolList();
		List<OrganizationEntity> orgEntiyList = orgService.getOrgList();
		for(SchoolForm schfrm:schoolLst){
			for(OrganizationEntity orgfrm:orgEntiyList){
			   if(orgfrm.getOrgId().intValue()==schfrm.getOrgId().intValue())	{
				   schfrm.setOrgId(orgfrm.getOrgId());
				   schfrm.setOrgName(orgfrm.getOrgName());
			   }
			}
		}
		return schoolLst;
	}

	@RequestMapping("newSchool")
	public ModelAndView schoolNewDetails(HttpServletRequest request, HttpServletResponse response, @ModelAttribute SchoolForm schoolForm) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ModelAndView mav = new ModelAndView("schoolEdit");
		OrganizationForm orgForm = new OrganizationForm();
		List<OrganizationEntity> orgEntiyList = orgService.getOrgList();
		List orgFromList = new ArrayList();
		for (OrganizationEntity orgEntity : orgEntiyList) {
			orgForm = new OrganizationForm();
			BeanUtils.copyProperties(orgEntity, orgForm);
			orgFromList.add(orgForm);
		}
		mav.addObject("countries", lookupService.lookup("CountryEntity", 0));
		mav.addObject("states", lookupService.lookup("StateEntity", 0));
		mav.addObject("cities", lookupService.lookup("CityEntity", 0));
	
		mav.addObject("orgFromList",orgFromList);
		return mav;
	}
	
	@RequestMapping("editSchool")
	public ModelAndView schoolEditDetails(HttpServletRequest request, HttpServletResponse response, @ModelAttribute SchoolForm schoolForm) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ModelAndView mav = new ModelAndView("schoolEdit");
		SchoolForm schoolFrm=schoolService.getSchool(schoolForm.getSchoolId());
		OrganizationForm orgForm = new OrganizationForm();
		List<OrganizationEntity> orgEntiyList = orgService.getOrgList();
		List orgFromList = new ArrayList();
		for (OrganizationEntity orgEntity : orgEntiyList) {
			orgForm = new OrganizationForm();
			BeanUtils.copyProperties(orgEntity, orgForm);
			orgFromList.add(orgForm);
		}
		mav.addObject("countries", lookupService.lookup("CountryEntity", 0));
		mav.addObject("states", lookupService.lookup("StateEntity", 0));
		mav.addObject("cities", lookupService.lookup("CityEntity", 0));
	
		mav.addObject("orgFromList",orgFromList);
		mav.addObject("schoolFrm",schoolFrm);
		return mav;
	}

	@RequestMapping(value = "saveSchool")
	public ModelAndView saveSchool(HttpServletRequest request, HttpServletResponse response, @ModelAttribute SchoolForm schoolForm) {
		ModelAndView mav = new ModelAndView("schoolEdit");
		SchoolForm schoolfrm=schoolService.saveSchool(schoolForm);
		mav.addObject("schoolFrm",schoolfrm);
		return mav;
	}

	@RequestMapping(value = "deleteSchool")
	public ModelAndView deleteSchool(HttpServletRequest request, HttpServletResponse response, @ModelAttribute SchoolForm schoolForm) {
		ModelAndView mav = new ModelAndView("schoolEdit");
		schoolService.deleteSchool(schoolForm);
		return mav;
	}

	// ACADEMIC SESSION START
	@RequestMapping(value = "academicSessionList")
	public ModelAndView getAcademicSessionListView(HttpServletRequest request, HttpServletResponse response, @ModelAttribute SearchForm searchForm) {
		ModelAndView mav = new ModelAndView("academicSessionList");
		return mav;
	}
	
	@RequestMapping(value = "listAcademicSessions")
	public @ResponseBody List<AcademicSessionForm> getAcademicSessionList(HttpServletRequest request, HttpServletResponse response) {
		/*List academicSessionLst = academicSessionService.listByForeignId(getId(request, "schoolId"));
		List<SchoolForm> schoolLst=schoolService.getSchoolList();
		List<AcademicSessionForm> acadSessionLst=new ArrayList<AcademicSessionForm>();
		Boolean flag=true;	
		for(Object obj:academicSessionLst){
			AcademicSessionEntity academicSessionEntity=(AcademicSessionEntity)obj;
			AcademicSessionForm  academicSessionfrm = new AcademicSessionForm();
			BeanUtils.copyProperties(academicSessionEntity, academicSessionfrm);
			acadSessionLst.add(academicSessionfrm);	
			}
		
		for(SchoolForm schoolform:schoolLst){
			AcademicSessionForm  academicSessionfrm = new AcademicSessionForm();
			academicSessionfrm.setSchoolId(schoolform.getSchoolId());
			academicSessionfrm.setSchoolName(schoolform.getSchoolName());
			for(AcademicSessionForm academicSession:acadSessionLst){
				if(academicSession.getSchoolId().intValue()==academicSessionfrm.getSchoolId().intValue())
				{
					academicSession.setSchoolName(schoolform.getSchoolName());
					flag=true;
					break;
					
				}else{
					flag=false;
				}
				
			}
		   if(!flag){
			   acadSessionLst.add(academicSessionfrm);	 
		   }
		}*/
		
		List<AcademicSessionForm> acadSessionLst = academicSessionService.getAcademicSession();
		return acadSessionLst;
	}

	
	@RequestMapping("newAcademicSessions")
	public ModelAndView newAcademicSessions(HttpServletRequest request, HttpServletResponse response, @ModelAttribute AcademicSessionForm academicSessionFrm) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ModelAndView mav = new ModelAndView("academicSessionFormView");
		List<SchoolForm> schoolLst=schoolService.getSchoolList();
		mav.addObject("schoolLst",schoolLst);
		mav.addObject("academicSessionFrm",academicSessionFrm);
		return mav;
	}
	
	
	
	@RequestMapping("editAcademicSessions")
	public ModelAndView editAcademicSessions(HttpServletRequest request, HttpServletResponse response, @ModelAttribute AcademicSessionForm academicSessionFrm) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ModelAndView mav = new ModelAndView("academicSessionFormView");
		AcademicSessionEntity academicSessionEnt=academicSessionService.getById(academicSessionFrm.getId());
		AcademicSessionForm academicSeionFrm = new AcademicSessionForm();
		BeanUtils.copyProperties(academicSessionEnt, academicSeionFrm);
		List<SchoolForm> schoolLst=schoolService.getSchoolList();
		mav.addObject("schoolLst",schoolLst);
		mav.addObject("academicSessionFrm",academicSeionFrm);
		mav.addObject("countries", lookupService.lookup("CountryEntity", 0));
		mav.addObject("states", lookupService.lookup("StateEntity", 0));
		mav.addObject("cities", lookupService.lookup("CityEntity", 0));
		return mav;
	}
	
	
	@RequestMapping(value = "saveAcademicSession")
	public ModelAndView  saveAcademicSession(HttpServletRequest request, HttpServletResponse response, @ModelAttribute AcademicSessionForm academicSessionFrm) {
		ModelAndView mav = new ModelAndView("academicSessionFormView");
		AcademicSessionForm acadmicSession=academicSessionService.saveAcademicSession(academicSessionFrm);
		mav.addObject("academicSessionFrm",acadmicSession);
		return mav;
	}

	@RequestMapping(value = "deleteAcademicSession")
	public @ResponseBody String deleteAcademicSession(HttpServletRequest request, HttpServletResponse response, @ModelAttribute AcademicSessionForm academicSessionFrm) {
		academicSessionService.delete(academicSessionFrm);
		return "Delete Success";
	}

	// ACADEMIC SESSION END
	
	
	// SCHOOL ORG GLOBAL CONFIGURATION START
	@RequestMapping(value = "schoolOrgGlobalConfigList")
	public ModelAndView getSchoolOrgGlobalConfigListView(HttpServletRequest request, HttpServletResponse response, @ModelAttribute SearchForm searchForm) {
		ModelAndView mav = new ModelAndView("schoolOrgGlobalConfigList");
		return mav;
	}

	@RequestMapping(value = "listSchoolOrgGlobalConfigs")
	public @ResponseBody List<SchoolOrgGlobalConfigForm> getSchoolOrgGlobalConfigList(HttpServletRequest request, HttpServletResponse response) {
		List<SchoolForm> schoolLst=schoolService.getSchoolList();
		List<SchoolOrgGlobalConfigForm> listofGlobalconfig=schoolOrgService.listSchoolOrgGlobal(new SchoolOrgGlobalConfigForm());
		for(SchoolForm schfrm:schoolLst){
			for(SchoolOrgGlobalConfigForm schoolOrgGlbConfigFrm:listofGlobalconfig)   
			if(schfrm.getSchoolId().intValue()==schoolOrgGlbConfigFrm.getSchoolId().intValue())	{
				   schoolOrgGlbConfigFrm.setSchoolId(schfrm.getSchoolId());
				   schoolOrgGlbConfigFrm.setName(schfrm.getSchoolName());
			   }
		}
		return listofGlobalconfig;
	}

	
	@RequestMapping(value = "editSchoolOrgGlobalConfig")
	public ModelAndView editSchoolOrgGlobalConfig(HttpServletRequest request, HttpServletResponse response, @ModelAttribute SchoolOrgGlobalConfigForm schoolOrgGlobalConfigForm) {
		ModelAndView mav = new ModelAndView("schoolOrgGlobalConfigForm");
		SchoolOrgGlobalConfigForm schoolOrgGlbConfigFrm=schoolOrgService.getSchoolOrgGlobal(schoolOrgGlobalConfigForm);
		List<SchoolForm> schoolLst=schoolService.getSchoolList();
		List<AcademicSessionForm> acadSessionNew=new ArrayList<AcademicSessionForm>();
		List<AcademicSessionForm> acadSessionLst = academicSessionService.getAcademicSession();
		for(SchoolForm schfrm:schoolLst){
			   if(schfrm.getSchoolId().intValue()==schoolOrgGlbConfigFrm.getSchoolId().intValue())	{
				   schoolOrgGlbConfigFrm.setSchoolId(schfrm.getSchoolId());
				   schoolOrgGlbConfigFrm.setName(schfrm.getSchoolName());
				   for(AcademicSessionForm acaSessionFrm:acadSessionLst){
				      if((null !=acaSessionFrm.getSchoolId() && null!=schfrm.getSchoolId()) && acaSessionFrm.getSchoolId().intValue()==schfrm.getSchoolId().intValue())
					    acadSessionNew.add(acaSessionFrm);
				   }
			   }
		}
		
		
		mav.addObject("schoolOrgGlbConfigFrm",schoolOrgGlbConfigFrm);
		mav.addObject("acadSessionNew",acadSessionNew);
		return mav;
    }
	
	@RequestMapping(value = "updateSchoolOrgGlobalConfig")
	public ModelAndView updateSchoolOrgGlobalConfig(HttpServletRequest request, HttpServletResponse response, @ModelAttribute SchoolOrgGlobalConfigForm schoolOrgGlobalConfigForm) {
		ModelAndView mav = new ModelAndView("schoolOrgGlobalConfigForm");
		schoolOrgService.updateGlobalConfig(schoolOrgGlobalConfigForm);
		return mav;
    }
	
	// SCHOOL ORG GLOBAL CONFIGURATION END
	
	
	// Class Edit and List
	
		@RequestMapping(value = "classView")
		public ModelAndView getClassView(HttpServletRequest request, HttpServletResponse response, @ModelAttribute SearchForm searchForm) {
			ModelAndView mav = new ModelAndView("classList");
			return mav;
		}
		
		
		@RequestMapping(value = "classList")
		public @ResponseBody List<ClassForm> getClassListView(HttpServletRequest request, HttpServletResponse response,@ModelAttribute ClassForm classForm) {
			List<ClassForm> classList=classService.list(classForm);
			return classList;
		}

		@RequestMapping("newClasses")
		public ModelAndView newClasses(HttpServletRequest request, HttpServletResponse response, @ModelAttribute ClassForm classForm) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			ModelAndView mav = new ModelAndView("classEdit");
			List<SchoolForm> schoolLst=schoolService.getSchoolList();
			mav.addObject("schoolLst",schoolLst);
			mav.addObject("classForm",classForm);
			return mav;
		}
		
		
		
		@RequestMapping(value = "editClasses")
		public ModelAndView  getClassList(HttpServletRequest request, HttpServletResponse response,@ModelAttribute ClassForm classForm) {
			ModelAndView mav = new ModelAndView("classEdit");
			ClassForm classFrm=classService.getClass(classForm);
			List<SchoolForm> schoolLst=schoolService.getSchoolList();
			mav.addObject("schoolLst",schoolLst);
			mav.addObject("classForm",classFrm);
			return mav;
		}

		@RequestMapping(value = "saveClass")
		public ModelAndView saveClass(HttpServletRequest request, HttpServletResponse response,@ModelAttribute ClassForm classForm) {
			ModelAndView mav = new ModelAndView("classEdit");
			ClassForm clForm=classService.saveClass(classForm);
			mav.addObject("classForm",clForm);
			return mav;
		}

		@RequestMapping(value = "deleteClass")
		public @ResponseBody String deleteClass(HttpServletRequest request, HttpServletResponse response,@ModelAttribute ClassForm classForm) {
			classService.delete(classForm);
			return "DeletedSuccessfully";
		}

		// Section Edit and List
		@RequestMapping(value = "sectionList")
		public ModelAndView getSectionListView(HttpServletRequest request, HttpServletResponse response, @ModelAttribute SectionForm sectionForm) {
			ModelAndView mav = new ModelAndView("sectionList");
			return mav;
		}

		@RequestMapping(value = "listSections")
		public @ResponseBody List<SectionForm> getSectionList(HttpServletRequest request, HttpServletResponse response,@ModelAttribute SectionForm sectionForm) {
			return sectionService.list(sectionForm);
		}

		
		
		@RequestMapping("newSection")
		public ModelAndView newSection(HttpServletRequest request, HttpServletResponse response, @ModelAttribute SectionForm sectionForm) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			ModelAndView mav = new ModelAndView("sectionEdit");
			List<SchoolForm> schoolLst=schoolService.getSchoolList();
			mav.addObject("schoolLst",schoolLst);
			mav.addObject("sectionForm",sectionForm);
			return mav;
		}
		
		
		
		@RequestMapping(value = "editSection")
		public ModelAndView  getEditSection(HttpServletRequest request, HttpServletResponse response,@ModelAttribute SectionForm sectionForm) {
			ModelAndView mav = new ModelAndView("sectionEdit");
			SectionForm sectionfrm=sectionService.getSection(sectionForm);
			List<SchoolForm> schoolLst=schoolService.getSchoolList();
			mav.addObject("schoolLst",schoolLst);
			mav.addObject("sectionfrm",sectionfrm);
			return mav;
		}

				
		
		@RequestMapping(value = "saveSection")
		public  ModelAndView  saveSection(HttpServletRequest request, HttpServletResponse response,@ModelAttribute SectionForm sectionForm) {
			ModelAndView mav = new ModelAndView("sectionEdit");
			SectionForm secform = sectionService.saveSection(sectionForm);
			mav.addObject("sectionfrm",secform);
			return mav;
		}

		@RequestMapping(value = "deleteSection")
		public @ResponseBody SectionForm deleteSection(HttpServletRequest request, HttpServletResponse response,@ModelAttribute SectionForm sectionForm) {
			sectionService.delete(sectionForm);
			return sectionForm;
		}


	
	// FEE CATEGOARY START
	@RequestMapping(value = "studentFeeCategoryList")
	public ModelAndView getStudentFeeCategoryListView(HttpServletRequest request, HttpServletResponse response, @ModelAttribute SearchForm searchForm) {
		ModelAndView mav = new ModelAndView("studentFeeCategoryList");
		return mav;
	}

	@RequestMapping(value = "listStudentFeeCategories")
	public @ResponseBody List getStudentFeeCategoryList(HttpServletRequest request, HttpServletResponse response) {
		return studentFeeCategoryService.list(new StudentFeeCategoryForm());
	}

	@RequestMapping(value = "saveStudentFeeCategory")
	public @ResponseBody StudentFeeCategoryForm saveStudentFeeCategory(HttpServletRequest request, HttpServletResponse response) {
		StudentFeeCategoryForm form = new StudentFeeCategoryForm(request);
		studentFeeCategoryService.save(form);
		return form;
	}

	@RequestMapping(value = "deleteStudentFeeCategory")
	public @ResponseBody StudentFeeCategoryForm deleteStudentFeeCategory(HttpServletRequest request, HttpServletResponse response) {
		StudentFeeCategoryForm form = new StudentFeeCategoryForm(request);
		studentFeeCategoryService.delete(form);
		return form;
	}
	// FEE CATEGOARY END
	
	
	@RequestMapping(value = "weeklyHolidayList")
	public ModelAndView getWeeklyHolidayList(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("weeklyHolidayList");
		return mav;
	}

	@RequestMapping(value = "weekelyHolidayEdit")
	public ModelAndView weekelyHolidayEditDetails(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("weekelyHolidayEdit");
		return mav;
	}

	// Bank edit and list
	@RequestMapping(value = "bankList")
	public ModelAndView getBankList(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("bankList");
		return mav;
	}

	@RequestMapping(value = "bankEdit")
	public ModelAndView bankbranchAccEditDetails(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("bankEdit");
		return mav;
	}

		@RequestMapping(value = "paperTypeList")
	public ModelAndView getPaperTypeList(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("paperTypeList");
		return mav;
	}

	@RequestMapping(value = "paperTypeEdit")
	public ModelAndView paperTypeEditDetails(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("paperTypeEdit");
		return mav;
	}

	@RequestMapping(value = "gradeTypeList")
	public ModelAndView getGradeTypeList(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("gradeTypeList");
		return mav;
	}

	@RequestMapping(value = "subjectList")
	public ModelAndView getSubjectList(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("subjectList");
		return mav;
	}

	@RequestMapping(value = "subjectEdit")
	public ModelAndView subjectEditDetails(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("subjectEdit");
		return mav;
	}

	@RequestMapping(value = "saveTemplate")
	public ModelAndView saveAddmissionDtl(HttpServletRequest request, HttpServletResponse response, OrganizationForm orgnizationForm) {
		ModelAndView mav = new ModelAndView("orgEditView");
		final HttpSession session = request.getSession(false);
		orgnizationForm.setOrgName("test");
		orgService.saveOrg(orgnizationForm);
		return mav;
	}

	// @RequestMapping(method = RequestMethod.GET, value = { "/login", // "/identity" })
	@RequestMapping(value = "rolepermission")
	public ModelAndView rolepermission(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("rolepermission");
		mav.addObject("loginForm", new LoginForm());
		return mav;

	}

	//load view for the employee type
	@RequestMapping(value = "loadModules")
	public ModelAndView loadModules(HttpServletRequest request, HttpServletResponse response, Searchfrm searchfrm) {
		ModelAndView mav = new ModelAndView("loadModules");
		List<ModulesEntity> modList = orgService.getModuleList();// this is to // load all // the // entity // together
		List<ModuleListForm> moduleListForm = new ArrayList<ModuleListForm>();
		for (ModulesEntity modEntity : modList) {
			ModuleListForm modLstFrm = new ModuleListForm();
			modLstFrm.setModuleName(modEntity.getStockName());
			modLstFrm.setModuleCaption(modEntity.getModCaption());
			modLstFrm.setModuleValue(modEntity.getStockId().toString());

			for (SubModulesEntity subModulesEntity : modEntity.getSubRecord()) {
				SubModLstForm modSubFrm = new SubModLstForm();
				modSubFrm.setModuleName(subModulesEntity.getStockName());
				modSubFrm.setModuleCaption(subModulesEntity.getSubModCaption());
				modSubFrm.setModuleValue(modEntity.getStockId().toString() + "_" + subModulesEntity.getSubStockId().toString());

				for (PermissionEntity subPerEntity : subModulesEntity.getPerStock()) {
					PerModLstForm modPermFrm1 = new PerModLstForm();
					modPermFrm1.setModuleName(subPerEntity.getPerName());
					modPermFrm1.setModuleValue(subPerEntity.getPerName() + "_" + subModulesEntity.getSubStockId().toString() + "_" + modEntity.getStockId().toString() + "_"
							+ subModulesEntity.getStockCode());
					modSubFrm.getPerfrmList().add(modPermFrm1);

				}
				modLstFrm.getSubfrmList().add(modSubFrm);
			}
			moduleListForm.add(modLstFrm);
		}

		mav.addObject("moduleListForm", new ModuleListForm());
		mav.addObject("modList", moduleListForm);
		return mav;

	}

	@RequestMapping(value = "loadModulesEdit")
	public ModelAndView loadModulesEdit(HttpServletRequest request, HttpServletResponse response, Searchfrm searchfrm) {
		ModelAndView mav = new ModelAndView("loadModules");
		String editId = (String) request.getParameter("editVal");

		List<ModulesEntity> modList = orgService.getModuleList();
		Map checkMap = orgService.loadEditModule(editId);
		List<ModSubPerMissionEntity> checkList = (List<ModSubPerMissionEntity>) checkMap.get("ModSubPerMissionEntity");
		RoleEntity role = (RoleEntity) checkMap.get("Role");
		List<ModuleListForm> moduleListForm = new ArrayList<ModuleListForm>();
		for (ModulesEntity modEntity : modList) {
			ModuleListForm modLstFrm = new ModuleListForm();
			modLstFrm.setModuleName(modEntity.getStockName());
			modLstFrm.setModuleCaption(modEntity.getModCaption());
			modLstFrm.setModuleValue(modEntity.getStockId().toString());

			for (SubModulesEntity subModulesEntity : modEntity.getSubRecord()) {
				SubModLstForm modSubFrm = new SubModLstForm();
				modSubFrm.setModuleName(subModulesEntity.getStockName());
				modSubFrm.setModuleCaption(subModulesEntity.getSubModCaption());
				modSubFrm.setModuleValue(subModulesEntity.getSubStockId().toString());

				for (PermissionEntity subPerEntity : subModulesEntity.getPerStock()) {
					PerModLstForm modPermFrm1 = new PerModLstForm();
					modPermFrm1.setModuleName(subPerEntity.getPerName());
					modPermFrm1.setModuleValue(subPerEntity.getPerName() + "_" + subModulesEntity.getSubStockId().toString() + "_" + modEntity.getStockId().toString() + "_"
							+ subModulesEntity.getStockCode());
					for (ModSubPerMissionEntity modId : checkList) {
						modLstFrm.setUserType(modId.getUserTypeId());

						// incase of edit
						if (Integer.valueOf(modId.getModVal()).equals(Integer.valueOf(modEntity.getStockId()))) {
							modLstFrm.setCheckflag(true);
						}

						if (Integer.valueOf(modId.getSubMod()).equals(Integer.valueOf(subModulesEntity.getSubStockId()))) {
							modSubFrm.setCheckflag(true);
						}

						for (String permStr : modId.getPermiss().split("-")) {
							if (permStr.equals(modPermFrm1.getModuleValue())) {
								modPermFrm1.setCheckflag(true);
							}
						}
					}
					modSubFrm.getPerfrmList().add(modPermFrm1);

				}
				modLstFrm.getSubfrmList().add(modSubFrm);
			}
			moduleListForm.add(modLstFrm);
		}

		mav.addObject("moduleListForm", new ModuleListForm());
		mav.addObject("modList", moduleListForm);
		mav.addObject("editId", editId);
		mav.addObject("role", role);
		return mav;

	}

	//This method is used for save the list of modules
	@RequestMapping(value = "saveModulesList")
	public @ResponseBody String getListofCaptionAutoCom(HttpServletRequest request, HttpServletResponse response, ModuleListForm moduleListForm) {
		orgService.saveModule(moduleListForm);
		return "Sucess";

	}

	@RequestMapping(value = "DeleteEmpType")
	public ModelAndView DeleteEmpType(HttpServletRequest request, HttpServletResponse response, ModuleListForm moduleListForm) {
		ModelAndView mav = new ModelAndView("modulesEdit");
		String editId = (String) request.getParameter("delVal");
		orgService.deleteEmployeeType(editId);
		List<RoleEntity> roleList = orgService.loadEditRole(moduleListForm);
		mav.addObject("roleList", roleList);
		return mav;
	}

	private Long getId(HttpServletRequest request, String param) {
		return StringUtils.isNotEmpty(request.getParameter(param)) ? Long.valueOf(request.getParameter(param)) : 0;
	}

	@InitBinder
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws ServletException {
		binder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());
	}

	public void setOrgService(OrgService orgService) {
		this.orgService = orgService;
	}

	public void setSchoolService(SchoolService schoolService) {
		this.schoolService = schoolService;
	}

	public void setLookupService(LookupService lookupService) {
		this.lookupService = lookupService;
	}

	public void setClassService(ClassService classService) {
		this.classService = classService;
	}

	public void setAcademicSessionService(AcademicSessionService academicSessionService) {
		this.academicSessionService = academicSessionService;
	}

	public void setSchoolOrgService(SchoolOrgService schoolOrgService) {
		this.schoolOrgService = schoolOrgService;
	}

	public void setStudentFeeCategoryService(StudentFeeCategoryService studentFeeCategoryService) {
		this.studentFeeCategoryService = studentFeeCategoryService;
	}

	public void setSectionService(SectionService sectionService) {
		this.sectionService = sectionService;
	}

}
