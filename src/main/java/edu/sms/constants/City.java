package edu.sms.constants;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.math.NumberUtils;

public enum City {

	GautamBudh_Nagar(1), Dadri(2), Greater_Noida(3), Ghaziabad(4), Delhi(5);

	private final int cityId;

	City(int cityId) {
		this.cityId = cityId;
	}
	
	private static Map<Integer, City> map = new HashMap<Integer, City>();

	static {
		for (City CityEnum : City.values()) {
			map.put(CityEnum.cityId, CityEnum);
		}
	}

	public static String find(Integer cityId) {
		return null != map.get(cityId) ? map.get(cityId).toString() : "Select";
	}

	public static String find(String cityId) {
		return NumberUtils.isNumber(cityId) && null!= map.get(Integer.valueOf(cityId))? map.get(Integer.valueOf(cityId)).toString() : "Select";
	}
	
	
	
	
}
