package USECASE;

import javax.persistence.EntityManager;

import Bean.Customer;
import Bean.Product;
import Utility.EMUtility;

public class AddingProduct {

	public static void main(String[] args) {
		
		
		Product product=new Product("sharbat", 85);
		Product product2=new Product("Vinegar", 70);
		Product product3=new Product("Kesar", 310);
//		Product product4=new Product("Orange Juice",95);
//		Product product5=new Product("Milk Powder",225);
//		Product product6=new Product("Ghee", 1467);
//		Product product7=new Product("Atta",407);
		
		Customer customer=new Customer();
		customer.setCustomerName("Rani Roa");
		customer.setAddress("Nashik");
		customer.getProducts().add(product);
		customer.getProducts().add(product2);
		customer.getProducts().add(product3);
//		customer.getProducts().add(product4);
//		customer.getProducts().add(product5);
//		customer.getProducts().add(product6);
//		customer.getProducts().add(product7);
		
		
	 EntityManager em=	EMUtility.provideEntityManager();
	em.getTransaction().begin();
	
	
	em.persist(customer);
	
	em.getTransaction().commit();
	 em.close();

	}
}
