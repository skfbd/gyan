package edu.sms.organization;

import java.util.List;
import java.util.Map;

import edu.sms.entity.appModules.ModSubPerMissionEntity;
import edu.sms.entity.appModules.ModulesEntity;
import edu.sms.entity.appModules.RoleEntity;
import edu.sms.entity.organization.OrganizationEntity;
import edu.sms.model.ModuleListForm;
import edu.sms.model.OrganizationForm;
import edu.sms.model.RoleFrm;

public interface OrgService {

	public OrganizationForm saveOrg(OrganizationForm organizationForm);

	public List getOrgList();

	public OrganizationEntity getOrganization(Long Id);
	
	public void deleteOrg(OrganizationForm organizationForm);

	public List<ModulesEntity> getModuleList();
	
		
	public void saveModule(ModuleListForm moduleListForm);

    public List<ModSubPerMissionEntity> loadEditModule(Integer userTypeId);
    
    public Map loadEditModule(String userid);
    
    
    public List<RoleEntity> loadEditRole(ModuleListForm moduleListForm);
    
    public void deleteEmployeeType(String employtypeId);
    
    public List<RoleFrm> getUserTypeSearchList(Map searchList);
}
