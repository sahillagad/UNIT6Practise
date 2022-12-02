package USECASE;

import javax.persistence.EntityManager;

import BEAN.Department;
import BEAN.Employee;
import Utility.EMUTILITY;

public class ADDINGEmployee {

	
	public static void main(String[] args) {
		
		
		Department marketing=new Department();
		marketing.setName("Marketing");
		marketing.setLocation("Mumbai");

		
		Employee employee=new Employee("E1", 45000);
		Employee employee1=new Employee("E2", 40000);
		Employee employee2=new Employee("E3", 35000);
		Employee employee3=new Employee("E4", 30000);
		
		marketing.getEmployees().add(employee);
		marketing.getEmployees().add(employee1);
		marketing.getEmployees().add(employee2);
		marketing.getEmployees().add(employee3);
		
		
	   EntityManager em=	EMUTILITY.provideEntityManager();
				
	   em.getTransaction().begin();
	   
	   
	   
	   em.persist(marketing);
	   
	   
	   
	   
	   em.getTransaction().commit();
	   em.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
