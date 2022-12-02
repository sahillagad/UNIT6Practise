package Usecase;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Bean.Product;
import Utility.EMUtility;

public class NamedQuery {

	public static void main(String[] args) {
		
		
	  EntityManager em=EMUtility.provideEntityManager();
		
	  Query query= em.createNamedQuery("Product.getAllProduct");
	  
	  List<Product> list=query.getResultList();	  
	  
	  for(Product i:list) { 
		
		  System.out.println(i);
	  
	  }
		
		
		
		
		
	}
}
