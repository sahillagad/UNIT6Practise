package Usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Bean.Product;
import Utility.EMUtility;

public class GetAllProductByUsingNativeQuery {

	
	
	public static void main(String[] args) {
		
	 EntityManager em=EMUtility.provideEntityManager();
	 	
	 String sql="select * from product";	
	 
	 Query query=em.createNativeQuery(sql,Product.class);
	 
	 List<Product> list=query.getResultList();
	
	 for(Product p:list) {
		 
		 System.out.println(p);
	 }
		
		
		
		
	}
	
}
