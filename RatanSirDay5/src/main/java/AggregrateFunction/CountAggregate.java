package AggregrateFunction;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import Utility.EMUtility;

public class CountAggregate {

	public static void main(String[] args) {
		EntityManager em=EMUtility.provideEntityManager();
		
		String jpql="select count(balance) from Account";
	
        // 1 way
		Query query= em.createQuery(jpql);
	    Long count=(Long)query.getSingleResult();
		System.out.println(count);
		
		
		System.out.println("--------------------------------------------");
		
		// 2way
		TypedQuery<Long> query2=em.createQuery(jpql,Long.class);
	     Long count1=query2.getSingleResult();
	     System.out.println(count1);

	}
}
