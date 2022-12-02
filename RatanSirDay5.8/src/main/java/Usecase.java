import javax.persistence.EntityManager;

import Bean.Address;
import Bean.Student;
import Utility.EMUtility;

public class Usecase {

	public static void main(String[] args) {
	EntityManager em=	EMUtility.provideEntityManager();
		
	Address  HomAddress=new Address("Mumbai", "MH","421301");
    Address officeAddress=new Address("Pune","MH","432564");
    		
	Student student=new Student("Rani",465, HomAddress,officeAddress);
	 
	em.getTransaction().begin();	
		
	em.persist(student);         	
	   
		
	em.getTransaction().commit();	
	System.out.println("Insert Record Done....");
	
	em.close();
	}
}
