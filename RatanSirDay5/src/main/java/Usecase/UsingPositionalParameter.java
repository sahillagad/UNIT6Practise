package Usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Utility.EMUtility;

public class UsingPositionalParameter {

	public static void main(String[] args) {
		
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Id");
        int accountid=sc.nextInt();
        
        
        EntityManager em=EMUtility.provideEntityManager();
		 
        em.getTransaction().begin();
		
		
        String jpql="Update Account set balance=balance+2000 where aid=?1";
        Query query=em.createQuery(jpql);
        query.setParameter(1, accountid);
        
        
        int x=query.executeUpdate();
		
        if(x>0) {
        	System.out.println("Update Excuted Sucessfully");
        }
        else {
        	System.out.println("Update failed");
        }
		
		
		em.getTransaction().commit();
		
		
		
		
		
		
	}
}
