package Usecase;

import javax.persistence.EntityManager;

import com.mysql.cj.protocol.FullReadInputStream;

import Entity.FullTimeInstructor;
import Entity.PartTimeInstructor;
import Utility.EMUtility;

public class Insert {

	public static void main(String[] args) {
		
	 EntityManager em=	EMUtility.provideEntityManager();
		
 
	     FullTimeInstructor fullTimeInstructor=new FullTimeInstructor("Sahil", 50000,"Sahil@gamil.com");
	     FullTimeInstructor fullTimeInstructor1=new FullTimeInstructor("Ram", 50000,"Ram@gamil.com");
	     FullTimeInstructor fullTimeInstructor2=new FullTimeInstructor("Rani", 50000,"Rani@gamil.com");
	     FullTimeInstructor fullTimeInstructor3=new FullTimeInstructor("Raj", 50000,"Raj@gamil.com");
		
		
		  PartTimeInstructor partTimeInstructor=new   PartTimeInstructor("Tom",3,200,"987654321");
		  PartTimeInstructor partTimeInstructor1=new   PartTimeInstructor("jarry",3,2600,"887654321");
		  PartTimeInstructor partTimeInstructor2=new   PartTimeInstructor("raone",1,200,"787654321");
		  PartTimeInstructor partTimeInstructor3=new   PartTimeInstructor("Topgun",1,2200,"977654321");
		
		  
		  
	  em.getTransaction().begin();
	  
	  em.persist(fullTimeInstructor3);
	  em.persist(fullTimeInstructor1);
	  em.persist(fullTimeInstructor2);
	  em.persist(fullTimeInstructor);
	  
	  em.persist(partTimeInstructor3);
	  em.persist(partTimeInstructor);
	  em.persist(partTimeInstructor2);
	  em.persist(partTimeInstructor1);
	  
	  
	  em.getTransaction().commit();
	}
 
 
	
}
