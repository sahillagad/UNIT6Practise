package Usecase;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import Bean.Account;
import Utility.EMUtility;

public class TypeQueryUse {

	
	public static void main(String[] args) {
		
	EntityManager em= EMUtility.provideEntityManager();
		
	String  jpql="select a Account a where a.aid=1";
	

	
	 TypedQuery<Account> query=em.createQuery(jpql,Account.class);
		
	 System.out.println(query);
	 
		
		
	}
}
