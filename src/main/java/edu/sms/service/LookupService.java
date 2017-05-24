package edu.sms.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import edu.sms.model.SearchForm;


public interface LookupService {
	public List lookup(String lookupType, Integer id) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException;

	public List<?> search(SearchForm searchform);
}
