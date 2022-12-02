package Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Query;

import Bean.Address;
import Bean.College;
import Bean.Student;
import Utility.EMUtility;

public class MumbaiUniversityDaoIMPL implements MumbaiUniversityDao{

	@Override
	public String registerStudent(Student student) {
		String result="Student NOT Registered Due Some Error";

	EntityManager em=	EMUtility.provideEntityManager();
		
	String jpql="Select s from Student s where s.studentName=?1 AND s.mobileNumber=?2 AND s.email=?3";
	Query query=em.createQuery(jpql);
	query.setParameter(1, student.getStudentName());
	query.setParameter(2, student.getMobileNumber());
	query.setParameter(3,student.getEmail());

	
	try {

		Student student2= (Student)query.getSingleResult();
		result="Student Is Already Present...";
	} catch (Exception e) {
		
		em.getTransaction().begin();
		
		em.persist(student);
		result="Student Registered Successfully.....";
		em.getTransaction().commit();
	}

	
	
	em.close();
	return result;
	
	
	}

	@Override
	public String registerCollege(College collage) {
		String result="college NOT Registered Due Some Error";
		

	EntityManager em=	EMUtility.provideEntityManager();

	String jpql="Select c from College c where c.collegeName=?1 AND c.collegeAddress=?2";
	Query query=em.createQuery(jpql);
	query.setParameter(1, collage.getCollegeName());
	query.setParameter(2, collage.getCollegeAddress());


	
	try {

		 College college1=(College)query.getSingleResult();
		result="college Is Already Present...";
	} catch (Exception e) {
		
		em.getTransaction().begin();
		
		em.persist(collage);
		result="college Registered Successfully.....";
		em.getTransaction().commit();
	}

	
	
	em.close();
	return result;
	
		 
	}

	@Override
	public Student getStudentByRoll(int Roll) {
		Student student=null;
		EntityManager em=EMUtility.provideEntityManager();
		student= em.find(Student.class, Roll);
		 em.close();
		return student;
		 
	
	}

	@Override
	public List<Student> getAllStudentOfCollageID(int collageId) {
		List<Student> students=null;
		EntityManager em=EMUtility.provideEntityManager();
	    College college=em.find(College.class, collageId);
	    students=college.getStudents();
		 
		 em.close();
		 return students;
	}



	@Override
	public void getCollegeByName(String CollegeName) {
	
	 EntityManager em=	EMUtility.provideEntityManager();
	String jpql="select c from College c where c.collegeName=?1";
	Query query=em.createQuery(jpql);
	
	query.setParameter(1,CollegeName );
	
	List<College> colleges=query.getResultList();
	
	for(College coll:colleges) {
		
		System.out.println("College Id          : "+coll.getCollegeId());
		System.out.println("College Name    : "+coll.getCollegeName());
		System.out.println("College Address : "+coll.getCollegeAddress()); 
		System.out.println("------------------------------------------------------");
	}
		
	 
	 
	}

	@Override
	public List<Object[]> getStudentNameANDMobileNumber(String name) {
		List<Object[]> list=null;
		EntityManager em=EMUtility.provideEntityManager();

			String jpql="Select s.studentName,s.mobileNumber from Student s where s.studentName=?1";
			Query query=em.createQuery(jpql);
			query.setParameter(1, name);
		    list=query.getResultList();
			 em.close();
		return list;
	}
	
	@Override
	public void addStudentExisting(int collegeId, int studentId) {
		EntityManager em=EMUtility.provideEntityManager();
		
		   College college=  em.find(College.class,collegeId);
		   Student student=em.find(Student.class,studentId);
		   
		   if(college!=null && student !=null) {
			   
			   em.getTransaction().begin();

			    
			    student.setCollege(college);
			   
			    em.merge(student);
			    college.getStudents().add(student);

			   
			   
			   
			   em.getTransaction().commit();
			   
		   }
       		
		
		   em.close();
		
		
	}
	

	@Override
	public void addStudentExisting(int collegeId, Student student) {
         EntityManager em=EMUtility.provideEntityManager();
         College college=  em.find(College.class,collegeId);
em.getTransaction().begin();
         if(college!=null) {


        	 
        	 student.setCollege(college);
        	 em.merge(student);
        	 
        	 
       
        	 
        	 
        	 
//        	String jpql="Update Student set college=?1 where studentRoll=?2";
//        	Query query=em.createQuery(jpql);
//        	query.setParameter(1,college);
//        	query.setParameter(2, student.getStudentRoll());
//        	query.executeUpdate();
        	
        	  } 
        
          em.getTransaction().commit();
	}
	
	

	@Override
	public College getCollegeBYId(int collegeId) {
		College college=null;
		EntityManager em=EMUtility.provideEntityManager();
		college= em.find(College.class,collegeId);
		 return college;
		
	}

	@Override
	public void UpdateStudent(Student student) {
 
		EntityManager em= EMUtility.provideEntityManager();
   
		try {
		Student student2=em.find(Student.class , student.getStudentRoll());
		
		em.getTransaction().begin();
		
		 
		student2.setAddresses(student.getAddresses());
		student2.setCollege(student.getCollege());
		student2.setEmail((student.getEmail()));
		student2.setMobileNumber(student.getMobileNumber());
		student2.setStudentName(student.getStudentName());

		
 
		  em.getTransaction().commit();
		  em.close();
		}
		catch (Exception e) {
		System.out.println("Student Is Not Fund By Given Id...");
		}
		
	}

	@Override
	public void UpdateCollege(College college) {
		 
		EntityManager em= EMUtility.provideEntityManager();
   
	
		try {
		
			College college2=(College) em.find(College.class, college.getCollegeId());
			em.getTransaction().begin();
			
	              college2.setCollegeAddress(college.getCollegeAddress());
	              college2.setCollegeName(college.getCollegeName());
	              college2.setStudents(college.getStudents());
	             
	              		
			
			em.getTransaction().commit();
		em.close();
		System.out.println("College Update Successfully......");
		} catch (Exception e) {

			System.out.println("College Is Not Availble By Given Detail...");
		}
		
		

		
	}

	@Override
	public List<College> getCollegeList() {
	 
	 EntityManager em=	EMUtility.provideEntityManager();
	
	 String jpql="Select C from College C";
	 Query query=em.createQuery(jpql);
	 
	 List<College> colleges= query.getResultList();
	
	
	return colleges;
	 
	}

	@Override
	public void GetCollegeDetail(int CollegeId) {
		
		EntityManager em= EMUtility.provideEntityManager();
		   
		
		try {
		
			College college2=(College) em.find(College.class,CollegeId);
 
			 System.out.println(college2);
		 
			
			 
	}
		catch (Exception e) {
	System.out.println("College Is Not Available By Given Id.....");
		}

	
	
	
}
}
