package Usecase;

import java.util.List;
import java.util.Scanner;

import Bean.Employee;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import Exception.EmployeeException;

public class GetEmployeeWithRangeSalary {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Start Salary");
	int startsalary=sc.nextInt(); 
	
	System.out.println("Enter End Salary");
int endsalary=sc.nextInt(); 
	
	EmployeeDao dao=new EmployeeDaoImpl();
	
	try {
		List<Employee>  list= dao.getAllEmployeeWithRangeSalary(startsalary,endsalary);
	
		 list.forEach(t -> {
			 System.out.println("Employee Id     : "+t.getEmpld());
			 System.out.println("Employee Name   : "+t.getName());
			 System.out.println("Employee Salary : "+t.getSalary());
			 System.out.println("Employee Add    : "+t.getAddress());
			 System.out.println("-----------------------------------------");
		 });
	
	} catch (EmployeeException e) {
	
		System.out.println(e.getMessage());
	}
	
}
}
