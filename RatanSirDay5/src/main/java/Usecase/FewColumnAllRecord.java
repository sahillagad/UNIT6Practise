package Usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Utility.EMUtility;

public class FewColumnAllRecord {

	public static void main(String[] args) {
		
	EntityManager em=EMUtility.provideEntityManager();
	
	
	String jpql="select name,balance from Account";
	
	Query query=em.createQuery(jpql);
	
	
	List<Object[]> list=query.getResultList();
	
	for(Object[] obj:list) {
		
		System.out.println((obj[0])+" "+(obj[1]));
		System.out.println("-----------------");
	}
	
	

	
	System.out.println("---------------------***********------------------------");
	
	for(Object[] obj:list) {
		
		String name=(String)(obj[0]);
		Integer balance=(Integer)(obj[1]);
		
		System.out.println(name.toUpperCase()+" "+balance);
	}
	
		

	
	
		
		
		
		
		
		
	}
}
