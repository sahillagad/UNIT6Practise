package Usecase;

import javax.persistence.EntityManager;

import Bean.ContractualEmployee;
import Bean.Employee;
import Bean.SalaryEmployee;
import Utility.EMUtility;

public class Demo {

	public static void main(String[] args) {

		Employee employee=new Employee("Rani"); 
		
		
	ContractualEmployee contractualEmployee=new ContractualEmployee();
	contractualEmployee.setName("Tom");
	contractualEmployee.setNoOfWorkingDays(4);
	contractualEmployee.setCostPerDay(2000);
	
	SalaryEmployee salaryEmployee=new SalaryEmployee();
	salaryEmployee.setName("Manasi");
	salaryEmployee.setSalary(50000);

	
	 EntityManager em=	EMUtility.provideEntityManager();
	
	 em.getTransaction().begin();
		
	em.persist(employee); 
	em.persist(contractualEmployee);
	em.persist(salaryEmployee);
		
		
	em.getTransaction().commit();	
		
		
	}
}
