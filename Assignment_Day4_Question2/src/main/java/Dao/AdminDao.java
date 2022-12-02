package Dao;

import Bean.Employee;
import Exception.EmployeeException;

public interface AdminDao {

	
public Employee registerEmployee(Employee employee)throws EmployeeException;
public Employee getEmployeeById(int emplId)throws EmployeeException	;
public Employee deleteEmployeeById(int empId) throws EmployeeException;
public Employee updateEmployee(Employee employee)throws EmployeeException;

	
	
}
