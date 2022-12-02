package Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

@Transactional
public class EMUtility {
	
	
	private static EntityManagerFactory emf;
	
	static {
		
		emf=Persistence.createEntityManagerFactory("CollegeUnit");
		
	}
	
	public static EntityManager provideEntityManager() {
		
		EntityManager em=emf.createEntityManager();
		
		return em;
		
	}

}
