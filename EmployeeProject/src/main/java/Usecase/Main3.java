package Usecase;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Bean.Employee;
import UTILITY.EMUTILITY;

public class Main3 {

	public static void main(String[] args) {
		
		
		
		EntityManager em=EMUTILITY.provideEntityManager();
	     
		 Query query= em.createQuery("from Employee");
		
		 List<Employee> employees= query.getResultList();
		
		 for(Employee employee:employees ) {
			 
			 System.out.println(employee);
			 
		 }
		
		 
		
		
		
	}
}
