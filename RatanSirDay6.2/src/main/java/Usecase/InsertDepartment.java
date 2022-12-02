package Usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;

import Bean.Department1;
import Bean.Employee1;
import Utility.EMUtility;

public class InsertDepartment {
public static void main(String[] args) {
	EntityManager em=EMUtility.provideEntityManager();
	Scanner sc=new Scanner(System.in);
 
	
	System.out.println("Enter Deparment Name");
	String depName=sc.next();
	
	Department1 depart=new Department1();
	depart.setDepName(depName);
	
     System.out.println("You Want Add Employee...(If Yes Than Write 'Y' AND Id No Than Write 'N')");
     String result=sc.next();
     em.getTransaction().begin();
     
     
     while(result.equalsIgnoreCase("Y")) {
    	 System.out.println("Enter Employee Name");
    	 String name= sc.next();
    	 
    	 System.out.println("Enter Employee Salary");
    	 int salary=sc.nextInt();
    	 
    	 Employee1 employee1=new Employee1(name, salary);
    	 depart.getEmployees().add(employee1);
    	 em.persist(employee1); 
    	 
    	 System.out.println("You Want To add Employee (Y/N)");
    	 String output=sc.next();
     	 
    	 if(output.equalsIgnoreCase("N")) {
    		 break;
    	 }
     }
     
     em.persist(depart);
     em.getTransaction().commit();
      
	 
     em.close();
	
	
	
	
}
}
