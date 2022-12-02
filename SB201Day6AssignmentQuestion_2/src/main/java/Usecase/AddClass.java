package Usecase;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import Dao.Address;
import Dao.Customer;
import Utility.EMUtility;

public class AddClass {

	public static void main(String[] args) {
		
    
    EntityManager em=EMUtility.provideEntityManager();	
	
    List<Address> addresses=new ArrayList<>();
    addresses.add(new Address("MH","MUMBAI", "432148"));
    addresses.add(new Address("MH","Pune", "543346"));
    addresses.add(new Address("MH","Nashik","654388"));
    
    
    Customer customer=new Customer("Sahil","98765432", "Sahil@gmail.com", addresses);
    
    
    
    List<Address> addresses1=new ArrayList<>();
    addresses1.add(new Address("MH","Nagpur", "762148"));
    addresses1.add(new Address("MH","Pune", "543346"));
    addresses1.add(new Address("MH","Nashik","654388"));
    
    
    Customer customer1=new Customer("Raj","88765432", "Ram@gmail.com", addresses1);
    
    
        
    
		
		em.getTransaction().begin();
		
	

 		  em.persist(customer1);
       em.persist(customer);		
		em.getTransaction().commit();
		
		em.close();
	}
}
