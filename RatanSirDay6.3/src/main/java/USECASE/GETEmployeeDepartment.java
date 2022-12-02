package USECASE;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import BEAN.Department;
import BEAN.Employee;
import Utility.EMUTILITY;

public class GETEmployeeDepartment {

	public static void main(String[] args) {
		
		EntityManager em= EMUTILITY.provideEntityManager(); 
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Employee Id");
	     int ID= sc.nextInt();
		
		String jpql="SELECT d from Department d";
		
		Query query= em.createQuery(jpql);
		
		List<Department> departments= query.getResultList();
		
		
		for(Department depart:departments) {
			
			
			for(Employee empl:depart.getEmployees()) {
				
				if(empl.getEmpID()==ID) {
					System.out.println("Id       : "+empl.getEmpID());
					System.out.println("Name     : "+empl.getName());
					System.out.println("Salary   : "+empl.getSalary());
					System.out.println("D-Name   : "+depart.getName());
					System.out.println("D-ID     : "+depart.getDepID());
					System.out.println("---------------------------------");
				}
				
				
			}
			
			
			
			
		}
		
		
		
		
	}
	
}
