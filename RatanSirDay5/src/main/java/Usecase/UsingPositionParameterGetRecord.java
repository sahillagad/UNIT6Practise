package Usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import Bean.Account;
import Utility.EMUtility;

public class UsingPositionParameterGetRecord {

	
	public static void main(String[] args) {
		EntityManager em=EMUtility.provideEntityManager();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Id");
		int accountId=sc.nextInt();
		
		
		
        String jpql="select a from Account a where aid=?1";
        
        
        TypedQuery<Account> query=em.createQuery(jpql,Account.class);
 		
        query.setParameter(1, accountId);
        
        Account a1= query.getSingleResult();
        
        System.out.println(a1);
		
		
		
		
		
		
		
		
		
		
	}
}
