package Usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Bean.Department1;
import Bean.Employee1;
import Utility.EMUtility;

public class FindDepartmentAndInsertEmployee {

	public static void main(String[] args) {
		
		EntityManager em= EMUtility.provideEntityManager(); 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1 For Search Department By Name");
		System.out.println("Enter 2 For Search Deaprtment By Id");
		
		int i=sc.nextInt();
		em.getTransaction().begin();
		if(i==1) {
			System.out.println("Enter Department Name...");
			String depName=sc.next();
			
			 String jpql="Select d from Department1 d where depName=?1";
			Query query= em.createQuery(jpql);
			query.setParameter(1,depName);
			
			Department1 depart1=(Department1) query.getSingleResult();
			
			
			
			if(depart1 != null ) {
			
			System.out.println("You Want Add Employee (Y/N)");
			String result=sc.next();

			
			while(result.equalsIgnoreCase("Y")) {
				
				System.out.println("Enter Employee Name");
				String Ename= sc.next();
				
				System.out.println("Enter Employee Salary");
				int salary=sc.nextInt();
				
				Employee1 empl1=new Employee1(Ename, salary);	
				
				depart1.getEmployees().add(empl1);
				em.persist(empl1);
				
				System.out.println("You Want Exit (Y/N)");
				String output=sc.next();
				
				if(output.equalsIgnoreCase("Y")) {
					
					break;
				}
								
			}
		    }
			else {
				System.out.println("DEPARTMENT is not Found...");
				
			}
			
		}
		if(i==2) {
			
			System.out.println("Enter Department Id");
			int ID=sc.nextInt();
			
			Department1 department1= em.find(Department1.class,ID);
			
			if(department1!=null) {
		
				
				System.out.println("You Want Add Employee (Y/N)");
				String result=sc.next();

				
				while(result.equalsIgnoreCase("Y")) {
					
					System.out.println("Enter Employee Name");
					String Ename= sc.next();
					
					System.out.println("Enter Employee Salary");
					int salary=sc.nextInt();
					
					Employee1 empl1=new Employee1(Ename, salary);	
					
					department1.getEmployees().add(empl1);
					em.persist(empl1);
									
					System.out.println("You Want Exit (Y/N)");
					String output=sc.next();
					
					if(output.equalsIgnoreCase("Y")) {
						
						break;
					}
				}
			}
			
			else {
				
				System.out.println("DEPARTMENT is not Found...");
			}
		
			
			
		}
		
		
		em.getTransaction().commit();
		
		
	}
}
