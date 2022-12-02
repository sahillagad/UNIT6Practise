package Usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Bean.Product;
import Utility.EMUtility;

public class NameNativeQuery {

	public static void main(String[] args) {
		
   EntityManager em= EMUtility.provideEntityManager();
 
   Query query=em.createNamedQuery("Product.getAllProduct");
   
   List<Product> list= query.getResultList();
   
   for(Product p:list) {
	   
	   System.out.println(p);
   }
    
		
		
		
		
	}
}
