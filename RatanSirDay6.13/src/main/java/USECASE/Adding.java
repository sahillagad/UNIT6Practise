package USECASE;

import javax.persistence.EntityManager;

import Bean.Department;
import Bean.Employee;
import Utility.EMUtility;

public class Adding {

	public static void main(String[] args) {
		
 EntityManager em=EMUtility.provideEntityManager();
Department department=new Department();
department.setDepName("HR");
department.setDepLocation("Mumbai");


Department department1=new Department();
department1.setDepName("IT");
department1.setDepLocation("Mumbai");
 
 Employee  employee=new Employee();
 employee.seteName("Sahil");
 employee.seteSalary(50000);
 employee.getDepartments().add(department);
 employee.getDepartments().add(department1);
		
 
 department.getEmployees().add(employee);
 department1.getEmployees().add(employee);
		
		
		
		
		em.getTransaction().begin();
		
		
		em.persist(department1);
        em.persist(department);
		  
		em.getTransaction().commit();
	em.close();	
	}
}
