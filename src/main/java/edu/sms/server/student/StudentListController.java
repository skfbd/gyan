/**
 * 
 */
package edu.sms.server.student;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import edu.sms.model.student.manage.StudentListForm;
import edu.sms.service.LookupService;
import edu.sms.service.student.manage.StudentService;

/**
 * @author Kundan Suthar
 *
 */

@Controller
@RequestMapping("/StudentList")
public class StudentListController {
	
	private LookupService lookupService;
	private StudentService studentService;
	
	@RequestMapping(value = "studentList")
	public ModelAndView doList(HttpServletRequest request, HttpServletResponse response, @ModelAttribute StudentListForm studentListForm) {
		ModelAndView mav = new ModelAndView("studentList");
		mav.addObject("studentListForm",new StudentListForm());
		return mav;
	}
	
	@RequestMapping(value = "studentSearch")
	public @ResponseBody List doSearch(HttpServletRequest request, HttpServletResponse response, @ModelAttribute StudentListForm studentListForm) {
		studentListForm.setSchoolId(getId(request, "schoolId"));
		studentListForm.setSession(getString(request, "session"));
		studentListForm.setClasses(getString(request, "classes"));
		studentListForm.setSection(getString(request, "section"));
		studentListForm.setStatus(getString(request, "status"));
		studentListForm.setGender(getString(request, "gender"));
		studentListForm.setHouse(getString(request, "house"));
		studentListForm.setReservationCategory(getString(request, "reservationCategory"));
		studentListForm.setFeeCategory(getString(request, "feeCategory"));
		studentListForm.setName(getString(request, "studentName"));
		return studentService.listByForeignId(studentListForm);
	}
	
	private Long getId(HttpServletRequest request, String param) {
		return StringUtils.isNotEmpty(request.getParameter(param)) ? Long.valueOf(request.getParameter(param)) : 0;
	}
	
	private String getString(HttpServletRequest request, String param) {
		return StringUtils.isNotEmpty(request.getParameter(param)) ? String.valueOf(request.getParameter(param)) : StringUtils.EMPTY;
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
