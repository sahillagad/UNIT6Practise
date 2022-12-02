package Usecase;

import javax.persistence.EntityManager;

import Bean.Company;
import Bean.Product;
import Utility.EMUtility;

public class Main {
	public static void main(String[] args) {
		
	  EntityManager em=	EMUtility.provideEntityManager();
		
	  Company company=new Company("s1", "23456", "Mumbai","MH");
	  Company company2=new Company("s2", "876543","Pune","MH");
	  Product product=new Product("LuX", "Soap", 54.78, company, company2);
	  
	  em.getTransaction().begin();
	  
	  em.persist(product);
		
		
		
	  em.getTransaction().commit();
	  
	  em.close();
	}

}
