package edu.sms.organization;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;

import edu.sms.dao.appModules.ModSubPerListDAO;
import edu.sms.dao.appModules.ModuleListDAO;
import edu.sms.dao.appModules.PerRoleListDAO;
import edu.sms.dao.appModules.RoleListDAO;
import edu.sms.dao.organization.OrganizationDAO;
import edu.sms.entity.appModules.ModSubPerMissionEntity;
import edu.sms.entity.appModules.ModulesEntity;
import edu.sms.entity.appModules.RoleEntity;
import edu.sms.entity.appModules.RolePermissionEntity;
import edu.sms.entity.organization.OrganizationEntity;
import edu.sms.model.ModuleListForm;
import edu.sms.model.OrganizationForm;
import edu.sms.model.RoleFrm;

public class OrgServiceImpl implements OrgService {
	private static final Logger logger = LoggerFactory.getLogger(OrgServiceImpl.class);
	private OrganizationDAO    organizationDAO;
	private ModuleListDAO      moduleListDAO;
	private ModSubPerListDAO   modSubPerListDAO;
	private PerRoleListDAO     perRoleListDAO;
	private RoleListDAO        roleDAO;
	

	@Transactional
	public OrganizationForm saveOrg(OrganizationForm organizationForm) {
		OrganizationEntity orgEntity = new OrganizationEntity();
		BeanUtils.copyProperties(organizationForm, orgEntity);
		OrganizationEntity OrgEntity=organizationDAO.saveUpdateOrg(orgEntity);
		OrganizationForm OrgFrm = new OrganizationForm();
		BeanUtils.copyProperties(OrgEntity, OrgFrm);
		return OrgFrm;
	}

	@Transactional
	public List getOrgList() {
		OrganizationEntity orgEntity = new OrganizationEntity();
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(OrganizationEntity.class);
		List list = organizationDAO.getListByCriteria(detachedCriteria);
		return list;
	}
	
	
	@Transactional
	public OrganizationEntity getOrganization(Long id) {
		OrganizationEntity orgEntity = organizationDAO.get(id);
		return orgEntity;
	}
	
	

	@Transactional
	public void deleteOrg(OrganizationForm organizationForm) {
		OrganizationEntity orgEntity = new OrganizationEntity();
		BeanUtils.copyProperties(organizationForm, orgEntity);
		organizationDAO.delete(orgEntity);
	}

	
	@Transactional
	public List<ModulesEntity> getModuleList() {
		List<ModulesEntity> list = moduleListDAO.loadAll();
		return list;
	}
	
	
	@Transactional
	public List<ModulesEntity> getModuleList(String loadVal) {
		List<ModulesEntity> list = moduleListDAO.loadAll(loadVal);
		return list;
	}
	
	
	
	@Transactional
	public void saveModule(ModuleListForm moduleListForm) {
		List<ModSubPerMissionEntity> modSubPerList=new ArrayList<ModSubPerMissionEntity>();
		String permList=StringUtils.EMPTY;
		  //save userTypeRoleEntity
		   RoleEntity roleEntity = new RoleEntity();
		   roleEntity.setrId(moduleListForm.getUserTypeId());
		   roleEntity.setPerName(moduleListForm.getUserType());
		   roleEntity.setRoleDesc(moduleListForm.getUserDescription());
		   roleEntity.setRoleId("0");
		   Integer id= roleDAO.saveRole(roleEntity);
		
		
		
		for(String mainList:moduleListForm.getMainModules()){
			    boolean flag=false;
				for(String subModLst:moduleListForm.getSubModule()){
					String[] subtemp=subModLst.split("_");
					if(Integer.valueOf(subtemp[0]).intValue() == Integer.valueOf(mainList).intValue()){
						flag=true;
						for(String perModLst:moduleListForm.getPerModule()){
							String[] temp=perModLst.split("_");
							if(Integer.valueOf(temp[1]).intValue()==Integer.valueOf(subtemp[1]).intValue()
									&& Integer.valueOf(temp[2]).intValue()==Integer.valueOf(mainList).intValue()){
							 permList=permList+"-"+perModLst;
							}
						 }
				    
						ModSubPerMissionEntity modPerListEntity = new ModSubPerMissionEntity();
						modPerListEntity.setModVal(mainList);
						modPerListEntity.setSubMod(subtemp[1]);
						modPerListEntity.setPermiss(permList.replaceFirst("-", StringUtils.EMPTY));
						modPerListEntity.setUserTypeId(id.toString());
						modSubPerList.add(modPerListEntity);
						permList=StringUtils.EMPTY;
				    }
				}
			  if(!flag){
				    ModSubPerMissionEntity modPerListEntity = new ModSubPerMissionEntity();
					modPerListEntity.setModVal(mainList);
					modPerListEntity.setSubMod("nosubmodule");
					modPerListEntity.setPermiss("nopermission");
					modPerListEntity.setUserTypeId(id.toString());
					modSubPerList.add(modPerListEntity);  
			  }
				
		}
		
	   modSubPerListDAO.deletUserType(moduleListForm.getUserType());
	   modSubPerListDAO.saveList(modSubPerList);
		   
	  
	   //save details for role and each operation
	   modSubPerListDAO.deletRolePer(moduleListForm.getUserType());
	   List<RolePermissionEntity> rolePerm=new ArrayList<RolePermissionEntity>();
	  
	    for(String subModLst:moduleListForm.getSubModule()){
	    	String[] subtemp=subModLst.split("_");
	    	for(String perModLst:moduleListForm.getPerModule()){
				RolePermissionEntity roleEntiy =new RolePermissionEntity();
				String[] temp=perModLst.split("_");
				logger.info("Amit"+temp[0]+temp[1]+temp[2]);
				if(temp[1].equals(subtemp[1])){
				     roleEntiy.setRole(id.toString());
				     roleEntiy.setPerName(temp[3]+":"+temp[0]);      //code:opertion
				     rolePerm.add(roleEntiy);
				   }
				}
			}
	   
	   perRoleListDAO.saveListRolePer(rolePerm);
	
	}
	
	
	@Transactional
	public void deleteEmployeeType(String emptypeId) {
		roleDAO.deleteRole(emptypeId);
	    modSubPerListDAO.deletUserType(emptypeId);
	    modSubPerListDAO.deletRolePer(emptypeId);
	}
	
		
	@Transactional
	public List<ModSubPerMissionEntity> loadEditModule(Integer userTypeId) {
		List<ModSubPerMissionEntity> moduleLst = modSubPerListDAO.loadAll(userTypeId);
		return moduleLst;
	}
	
	
	@Transactional
    public Map loadEditModule(String loadVal) {
		Map moduleLst = modSubPerListDAO.loadEditModule(loadVal);
		return moduleLst;
	}

	
	@Transactional
	public List<RoleEntity> loadEditRole(ModuleListForm moduleListForm) {
		List<RoleEntity> moduleLst = roleDAO.loadRoleList();
		return moduleLst;
	}
	
	@Transactional
	public List<RoleFrm> getUserTypeSearchList(Map searchList) {
		List<RoleEntity> roleEntity = roleDAO.getUserTypeSearchList(searchList);
		List<RoleFrm> roleLst= new ArrayList<RoleFrm>();
		
		for(RoleEntity roleEtt:roleEntity){
		  RoleFrm roleFrm = new RoleFrm();
		  BeanUtils.copyProperties(roleEtt, roleFrm);
		  roleLst.add(roleFrm);
		}
		 
		return roleLst;
	}
	
	
	
	public ModSubPerListDAO getModSubPerListDAO() {
		return modSubPerListDAO;
	}

	public void setModSubPerListDAO(ModSubPerListDAO modSubPerListDAO) {
		this.modSubPerListDAO = modSubPerListDAO;
	}

	public OrganizationDAO getOrganizationDAO() {
		return organizationDAO;
	}

	public void setOrganizationDAO(OrganizationDAO OrganizationDAO) {
		this.organizationDAO = OrganizationDAO;
	}

	public ModuleListDAO getModuleListDAO() {
		return moduleListDAO;
	}

	public void setModuleListDAO(ModuleListDAO moduleListDAO) {
		this.moduleListDAO = moduleListDAO;
	}

	public PerRoleListDAO getPerRoleListDAO() {
		return perRoleListDAO;
	}

	public void setPerRoleListDAO(PerRoleListDAO perRoleListDAO) {
		this.perRoleListDAO = perRoleListDAO;
	}

	public RoleListDAO getRoleDAO() {
		return roleDAO;
	}

	public void setRoleDAO(RoleListDAO roleDAO) {
		this.roleDAO = roleDAO;
	}


	
	
	
	
}
