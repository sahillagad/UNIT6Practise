package Usecase;

import java.util.Scanner;

import Bean.Address;
import Bean.College;
import Bean.Student;
import Dao.MumbaiUniversityDao;
import Dao.MumbaiUniversityDaoIMPL;

public class CollegeRegister {

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter College Name");
      String collegeName=  sc.next();
	
	System.err.println("Enter College Address");
    String  collegeAddress=sc.next();
    
    College college=new College();
    college.setCollegeName(collegeName);
    college.setCollegeAddress(collegeAddress);
    System.out.println("You Want Add Student Detail (Y/N)");
    String s=sc.next();  
    
  			
	if(s.equalsIgnoreCase("Y")) {
		
		 while(true){
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
              student.setCollege(college);

		        
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
		        	String s1=sc.next();
		        	
		        	if(s1.equalsIgnoreCase("N")) {
		        		break;
		        	}
		        	
		        }
		        
		        
		        college.getStudents().add(student);
		        
		        
		        System.out.println("You Want Add More Sudent (Y/N)");
		        String d= sc.next();
			    if(d.equalsIgnoreCase("N")) {
			    	
			    	break;
			    }
		        
			 
		 }
		
		
	}
	else {
		System.out.println("Thank You");
		
	}

	
	  MumbaiUniversityDao  dao=new MumbaiUniversityDaoIMPL();
	  String result= dao.registerCollege(college);
	  System.out.println(result);
	  
 	
	
	
}
}
