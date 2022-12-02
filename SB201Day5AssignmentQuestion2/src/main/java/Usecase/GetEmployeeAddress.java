package Usecase;

import java.util.List;
import java.util.Scanner;

import Bean.Employee;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import Exception.EmployeeException;

public class GetEmployeeAddress {
 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Address of the Employee");
	String empIAdd=sc.next(); 
		

		EmployeeDao dao=new EmployeeDaoImpl();
		
		try {
			List<Employee> list= dao.getEmployeesByAddress(empIAdd);
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
