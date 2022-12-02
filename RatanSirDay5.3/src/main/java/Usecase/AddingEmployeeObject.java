package Usecase;

import javax.persistence.EntityManager;

import Bean.Address;
import Bean.Employee;
import Utility.EMUtility;

public class AddingEmployeeObject {

	
	public static void main(String[] args) {
    EntityManager em= EMUtility.provideEntityManager();
 
	
    Employee e1=new Employee();
    e1.setName("Sahil");
    e1.setSalary(50000);
    e1.setAddress(new Address("Mumbai", "India","421301"));
		
    
		
        em.getTransaction().begin(); 
		
		em.persist(e1);
		
		
		em.getTransaction().commit();
	}
	
	
}
