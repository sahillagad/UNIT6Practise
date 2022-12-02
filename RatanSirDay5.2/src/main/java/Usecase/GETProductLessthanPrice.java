package Usecase;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Bean.Product;
import Utility.EMUtility;

public class GETProductLessthanPrice {

	public static void main(String[] args) {
		
	  EntityManager em=EMUtility.provideEntityManager();
       Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter Amount less than Product Look");
	  Double amt=sc.nextDouble();
	 
	  
	  String sql="select * from product where mrp<?1";
	 Query query=em.createNativeQuery(sql,Product.class); 
	 	
	 query.setParameter(1, amt);
	 List<Product>  list=query.getResultList();
	 
	 for(Product p:list) {
		 
		 System.out.println(p);
	 }
 		
		
		
	}
}
