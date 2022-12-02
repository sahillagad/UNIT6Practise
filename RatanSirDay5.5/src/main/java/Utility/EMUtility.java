package Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtility {

	
 private static EntityManagerFactory emf;
 
 static {
	 
	 emf=Persistence.createEntityManagerFactory("EmployeeUnit");
	 
	 
 }
 
 public static EntityManager provideEntityManager() {
	 
	 
	 EntityManager em=emf.createEntityManager();
	 
	 return em;
 }
}
