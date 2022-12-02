package Usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Utility.EMUtility;

public class OneColumnOneRow_2 {

	public static void main(String[] args) {
		
		EntityManager em=EMUtility.provideEntityManager();
		
		String jpql="select balance from Account";
		
		Query query=em.createQuery(jpql);
		
		List<Integer> integers= query.getResultList();
		
		for(Integer bal:integers) {
			
			System.out.println(bal);
		}
		
		
		
		
	}
}
