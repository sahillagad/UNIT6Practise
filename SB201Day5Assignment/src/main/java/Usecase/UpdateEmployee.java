package Usecase;

import java.util.Scanner;

import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;

public class UpdateEmployee {
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Employee Id");
	int id=sc.nextInt(); 
	
	EmployeeDao dao=new EmployeeDaoImpl();
	dao.updateEmployee(id);
	
}
}
