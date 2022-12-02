package Usecase;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Entity.PhoneNumber;
import Entity.User;
import Exception.UserNotFoundException;
import Utility.EMUtility;

public class FindUserByName {

	public static void main(String[] args) throws UserNotFoundException {
		
   EntityManager em=EMUtility.provideEntityManager();
 
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter User Name");
   String name= sc.next();
   
   
   String jpql="Select u from User u where u.userName=?1";
 
   Query query=em.createQuery(jpql);
   query.setParameter(1,name);
   
   
   try {
	

   
     User user=(User) query.getSingleResult();
		
     if(user!=null) {
    	 
    	 List<PhoneNumber> list=user.getPhoneNumbers();
    	
    	 System.out.println("User Id : "+user.getUserId());
    	 System.out.println("User Name : +"+user.getUserName());
    	 System.out.println("User Email Id : "+user.getEmailId());
    	 System.out.println("----------------------------------------------------------");
    	 
    	  for(PhoneNumber number:list) {
    		 
    		  System.out.println("Phone Id : "+number.getPhoneId());
    		  System.out.println("Phone Number : "+number.getPhoneNumber());
    		  System.out.println("Phone Type : "+number.getPhoneType());
    		  
    		  System.out.println("-------*****-------");
    			
    	  }
    	
    	  System.out.println("----------------------------------------------------------");
     }
		
   } catch (Exception e) {
	
	   UserNotFoundException foundException=new UserNotFoundException("User Not Found By Given Name");
	   throw foundException;
	   
	}
		
		
		
	}
	
}
