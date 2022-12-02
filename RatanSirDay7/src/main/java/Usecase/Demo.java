package Usecase;

import javax.persistence.EntityManager;

import Bean.Department;
import Bean.Employee;
import Utility.EMUtility;

public class Demo {

	public static void main(String[] args) {

	 EntityManager  em=	EMUtility.provideEntityManager();
		
		Employee employee=new Employee("Sahil", 50000);
		Employee employee2=new Employee("Ram", 45000);
		
		
		
        Department department=new Department("IT", "Mumbai", employee);
        Department department1=new Department("HR", "Mumbai", employee2);
		

        em.getTransaction().begin();
        
        em.persist(department1); 
        em.persist(department);
        
        
        em.getTransaction().commit();
		em.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
