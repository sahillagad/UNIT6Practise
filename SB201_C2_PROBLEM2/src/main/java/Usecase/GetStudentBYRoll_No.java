package Usecase;

import java.util.Scanner;

import Dao.AdminDao;
import Dao.AdminDaoImpl;
import Exception.StudentException;

public class GetStudentBYRoll_No {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Roll No");
		 int rollNo=  sc.nextInt();
		
		AdminDao dao=new AdminDaoImpl();
		try {
			dao.getStudent(rollNo);
		} catch (StudentException e) {

		System.out.println(e.getMessage());
		}
		
		
	}
}
