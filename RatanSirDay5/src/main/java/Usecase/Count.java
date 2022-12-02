package Usecase;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Utility.EMUtility;

public class Count {

	
	public static void main(String[] args) {
		
		
		
		EntityManager em= EMUtility.provideEntityManager();
		
		String jpql="select sum(balance) from Account";
		
		
		Query query=em.createQuery(jpql);
		
		Long sumAllAccount=(Long)query.getSingleResult();
		
		System.out.println("Sum OF All Account "+sumAllAccount);
		
		
		
		
	}
}
