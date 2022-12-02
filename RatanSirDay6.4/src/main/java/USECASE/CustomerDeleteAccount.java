package USECASE;

import java.util.Scanner;

import javax.persistence.EntityManager;

import Bean.Customer;
import Utility.EMUtility;

public class CustomerDeleteAccount {
  
	
	public static void main(String[] args) {
		EntityManager em= EMUtility.provideEntityManager();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Customer Id");
		int Id= sc.nextInt();
		
	  Customer customer=	em.find(Customer.class, Id);
		
	  if(customer!=null) {
		  
		  em.getTransaction().begin();
		  em.remove(customer);
		  
		  em.getTransaction().commit();
	  }
	  else {
		  System.out.println("Wrong Customer Id Provide......");
	  }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	         
}
