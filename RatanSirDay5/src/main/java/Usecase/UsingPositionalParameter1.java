package Usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Utility.EMUtility;

public class UsingPositionalParameter1 {

	
	/*
	 * if we want take parameter and update sapecific record balance update
	 */
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Account Id");
	int accountId=  sc.nextInt();	
	
	
	System.out.println("Enter Account amount add");
	int amount=  sc.nextInt();		
		
		
		
		EntityManager em=EMUtility.provideEntityManager();
	
	
	
	
	String jpql="Update Account  set balance=balance+?1 where aid=?2";
	 
	Query query=em.createQuery(jpql);
	
	query.setParameter(1, amount);
	query.setParameter(2, accountId);
	
	
	em.getTransaction().begin();
	
	
     int i=query.executeUpdate();
	
     if(i>0) {
    	 System.out.println("Update susseessfully");
     }
	
     else {
    	 System.out.println("Update is failed...");
     }
	
	em.getTransaction().commit();
	
		
	
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
