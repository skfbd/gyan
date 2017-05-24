package edu.sms.dao.appModules;

import java.util.List;

import edu.sms.dao.genric.IDaoBase;
import edu.sms.entity.appModules.ModSubPerMissionEntity;
import edu.sms.entity.appModules.ModulesEntity;
import edu.sms.entity.organization.OrganizationEntity;

public interface ModuleListDAO extends IDaoBase<ModulesEntity>{
	public List<ModulesEntity> loadAll();
}
 