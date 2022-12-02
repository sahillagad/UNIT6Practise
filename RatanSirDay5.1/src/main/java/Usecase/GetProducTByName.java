package Usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Bean.Product;
import Utility.EMUtility;

public class GetProducTByName {
public static void main(String[] args) {
	EntityManager em=EMUtility.provideEntityManager();
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Product Name");
	String productName= sc.next();
	
	Query query= em.createNamedQuery("Product.getProductByName");
	query.setParameter(1,productName);
	
	Product product=(Product) query.getSingleResult();
	
	System.out.println(product);
	
	
	
	
	
}
}
