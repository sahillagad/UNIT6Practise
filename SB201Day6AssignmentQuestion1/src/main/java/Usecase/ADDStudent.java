package Usecase;

import java.util.Scanner;

import Bean.Student;
import Dao.MumbaiUniversityDao;
import Dao.MumbaiUniversityDaoIMPL;

public class ADDStudent {

	public static void main(String[] args) {
		
		MumbaiUniversityDao dao=new MumbaiUniversityDaoIMPL();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter College Id");
	  int collegeid=	sc.nextInt();

		System.out.println("Enter Roll Number Of Student"); 
		int studentRoll=sc.nextInt();
		

		Student student=dao.getStudentByRoll(studentRoll);
		
		System.out.println(student);
		
	 dao.addStudentExisting(collegeid, student); 
		
		
		
		
	}
	
}
