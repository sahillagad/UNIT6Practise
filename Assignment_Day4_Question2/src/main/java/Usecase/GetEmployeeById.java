package Usecase;

import java.util.Scanner;

import Bean.Employee;
import Dao.AdminDao;
import Dao.AdminDaoImpl;
import Exception.EmployeeException;

public class GetEmployeeById {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Id");
		int eid=sc.nextInt();
		
		
		 AdminDao dao=new AdminDaoImpl();
		 try {
			Employee employee= dao.getEmployeeById(eid);
			
			if(employee!=null) {
				
				System.out.println(employee);
			}
			
			else {
				System.out.println("Employee Is Not Found By Given Id");
			}
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
