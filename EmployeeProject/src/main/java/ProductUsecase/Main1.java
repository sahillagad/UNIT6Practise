package ProductUsecase;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import Bean.Employee;
import Bean.Product;
import UTILITY.EMUTILITY;

public class Main1 {

	public static void main(String[] args) {
		
		
		
	Product p1=new Product("lux",100);
	Product p2=new Product("detal",130);
	Product p3=new Product("santuer",200);
	Product p4=new Product("midimax",500);
	
		
		
		
		List<Product> products=new ArrayList<>();
		
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);

		
		
		EntityManager em=EMUTILITY.provideEntityManager();
		
		
		em.getTransaction().begin();
		
		
		for(Product pro:products) {
			
			
			em.persist(pro);
			
		}
		
		
		
		em.getTransaction().commit();
		
		
		em.close();
		
		
		
		
	}
}
