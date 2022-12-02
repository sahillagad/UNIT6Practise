package USECASE;

import javax.persistence.EntityManager;

import Bean.Phone;
import Bean.User;
import Utility.EMUtility;

public class Add {

	public static void main(String[] args) {
		
		User user=new User();
		user.setName("Sahil");
		user.setLocation("Mumbai");
	
				
		
		Phone phone=new Phone("JIO", "Mumbai",user);
		Phone phone1=new Phone("VI", "Mumbai",user);
		Phone phone2=new Phone("Artiel", "Mumbai",user);
		
		user.getPhones().add(phone);
		user.getPhones().add(phone1);
		user.getPhones().add(phone2);
		
		EntityManager em= EMUtility.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(user);
		
		
		em.getTransaction().commit();
		 em.close();
		
		
		
		
	}
}
