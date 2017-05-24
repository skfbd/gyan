package edu.sms.service;

import java.util.List;

import edu.sms.model.SchoolForm;

public interface SchoolService {

	public SchoolForm saveSchool(SchoolForm schoolForm);

	public List<SchoolForm> getSchoolList();

	public SchoolForm getSchool(Long schoolId);
	
	public void deleteSchool(SchoolForm schoolForm);

}
