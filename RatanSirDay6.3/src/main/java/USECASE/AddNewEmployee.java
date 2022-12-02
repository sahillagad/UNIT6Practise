package USECASE;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import BEAN.Department;
import BEAN.Employee;
import Utility.EMUTILITY;

public class AddNewEmployee {

	public static void main(String[] args) {
		EntityManager em=EMUTILITY.provideEntityManager();
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Department Name");
		String name= sc.next();
		
		System.out.println("Enter Department Location");
		String location=sc.next();
		

		
		String jpql="select d from Department d where name=?1 AND location=?2 ";
		Query query=em.createQuery(jpql);
		query.setParameter(1, name);
		query.setParameter(2,location);
	 	   em.getTransaction().begin();
		
		   Department depart = null;
		try {
			


	          depart=(Department) query.getSingleResult();
		   System.out.println("Department Is Already Preasent.....");
	 
		   
	       System.out.println("You Want TO Add Employee..(Y/N)");
	       String result=sc.next();
	       
	       if(result.equalsIgnoreCase("Y")) {
	    	
	    	  
	    	   while(true) {
	    		   
	    		   System.out.println("Enter Employee Name...");
	    		   String EName=sc.next();
	    		   
	    		   
	    		   System.out.println("Enter Employee Salary");
	    		   double ESalary=sc.nextDouble();
	    		   
	    		   Employee employee=new Employee(EName, ESalary);
	    		   depart.getEmployees().add(employee);
	    		   em.persist(employee);
	    		   
	    		   System.out.println("You Want To Add Employee (Y/N)");
	    		   String result1= sc.next();
	    		   
	    		   if(result1.equalsIgnoreCase("N")) {
	    			   
	    			   break;
	    		   }
	    	   }
	       }
	       else {
	    	   System.out.println("Thank You..");
	       }
	    	   
		} catch (Exception e) {
		 	   if(depart==null) {
		       Department department=new Department();
		       department.setName(name);
		       department.setLocation(location);
		       
		       
		       System.out.println("You Want TO Add Employee..(Y/N)");
		       String result=sc.next();
		       
		       if(result.equalsIgnoreCase("Y")) {
		    	
		  
		    	   while(true) {
		    		   
		    		   System.out.println("Enter Employee Name...");
		    		   String EName=sc.next();
		    		   
		    		   
		    		   System.out.println("Enter Employee Salary");
		    		   double ESalary=sc.nextDouble();
		    		   
		    		   Employee employee=new Employee(EName, ESalary);
		    		   department.getEmployees().add(employee);
		    		   em.persist(employee);
		    		   
		    		   System.out.println("You Want To Add Employee (Y/N)");
		    		   String result1= sc.next();
		    		   
		    		   if(result1.equalsIgnoreCase("N")) {
		    			   break;
		    		   }
		    	   }
		    	   
		    	   em.persist(department);
		   
		       }else {
		    	   
		    	   System.out.println("Your Department Is Craeted .....");
		       
		       }
		 	   }
		}
	 	   em.getTransaction().commit();
    	   em.close();
	}
}
