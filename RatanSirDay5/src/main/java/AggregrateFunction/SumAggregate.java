package AggregrateFunction;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import Utility.EMUtility;

public class SumAggregate {

	public static void main(String[] args) {
		
		EntityManager em=EMUtility.provideEntityManager();
		
		String jpql="select sum(balance) from Account";
	  	 Query query = em.createQuery(jpql);
		
	  	 Long sum=(Long)query.getSingleResult();
	  	 System.out.println(sum);
		
	  	 System.out.println("------------------------");
		
	  	 
	  	 TypedQuery<Long> query2=em.createQuery(jpql,Long.class);
		 Long coun1=query2.getSingleResult();
		 System.out.println(coun1);
		 
	  	 
	  	 
		
	}
}
