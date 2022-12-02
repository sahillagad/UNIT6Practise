package Usecase;

import java.util.Scanner;

import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;

public class GetEmployeeByName {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Name");
	  	String name= sc.next();
	  	
		EmployeeDao dao1=new EmployeeDaoImpl();
		dao1.getEmployeeByName(name);;
		
		
		
	}
}
