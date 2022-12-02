package AggregrateFunction;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Utility.EMUtility;

public class MaxAggregate {

	public static void main(String[] args) {
		
		
		EntityManager em=EMUtility.provideEntityManager();
		
		String jpql="SELECT Max(balance) from Account";
		Query query= em.createQuery(jpql);
		
		Integer maximum=(Integer) query.getSingleResult();
		System.out.println(maximum);
		
		
		
	}
}
