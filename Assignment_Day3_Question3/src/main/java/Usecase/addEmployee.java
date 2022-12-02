package Usecase;

import java.util.Scanner;

import Bean.Employee;
import Dao.AdminDao;
import Dao.AdminDaoImpl;

public class addEmployee {

	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Name");
	    String name= sc.next();    
		
		
		System.out.println("Enter Employee Address");
		String address=sc.next(); 
		
		
		System.out.println("Entre Employee Salary");
	    int salary=sc.nextInt();
	       
	       
	    
	    Employee employee=new Employee(name, address, salary);
	    
	    AdminDao dao=new AdminDaoImpl();
	    
 	    dao.save(employee);
	       
	       
	}
	
}
