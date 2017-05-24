/**
 * 
 */
package edu.sms.server.student;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.sms.model.student.manage.StudentMasterForm;
import edu.sms.service.LookupService;
import edu.sms.service.student.manage.StudentService;

/**
 * @author Kundan Suthar
 *
 */

@Controller
@RequestMapping("/StudentUpdate")
public class StudentUpdateController {
	
	private LookupService lookupService;
	private StudentService studentService;
	
	@RequestMapping(value = "studentEdit")
	public ModelAndView doUpdate(HttpServletRequest request, HttpServletResponse response, @ModelAttribute StudentMasterForm studentMasterForm) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ModelAndView mav = new ModelAndView("studentEdit");
		long studentId = Long.valueOf(request.getParameter("studentId"));
		studentMasterForm = studentService.loadAll(studentId);
		mav.addObject("studentMasterForm",studentMasterForm);
		return mav;
	}
	
	@RequestMapping(value = "studentUpdateSave")
	public ModelAndView createStudent(HttpServletRequest request, HttpServletResponse response, @ModelAttribute StudentMasterForm studentMasterForm) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		studentService.updateStudent(studentMasterForm,request);
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
