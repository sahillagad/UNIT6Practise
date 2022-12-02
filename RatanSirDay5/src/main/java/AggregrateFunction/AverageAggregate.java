package AggregrateFunction;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import Bean.Account;
import Utility.EMUtility;

public class AverageAggregate {

	public static void main(String[] args) {
		
		EntityManager em=EMUtility.provideEntityManager();
		
		String jpql="Select Avg(balance) from Account";
		
		/*
		 Query query=em.createQuery(jpql);
		Double avarage=(Double)query.getSingleResult();
		System.out.println(avarage);
		
		*/
		
		TypedQuery<Double> query=em.createQuery(jpql,Double.class);
		Double avg1= query.getSingleResult();
		System.out.println(avg1);
		
	}
}
