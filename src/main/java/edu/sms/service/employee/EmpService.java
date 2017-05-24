package edu.sms.service.employee;

import java.util.List;
import java.util.Map;

import edu.sms.entity.employee.EmployeeEntity;
import edu.sms.model.EmpDesignationFrm;
import edu.sms.model.EmployeeFrm;




public interface EmpService {

  //Designation Methods start
  public List<EmpDesignationFrm> getEmployeeDesigList(Map<String,String> paramVal);
  public EmpDesignationFrm loadEmployeeDtl(Integer empDesignationId);
  public void saveorupdate(EmpDesignationFrm empdesignation);
  public void deleteDesig(Integer empDesigId);
  //Employee Details Start
  public List<EmployeeFrm> loadEmployeeList(Map<String,String> paramVal);
  public EmployeeFrm loadEmployee(Integer employeeId);
  public EmployeeEntity saveorupateEmp(EmployeeFrm employee);
  public void deleteEmp(Integer employeeId);	
 //set employee password details
  public void setEmpPasswordMapping(String userid,String userType,Integer empId);
  public String getUserNames();
  
}
