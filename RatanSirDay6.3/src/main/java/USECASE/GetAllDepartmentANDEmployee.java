package USECASE;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import BEAN.Department;
import BEAN.Employee;
import Utility.EMUTILITY;

public class GetAllDepartmentANDEmployee {

	public static void main(String[] args) {
		
	  EntityManager em=EMUTILITY.provideEntityManager();
		
      String jpql="SELECT d from Department d";
 
      Query query=em.createQuery(jpql);
      
      List<Department> departments= query.getResultList();
      
      for(Department depart:departments) {
    	  
    	  System.out.println("-----------"+depart.getName()+"-----------");
    	  for(Employee empl:depart.getEmployees()) {
    		  
    		  
  	       	System.out.println("Id     : "+empl.getEmpID());
  	    	System.out.println("Name   : "+empl.getName());
  	    	System.out.println("Salary : "+empl.getSalary());
  	    	System.out.println("-----------------------------");
  	    	
    		  
    	  }
    	  
    	  System.out.println("************************************************");
    	  
    	  
    	  
      }
      
		
		
		
		
	}
}
