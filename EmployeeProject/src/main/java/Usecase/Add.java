package Usecase;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import Bean.Employee;
import UTILITY.EMUTILITY;

public class Add {

	public static void main(String[] args) {
		
		
		Employee employee=new Employee("Bhaskar", 40000,"HR");
	
		
		
		
		List<Employee> employees=new ArrayList<>();
		
		
		employees.add(employee);
//		employees.add(employee1);
//		employees.add(employee2);
//		employees.add(employee3);

		
		
		EntityManager em=EMUTILITY.provideEntityManager();
		
		
		em.getTransaction().begin();
		
		
		for(Employee emp:employees) {
			
			
			em.persist(emp);
			
		}
		
		
		
		em.getTransaction().commit();
		
		
		em.close();
		
		
	}
}
