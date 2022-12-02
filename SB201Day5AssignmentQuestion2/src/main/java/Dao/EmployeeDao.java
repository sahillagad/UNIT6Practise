package Dao;

import java.util.List;

import Bean.Employee;
import Exception.*;

public interface EmployeeDao {

	 public void insertEmployee(Employee employee)throws EmployeeException ;
	public List<Employee> getAllEmployees() throws EmployeeException;
	public List<Employee> getEmployeesByAddress(String address) throws	EmployeeException;
	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary,int endSalary) throws EmployeeException;
	public Object[] getEmployeeNameAndSalary(int empId)throws EmployeeException;
	public int getEmployeeSalaryById(int empId)throws EmployeeException;

	
	
}

