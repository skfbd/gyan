package edu.sms.util;

import org.springframework.jdbc.core.RowMapper;
/**
 * Class of output params specifying name of the output param, output return type like OracleTypes.CURSOR etc. 
 * and the row mapper which will map the result set to the given class
 * Output parameters will appear here, with their values after the
 * stored procedure has been called.
 * @author 218231
 */
public class OutputParameter {
	private String paramName;
	private int paramType;
	private RowMapper<?> rowMapper;
	
	public String getParamName() {
		return paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	public int getParamType() {
		return paramType;
	}
	public void setParamType(int paramType) {
		this.paramType = paramType;
	}
	public RowMapper<?> getRowMapper() {
		return rowMapper;
	}
	public void setRowMapper(RowMapper<?> rowMapper) {
		this.rowMapper = rowMapper;
	}
}
