package edu.sms.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.Type;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;


public class HibernateQueryBuilder {

	/**
	 * @param query , SQLQuery with alias(es)
	 * @param resultSetMapping , map with names and Hibernate Type
	 * @param paramValues , map with param names and values
	 * @description The function applies the custom mapping of the columns to the fields/properties of the non-entity class. 
	 * This can be useful where we dont have managed entities. The function also adds the required named parameters to the query.  
	 */
	public static void applyParamsAndResultSetMappingForTargetClassToSQLQuery(SQLQuery query, Map<String, Type> resultSetMapping,
			Map<String, Object> paramValues,Class targetClass) {
		Assert.notNull(query, "Query cannot be null");		
		
		if (!CollectionUtils.isEmpty(resultSetMapping)) {
			for (Entry<String, Type> mapping : resultSetMapping.entrySet()) {
				if(null!=mapping.getValue()){
					query.addScalar(mapping.getKey(), mapping.getValue());
				}else{
					query.addScalar(mapping.getKey());	//Let Hibernate auto detect the type
				}
			}
		}

		if (!CollectionUtils.isEmpty(paramValues)) {
			for (Entry<String, Object> paramValuePair : paramValues.entrySet()) {
				Object value = paramValuePair.getValue();
				if (null != value) {
					if (value.getClass().equals(int.class) || value.getClass().equals(Integer.class)) {
						query.setInteger(paramValuePair.getKey(), (Integer) value);
					}
					if (value.getClass().equals(long.class) || value.getClass().equals(Long.class)) {
						query.setLong(paramValuePair.getKey(), (Long) value);
					}
					if (value.getClass().equals(String.class)) {
						query.setString(paramValuePair.getKey(), (String) value);
					}
					if (value.getClass().equals(Date.class)) {
						query.setDate(paramValuePair.getKey(), (Date) value);
					}
					if (value.getClass().equals(Double.class) || value.getClass().equals(double.class)) {
						query.setDouble(paramValuePair.getKey(), (Double) value);
					}
					if (value.getClass().equals(ArrayList.class) ) {  
	                 query.setParameterList(paramValuePair.getKey(), (ArrayList)value);
	              }

				} else {
					query.setParameter(paramValuePair.getKey(), value);
				}
			}
		}
		//May not be required for primitive types. Hibernate should auto detect
		if(null!=targetClass){
			query.setResultTransformer(Transformers.aliasToBean(targetClass));
		}
	}

}
