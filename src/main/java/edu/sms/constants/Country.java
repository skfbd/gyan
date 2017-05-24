package edu.sms.constants;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.math.NumberUtils;

public enum Country {

	India(1), Pakistan(2), Nepal(3), Bhutan(4), Bangladesh(5), Myanmar(6), Srilanka(7);

	private final int countryId;
	
	Country(int countryId) {
		this.countryId = countryId;
	}
	
	private static Map<Integer, Country> map = new HashMap<Integer, Country>();

	static {
		for (Country countryEnum : Country.values()) {
			map.put(countryEnum.countryId, countryEnum);
		}
	}

	public static String find(Integer countryId) {
		return null != map.get(countryId) ? map.get(countryId).toString() : "Select";
	}

	public static String find(String countryId) {
		return NumberUtils.isNumber(countryId) && null!= map.get(Integer.valueOf(countryId))? map.get(Integer.valueOf(countryId)).toString() : "Select";
	}

}
