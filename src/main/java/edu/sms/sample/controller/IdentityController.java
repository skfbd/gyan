/*
 * This file is licensed to you under the BSD License, (the "License"); you may
 * not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 * 
 * http://www.opensource.org/licenses/bsd-license.php
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package edu.sms.sample.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.Validator;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.sms.dao.appModules.ModSubPerListDAO;
import edu.sms.dao.appModules.PerRoleListDAO;
import edu.sms.dao.appModules.RoleListDAO;
import edu.sms.entity.appModules.ModSubPerMissionEntity;
import edu.sms.entity.appModules.ModulesEntity;
import edu.sms.entity.appModules.PermissionEntity;
import edu.sms.entity.appModules.RoleEntity;
import edu.sms.entity.appModules.RolePermissionEntity;
import edu.sms.entity.appModules.ShiroUserRole;
import edu.sms.entity.appModules.ShiroUserRolePK;
import edu.sms.entity.appModules.SubModulesEntity;
import edu.sms.model.EmployeeFrm;
import edu.sms.organization.OrgService;
import edu.sms.sample.domain.Identity;
import edu.sms.sample.form.LoginForm;
import edu.sms.sample.form.RegistrationForm;
import edu.sms.sample.service.IdentityService;
import edu.sms.service.employee.EmpService;


@Controller
public class IdentityController {

  @Autowired(required = true)
  private IdentityService identityService;
  
  @Autowired(required = true)
  private EmpService      empService;
  
  @Autowired(required = true)
  private OrgService orgService;
  
  @Autowired(required = true)
  private RoleListDAO        roleDAO;
  
  @Autowired(required = true)
  private ModSubPerListDAO   modSubPerListDAO;
	
  @Autowired(required = true)
  private PerRoleListDAO     perRoleListDAO;
  
  
  
  private Validator validator;

  public Validator getValidator() {
    return validator;
  }

  @Autowired
  public void setValidator(Validator validator) {
    this.validator = validator;
  }

  private static final Logger logger = LoggerFactory.getLogger(IdentityController.class);

  /**
   * Show the Login form
   * 
   * @param locale
   * @param model
   * @return
   */
  //@RequestMapping(method = RequestMethod.GET, value = { "/login", "/identity" })
  @RequestMapping(value = "Login/login")
  public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
    logger.trace("Entering login");
    ModelAndView mav = new ModelAndView("login");
    mav.addObject("loginForm", new LoginForm());
	return mav;
      
  }

  /**
   * Shows the registration form.
   * 
   * @param locale
   * @param model
   * @return
   */
  @RequestMapping(method = RequestMethod.GET, value = { "Login/registration" })
  public ModelAndView registration(HttpServletRequest request, HttpServletResponse response) {
    logger.trace("Entering Registration");
    ModelAndView mav = new ModelAndView("registration");
    mav.addObject("registration",  new RegistrationForm());
    return mav;
  }

  /**
   * Handles the submission from the registration form.
   * 
   * @param registration
   * @param result
   * @param model
   * @return
   *///this function will be used only to create super admin so we have to put some restriction on url
  @RequestMapping(method = RequestMethod.POST, value = { "Login/register" })
  public ModelAndView register(HttpServletRequest request, HttpServletResponse response,@ModelAttribute(value = "employeefrm") @Valid EmployeeFrm employeefrm) {
    logger.trace("Entering Register");
    ModelAndView mav = new ModelAndView("register");
    RegistrationForm registration = new RegistrationForm();
    registration.setUsername(employeefrm.getUsername());
    registration.setEmail(employeefrm.getEmail());
    registration.setPassphrase(employeefrm.getPassphrase());
    Identity identity = this.identityService.registerIdentity(registration);
    //save role entity
    RoleEntity roleEntity = new RoleEntity();
	roleEntity.setPerName("SUPERADMIN");
	roleEntity.setRoleDesc("SUPERADMIN");
	roleEntity.setRoleId("0");
	Integer id= roleDAO.saveRole(roleEntity);
	List<ModSubPerMissionEntity> modSubPerList=new ArrayList<ModSubPerMissionEntity>();
    List<ModulesEntity> modList = orgService.getModuleList();// this is to // load all // the // entity // together
    for (ModulesEntity modEntity : modList) {
		for (SubModulesEntity subModulesEntity : modEntity.getSubRecord()) {
			ModSubPerMissionEntity modPerListEntity = new ModSubPerMissionEntity();
			modPerListEntity.setModVal(modEntity.getStockId().toString());
			modPerListEntity.setSubMod(subModulesEntity.getSubStockId().toString());
			String permStr=StringUtils.EMPTY;
			for (PermissionEntity subPerEntity : subModulesEntity.getPerStock()) {
				permStr=permStr+"-"+(subPerEntity.getPerName() + "_" + subModulesEntity.getSubStockId().toString() + "_" + modEntity.getStockId().toString() + "_"
						+ subModulesEntity.getStockCode());
			}
			modPerListEntity.setPermiss(permStr.replaceFirst("-", StringUtils.EMPTY));
		    modPerListEntity.setUserTypeId(id.toString());
			modSubPerList.add(modPerListEntity);
		
		}
	}

	modSubPerListDAO.saveList(modSubPerList);
	
	 List<RolePermissionEntity> rolePerm=new ArrayList<RolePermissionEntity>();
	 for (ModulesEntity modEntity : modList) { 
		 for (SubModulesEntity subModulesEntity : modEntity.getSubRecord()) {
	    	 for (PermissionEntity subPerEntity : subModulesEntity.getPerStock()) {
				     RolePermissionEntity roleEntiy =new RolePermissionEntity();
				     roleEntiy.setRole(id.toString());
				     roleEntiy.setPerName(subModulesEntity.getStockCode()+":"+subPerEntity.getPerName());      //code:opertion
				     rolePerm.add(roleEntiy);
				}
	  }
	 } 
	 perRoleListDAO.saveListRolePer(rolePerm);
		
	 ShiroUserRole shiroUsrRole=new ShiroUserRole();
	 ShiroUserRolePK shiropk = new ShiroUserRolePK();
	 shiropk.setUserId(new Integer(identity.getId()));
	 shiropk.setRoleId(id);
	 shiroUsrRole.setId(shiropk);
	 shiroUsrRole.setEntityId(0);
	 shiroUsrRole.setEntityType("superadmin");
	 perRoleListDAO.saveUser(shiroUsrRole);
	
   // this.empService.setEmpPasswordMapping(new Integer(identity.getId()).toString(),"Employee",employeefrm.getEmpId());
    mav.addObject("registration", registration);
    mav.addObject("identity", identity);
    return mav;
  }

  /**
   * Logs the user in, handles submission from the login form.
   * 
   * @param loginForm
   * @param result
   * @param model
   * @return
   */
  
  @RequestMapping(method = RequestMethod.POST,value = "Login/authenticate")
  public ModelAndView register(HttpServletRequest request, HttpServletResponse response,@ModelAttribute(value = "loginForm") @Valid LoginForm loginForm) {
    logger.trace("Entering Authenticate");
    ModelAndView mav = new ModelAndView("login");
      
    UsernamePasswordToken token = new UsernamePasswordToken(loginForm.getUsername(), loginForm.getPassphrase());

    // ”Remember Me” built-in, just do this
    // TODO: Make this a user option instead of hard coded in.
    token.setRememberMe(true);

    Subject currentUser = SecurityUtils.getSubject();
    
    try {
      currentUser.login(token);
      logger.info("AUTH SUCCESS");
    } catch (AuthenticationException ae) {
    	logger.info("AUTH MSSG: " + ae.getMessage());
    }
    
    if (currentUser.isAuthenticated()) {
    	return new ModelAndView("redirect:/admin/menuList.htm");
    	
    }
   
    return new ModelAndView("redirect:/Login/login.htm");
  }

	
  //@RequestMapping(method = RequestMethod.GET, value = { "/login", "/identity" })
  @RequestMapping(value = "Login/logout")
  public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
    logger.trace("Entering login");
    ModelAndView mav = new ModelAndView("login");
    Subject currentUser = SecurityUtils.getSubject();
    currentUser.logout();
    mav.addObject("loginForm", new LoginForm());
    mav.addObject("success", "you are successfully logout");
    return mav;
      
  }

	  
 
  
  
  
  
}
