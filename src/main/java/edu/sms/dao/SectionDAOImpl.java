package edu.sms.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.type.Type;

import edu.sms.dao.genric.DaoBase;
import edu.sms.entity.SectionEntity;
import edu.sms.model.SectionForm;
import edu.sms.util.HibernateQueryBuilder;

public class SectionDAOImpl extends DaoBase<SectionEntity> implements SectionDAO {
	//search list 
	public List<SectionForm> getSectionList() {
		StringBuilder sql = new StringBuilder(
				" SELECT sc.id id,sc.school_id schoolId,s.school_name schoolName,"
				+ " CONCAT(s.school_id,'-',s.school_name) schoolIdName,sc.name name,"
				+ " sc.description description   FROM section sc "
				+ " RIGHT OUTER JOIN school s ON sc.school_id=s.school_id");
		
		Map<String, Type> resultSetMapping = new HashMap<String, Type>();
		resultSetMapping.put("id", Hibernate.LONG);
		resultSetMapping.put("schoolId", Hibernate.LONG);
		resultSetMapping.put("schoolName",Hibernate.STRING);
		resultSetMapping.put("schoolIdName",Hibernate.STRING);
		resultSetMapping.put("name", Hibernate.STRING);
		resultSetMapping.put("description",Hibernate.STRING);
						

		SQLQuery query = getHibernateTemplate().getSessionFactory()
				.openSession().createSQLQuery(sql.toString());
		HibernateQueryBuilder
				.applyParamsAndResultSetMappingForTargetClassToSQLQuery(query,
						resultSetMapping, null,
						SectionForm.class);
		return query.list();
	}

		
}
