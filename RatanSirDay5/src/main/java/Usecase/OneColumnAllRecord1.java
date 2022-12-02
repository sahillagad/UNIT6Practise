package Usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;import javax.persistence.criteria.CriteriaBuilder.In;

import Utility.EMUtility;

public class OneColumnAllRecord1 {

	public static void main(String[] args) {
		
		
		EntityManager em=EMUtility.provideEntityManager();
		
		String jpql="select balance from Account";
		
		Query  query=em.createQuery(jpql);
		
		List<Integer> integers= query.getResultList();
		
		for(Integer i:integers) {
		System.out.println("Balance : "+i);
		
		}
	}
	 
}
