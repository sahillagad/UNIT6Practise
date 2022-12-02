package USECASE;

import java.util.Scanner;

import javax.persistence.EntityManager;

import BEAN.Department;
import BEAN.Employee;
import Utility.EMUTILITY;

public class FindDepartmentAndEmployee {

	public static void main(String[] args) {
		
		EntityManager em=EMUTILITY.provideEntityManager();
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Department ID");
		int DepId= sc.nextInt();
		
		Department depart1=em.find(Department.class,DepId);
		
		
		if(depart1!=null) {
		while(true) {
		
			System.out.println("Enter Employee Name");
			String name= sc.next();
			
			
			System.out.println("Enter Employee Salary");
			double salary=sc.nextDouble();
			
			Employee employee=new Employee(name, salary);
			
			em.getTransaction().begin();
			
			
			em.persist(employee);
			
			em.getTransaction().commit();
			
			System.out.println("You Want To Add Employee...(Y/N)");
			String result=sc.next();
			
			if(result.equalsIgnoreCase("N")) {
				System.out.println("Thank You.....");
				break;
			}
		}
		
		}
		else {
			
			System.out.println("Department is not Find By Given Id.....");
		}
		
		
		sc.close();
		 em.close();
		
		
	}
}
