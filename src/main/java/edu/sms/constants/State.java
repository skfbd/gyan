package edu.sms.constants;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.math.NumberUtils;

public enum State {

	AndhraPradesh(1), Arunachal_Pradesh(2), Assam(3), Bihar(4), Chandigarh(5), Chhattisgarh(6), Daman_and_Diu(7), Delhi(8), Goa(9), Gujarat(10), Haryana(12), Himachal_Pradesh(13), Jammu_Kashmir(
			14), Jharkhand(15), Karnataka(16), Kerala(17), Lakshadweep(18), Madhya_Pradesh(19), Maharashtra(20), Manipur(21), Meghalaya(22), Mizoram(23), Nagaland(24), Odisha(25), Puducherry(
			26), Punjab(27), Rajasthan(28), Sikkim(29), Tamil_Nadu(30), Telangana(31), Tripura(32), Uttar_Pradesh(33), Uttarakhand(34), West_Bengal(35);

	private final int stateId;

	State(int stateId) {
		this.stateId = stateId;
	}
	
	private static Map<Integer, State> map = new HashMap<Integer, State>();

	static {
		for (State stateEnum : State.values()) {
			map.put(stateEnum.stateId, stateEnum);
		}
	}

	//put a wrapper for the below in SmsUtils to return select. Below methods should return stateId in case value is not found
	public static String find(Integer stateId) {
		return null != map.get(stateId) ? map.get(stateId).toString() : "Select";
	}

	public static String find(String stateId) {
		return NumberUtils.isNumber(stateId) && null!= map.get(Integer.valueOf(stateId))? map.get(Integer.valueOf(stateId)).toString() : "Select";
	}

}
