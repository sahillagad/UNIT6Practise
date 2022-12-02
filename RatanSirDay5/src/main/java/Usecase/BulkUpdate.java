package Usecase;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Utility.EMUtility;

public class BulkUpdate {

	public static void main(String[] args) {
		
		
		EntityManager em=EMUtility.provideEntityManager();
		
		
		em.getTransaction().begin();
		
		String jpql="update Account set balance=balance+2000";
		Query query=em.createQuery(jpql);
		
		int i= query.executeUpdate();
         		
		if(i>0) {
			
			System.out.println("Update Excuted Successfully....");
			
		}
		else {
			System.out.println("Update is failed....");
		}
		
		
		em.getTransaction().commit();
		
	}
}
