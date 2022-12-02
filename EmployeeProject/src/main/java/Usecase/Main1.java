package Usecase;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import UTILITY.EMUTILITY;

public class Main1 {

	public static void main(String[] args) {
		
		
		EntityManager em=EMUTILITY.provideEntityManager();
		
		Query query=em.createQuery("Select Max(e.salary) from Employee e");
		
		Double result=(Double)query.getSingleResult();
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
