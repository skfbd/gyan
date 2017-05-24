package edu.sms.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.type.Type;
import org.springframework.stereotype.Repository;

import edu.sms.dao.genric.DaoBase;
import edu.sms.entity.ClassEntity;
import edu.sms.model.AcademicSessionForm;
import edu.sms.model.ClassForm;
import edu.sms.util.HibernateQueryBuilder;

@Repository
public class ClassDAOImpl extends DaoBase<ClassEntity> implements ClassDAO {

	//search list 
			public List<ClassForm> getClassList() {
				StringBuilder sql = new StringBuilder(
						" SELECT c.id id,c.school_id schoolId,s.school_name schoolName,"
						+ " CONCAT(s.school_id,'-',s.school_name) schoolIdName,c.name name,"
						+ " c.priority priority,c.description description   FROM class c RIGHT OUTER JOIN school s"
						+ " ON c.school_id=s.school_id");
				
				Map<String, Type> resultSetMapping = new HashMap<String, Type>();
				resultSetMapping.put("id", Hibernate.LONG);
				resultSetMapping.put("schoolId", Hibernate.LONG);
				resultSetMapping.put("schoolName",Hibernate.STRING);
				resultSetMapping.put("schoolIdName",Hibernate.STRING);
				resultSetMapping.put("name", Hibernate.STRING);
				resultSetMapping.put("priority",Hibernate.LONG);
				resultSetMapping.put("description",Hibernate.STRING);
								

				SQLQuery query = getHibernateTemplate().getSessionFactory()
						.openSession().createSQLQuery(sql.toString());
				HibernateQueryBuilder
						.applyParamsAndResultSetMappingForTargetClassToSQLQuery(query,
								resultSetMapping, null,
								ClassForm.class);
				return query.list();
			}
			
		

}			