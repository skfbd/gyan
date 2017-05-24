package edu.sms.dao;

import java.util.List;

import edu.sms.dao.genric.IDaoBase;
import edu.sms.entity.ClassEntity;
import edu.sms.entity.SchoolEntity;
import edu.sms.model.AcademicSessionForm;
import edu.sms.model.ClassForm;

public interface ClassDAO extends IDaoBase<ClassEntity>{
	public List<ClassForm> getClassList();
	public ClassEntity saveClass(ClassEntity classEntity);
   
}
