package Usecase;

import java.util.Scanner;

import Bean.Employee;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import Exception.EmployeeException;

public class InserEmployee {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name Of Employee");
		String name= sc.next();
		System.out.println("Enter Address Of Employee");
		String address= sc.next();
		
		System.out.println("Enter Salary Of Employee"); 
		int salary= sc.nextInt();
		
		Employee employee=new Employee(name,address,salary);
		EmployeeDao dao=new EmployeeDaoImpl();
		try {
		 	dao.insertEmployee(employee);
		} catch (EmployeeException e) {
		
			 System.out.println(e.getMessage());
		}
		
		
		
		
		
		
	}

}
