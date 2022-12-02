package Usecase;

import java.util.Scanner;

import Dao.AdminDao;
import Dao.AdminDaoImpl;
import Exception.CollegeException;

public class UpdateCollege {

public static void main(String[] args) {
	
	
	AdminDao dao=new AdminDaoImpl();

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter College Id");
   int	collegeId= sc.nextInt();
	
	try {
    String s=dao.updateCollege(collegeId);
	System.out.println(s);
	}
	catch (Exception e) {

		
		System.out.println(e.getMessage());
	}
	

	
	
}
}
