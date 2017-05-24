package edu.sms.service;

import java.util.List;

import edu.sms.entity.ClassEntity;
import edu.sms.model.ClassForm;

public interface ClassService extends CRUDInjectService<ClassEntity, ClassForm>{
	public ClassForm saveClass(ClassForm form);
	public ClassForm getClass(ClassForm form);
	public List<ClassForm> list(ClassForm form);
}
