package Dao;

import Bean.Employee;

public interface AdminDao {

	public void save(Employee emp);
	public String getAddressOfEmployee(int empId);
	public String giveBonusToEmployee(int empId, int bonus);
	public boolean deleteEmployee(int empId);

	
}
