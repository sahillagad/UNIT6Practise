package USECASE;

import java.util.Scanner;

import javax.persistence.EntityManager;

import Bean.Employee;
import Utility.EMUtility;

public class GETEmployeeDepartmentDetails {

	public static void main(String[] args) {
					Scanner sc=new Scanner(System.in);		
					
					EntityManager em=EMUtility.provideEntityManager();
					System.out.println("Enter Employee Id");
					int ID=sc.nextInt();
					
					Employee employee= em.find(Employee.class,ID);


					if(employee!=null){
						
						System.out.println("Id : "+employee.getEid());
						System.out.println("Name : "+employee.getName());
						System.out.println("Address : "+employee.getAddress());
						System.out.println("DepId : "+employee.getDepart().getDepID() );
						System.out.println("DepName : "+employee.getDepart().getDepName());
						System.out.println("DepLocation : "+employee.getDepart().getLocation());
					}
	             
	 

	em.close();
		
		
		
		
	}
}
