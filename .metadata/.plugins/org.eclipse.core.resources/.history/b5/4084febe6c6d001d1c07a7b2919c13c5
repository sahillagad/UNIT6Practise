package Usecase;

import javax.persistence.EntityManager;

import Bean.Student;
import Utility.EMUtility;

public class GetStudent {

	public static void main(String[] args) {
		
	 EntityManager em=EMUtility.provideEntityManager();
		
	 Student student= em.find(Student.class,1);
	 em.close();
	 
	 System.out.println(student);
	 
		
		
		
		
	}
}
