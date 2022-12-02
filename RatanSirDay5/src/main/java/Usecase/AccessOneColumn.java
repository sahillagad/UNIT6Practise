package Usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Utility.EMUtility;

public class AccessOneColumn {

	/*
	 * Try to access One Column than return type is 
	 * string,any wrapper class object , Local date
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Id");
	 	int aid= sc.nextInt();
		
		
		EntityManager em=EMUtility.provideEntityManager();
		
	   String jpql="select balance from Account  where aid=?1";
	   Query query=em.createQuery(jpql);
	   
	   query.setParameter(1, aid);
	   // position,Account ID
	   
	   Integer balance=(Integer) query.getSingleResult();
	   
	   System.out.println("\nIn the Account Number "+aid+" in the that account balance is "+balance);
	
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
