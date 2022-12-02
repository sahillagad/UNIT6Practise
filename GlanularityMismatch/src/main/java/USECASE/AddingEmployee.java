package USECASE;

import javax.persistence.EntityManager;

import Utility.Address;
import Utility.EMUtility;
import Utility.Employee;

public class AddingEmployee {

	
	public static void main(String[] args) {
	 EntityManager em=	EMUtility.provideEntityManager();
	
	 Address address=new Address("Mumbai","India" ,"421301");
	 Employee employee= new Employee("Sahil",450000,address);
			 
	 
	 
	 em.getTransaction().begin();
		
		
	em.persist(employee); 
		
		
	 em.getTransaction().commit();	
		
	}
}
