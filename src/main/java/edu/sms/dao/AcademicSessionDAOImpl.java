package edu.sms.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.type.Type;

import edu.sms.dao.genric.DaoBase;
import edu.sms.entity.AcademicSessionEntity;
import edu.sms.entity.appModules.RoleEntity;
import edu.sms.model.AcademicSessionForm;
import edu.sms.util.HibernateQueryBuilder;

public class AcademicSessionDAOImpl extends DaoBase<AcademicSessionEntity> implements AcademicSessionDAO {

	
	//search list 
		public List<AcademicSessionForm> getAcademicSession() {
			StringBuilder sql = new StringBuilder(
					" SELECT a.id id,a.session session,a.school_id schoolId,s.school_name schoolName,CONCAT(s.school_id,'-',s.school_name) schoolIdName " +
					",a.session_start_date sessionStartDate,a.session_end_date sessionEndDate , a.startyear startYear,a.endyear endYear,a.subject_wise_attendance subjectWiseAttendance , "+
					" a.fee_start_month feeStartMonth ,a.prospectus_string prospectusString,a.notapplicable notApplicable   FROM academic_session a RIGHT OUTER JOIN school s " +
				    " ON a.school_id=s.school_id ");
					
			
			Map<String, Type> resultSetMapping = new HashMap<String, Type>();
			resultSetMapping.put("id", Hibernate.LONG);
			//resultSetMapping.put("name", Hibernate.STRING);
			resultSetMapping.put("schoolId", Hibernate.LONG);
			resultSetMapping.put("schoolName",Hibernate.STRING);
			resultSetMapping.put("schoolIdName",Hibernate.STRING);
			resultSetMapping.put("session",Hibernate.STRING);
			resultSetMapping.put("startYear",Hibernate.STRING);
			resultSetMapping.put("endYear",Hibernate.STRING);
			resultSetMapping.put("sessionStartDate",Hibernate.STRING);
			resultSetMapping.put("sessionEndDate",Hibernate.STRING);
			resultSetMapping.put("subjectWiseAttendance",Hibernate.STRING);
			resultSetMapping.put("feeStartMonth",Hibernate.STRING);
			resultSetMapping.put("prospectusString",Hibernate.STRING);
			resultSetMapping.put("notApplicable",Hibernate.BOOLEAN);
				
			

			SQLQuery query = getHibernateTemplate().getSessionFactory()
					.openSession().createSQLQuery(sql.toString());
			HibernateQueryBuilder
					.applyParamsAndResultSetMappingForTargetClassToSQLQuery(query,
							resultSetMapping, null,
							AcademicSessionForm.class);
			return query.list();
		}
		
	
	
	
}
