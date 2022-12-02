package USECASE;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import BEAN.Department;
import BEAN.Employee;
import Utility.EMUTILITY;

public class DepartmentandEmployee {

	public static void main(String[] args) {
		
		EntityManager em= EMUTILITY.provideEntityManager();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Department Name");
		String name= sc.next();
		
		String jpql="select d from Department d where d.name=?1";
		TypedQuery<Department> query=em.createQuery(jpql,Department.class);
		
		query.setParameter(1, name);
		
	 
		Department department=query.getSingleResult();
		
		for(Employee empl:department.getEmployees()) {
			
	       	System.out.println("Id     : "+empl.getEmpID());
	    	System.out.println("Name   : "+empl.getName());
	    	System.out.println("Salary : "+empl.getSalary());
	    	System.out.println("-----------------------------");
	    	
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}
