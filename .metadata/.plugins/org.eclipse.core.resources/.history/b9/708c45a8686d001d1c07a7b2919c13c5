package Usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;

import Bean.Address;
import Bean.Employee;
import Utility.EMUtility;

public class Adding {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		
		Employee employee=new Employee();
     
	
		System.out.println("Enter Employee Name");
	      String name=sc.next();
	      employee.setName(name);
		
		
		System.out.println("Enter Employee Salary");
		double salary=sc.nextDouble();
		employee.setSalary(salary);
		
		
		while(true) {
			
		System.out.println("Enter City");
		String city= sc.next();
		
		System.out.println("Enter State");
		String state=sc.next();
		
		System.out.println("Enter Pincode");
		String pincode=sc.next();
		
			
		System.out.println("You want to add One More Address (Y/N)");
		String result=sc.next();
		
		Address address=new Address(city, state, pincode);
		employee.getAddresses().add(address);
		
		if(result.equalsIgnoreCase("N")) {
			
			break;
		}
		}
		
		
		
	EntityManager em=EMUtility.provideEntityManager();
	em.getTransaction().begin();
	
	
	em.persist(employee);
	
	em.getTransaction().commit();
	
		
		em.close();
		
		
	}
}

