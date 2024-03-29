package edu.sms.server;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(("/Admission"))
public class AdmissionController {

	/*@Autowired(required = true)
	private AdmissionService admissionService;*/

	@RequestMapping(value = "prospectusConfiguration")
	public ModelAndView getProspectusConfiguration(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("prospectusConfiguration");
		return mav;
	}

	@RequestMapping(value = "admissionRelatedStudentDocument")
	public ModelAndView getAdmissionRelatedStudentDocument(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("admissionRelatedStudentDocument");
		return mav;
	}

	@RequestMapping(value = "admissionStagesConfiguration")
	public ModelAndView getAdmissionStagesConfiguration(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("admissionStagesConfiguration");
		return mav;
	}

}
