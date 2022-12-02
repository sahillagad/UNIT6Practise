package Usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import UTILITY.EMUTILITY;

public class Main {

	
	public static void main(String[] args) {
		
		
		
		EntityManager em=EMUTILITY.provideEntityManager();
		
		
	    Query query= em.createQuery("Select UPPER(e.ename) from Employee e");
	    
	    List<String> list= query.getResultList();
		
		
	    for(String l:list) {
	    	
	    	System.out.println(l);
	    	
	    }
		
		
		
		
	}
	
	
}
