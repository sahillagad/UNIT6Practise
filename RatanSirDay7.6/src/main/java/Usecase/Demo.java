package Usecase;

import javax.persistence.EntityManager;

import Bean.Department;
import Bean.Employee;
import Utility.EMUtility;

public class Demo {
public static void main(String[] args) {
	Employee employee=new Employee();
	employee.seteName("Sahil");
	employee.setSalary(50000);

	
	
	
 Department department=new Department();	
	 department.setDepName("Sahil");

	 department.setLocation("Mumbai");
	
		employee.setDepartment(department);

		 department.setEmployee(employee);
	
		 
		 EntityManager em=EMUtility.provideEntityManager();
		 em.getTransaction().begin();
		 
	
		 em.persist(employee);
	
		 em.getTransaction().commit();
	
}
}
