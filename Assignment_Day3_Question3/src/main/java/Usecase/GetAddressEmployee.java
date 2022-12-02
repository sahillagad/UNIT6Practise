package Usecase;

import java.util.Scanner;

import Dao.AdminDao;
import Dao.AdminDaoImpl;

public class GetAddressEmployee {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Employee Id");
		int emplid= sc.nextInt();
		
		
		AdminDao dao=new AdminDaoImpl();
		String s= dao.getAddressOfEmployee(emplid);
		
		System.out.println(s);
		
		
		
		
	}
}
