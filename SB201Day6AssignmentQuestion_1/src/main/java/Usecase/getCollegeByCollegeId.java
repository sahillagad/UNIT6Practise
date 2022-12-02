package Usecase;

import java.util.Scanner;

import Bean.College;
import Bean.Student;
import Dao.AdminDao;
import Dao.AdminDaoImpl;
import Exception.CollegeException;

public class getCollegeByCollegeId {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
	 System.out.println("Enter College Id");

	 int collegeId=sc.nextInt();
	  
	 
	 AdminDao dao=new AdminDaoImpl();
	
	try {
		College college=  dao.getCollegeBycollageId(collegeId);
	                                         
		 System.out.println("College ID "+college.getCollageId());                    
		 System.out.println("College Name  "+college.getCollageName() );              
		 System.out.println("College Address "+college.getCollageAddress());          
		int count=0;                                                                  
		for(Student stu:college.getStudents()) {                                      
			                                                                          
			count=count+1;                                                            
			                                                                          
		}                                                                             
	  System.out.println("Number OF Student "+count);                                 
		                                                                              

	} catch (CollegeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
	}
}
