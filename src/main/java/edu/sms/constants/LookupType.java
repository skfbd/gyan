package edu.sms.constants;

import edu.sms.model.OrganizationForm;

public enum LookupType {

	organizations(OrganizationForm.class), schools(OrganizationForm.class);

	// private final Class lookupType;

	/*
	 * LookupType(Class lookupType) { this.lookupType = lookupType; }
	 */

	/*
	 * private static Map<Class, LookupType> map = new HashMap<Class,
	 * LookupType>();
	 * 
	 * static { for (LookupType lookupEnum : LookupType.values()) {
	 * map.put(lookupEnum.lookupType, lookupEnum); } }
	 * 
	 * public static Class find(Integer lookupType) { return null !=
	 * map.get(lookupType) ? map.get(lookupType).toString() : "Select"; }
	 * 
	 * public static Class find(String lookupType) { return
	 * NumberUtils.isNumber(lookupType) && null !=
	 * map.get(Integer.valueOf(lookupType)) ?
	 * map.get(Integer.valueOf(lookupType)).toString() : "Select"; }
	 */

	private Class classAttribute;

	LookupType(Class classAttribute) {
		this.classAttribute = classAttribute;
	}

	public Class getInstance() throws InstantiationException, IllegalAccessException {
		Class instance = (Class) classAttribute.newInstance();
		return instance;
	}

}