package Usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Bean.Account;
import Utility.EMUtility;

public class AccessAllColumnSingleRecord {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Employee Name");
		String name=sc.next();
	
		
	    System.out.println("Enter Employee Account Id");
		int accountId=sc.nextInt();
	    
		
		EntityManager  em=EMUtility.provideEntityManager();
		
		String jpql="select a from Account a where name=:name And aid=:aid";
		Query query=em.createQuery(jpql);
		
		query.setParameter("name",name);
		query.setParameter("aid", accountId);
		
	   	 Account account=(Account)query.getSingleResult();
		
	   	 System.out.println(account);
		
		
		
		
		
		
		
		
	}
}
