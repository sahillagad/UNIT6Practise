package Usecase;

import javax.persistence.EntityManager;

import Bean.Account;
import Utility.EMUtility;

public class PartialInsertion {

	
	public static void main(String[] args) {
		
		
	EntityManager em=EMUtility.provideEntityManager();
	
	
	Account account=new Account();
	account.setName("Karthik");
	

	em.getTransaction().begin();
	
	
	em.persist(account);
		
		
		
	em.getTransaction().commit();	
		
		
	}
}
