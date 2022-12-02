package Usecase;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import Bean.Phone;
import Bean.User;
import Utility.EMUtility;

public class Demo {

	public static void main(String[] args) {
		
		
		
		EntityManager em= EMUtility.ProvideEntityManager();
		
		em.getTransaction().begin();
		
		User user=new User();
		user.setUsername("Sahil");
		List<Phone> list= new ArrayList<>();
		
		list.add(new Phone("Home", "987654321", 1));
		list.add(new Phone("Office", "543654321", 1));
		list.add(new Phone("Home", "887654321", 1));  
		
		user.setPhoneList(list);
		
		
		em.persist(user);
		
		em.getTransaction().commit();
		
	}
	
}
