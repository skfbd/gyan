package edu.sms.dao.appModules;



import java.util.List;
import java.util.Map;

import edu.sms.dao.genric.IDaoBase;
import edu.sms.entity.appModules.RoleEntity;


public interface RoleListDAO extends IDaoBase<RoleEntity>{
	public void deleteRole(String userTypeId);
	public Integer saveRole(RoleEntity roleEntity);
	public List<RoleEntity> loadRoleList();
	public List<RoleEntity> getUserTypeSearchList(Map searchLst);
}
 