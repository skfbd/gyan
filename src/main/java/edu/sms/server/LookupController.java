package edu.sms.server;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import edu.sms.model.SearchForm;
import edu.sms.service.ClassService;
import edu.sms.service.LookupService;

@Controller
@RequestMapping("/lookup")
public class LookupController {

	private LookupService lookupService;
	private ClassService classService;

	@RequestMapping("classes")
	public ModelAndView search(/*@PathVariable String searchParam, */HttpServletRequest request, HttpServletResponse response, @ModelAttribute SearchForm searchform) {
		ModelAndView mav = null;
		//if (searchParam == "classes") {
			mav = new ModelAndView("classList");
			mav.addObject("urlClassList",classService.list(searchform.getClassForm()));
		//}
		mav.addObject("searchform", searchform);
		return mav;
	}

	/**	
	 * lookupType should be the exact Entity name, which is expected to be
	 * populated with values.
	 */
	@RequestMapping("/{lookupType}")
	public @ResponseBody List<?> lookup(@PathVariable String lookupType, HttpServletRequest request, HttpServletResponse response) throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return lookupService.lookup(lookupType.toString(), getId(request, "parentId"));
	}

	private Integer getId(HttpServletRequest request, String param) {
		return StringUtils.isNotEmpty(request.getParameter(param)) ? Integer.valueOf(request.getParameter(param)) : 0;
	}

	public void setClassService(ClassService classService) {
		this.classService = classService;
	}

	public void setLookupService(LookupService lookupService) {
		this.lookupService = lookupService;
	}
}