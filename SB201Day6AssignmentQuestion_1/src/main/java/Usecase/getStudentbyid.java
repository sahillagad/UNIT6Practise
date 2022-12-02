package Usecase;

import java.util.Scanner;

import Bean.College;
import Bean.Student;
import Dao.AdminDao;
import Dao.AdminDaoImpl;
import Exception.CollegeException;
import Exception.StudentException;

public class getStudentbyid {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
	 System.out.println("Enter Student Id");

	 int StudentId=sc.nextInt();
	  
	 
	 AdminDao dao=new AdminDaoImpl();
	


		try {
			Student student = dao.getStudentById(StudentId);
			 System.out.println("Student Roll        "+student.getStudentRoll());
	    	 System.out.println("Student Name     "+student.getStudentName());
	    	 System.out.println("Student Email     "+student.getEmail());
	    	 System.out.println("Student Mobile   "+student.getMobileNumber());
	    	 System.out.println("Student Address  "+student.getAddress());
	    	 System.out.println("student College   "+student.getCollege().getCollageName());
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    

    	                   

		
		
		
		
		
	}

}
