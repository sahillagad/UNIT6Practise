package Usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Utility.EMUtility;

public class TryToAccessOneColumn {
public static void main(String[] args) {
	
	/*
	 * Single recode we want multipal column 
	 */
	
	EntityManager em= EMUtility.provideEntityManager();
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Account Id");
 	int accountId= sc.nextInt();
	
	
 	
	String jpql="Select balance,name from Account where aid=?1";
	
	Query query=em.createQuery(jpql);
	query.setParameter(1,accountId);
	
	 Object object= query.getSingleResult();
	
	 Object[] obj=(Object[])object;

	 System.out.println(obj[1]+" "+obj[0]);
	
	
	
	
	
	
}
}
