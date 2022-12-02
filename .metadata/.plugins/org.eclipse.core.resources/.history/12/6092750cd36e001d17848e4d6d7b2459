package USECASE;

import javax.persistence.EntityManager;

import Bean.Department;
import Bean.Employee;
import Utility.EMUtility;

public class USECASE {
 
	
	public static void main(String[] args) {
		 
		EntityManager em= EMUtility.provideEntityManager();
		
		
		Department depart1=new Department("HR","Mumbail");
		Department depart2=new Department("Sales","Mumbai");
		
		Employee e1=new Employee("e1","add1", depart2);
		Employee e2=new Employee("e2","add2", depart2);
		
		Employee e3=new Employee("e3","add3", depart1);
		Employee e4=new Employee("e4","add4", depart1);
		
		
		em.getTransaction().begin();
		
	  em.persist(e1);
      em.persist(e2);	
      em.persist(e3);	
      em.persist(e4);	

		em.getTransaction().commit();
		
		em.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
