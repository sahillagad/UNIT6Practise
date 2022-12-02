package Bean;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import Utility.EMUtility;

public class GetEmployeeFromDepartment {

	public static void main(String[] args) {
		
    EntityManager em=EMUtility.provideEntityManager();
		
  
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter Department Id");
     int ID= sc.nextInt();
     
     
     Department1 depart=em.find(Department1.class,ID);
     
     List<Employee1> list=depart.getEmployees();
    
     for(Employee1 empl:list) {
    	 
    	 System.out.println("Id     : "+empl.getEid());
    	 System.out.println("Name   : "+empl.getName());
    	 System.out.println("Salary : "+empl.getSalary());
    	 System.out.println("-----------------------------");
     }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
