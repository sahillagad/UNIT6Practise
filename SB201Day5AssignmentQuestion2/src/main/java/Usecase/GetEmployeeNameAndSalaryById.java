package Usecase;

import java.util.Scanner;

import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;

public class GetEmployeeNameAndSalaryById {
public static void main(String[] args) {
	
	
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Id of the Employee");
	int empId=sc.nextInt(); 
	

	EmployeeDao dao=new EmployeeDaoImpl();
	
	try {
		
		Object[]  objects= dao.getEmployeeNameAndSalary(empId);
		System.out.println("Name : "+objects[0]);
		System.out.println("Salary : "+objects[1]);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	
}
}
