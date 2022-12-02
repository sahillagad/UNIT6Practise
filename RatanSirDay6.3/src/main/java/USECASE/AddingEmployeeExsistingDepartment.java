package USECASE;

import java.util.Scanner;

import javax.persistence.EntityManager;

import BEAN.Department;
import BEAN.Employee;
import Utility.EMUTILITY;

public class AddingEmployeeExsistingDepartment {

	public static void main(String[] args) {
	 
	EntityManager em=EMUTILITY.provideEntityManager();
	
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter Department Id");
	int Id= sc.nextInt();
	
      Department department=em.find(Department.class, Id);
      
      if(department!=null) {
    	  
    	  System.out.println("Enter Employee Name");
          String name= sc.next();   
    	  
    	  System.out.println("Enter Employee Salary");
    	  double salary=sc.nextDouble();
    	  
    	 
    	  Employee employee=new Employee(name, salary);                     
    	  department.getEmployees().add(employee);
    	  em.getTransaction().begin();
    	  

    	  
    	  em.persist(employee);
    	  
    	  em.getTransaction().commit();
    	  
    	  
      }
		
		
		
		
		
	}
}





              