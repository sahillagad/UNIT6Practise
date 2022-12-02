package Usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Bean.Account;
import Utility.EMUtility;

public class usingNamedParameter {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Account Holder Name");
	 	String Aname= sc.next();
		
		
		System.out.println("Enter Amount Which You Want add");
		int amount= sc.nextInt();
		
		
		EntityManager em=EMUtility.provideEntityManager();
	
		
		String jpql="Update Account set balance=balance+:Amt where name=:name";
		
		Query query=em.createQuery(jpql);
		query.setParameter("Amt",amount);
		query.setParameter("name", Aname);
		
	 
		em.getTransaction().begin();
	     int i=query.executeUpdate();
	     em.getTransaction().commit();
	     
	     
	 	
	     if(i>0) {
	    	 System.out.println("Update susseessfully");
	     }
		
	     else {
	    	 System.out.println("Update is failed...");
	     }
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
