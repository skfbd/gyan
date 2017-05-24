package edu.sms.service;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.WordUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import edu.sms.constants.Constant;
import edu.sms.dao.LookupDAO;
import edu.sms.model.SearchForm;

public class LookupServiceImpl implements LookupService {

	private LookupDAO lookupDAO;
	
	public List<?> search(SearchForm searchform){
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List lookup(String lookupType, Integer id) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		List list = Arrays.asList("Error fetching");
		Class<?> clazz = getClass(lookupType);
		if (clazz != null) {
			DetachedCriteria detachedCriteria = DetachedCriteria.forClass(clazz);
			if (id != 0) {
				detachedCriteria.add(Restrictions.eq("parentId", id)).addOrder(Order.asc("name"));
			}
			list = lookupDAO.getListByCriteria(detachedCriteria);
			Constructor<?> cons = clazz.getConstructor(Integer.class, String.class);
			//list.add(0, cons.newInstance(0, "Select"));
		}
		return list;
	}
	
	/**
	 * @param lookupType
	 * @return Entity class containing the drop-down values. 
	 * Put an entry to Constant.ENTITY_PACKAGES for the package containing required entity.
	 * Additionally LookupType enum can also be used to get some liberty from using entity name to fetch drop-down values. However that needs to be done
	 * .
	 */
	private Class getClass(String lookupType) {
		String dot = ".";
		Class clazz = null;
		for (Iterator iterator = Constant.ENTITY_PACKAGES.iterator(); iterator.hasNext();) {
			String packageName = (String) iterator.next();
			try {
				clazz = Class.forName(packageName + dot + WordUtils.capitalize(lookupType));
				break;
			} catch (ClassNotFoundException e) {
				continue;
			}
		}
		return clazz;
	}


	public LookupDAO getLookupDAO() {
		return lookupDAO;
	}

	public void setLookupDAO(LookupDAO lookupDAO) {
		this.lookupDAO = lookupDAO;
	}

}
