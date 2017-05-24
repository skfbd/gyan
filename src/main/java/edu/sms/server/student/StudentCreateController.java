/**
 * 
 */
package edu.sms.server.student;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.sms.constants.OrganizationType;
import edu.sms.model.student.manage.StudentMasterForm;
import edu.sms.service.LookupService;
import edu.sms.service.student.manage.StudentService;

/**
 * @author Kundan Suthar
 *
 */

@Controller
@RequestMapping("/StudentCreate")
public class StudentCreateController {
	
	private LookupService lookupService;
	private StudentService studentService;
	
	@RequestMapping(value = "studentCreate")
	public ModelAndView docreate(HttpServletRequest request, HttpServletResponse response, @ModelAttribute StudentMasterForm studentMasterForm) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ModelAndView mav = new ModelAndView("studentCreate");
		studentMasterForm = new StudentMasterForm();
		mav.addObject("studentMasterForm",studentMasterForm);
		return mav;
	}
	
	@RequestMapping(value = "studentCreateSave")
	public ModelAndView createStudent(HttpServletRequest request, HttpServletResponse response, @ModelAttribute StudentMasterForm studentMasterForm) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		studentMasterForm.setStudentCreationDate(new Date());
		studentService.createStudent(studentMasterForm,request);
		ModelAndView mav = new ModelAndView("studentEdit");
		mav.addObject("studentMasterForm",studentMasterForm);
		return mav;
	}

	public LookupService getLookupService() {
		return lookupService;
	}

	public void setLookupService(LookupService lookupService) {
		this.lookupService = lookupService;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
}
