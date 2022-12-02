package Usecase;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Bean.Product;
import Utility.EMUtility;

public class GetProductLessThan {

	public static void main(String[] args) {
		
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter Amount less than product You Want");
	 Double amt= sc.nextDouble();	
	 
		
	 EntityManager em=	EMUtility.provideEntityManager();
	
	 Query query=em.createNamedQuery("Product.getProductLessThan");
	 query.setParameter(1, amt);
	 
	 List<Product> list= query.getResultList();
		
	 for(Product p:list) {
		 
		 System.out.println(p);
	 }
	 
		
		
		
		
		
	}
}
