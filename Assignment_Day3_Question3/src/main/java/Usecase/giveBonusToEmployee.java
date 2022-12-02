package Usecase;

import java.util.Scanner;

import Dao.AdminDao;
import Dao.AdminDaoImpl;

public class giveBonusToEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Employee emplId");
 		int emplId= sc.nextInt();
		
		
		System.out.println("Enter Employee Bouns");
		int bouns=sc.nextInt();
		
		AdminDao dao=new AdminDaoImpl();
		
		String s= dao.giveBonusToEmployee(emplId, bouns);
		
		System.out.println(s);
		
		
		
	}
}
