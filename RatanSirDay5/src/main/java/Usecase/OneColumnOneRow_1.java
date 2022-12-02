package Usecase;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import Utility.EMUtility;

public class OneColumnOneRow_1 {

public static void main(String[] args) {
	
	EntityManager em=EMUtility.provideEntityManager();
	
	String jpql="select balance from Account where aid=?1";
	/*
	 //1st way
	Query query= em.createQuery(jpql);
	query.setParameter(1, 3);
	Integer balance=(Integer) query.getSingleResult();
	System.out.println(balance);
	*/
	
	
	//2 way
	TypedQuery<Integer> query=em.createQuery(jpql,Integer.class);
	query.setParameter(1, 3);
	Integer integer=query.getSingleResult();
	System.out.println(integer);
	
	
	
	
	
	
	
	
	
	
	
}

	



}
