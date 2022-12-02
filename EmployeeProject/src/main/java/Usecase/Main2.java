package Usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Bean.Employee;
import UTILITY.EMUTILITY;

public class Main2 {

	
	public static void main(String[] args) {
		
		
		EntityManager em=EMUTILITY.provideEntityManager();
		
		
		Query query=em.createQuery("SELECT e from Employee e where e.salary Between 20000 AND 30000");
	
		List<Employee> employees=query.getResultList();
		
		
		employees.forEach(t -> System.out.println(t));
		
		
		
		
		
		
	}
}
