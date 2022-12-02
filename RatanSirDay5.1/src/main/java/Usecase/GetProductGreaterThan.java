package Usecase;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Bean.Product;
import Utility.EMUtility;

public class GetProductGreaterThan {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount GreaterThan Given Amount");
		Double amt=sc.nextDouble();
		
		
		EntityManager em= EMUtility.provideEntityManager();
		
		Query query=em.createNamedQuery("Product.getProductGreaterThan");
		query.setParameter(1, amt);
		
		
		List<Product> products=query.getResultList();
		
		
		products.forEach(p->{
			
			System.out.println(p);
			
		});
		
		
		
		
		
	}
}
