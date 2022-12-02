package Usecase;

import java.util.Scanner;

import Bean.Address;
import Bean.Student;
import Dao.AdminDao;
import Dao.AdminDaoImpl;

public class InsertStudent {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Name");
		String studentName=sc.next();
		
		System.out.println("Enter Student Mobile Number");
		String studentMobile=sc.next();
		
		System.out.println("Enter Student Email");
       String studentEmail=sc.next();
		
       
      
       
		System.out.println("Enter State");
    	 String state=sc.next();
    	 
    	 System.out.println("Enter City");
    	String city=sc.next();
    	 
    	 System.out.println("Enter pincode");
    	String pincode=sc.next();
    	 
    	 System.out.println("Enter type");
    	 String type=sc.next();
		
		
    	 Address address=new Address(state, city, pincode, type);
    	 Student student=new  Student();
    	 student.setStudentName(studentName);
    	 student.setMobileNumber(type);
    	 student.setAddress(address);
          student.setEmail(studentEmail); 
   
  		AdminDao dao=new AdminDaoImpl();
          
  		try {
  		    String s=dao.insertStudent(student);
  			System.out.println(s);
  			}
  			catch (Exception e) {
  	  
  				System.out.println(e.getMessage());
  			}
		
		
		
		
	}
	
}
