package Usecase;

import java.util.Scanner;

import Bean.Address;
import Bean.Student;
import Dao.MumbaiUniversityDao;
import Dao.MumbaiUniversityDaoIMPL;

public class Register_Student {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Student Name");
        String name= sc.next();
		
	   System.out.println("Student Mobile Number");
     String mobile=sc.next();
		
		System.out.println("Student Email Id");
		String email=sc.next();
		
		
		
		Student student=new Student();
		student.setStudentName(name);
		student.setMobileNumber(mobile);
        student.setEmail(email);


        
        while(true) {
        	System.out.println("Enter State");
        	String state= sc.next();
        	
        	System.out.println("Enter City");
        	String city=sc.next();
        	
        	System.out.println("Enter Pincode");
        	String pincode=sc.next();
        	
        	System.out.println("Enter Type");
        	String type=sc.next();
        	
        	Address address=new Address(state, city, pincode, type);
        	 student.getAddresses().add(address);
        	
        	System.out.println("You Want add One More Address(Y/N)");
        	String s=sc.next();
        	
        	if(s.equalsIgnoreCase("N")) {
        		break;
        	}
        	
        }
		 
		
        MumbaiUniversityDao dao=new MumbaiUniversityDaoIMPL();
        dao.registerStudent(student);
		
	}
}
