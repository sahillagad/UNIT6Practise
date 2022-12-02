package Usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Bean.Product;
import Utility.EMUtility;

public class GetProductBYID {

	public static void main(String[] args) {
		System.out.println("Enter Product Id...");
		Scanner sc=new Scanner(System.in);
		int pid=sc.nextInt();
		
		EntityManager em=EMUtility.provideEntityManager();
		
        String sql="select * from product where pid=?1";
       
        
        Query query=em.createNativeQuery(sql,Product.class);
	   query.setParameter(1, pid);
        Product product=(Product) query.getSingleResult();
	    System.out.println(product);
        
		
		
		
		
		
		
	}
}
