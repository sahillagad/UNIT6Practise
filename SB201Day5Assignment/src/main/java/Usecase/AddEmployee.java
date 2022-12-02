package Usecase;

import java.util.Scanner;

import Bean.Address;
import Bean.Employee;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;

public class AddEmployee{

	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoImpl();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Name");
	  	String name= sc.next();
		
		System.out.println("Enter Employee Gender");
		String gender=sc.next();
		
		System.out.println("Enter Employee Salary");
		int salary=sc.nextInt();
		
		Employee employee=new Employee();
		employee.setName(name);
		employee.setSalary(salary);
		employee.setGender(gender);
		
		
		while(true) {
			System.out.println("Enter State");
            String state= sc.next();
			
			System.out.println("Enter City");
			String city=sc.next();
			
			System.out.println("Enter Pincode");
		    String pincode=sc.next();
			 
			
			System.out.println("Enter Type");
			String type=sc.next();
			
			Address address=new Address(state, city, pincode, type);
			employee.getAddresses().add(address);
			
			
			System.out.println("You Want Add More Addresss(Y/N)");
			String result= sc.next();
					
			if(result.equalsIgnoreCase("N")) {
				break;
			}
			
		}
		
		dao.insertEmployee(employee);
		
		
		
	}
	
	
	
}
