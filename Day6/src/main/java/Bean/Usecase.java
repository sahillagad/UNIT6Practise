package Bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Usecase {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("AnimalUnit");
		EntityManager em=entityManagerFactory.createEntityManager();
		
		
		 Pet pet=new Pet(1,"Cat", "Tommy");
		 
		 em.getTransaction().begin();
	    	
		 em.persist(pet);
		
		em.getTransaction().commit();
		
		
		
		
	}
}
