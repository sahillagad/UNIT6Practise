package USECASE;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import BEAN.Department;
import BEAN.Employee;
import Utility.EMUTILITY;

public class GetAllEmployeeBYName {
	public static void main(String[] args) {
		
		
	  EntityManager em=	EMUTILITY.provideEntityManager();
		
	    
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Department Name");
	  String name= sc.next();
		
	   String jpql="SELECT d from Department d where d.name=?1";
	   Query query=em.createQuery(jpql);
	   query.setParameter(1, name);
	   
	    Department department=(Department) query.getSingleResult();
	    
	    List<Employee> employees= department.getEmployees();
	    
	    for(Employee empl:employees) {
	    	
	    	System.out.println("Id     : "+empl.getEmpID());
	    	System.out.println("Name   : "+empl.getName());
	    	System.out.println("Salary : "+empl.getSalary());
	    	System.out.println("-----------------------------");
	    	
	    	
	    }
	    
		
	    
		
		
	}

}
