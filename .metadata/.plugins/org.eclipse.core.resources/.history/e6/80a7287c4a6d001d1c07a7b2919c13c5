import javax.persistence.EntityManager;

import Bean.Address;
import Bean.Student;
import Utility.EMUtility;

public class Usecase {

	public static void main(String[] args) {
	EntityManager em=	EMUtility.provideEntityManager();
		
	Address address=new Address("Mumbai", "MH","421301");
    Student student=new Student("Rani",465, address);
	 
	em.getTransaction().begin();	
		
	em.persist(student);         	
	   
		
	em.getTransaction().commit();	
	System.out.println("Insert Record Done....");
	
	em.close();
	}
}
