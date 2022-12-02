package Usecase;

import javax.persistence.EntityManager;

import Utility.Address1;
import Utility.EMUtility;
import Utility.Employee1;

public class Main1 {

	public static void main(String[] args) {
		
	 EntityManager em=	EMUtility.provideEntityManager();
		
	 em.getTransaction().begin();
		
	 Address1 Home1=new Address1("Mumbai","MH", "421301");
	 Address1 Office2=new Address1("Pune","MH", "421301");
	 Employee1 employee1=new Employee1("Sahil",56000, Home1, Office2);
	 
	 
	 em.persist(employee1);
	
		
		
		
   em.getTransaction().commit();		
		
	}
}
