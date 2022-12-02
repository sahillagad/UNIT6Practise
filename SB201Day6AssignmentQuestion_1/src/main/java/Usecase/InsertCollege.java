package Usecase;

import java.util.Scanner;

import Bean.College;
import Dao.AdminDao;
import Dao.AdminDaoImpl;

public class InsertCollege {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter College Name");
		String collageName= sc.next();
		System.out.println("Enter College Address");
		String address=sc.next();
		
		
		College college=new College();
		college.setCollageName(collageName);
		college.setCollageAddress(address);
		
		AdminDao dao=new AdminDaoImpl();
		
		try {
	    String s=dao.insertCollege(college);
		System.out.println(s);
		}
		catch (Exception e) {
  
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}
	
}
