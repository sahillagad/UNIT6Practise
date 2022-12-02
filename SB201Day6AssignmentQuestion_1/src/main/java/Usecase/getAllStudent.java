package Usecase;

import java.util.List;

import Bean.Student;
import Dao.AdminDao;
import Dao.AdminDaoImpl;

public class getAllStudent {

public static void main(String[] args) {
	
	
	AdminDao dao=new AdminDaoImpl();
    
	try {
	    
	
	     List<Student> list=dao.getAllStudent();
		  System.out.println("..................................Student Detail..................................");
		     for(Student student:list) {
		    	 System.out.println("Student Roll        "+student.getStudentRoll());
		    	 System.out.println("Student Name     "+student.getStudentName());
		    	 System.out.println("Student Email     "+student.getEmail());
		    	 System.out.println("Student Mobile   "+student.getMobileNumber());
		    	 System.out.println("Student Address  "+student.getAddress());
		    	 System.out.println("student College   "+student.getCollege().getCollageName());
		    	 
		    	 System.out.println("--------------------------------------------------------\n");
		     }
		}
		catch (Exception e) {
  
			System.out.println(e.getMessage());
		}

	
	
	
	
}	
}
