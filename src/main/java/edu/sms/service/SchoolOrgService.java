package edu.sms.service;

import java.util.List;

import edu.sms.entity.SchoolOrgGlobalConfigEntity;
import edu.sms.model.SchoolOrgGlobalConfigForm;

public interface SchoolOrgService extends CRUDInjectService<SchoolOrgGlobalConfigEntity, SchoolOrgGlobalConfigForm>{
	public List<SchoolOrgGlobalConfigForm> listSchoolOrgGlobal(SchoolOrgGlobalConfigForm form);
	public SchoolOrgGlobalConfigForm getSchoolOrgGlobal(SchoolOrgGlobalConfigForm form);
	public String updateGlobalConfig(SchoolOrgGlobalConfigForm form);
}
