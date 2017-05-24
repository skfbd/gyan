package edu.sms.service.student.manage;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import edu.sms.model.student.manage.StudentListForm;
import edu.sms.model.student.manage.StudentMasterForm;

public interface StudentService {

	public void createStudent(StudentMasterForm studentMasterForm,HttpServletRequest request);
	public void updateStudent(StudentMasterForm studentMasterForm,HttpServletRequest request);
	public StudentMasterForm loadAll(long studentId);
	public List listByForeignId(StudentListForm studentListForm);
	
}
