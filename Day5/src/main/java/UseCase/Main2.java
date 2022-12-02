package UseCase;

import javax.persistence.EntityManager;

import Bean.Address;
import Bean.Employee;
import Utility.EMUtility;

public class Main2 {


	public static void main(String[] args) {
		
	 EntityManager em=	EMUtility.provideEntityManager();
		
	 
	 Address homeAddress=new Address("mumbai","mharastra","421301");
	 Address OfficeAddress=new Address("pune","mharastra","421301");
	 Employee employee=new Employee("sahil", 50000,homeAddress,OfficeAddress );
	 
	 
	 
	 em.getTransaction().begin();
	 
	 
	 em.persist(employee);
	 
	 
	 
	 
	 
	 em.getTransaction().commit();
		
		
		
		
		
		
		
	}
	
	
	
	
}
