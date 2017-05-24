package edu.sms.dao.genric;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.type.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.sms.entity.AcademicSessionEntity;
import edu.sms.entity.ClassEntity;
import edu.sms.entity.SchoolEntity;
import edu.sms.entity.SchoolOrgGlobalConfigEntity;
import edu.sms.entity.SchoolSchglobalconfigMapping;
import edu.sms.entity.SectionEntity;
import edu.sms.entity.appModules.RoleEntity;
import edu.sms.entity.appModules.ShiroUserRole;
import edu.sms.entity.organization.OrganizationEntity;
import edu.sms.util.HibernateQueryBuilder;
public abstract class DaoBase<T> extends HibernateDaoSupport implements IDaoBase<T> {
	private Class<T> entityClass;

	@Autowired
	public void setSession(SessionFactory sessionFactory) {
		this.setSessionFactory(sessionFactory);
	}

	public DaoBase() {
		entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public List<T> loadAll() {
		return getHibernateTemplate().loadAll(entityClass);
	}

	public  List<T> loadAll(Integer editVal) {
		return  (List<T>) getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from edu.sms.entity.appModules.ModSubPerMissionEntity  where userTypeId="+editVal).list();
	}
	
	public  List<T> loadAll(String editVal) {
		return  (List<T>) getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from edu.sms.entity.appModules.ModSubPerMissionEntity  where userTypeId="+editVal).list();
	}
	
	
	
	public Map loadEditModule(String editVal) {
		Map roleAndsubMod= new HashMap();
		roleAndsubMod.put("ModSubPerMissionEntity", (List<T>) getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from edu.sms.entity.appModules.ModSubPerMissionEntity  where userTypeId="+editVal).list());
		roleAndsubMod.put("Role",(RoleEntity) getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from edu.sms.entity.appModules.RoleEntity  where rId="+editVal).uniqueResult());
	    return roleAndsubMod;
	}
		
	public void delete(T domain) {
		getHibernateTemplate().delete(domain);
	}

	public void save(T domain) {
		getHibernateTemplate().saveOrUpdate(domain);

	}
	
	public Integer saveRole(T domain){
		getHibernateTemplate().saveOrUpdate(domain);
		Integer id =  ((RoleEntity) domain).getrId();
	    return id;
	}
	
	public List<T> loadRoleList(){
		return getHibernateTemplate().loadAll(entityClass);
	}
	
	public void saveList(List<T> domainList) {
		getHibernateTemplate().saveOrUpdateAll(domainList);

	}
	
	public void deletUserType(String usertype) {
		getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery("Delete from mod_submod_permission where userTypeId =:usertype").setString("usertype", usertype).executeUpdate();
	}
	
		
	public void update(T domain) {
		getHibernateTemplate().merge(domain);
	}

	public T get(Serializable id) {
		T o = (T) getHibernateTemplate().get(entityClass, id);
		return o;
	}

	
	
	public List<T> getListByCriteria(DetachedCriteria detachedCriteria, int offset, int size) {
		return getHibernateTemplate().findByCriteria(detachedCriteria, offset, size);
	}

	public List<T> getListByCriteria(DetachedCriteria detachedCriteria) {
		return getHibernateTemplate().findByCriteria(detachedCriteria);
	}
	
	
	//Added by Amit Rawal for the permission for opertation
	
	public void saveListRolePer(List<T> domainList) {
		getHibernateTemplate().saveOrUpdateAll(domainList);
	}

	public List<T> loadRolePer() {
		return getHibernateTemplate().loadAll(entityClass);
	}

	public void deletRolePer(String usertype) {
		getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery("Delete from shiro_role_permission where role_id =:usertype").setString("usertype", usertype).executeUpdate();
		
	}

	
	public void deleteRole(String usertype) {
		getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery("Delete from shiro_role where rId =:usertype").setString("usertype", usertype).executeUpdate();
		
	}
	//search list 
	public List<RoleEntity> getUserTypeSearchList(Map searchLst) {
		String queryParam=StringUtils.EMPTY;
		Map<String, Object> paramValues = new HashMap<String, Object>();
		
		
		
	
		if(null!=searchLst.get("userName")){
			queryParam=queryParam  + " and s.name=:userName ";
			paramValues.put("userName", (String)searchLst.get("userName"));
		}
		
		if(null!=searchLst.get("moduleId")){
			queryParam=queryParam + " and m.moduleId=:moduleId";
			paramValues.put("moduleId", (String)searchLst.get("moduleId"));
		}
		
		if(null!=searchLst.get("menuId")){
			queryParam=queryParam  + " and m.subModId=:menuId";
			paramValues.put("menuId", (String)searchLst.get("menuId"));
		}
		
		StringBuilder sql = new StringBuilder(
				"SELECT distinct name as perName,description as roleDesc , s.rId as rId  from  mod_submod_permission m,shiro_role s "
				+ " where s.rid=m.userTypeId " + queryParam);
				
		
		Map<String, Type> resultSetMapping = new HashMap<String, Type>();
		resultSetMapping.put("perName", Hibernate.STRING);
		resultSetMapping.put("roleDesc", Hibernate.STRING);
		resultSetMapping.put("rId", Hibernate.INTEGER);
		
			
		

		SQLQuery query = getHibernateTemplate().getSessionFactory()
				.openSession().createSQLQuery(sql.toString());
		HibernateQueryBuilder
				.applyParamsAndResultSetMappingForTargetClassToSQLQuery(query,
						resultSetMapping, paramValues,
						RoleEntity.class);
		return query.list();
	}
	
	
	public OrganizationEntity saveUpdateOrg(OrganizationEntity organizationEntity) {
		getHibernateTemplate().saveOrUpdate(organizationEntity);
		return organizationEntity;
	}
	
	public AcademicSessionEntity saveAcademicSession(AcademicSessionEntity academicSessionEntity) {
		getHibernateTemplate().saveOrUpdate(academicSessionEntity);
		return academicSessionEntity;
	}
	
	public ClassEntity saveClass(ClassEntity classEntity) {
		getHibernateTemplate().saveOrUpdate(classEntity);
		return classEntity;
	}
	
	
	public SectionEntity saveSection(SectionEntity sectionEntity) {
		getHibernateTemplate().saveOrUpdate(sectionEntity);
		return sectionEntity;
	}
	
	public void saveUser(ShiroUserRole shiroUserRole){
		getHibernateTemplate().saveOrUpdate(shiroUserRole);
	}
	
	
	
	
	public SchoolEntity saveUpdateSchool(SchoolEntity schoolEntity) {
		getHibernateTemplate().saveOrUpdate(schoolEntity);
		SchoolOrgGlobalConfigEntity schoolOrgGlobalConfigEntity=new SchoolOrgGlobalConfigEntity();
		schoolOrgGlobalConfigEntity.setSchoolId(schoolEntity.getSchoolId());
		getHibernateTemplate().save(schoolOrgGlobalConfigEntity);
		SchoolSchglobalconfigMapping schoolSchglobalconfigMapping = new SchoolSchglobalconfigMapping();
		schoolSchglobalconfigMapping.setSchoolGlobalConfig(schoolOrgGlobalConfigEntity.getId());
		schoolSchglobalconfigMapping.setSchoolId(schoolEntity.getSchoolId());
		getHibernateTemplate().save(schoolSchglobalconfigMapping);
		return schoolEntity;
	}
	
}