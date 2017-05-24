package edu.sms.dao.genric;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.criterion.DetachedCriteria;

import edu.sms.entity.SchoolEntity;
import edu.sms.entity.appModules.RoleEntity;
import edu.sms.entity.organization.OrganizationEntity;



	/**
	 * Base interface for CRUD operations and common queries
	 */
	public interface IDaoBase<T> {
	     
	    public List<T> loadAll();
	     
	    public List<T> loadAll(String editVal);
	    
	    public List<T> loadAll(Integer editVal);
	    
	    public Map loadEditModule(String editVal);
	    
	    public void save(T domain);
	         
	    public void saveList(List<T> domainList);
	    
	    public void update(T domain);
	         
	    public void delete(T domain);
	     
	    public T get(Serializable id);
	      
	    public void deletUserType(String userType);
	    
	    /**
	     * Get list by criteria
	     * @param detachedCriteria the domain query criteria, include condition and the orders.
	     * @return
	     *
	     */
	    public List<T> getListByCriteria(DetachedCriteria detachedCriteria);
	     
	    public List<T> getListByCriteria(DetachedCriteria detachedCriteria, int offset, int size);   
	
	    public void saveListRolePer(List<T> domain);

		public List<T> loadRolePer();

		public void deletRolePer(String roleper);

		//this is for role
		public Integer saveRole(T domain);
		public List<T> loadRoleList();
		public void deleteRole(String userTypeId);
		public List<RoleEntity> getUserTypeSearchList(Map searchLst);

		public  OrganizationEntity saveUpdateOrg(OrganizationEntity OrganizationEntity);
		public  SchoolEntity saveUpdateSchool(SchoolEntity SchoolEntity);
	}

