package Usecase;

import java.util.Scanner;

import Dao.AdminDao;
import Dao.AdminDaoImpl;
import Exception.StudentException;

public class UpdateStudent {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Id");
		int studentId= sc.nextInt();
		
		
		 AdminDao dao=new AdminDaoImpl();

		 
		  try {
		 String result=	dao.updateStudent(studentId);
		System.err.println(result);
		  } catch (StudentException e) {
		
			  System.out.println(e.getMessage());
			
		}
		 
		
		
		
		
		
		
		
		
	} 
}
