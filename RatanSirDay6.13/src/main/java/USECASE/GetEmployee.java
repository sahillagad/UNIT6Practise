package USECASE;

import java.util.List;

import javax.persistence.EntityManager;

import Bean.Department;
import Bean.Employee;
import Utility.EMUtility;

public class GetEmployee {

	public static void main(String[] args) {
		
		EntityManager entityManager=EMUtility.provideEntityManager();
		
     Employee employee=entityManager.find(Employee.class, 1);
		
         List<Department> departments= (employee.getDepartments());
         System.out.println(departments.get(0).getDepName());
         System.out.println(departments.get(1).getDepName());
		
		
	}
}
