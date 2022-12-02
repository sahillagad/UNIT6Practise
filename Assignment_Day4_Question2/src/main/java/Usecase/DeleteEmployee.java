package Usecase;

import java.util.Scanner;

import Bean.Employee;
import Dao.AdminDao;
import Dao.AdminDaoImpl;
import Exception.EmployeeException;

public class DeleteEmployee {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id");
	    int eid=	sc.nextInt();
		
	    
	    AdminDao dao=new AdminDaoImpl();
	    
	    try {
			Employee employee= dao.deleteEmployeeById(eid);
		
			if(employee!=null) {
				
				System.out.println("Delete Employee Successfully");
			}
			else {
				
				System.out.println("Delete Employee failed");
			}
	    
	    
	    } catch (EmployeeException e) {
			
			e.printStackTrace();
		}
	   
	   
		
		
	}
}
