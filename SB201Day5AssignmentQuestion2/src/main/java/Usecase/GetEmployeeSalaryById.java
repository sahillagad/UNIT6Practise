package Usecase;

import java.util.Scanner;

import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import Exception.EmployeeException;

public class GetEmployeeSalaryById {
public static void main(String[] args) {
	
	
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Id of the Employee");
	int empId=sc.nextInt(); 
	

	EmployeeDao dao=new EmployeeDaoImpl();
	

	try {
		int i= dao.getEmployeeSalaryById(empId);
		   System.out.println(i);
	} catch (EmployeeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      

}

}
