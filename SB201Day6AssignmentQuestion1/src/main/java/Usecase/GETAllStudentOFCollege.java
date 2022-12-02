package Usecase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import Bean.Address;
import Bean.College;
import Bean.Student;
import Dao.MumbaiUniversityDao;
import Dao.MumbaiUniversityDaoIMPL;

public class GETAllStudentOFCollege {

	public static void main(String[] args) {
		
		MumbaiUniversityDao dao=new MumbaiUniversityDaoIMPL();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter College Id");
	    int collegeid=	sc.nextInt();
	    
	   List<Student> list= dao.getAllStudentOfCollageID(collegeid);
		/*
		 * 	private int studentRoll;
	private String studentName;
	private String mobileNumber;
	private String email;

	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private College college;
	   
	@Embedded
	@ElementCollection
     List<Address> addresses=new ArrayList<>();
		 */
	   list.forEach(t ->{
		   System.out.println("Student Roll      : "+t.getStudentRoll());
		   System.out.println("Student Name  : +"+t.getStudentName());
		   System.out.println("Student Mobile : "+t.getMobileNumber());
		   System.out.println("Student Email   : "+t.getEmail());
//		   System.out.println("Student Address : "+t.getAddresses());
		   System.out.println("Student College  Id "+t.getCollege().getCollegeId());
		   System.out.println("Student College Name : "+t.getCollege().getCollegeName());
		   System.out.println("Student College Address : "+t.getCollege().getCollegeAddress());
		  
	   } );
		
		
		
	}
}
