package edu.sms.dao.appModules.employee;



import java.util.List;
import java.util.Map;

import edu.sms.dao.genric.IDaoBase;
import edu.sms.entity.employee.CommonEmployeeEntity;
import edu.sms.entity.employee.EmpDesignationEntity;
import edu.sms.entity.employee.EmployeeEntity;


public interface EmployeeDAO {
	public List<EmpDesignationEntity> loadAll(Map<String,String> paramVal);
	public EmpDesignationEntity get(Integer paramVal);
	public void saveEmployeeDesignation(EmpDesignationEntity empDesEntity);
	public void delete(EmpDesignationEntity empDesEntity);
//employee section started
	public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
	public List<EmployeeEntity> loadEmployeeList(Map<String,String> paramVal);
	public EmployeeEntity loadEmployee(Integer employeeId);
	public void deleteEmp(EmployeeEntity employeeEntity);
	
//employee password mapping file
	public void setEmpPasswordMapping(String userid,String userType,Integer empId);
	public String getUserNames();
}
 