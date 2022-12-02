package Usecase;

import java.awt.SystemColor;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;

import Bean.Address;
import Bean.Employee;
import Utility.EMUtility;

public class GetEmployee {

	public static void main(String[] args) {
		
		EntityManager em= EMUtility.provideEntityManager();
		
		 Employee employee=em.find(Employee.class,1);
		 
		 em.close();
		 
		 System.out.println(employee);
		 

		

	
	}
}
