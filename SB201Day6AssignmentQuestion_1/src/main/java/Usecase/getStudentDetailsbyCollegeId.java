package Usecase;

import java.util.Scanner;

import Dao.AdminDao;
import Dao.AdminDaoImpl;

public class getStudentDetailsbyCollegeId {

	public static void main(String[] args) {
		
		AdminDao dao=new AdminDaoImpl();
 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter College Id");
		 int collegeid=  sc.nextInt();
		try {

			dao.getStudentDetailbyCollegeId(collegeid);
			
		}
		catch (Exception e) {
  
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
