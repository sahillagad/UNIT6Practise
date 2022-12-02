package Usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Bean.Account;
import Utility.EMUtility;

public class AllRowAllColumn {

	public static void main(String[] args) {
		
 	EntityManager em=EMUtility.provideEntityManager();
		

 	String jpql="select a from Account a";
 	
 	Query query=em.createQuery(jpql);
  	List<Account> accounts= query.getResultList();
 	
  	for(Account acc:accounts) {
  		
  		System.out.println("Account Id : "+acc.getAid());
  		System.out.println("Name       : "+acc.getName());
  		System.out.println("Balance    : "+acc.getAid());
  		
  		System.out.println("-------------------------------");
  		
  	}
 	
 	
 	
	}
}
