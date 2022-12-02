package Usecase;

import java.util.Scanner;

import Dao.AdminDao;
import Dao.AdminDaoImpl;
import Entity.Course;
import Entity.Student;

public class AddCourse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Course Name");
		String name= sc.next();
		
		System.out.println("Enter Course Duration In Month (Only Month Write eg- 1,2,3)");
		int month=sc.nextInt();
		
		System.out.println("Enter Course Fee");
		double fee=sc.nextDouble();
		
		
		Course course=new Course();
		course.setCourseName(name);
		course.setDuration(month);
		course.setFee(fee);
		
		System.out.println("You Want Add Student (for Yes write Y otherwise N )");
		String s= sc.next();
		
		while(s.equalsIgnoreCase("Y")) {
			
			System.out.println("Enter Student Name");
			String SName= sc.next();
			
			System.out.println("Enter Student Email");
			String SEmail=sc.next();
			
			System.out.println("Enter Student Mobile Number");
			String SMobile=sc.next();
			
			Student student=new Student(SName, SMobile, SEmail, course);
			 
			course.getStudents().add(student);
			
			
			System.out.println("You Want Add One More Student (Y/N)");
			String result=sc.next();
			
			if(result.equalsIgnoreCase("N")) {
				break;
			}
		}
		
		
    AdminDao dao=new AdminDaoImpl();
    dao.addCourse(course);
		

		
	}
	
}
