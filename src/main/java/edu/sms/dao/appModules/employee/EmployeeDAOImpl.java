package edu.sms.dao.appModules.employee;




import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.type.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import edu.sms.entity.appModules.RoleEntity;
import edu.sms.entity.appModules.ShiroSequence;
import edu.sms.entity.employee.CommonEmployeeEntity;
import edu.sms.entity.employee.EmpDesignationEntity;
import edu.sms.entity.employee.EmployeeEntity;
import edu.sms.entity.employee.UserEntityMapping;
import edu.sms.model.EmployeeFrm;
import edu.sms.util.HibernateQueryBuilder;


@Repository
public class EmployeeDAOImpl  extends HibernateDaoSupport implements  EmployeeDAO {

	@Autowired
	public void setSession(SessionFactory sessionFactory) {
		this.setSessionFactory(sessionFactory);
	}
	public List<EmpDesignationEntity> loadAll(Map<String,String> paramVal) {
			String queryParam=StringUtils.EMPTY;
			Map<String, Object> paramValues = new HashMap<String, Object>();
			
			if(null!=paramVal.get("userName")){
				queryParam=queryParam  + " and s.name=:userName ";
				paramValues.put("userName", (String)paramVal.get("userName"));
			}
			
			if(null!=paramVal.get("moduleId")){
				queryParam=queryParam + " and msp.moduleId=:moduleId";
				paramValues.put("moduleId", (String)paramVal.get("moduleId"));
			}
			
			if(null!=paramVal.get("menuId")){
				queryParam=queryParam  + " and msp.subModId=:menuId";
				paramValues.put("menuId", (String)paramVal.get("menuId"));
			}
			
			
			
			if(null!=paramVal.get("roleId")){
				queryParam=queryParam  + " and sr.rId=:roleId";
				paramValues.put("roleId", Integer.valueOf(paramVal.get("roleId").toString()));
				
			}
			
			StringBuilder sql = new StringBuilder(
					"SELECT  m.emp_desig_id as empDesigId, m.Desig_Name as desig_Name,sr.name as  Emp_type,"
					+ "      m.Staff_type as Staff_type, m.Priority as Priority,m.Description as Description"
					+ " from  empdesignation m,shiro_role sr "
					+ "	where m.emp_type=sr.rId " + queryParam);
					
					
			Map<String, Type> resultSetMapping = new HashMap<String, Type>();
			resultSetMapping.put("empDesigId", Hibernate.INTEGER);
			resultSetMapping.put("desig_Name", Hibernate.STRING);
			resultSetMapping.put("Emp_type", Hibernate.STRING);
			resultSetMapping.put("Staff_type", Hibernate.STRING);
			resultSetMapping.put("Priority", Hibernate.STRING);
			resultSetMapping.put("Description", Hibernate.STRING);
			
				
			

			SQLQuery query = getHibernateTemplate().getSessionFactory()
					.openSession().createSQLQuery(sql.toString());
			HibernateQueryBuilder
					.applyParamsAndResultSetMappingForTargetClassToSQLQuery(query,
							resultSetMapping, paramValues,
							EmpDesignationEntity.class);
			return query.list();
		
	}

	public EmpDesignationEntity get(Integer paramVal) {
		return getHibernateTemplate().get(EmpDesignationEntity.class,paramVal);
		 
	}

	public List<CommonEmployeeEntity> loadAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CommonEmployeeEntity> loadAll(String editVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map loadEditModule(String editVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(CommonEmployeeEntity domain) {
		// TODO Auto-generated method stub
		
	}

	public void saveList(List<CommonEmployeeEntity> domainList) {
		// TODO Auto-generated method stub
		
	}

	public void update(CommonEmployeeEntity domain) {
		// TODO Auto-generated method stub
		
	}

	public void delete(CommonEmployeeEntity domain) {
		// TODO Auto-generated method stub
		
	}

	public CommonEmployeeEntity get(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletUserType(String userType) {
		// TODO Auto-generated method stub
		
	}

	public List<CommonEmployeeEntity> getListByCriteria(
			DetachedCriteria detachedCriteria) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CommonEmployeeEntity> getListByCriteria(
			DetachedCriteria detachedCriteria, int offset, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EmployeeEntity> loadEmployeeList(Map<String,String> paramVal) {
		/*String queryParam=StringUtils.EMPTY;
		Map<String, Object> paramValues = new HashMap<String, Object>();
		
		if(null!=paramVal.get("userName")){
			queryParam=queryParam  + " and s.name=:userName ";
			paramValues.put("userName", (String)paramVal.get("userName"));
		}
		
		if(null!=paramVal.get("moduleId")){
			queryParam=queryParam + " and m.moduleId=:moduleId";
			paramValues.put("moduleId", (String)paramVal.get("moduleId"));
		}
		
		if(null!=paramVal.get("menuId")){
			queryParam=queryParam  + " and m.subModId=:menuId";
			paramValues.put("menuId", (String)paramVal.get("menuId"));
		}
		
		StringBuilder sql = new StringBuilder(
				"SELECT  m.emp_desig_id as empDesigId, m.Desig_Name as desig_Name,sr.name as  Emp_type,"
				+ "      m.Staff_type as Staff_type, m.Priority as Priority,m.Description as Description"
				+ " from  empdesignation m,shiro_role sr	where sr.rId=m.Emp_type"+ queryParam);
				
				
		Map<String, Type> resultSetMapping = new HashMap<String, Type>();
		resultSetMapping.put("empDesigId", Hibernate.INTEGER);
		resultSetMapping.put("desig_Name", Hibernate.STRING);
		resultSetMapping.put("Emp_type", Hibernate.STRING);
		resultSetMapping.put("Staff_type", Hibernate.STRING);
		resultSetMapping.put("Priority", Hibernate.STRING);
		resultSetMapping.put("Description", Hibernate.STRING);
		
			
		

		SQLQuery query = getHibernateTemplate().getSessionFactory()
				.openSession().createSQLQuery(sql.toString());
		HibernateQueryBuilder
				.applyParamsAndResultSetMappingForTargetClassToSQLQuery(query,
						resultSetMapping, paramValues,
						EmpDesignationEntity.class);
		return query.list();*/
	  return getHibernateTemplate().loadAll(EmployeeEntity.class);
    }


	public void saveEmployeeDesignation(EmpDesignationEntity empDesEntity) {
		getHibernateTemplate().saveOrUpdate(empDesEntity);
		
	}
	
	public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
		 Integer id = null;
		try{
		   getHibernateTemplate().saveOrUpdate(employeeEntity);
		   // id =  employeeEntity.getEmpId();
		}catch(HibernateException e){
			Logger.getLogger("EmployeeDAOImpl").info("This is the error in Hibernate saveEmployee");
		}
		 return employeeEntity;
	}
	
	
	public void delete(EmpDesignationEntity empDesEntity) {
		getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery("Delete from empdesignation where emp_desig_id =:empdesigid").setInteger("empdesigid", empDesEntity.getEmpDesigId()).executeUpdate();
		
	}
	public EmployeeEntity loadEmployee(Integer employeeId) {
		return getHibernateTemplate().load(EmployeeEntity.class, employeeId);
	}
	
	public void setEmpPasswordMapping(String userid,String userType,Integer empId) {
		UserEntityMapping uerEntityMapping = new UserEntityMapping();
		uerEntityMapping.setEntityId(empId);
		uerEntityMapping.setUserId(userid);
		uerEntityMapping.setEntityType(userType);
		getHibernateTemplate().saveOrUpdate(uerEntityMapping);
		
	}
	
	
	public void deleteEmp(EmployeeEntity employeeEntity) {
		getHibernateTemplate().delete(employeeEntity);
	}
	
	
	public String getUserNames() {
		StringBuilder sql = new StringBuilder("SELECT  s.seq_name seqName,LAST_INSERT_ID(s.`seq_count`+1) seqCount "
				+ " FROM shiro_sequence s where s.seq_name='shiro_role_seq'");
				
				
		Map<String, Type> resultSetMapping = new HashMap<String, Type>();
		resultSetMapping.put("seqName", Hibernate.STRING);
		resultSetMapping.put("seqCount", Hibernate.BIG_DECIMAL);
				
		

		SQLQuery query = getHibernateTemplate().getSessionFactory()
				.openSession().createSQLQuery(sql.toString());
		HibernateQueryBuilder
				.applyParamsAndResultSetMappingForTargetClassToSQLQuery(query,
						resultSetMapping, null,
						ShiroSequence.class);
		ShiroSequence shiroSequence=(ShiroSequence)query.list().get(0);
		
		getHibernateTemplate().getSessionFactory().getCurrentSession().
		createSQLQuery("UPDATE shiro_sequence SET seq_count=seq_count+1	where seq_name='shiro_role_seq'").executeUpdate();
		
		
		return shiroSequence.getSeqCount().toString();
		
	}

	
}
