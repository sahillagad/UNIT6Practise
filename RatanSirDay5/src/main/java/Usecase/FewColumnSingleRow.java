package Usecase;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import Utility.EMUtility;

public class FewColumnSingleRow {

	public static void main(String[] args) {
		
		
	 EntityManager em=	EMUtility.provideEntityManager();
	
	 String jpql="select balance,name from Account where aid=?1";

	 /*
	  //1 way
	 Query query=em.createQuery(jpql);
	 query.setParameter(1, 3);
	 Object[] obj=(Object[]) query.getSingleResult();
	 System.out.println(obj[0]+" "+obj[1]);
	 */
		
	 //2 way
	 TypedQuery<Object[]> query=em.createQuery(jpql,Object[].class);
	 query.setParameter(1,3);
	 Object[]  array=query.getSingleResult();
	 System.out.println(array[0]+" "+array[1]);
	 
	 
	 
		
		
		
		
		
	}
}
