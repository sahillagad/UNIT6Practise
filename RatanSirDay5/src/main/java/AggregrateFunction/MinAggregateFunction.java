package AggregrateFunction;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Utility.EMUtility;

public class MinAggregateFunction {

	
	public static void main(String[] args) {
		

		EntityManager em=EMUtility.provideEntityManager();
		
		String jpql="Select min(balance) from Account";
		Query query= em.createQuery(jpql);
		
		Integer minimum=(Integer) query.getSingleResult();
		
		System.out.println(minimum);
		
		
		
	}
	
}
