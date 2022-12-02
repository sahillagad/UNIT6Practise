package Usecase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.persistence.EntityManager;

import Bean.Address;
import Bean.Person;
import Bean.RTO;
import Utility.EMUtility;

public class ADDVechical {

	public static void main(String[] args) {
		
 	 EntityManager em=	EMUtility.provideEntityManager();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name=sc.next();
		
		
		System.out.println("Enter mobile");
		String mobile=sc.next();
		
		
		System.out.println("Enter Data of Birth dd/MM/yyyy");
		String date=sc.next();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate DOB=LocalDate.parse(date, formatter);
		
		
	
		System.out.println("Enter City");
		String city= sc.next();
		
		System.out.println("Enter State");
		String state= sc.next();
		
		System.out.println("Enter Pincode");
		String pincode= sc.next();

		Address address=new Address(state, city, pincode);
	    Person person=new Person(name, mobile, address, DOB);
		
	
		
		
		System.out.println("Enter Vechical Number");
		String vechicalNumber=sc.next();
		
		
		System.out.println("Enter Vechical Registration Date write in formate dd/MM/yyyy");
		String Rdate=sc.next();
		LocalDate Rdate1=LocalDate.parse(Rdate, formatter);
		
		
		
		System.out.println("Enter color of vechical");
		String color=sc.next();
		
		
		
		RTO rto=new RTO(person, vechicalNumber, Rdate1, color);
		
		
		em.getTransaction().begin();
		 
		
		em.persist(rto);
		
		
		em.getTransaction().commit();
		
		
		em.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
