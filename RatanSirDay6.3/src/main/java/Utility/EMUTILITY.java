package Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUTILITY {

	 
	private static EntityManagerFactory emf;
	
	
	static {
		
		emf=Persistence.createEntityManagerFactory("EmployeeUnit");
		
		
	}
	 
	public static EntityManager provideEntityManager() {
		
		EntityManager em=emf.createEntityManager();
		
		return em;
	}
	 
}
