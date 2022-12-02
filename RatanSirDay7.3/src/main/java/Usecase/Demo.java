package Usecase;

import javax.persistence.EntityManager;

import Bean.Address;
import Bean.Employee;
import Utility.EMUtility;

public class Demo {

 public static void main(String[] args) {
	
	 
	  EntityManager em= EMUtility.provideEntityManager();
	 
	  Address address=new Address("MH","Pune", "432124");
	  Employee employee=new Employee("Ram", 45000, address);
	  
	  Address address2=new Address("MH", "Kalyan", "564543");
	 Employee employee2=new Employee("Sahil", 50000, address2);
		
		
	  
	  
	  
	 em.getTransaction().begin();
	  
	 em.persist(employee);
      em.persist(employee2);
      
	 
	 em.getTransaction().commit();
} 
}
