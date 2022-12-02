package Usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Utility.EMUtility;

public class FewColumnAllRows {

	public static void main(String[] args) {
		
		EntityManager em= EMUtility.provideEntityManager();
		
		String jpql="select balance,name from Account";
        Query query= em.createQuery(jpql);
		
        
        List<Object[]> list=query.getResultList();
        
        for(Object[] obj:list) {
        	
        	System.out.println("Name    : "+obj[1]);
        	System.out.println("Balance : "+ obj[0]);
        	System.out.println("--------------------");
        }
        
		
		 
		
		
		
		
		
		
	}
	
	
	
}
