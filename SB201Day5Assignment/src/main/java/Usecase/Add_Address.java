package Usecase;

import java.util.Scanner;

import Bean.Address;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;

public class Add_Address {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int id=sc.nextInt(); 
		
		System.out.println("Enter State");
        String state= sc.next();
		
		System.out.println("Enter City");
		String city=sc.next();
		
		System.out.println("Enter Pincode");
	    String pincode=sc.next();
		 
		
		System.out.println("Enter Type");
		String type=sc.next();
	
		
		Address address=new Address(state, city, pincode, type);
		
		EmployeeDao dao=new EmployeeDaoImpl();
		dao.addAddress(id,address);
		
		
		
		
		
	}
}
