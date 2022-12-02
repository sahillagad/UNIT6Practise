package USECASE;

import javax.persistence.Embedded;
import javax.persistence.EntityManager;

import Bean.DepartmentDate;
import Bean.EmployeeDate;
import Utility.EMUtility;

public class Main {

	
	public static void main(String[] args) { 
 EntityManager entityManager=EMUtility.provideEntityManager();
	
	
  
       DepartmentDate d=new DepartmentDate("HR", "Mumbai");
       
       EmployeeDate e1=new EmployeeDate("Ram", 56000, d);
       EmployeeDate e2=new EmployeeDate("Sahil",40000,d);
       
       entityManager.getTransaction().begin();
       
       
       entityManager.persist(e1);
       entityManager.persist(e2);
       
       entityManager.getTransaction().commit();
	
	
	
	}
}
