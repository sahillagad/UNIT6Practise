package Usecase;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import Bean.Address;
import Bean.Student;
import Utility.EMUtility;

public class Main1 {

	public static void main(String[] args) {
		
	
	EntityManager em=EMUtility.ProvideEntityManager();
		
 
	
	Address address=new Address();
	address.setCity("Mumbai");
	address.setState("MH");
	address.setPincode("421301");
	address.setLable("Home");
	
	
	
	
	Address address1=new Address();
	address1.setCity("Pune");
	address1.setState("MH");
	address1.setPincode("421302");
	address1.setLable("Home");
	
	Address address2=new Address();
	address2.setCity("Nashik");
	address2.setState("MH");
	address2.setPincode("421304");
	address2.setLable("Home");
		
		

	em.getTransaction().begin();
	em.persist(address);
	em.persist(address1);	
	em.persist(address2);
	
	em.getTransaction().commit();
	
	em.close();
		
		
		
	}
}
