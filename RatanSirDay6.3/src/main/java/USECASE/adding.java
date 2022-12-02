package USECASE;

import javax.persistence.EntityManager;

import BEAN.Department;
import BEAN.Employee;
import Utility.EMUTILITY;

public class adding {

	public static void main(String[] args) {
		
	EntityManager  em= 	EMUTILITY.provideEntityManager();
		
	Department depart1=new Department();
	depart1.setName("HR");
	depart1.setLocation("MUMBAI");
	
	 
	Department depart2=new Department();
	depart2.setName("IT");
	depart2.setLocation("PUNE");
  	
	
		
		
   Employee e1=new Employee("Ram",50000);
   Employee e2=new Employee("Raj", 56000);
   Employee e3=new Employee("Sahil",50000);
   Employee e4=new Employee("Tom",56000);
   Employee e5=new Employee("Jarry", 54000);
   
   depart1.getEmployees().add(e1);
   depart1.getEmployees().add(e2);
   
   depart2.getEmployees().add(e3);
   depart2.getEmployees().add(e4);
   depart2.getEmployees().add(e5);
 		 
		
em.getTransaction().begin();


em.persist(e1);
em.persist(e2);
em.persist(e3);
em.persist(e4);
em.persist(e5);

em.persist(depart1);
em.persist(depart2);



em.getTransaction().commit();
		
em.close();		

		
	}
}
