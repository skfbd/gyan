package edu.sms.dao.appModules;




import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.type.Type;
import org.springframework.stereotype.Repository;

import edu.sms.dao.genric.DaoBase;
import edu.sms.entity.appModules.ModSubPerMissionEntity;
import edu.sms.entity.appModules.RolePermissionEntity;
import edu.sms.entity.appModules.ShiroUserRole;
import edu.sms.entity.appModules.ShiroUserRolePK;
import edu.sms.entity.employee.EmpDesignationEntity;
import edu.sms.util.HibernateQueryBuilder;


@Repository
public class PerRoleListDAOImpl  extends DaoBase<RolePermissionEntity> implements  PerRoleListDAO {

	/*public void saveListRolePer(List<RolePermissionEntity> modSubPerList) {
		// TODO Auto-generated method stub
		
	}

	public List<RolePermissionEntity> loadRolePer() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletRolePer(String userType) {
		// TODO Auto-generated method stub
		
	}
*/

	public Integer getUserTypeId(String username){
		Map<String, Object> paramValues = new HashMap<String, Object>();
		String queryParam=StringUtils.EMPTY;
		
		
		
		if(null!=username){
			queryParam=queryParam  + " and s.userid=:userName ";
			paramValues.put("userName", username );
		}
		
		StringBuilder sql = new StringBuilder("SELECT sur.role_id roleId FROM shiro_user s,shiro_user_role sur"
				+ "	 where sur.user_id=s.id"+ queryParam);
				
				
		Map<String, Type> resultSetMapping = new HashMap<String, Type>();
		resultSetMapping.put("roleId", Hibernate.INTEGER);
			
			
		

		SQLQuery query = getHibernateTemplate().getSessionFactory()
				.openSession().createSQLQuery(sql.toString());
		HibernateQueryBuilder
				.applyParamsAndResultSetMappingForTargetClassToSQLQuery(query,
						resultSetMapping, paramValues,
						ShiroUserRolePK.class);
		Integer roleId=new Integer(((ShiroUserRolePK)query.list().get(0)).getRoleId());
		return roleId;
	}
	
	
	
}
