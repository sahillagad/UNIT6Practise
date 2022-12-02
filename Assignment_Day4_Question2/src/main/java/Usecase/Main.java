package Usecase;

import java.util.Scanner;

import Bean.Employee;
import Dao.AdminDao;
import Dao.AdminDaoImpl;
import Exception.EmployeeException;

public class Main {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Name");
		String name=sc.next();
		
		
		System.out.println("Enter Employee Address");
		String address=sc.next();
		
		System.out.println("Enter Employee Salary");
		int salary=sc.nextInt();
		
		
		
		
		Employee employee=new Employee(name,address,salary);
		AdminDao dao=new AdminDaoImpl();
		
		
		
		try {
			Employee employee2= dao.registerEmployee(employee);
			System.out.println(employee2);
		} catch (EmployeeException e) {
			
			e.printStackTrace();
		}
		
		 
		
	}
}
