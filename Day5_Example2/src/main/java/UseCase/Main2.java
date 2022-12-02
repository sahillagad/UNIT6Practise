package UseCase;

import javax.persistence.EntityManager;

import Bean.Employee;
import Utility.EMUtility;

public class Main2 {

	public static void main(String[] args) {
		
		
		
	 EntityManager em=	EMUtility.provideEntityManager();
	
	 
	 Employee employee= em.find(Employee.class ,1);
	 
	 System.out.println(employee);
		
		
		
	}
}
