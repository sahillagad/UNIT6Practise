package Usecase;

import java.util.Scanner;

import Bean.Employee;
import Dao.AdminDao;
import Dao.AdminDaoImpl;
import Exception.EmployeeException;

public class UpdateEmployee {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Id");
		int eid= sc.nextInt();
		
		AdminDao dao=new AdminDaoImpl();
		try {
			Employee employee=dao.getEmployeeById(eid);
			
			if(employee!=null) {
				
				while(true) {
			System.out.println("Enter 1 Update Emplyee Name"
					+ "\nEnter 2 Update Employee Address"
					+ "\nEnter 3 Update Employee Salary"
					+ "\nEnter 4 For Exit....");
			
			
			
			
			 int i=sc.nextInt();
			 
			 
			 
			 if(i==1) {
				 System.out.println("Enter New Employee Name");
				 String name=sc.next();
				 employee.setName(name); 
				  
				 
			 }
			 
			 if(i==2) {
				 System.out.println("Enter New Employee Address");
				 String address=sc.next();
				 employee.setAddress(address); 
				 
			 }
			 if(i==3) {
				 System.out.println("Enter Employee Upadted Salary");
				 int salary= sc.nextInt();
				 employee.setSalary(salary); 
				 
			 }
			 if(i==4) {
				 
			
				 
				 break;
				 
			 }
			 
				Employee employee1=dao.updateEmployee(employee);
				 
				if(employee1!=null) {
					System.out.println("Update Succesfully....");
				     
				}
				else {
					System.out.println("Update failed... ");
				}
			
			
			}
				
			
			}
			
			
			
			
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
