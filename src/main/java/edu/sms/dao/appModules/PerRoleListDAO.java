package edu.sms.dao.appModules;



import java.util.List;

import edu.sms.dao.genric.IDaoBase;
import edu.sms.entity.appModules.ModSubPerMissionEntity;
import edu.sms.entity.appModules.RolePermissionEntity;
import edu.sms.entity.appModules.ShiroUserRole;


public interface PerRoleListDAO extends IDaoBase<RolePermissionEntity>{
	public void deletRolePer(String userType);
	public void saveListRolePer(List<RolePermissionEntity> modSubPerList);
	public List<RolePermissionEntity> loadRolePer();
	public void saveUser(ShiroUserRole shiroUserRole);
	public Integer getUserTypeId(String username);
}
 