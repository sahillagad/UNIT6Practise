package Usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import Utility.EMUtility;

public class OneColumnAllRecord {

	public static void main(String[] args) {
		
		EntityManager em=EMUtility.provideEntityManager();
		
		String jpql="select balance from Account";
		
		TypedQuery<Integer> query=em.createQuery(jpql,Integer.class);
		
		List<Integer> integers=query.getResultList();
		
		for(Integer i:integers) {
			
			System.out.println(i);
		}

	}
	
}
