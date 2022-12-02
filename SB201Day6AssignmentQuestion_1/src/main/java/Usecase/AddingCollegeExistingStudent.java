package Usecase;

import java.util.Scanner;

import Dao.AdminDao;
import Dao.AdminDaoImpl;

public class AddingCollegeExistingStudent {

	public static void main(String[] args) {
		
     Scanner sc=new Scanner(System.in);
		
		
	System.out.println("Enter College Id");
    int  collegeId=	sc.nextInt();

    System.out.println("Enter Student Roll");
	int roll=sc.nextInt();
	
	
	AdminDao dao=new AdminDaoImpl();
    
		try {
		    String s=dao.addCollegeExisting(collegeId, roll);
			System.out.println(s);
			}
			catch (Exception e) {
	  
				System.out.println(e.getMessage());
			}
	
		
		
		
		
		
	}
}
