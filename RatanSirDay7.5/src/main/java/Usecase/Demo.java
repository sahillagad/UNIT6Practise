package Usecase;

import javax.persistence.EntityManager;

import Bean.Address;
import Bean.Employee;
import Utility.EMUtility;

public class Demo {

 public static void main(String[] args) {
	
	 
	  EntityManager em= EMUtility.provideEntityManager();

	  
	   Employee e1=new Employee();
	   e1.setName("Sahil");
	   e1.setSalary(50000);
	  
	   
	   
	   Address a1=new Address();
	   a1.setState("MH");
	   a1.setCity("Kalyan");
	   a1.setPincode("432456");
	   a1.setEmployee(e1);
	   
	   e1.setAddress(a1);
	  
	  
	 em.getTransaction().begin();

      	 em.persist(e1);
      
	  
	 em.getTransaction().commit();
	 em.close();
} 
}
