package UseCase;

import javax.persistence.EntityManager;

import Bean.Address;
import Bean.Employee;
import Utility.EMUtility;

public class Main1 {

	public static void main(String[] args) {
		
	
	EntityManager em= EMUtility.provideEntityManager();	

	Address address=new Address("Mumbai","India","421301");
//	Employee employee=new Employee("sahil",50000,address);
	
	
	
	em.getTransaction().begin();
	

//	em.persist(employee);
	
	
		
	em.getTransaction().commit();	
		
		
		
	}
}
