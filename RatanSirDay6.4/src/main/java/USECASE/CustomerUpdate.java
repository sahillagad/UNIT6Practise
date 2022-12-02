package USECASE;

import java.util.Scanner;

import javax.persistence.EntityManager;

import Bean.Customer;
import Utility.EMUtility;

public class CustomerUpdate {
public static void main(String[] args) {
	
	
  EntityManager em=EMUtility.provideEntityManager();

   Scanner sc=new Scanner(System.in);

   System.out.println("Enter Customer Id");
   int ID=sc.nextInt();
  

   try {



   Customer customer= em.find(Customer.class, ID);
   
   if(customer!=null) {
   System.out.println("Enter 1 For  Update Customer Name");
   System.out.println("Enter 2 For Update Customer Address");
    
   int o=sc.nextInt();
   
   
   em.getTransaction().begin();
   
   if(o==1) {
	   
	   System.out.println("Enter updated Customer Name");
	   String cName= sc.next();
	   customer.setCustomerName(cName);
	   
   }
   if(o==2) {
	   System.out.println("Enter Updated Cusomer Address");
	   String cAddress=sc.next();
	   customer.setAddress(cAddress);
	   
   }
   if(o>2) {
	   
	   System.out.println("Please Give  Currect Input....");
   }
   }
   em.getTransaction().commit();
   em.close();
   
	
} catch (IllegalStateException e) {
	
  
	   System.out.println("Student Not available By Given Id");
   
}
   
   

  
  
 
	
	
	
	
}
}