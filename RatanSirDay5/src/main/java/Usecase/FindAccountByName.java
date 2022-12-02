package Usecase;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Bean.Account;
import Utility.EMUtility;

public class FindAccountByName {

	
	public static void main(String[] args) {
		
		EntityManager em=EMUtility.provideEntityManager();
		
		
		 String jpql="select a from Account a where a.name='sahil'";
		 
		 Query query=em.createQuery(jpql);
		 
		 
		Account account=(Account) query.getSingleResult();
		
		System.out.println(account);
		
	}
}
