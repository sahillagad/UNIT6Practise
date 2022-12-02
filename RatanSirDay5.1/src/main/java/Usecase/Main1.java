package Usecase;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import Bean.Product;
import Utility.EMUtility;

public class Main1 {

	public static void main(String[] args) {
		
		
	 List<Product> list=new ArrayList<Product>();
	 
	 list.add(new Product("Cort", 60));
	 list.add(new Product("D-CIN-100",28));
	 list.add(new Product("P-in-K",40));
	 list.add(new Product("oyth-K",100));
	 list.add(new Product("DEZOny",80));
	 
	 
	 EntityManager em= EMUtility.provideEntityManager();
	 
	 em.getTransaction().begin();
	 
	 for(Product pro:list) {
		 
		 em.persist(pro);
	 
	 }
	 
	 em.getTransaction().commit();
		
		
		
	}
}
