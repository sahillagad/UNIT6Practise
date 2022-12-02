package Usecase;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Bean.Employee;
import UTILITY.EMUTILITY;

public class Main4 {

	public static void main(String[] args) {
		
		EntityManager em=EMUTILITY.provideEntityManager();
		
		Query query= em.createQuery("Select e from Employee e where ename='bhaskar'");
		
	       Employee employee=(Employee)query.getSingleResult();
		 
	       System.out.println(employee);
	       
	       
		
		
	}
}
