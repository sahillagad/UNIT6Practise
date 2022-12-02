package Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.CascadeType;
import javax.persistence.EntityManager;
import javax.persistence.OneToMany;
import javax.persistence.Query;

import Bean.Address;
import Bean.College;
import Bean.Student;
import Exception.CollegeException;
import Exception.StudentException;
import Utility.EMUtility;

public class AdminDaoImpl implements AdminDao{

	@Override
	public String insertStudent(Student student) throws StudentException {
	String result="Student is Not Insert Due To Some Error...";
		EntityManager em=	EMUtility.provideEntityManager();
	 
		 String jpql="select s from Student s where s.studentName=?1 AND s.mobileNumber=?2 AND s.email=?3";
		 Query query=em.createQuery(jpql);
	    query.setParameter(1, student.getStudentName());
	    query.setParameter(2, student.getMobileNumber());
	    query.setParameter(3, student.getEmail());
	    
	    try {
		    Student student2= (Student)query.getSingleResult();
	          result=("Student Already Present"); 
	    
		} catch (Exception e) {
		
			em.getTransaction().begin();
			em.persist(student);
			result="Student insert Sucessfully....";
			em.getTransaction().commit();
		    
		 }
	    em.close();
		return result;
	}

	@Override
	public Student getStudentById(int roll) throws StudentException {
	         Student student=null;
	         
	         EntityManager em= EMUtility.provideEntityManager();
	         student= em.find(Student.class,roll);
		
	         if(student==null) {
	        	 StudentException exception=new StudentException("Student Not Present By Given Id");
	        	 throw exception;
	         }
	          
		return student;
	}

	@Override
	public List<Student> getAllStudent() throws StudentException {
		  List<Student> list=null;
		EntityManager em=	EMUtility.provideEntityManager();
	   
	 String jpql="Select s  from Student s";
	 
	  Query query=em.createQuery(jpql);
            list= query.getResultList();
		
	  
	  if(list==null) {
		  StudentException exception=new StudentException("Student Database is Empty......");
		  throw exception;
	  }
	  
	  
		return list;
	}

	@Override
	public String insertCollege(College college) throws CollegeException {
	    String result="College Is Not Insert Due To Some Error.....";
		 EntityManager em=EMUtility.provideEntityManager();
		 
		 String jpql="Select c from College c where collageName=?1 AND collageAddress=?2";
		 Query query=em.createQuery(jpql);
		 query.setParameter(1, college.getCollageName());
		 query.setParameter(2,college.getCollageAddress());
		 
		 try {

			 College college2=(College) query.getSingleResult();
		   result="College Is already Present.....";
		 } catch (Exception e) {
			
			 em.getTransaction().begin();
			 			 
			 em.persist(college);
			 			 
			 em.getTransaction().commit();
		}
		 em.close();
		return result;
	}

	@Override
	public List<College> getAllCollege() throws CollegeException {
   EntityManager em=EMUtility.provideEntityManager();
		 List<College> colleges=null;
		 
		 String jpql="select c from College c";
		 Query query=em.createQuery(jpql);
		 colleges=query.getResultList();
		 
		 
		 if(colleges==null) {
			 
			 CollegeException collegeException=new CollegeException("College Is Not Fund In DataBase");
            throw collegeException;			 
		 }
		
	
		 return colleges;
	}

	@Override
	public College getCollegeBycollageId(int collageId) throws CollegeException {
		College college=null;
		
 		EntityManager em= EMUtility.provideEntityManager();
	  college=	em.find(College.class,collageId);
 	
	   if(college==null) {
		   CollegeException collegeException=new CollegeException("College Is Not Found By Given College Id");
		   		   throw collegeException; 	   
	   }
	 
		return college;
	}

	@Override
	public String addCollegeExisting(int collegeId, int roll) throws CollegeException, StudentException {
		String result="Operation Failed Due To Some Error Occuring.....";
		EntityManager em=  EMUtility.provideEntityManager();
	   
		College college=em.find(College.class, collegeId);
		Student student=em.find(Student.class, roll);
		
		if((college!=null) && (student!=null)) {
			
			em.getTransaction().begin();
			
			
			college.getStudents().add(student);
			student.setCollege(college);
			
			
			em.getTransaction().commit();
	        result="Operation Perform Successfully........";
			em.close();
		}
		else {
			
			StudentException exception=new StudentException("Please Provide Vaild Input.......");
			throw exception;
			
		}
		
	return result;
	}

	@Override
	public String updateStudent(int roll) throws StudentException {
		String result="Operation Failed Due To Some Error Occuring.....";
		EntityManager em=  EMUtility.provideEntityManager();
	   

		Student student=em.find(Student.class, roll);
		

		if(student!=null) {

			em.getTransaction().begin();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1 For Update Name");
			System.out.println("Enter 2 For Update mobile");
			System.out.println("Enter 3 For Update Email");
           System.out.println("Enter 4 For Update Address");
           System.out.println("Enter 5 For Update College");
           
         int  x= sc.nextInt();
           
         if(x==1) {
        	 System.out.println("Enter Update Name");
        	 String name=sc.next();
 
        	 student.setStudentName(name);
         }	
         
         if(x==2) {
        	 System.out.println("Enter Update Mobile");
        	 String mobile=sc.next(); 
        	 
        	 student.setMobileNumber(mobile);
        	 
        	 
         }
         
         if(x==3) {
        	 System.out.println("Enter Update Email");
             String email=sc.next(); 
        	student.setEmail(email); 
         }
         if(x==4) {
        	 System.out.println("Enter  Update State");
        	 String state=sc.next();
        	 
        	 System.out.println("Enter Update City");
        	String city=sc.next();
        	 
        	 System.out.println("Enter Update pincode");
        	String pincode=sc.next();
        	 
        	 System.out.println("Enter Update type");
        	 String type=sc.next();
        	 
        	 Address address=new Address(state, city, pincode, type);
        	 
        	 student.setAddress(address);
         }
         if(x==5) {
        	 
        	 System.out.println("Enter College Id ");
        	 int collegeid=sc.nextInt();
        	 
        	 College college=  em.find(College.class, collegeid);
        	 
        	 student.setCollege(college);
        	 
         }
         if(x>5) {
        	 
        	 System.out.println("Please Provide Currect Input.......");
        	 
         }
         
         
         em.getTransaction().commit();
         result="Update Process Done....";
         em.close();
		}
		else {
			
			StudentException  exception=new StudentException("Student Is Not Available By Given Id");
			throw exception;
		}
		return result;
	}

	@Override
	public String updateCollege(int collegeid) throws CollegeException {
		String result="Update Process Is Failed.....";
	 	EntityManager em= EMUtility.provideEntityManager();
		
		College college=(College)em.find(College.class, collegeid);

		if(college!=null) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter 1 For Update College Name");
			System.out.println("Enter 2 For Update College Address");
			System.out.println("Enter 3 For College Add Student");
			System.out.println("Enter 4 For Remove Student");

			 int x=sc.nextInt();
			
			 em.getTransaction().begin();
			 
			 if(x==1) {
			
				 
				 System.out.println("Enter New College Name");
				 String collegeName= sc.next();
				 college.setCollageName(collegeName);
				 
			 }
			if(x==2) {
				System.out.println("Enter update Collage Address ");
				String address=sc.next();
				college.setCollageAddress(address);
				
			}
			if(x==3) {
				System.out.println("\n---------------Enter  Student Detail------------\n");
				
				System.out.println("Enter Student Name");
				String studentName=sc.next();
				
				System.out.println("Enter Student Mobile Number");
				String studentMobile=sc.next();
				
				System.out.println("Enter Student Email");
               String studentEmail=sc.next();
				
               
              
               
				System.out.println("Enter State");
	        	 String state=sc.next();
	        	 
	        	 System.out.println("Enter City");
	        	String city=sc.next();
	        	 
	        	 System.out.println("Enter pincode");
	        	String pincode=sc.next();
	        	 
	        	 System.out.println("Enter type");
	        	 String type=sc.next();
				
				
	        	 Address address=new Address(state, city, pincode, type);
	        	 Student student=new  Student(studentName, studentMobile, studentEmail, address, college);
	        	 
	        	 college.getStudents().add(student);
	        	 
			}
			if(x==4) {
				
										System.out.println("Enter Student Roll Number Which You Want TO Remove...");
									 	int  roll= sc.nextInt();
										Student student=em.find(Student.class,roll);
										if(student!=null) {
											
						//					
						//					college.getStudents().remove();
											em.remove(student);
											
										}
										else {
											System.out.println("Student Is Not Available By Given Roll Number");
										}
				
			}
			if(x>4) {
				System.out.println("Please Provide Correct Input....");
				
			}

			em.getTransaction().commit();
			result="Update Process Done";
			em.close();
		}
		else {
		
			CollegeException collegeException=new CollegeException("College Is Not  Fund By Given College  ID");
			throw collegeException;
		}
		
		
		return result;
	}

	@Override
	public void getStudentDetailbyCollegeId(int collegeid) throws CollegeException {
	 EntityManager em= EMUtility.provideEntityManager();
		
	 College college=em.find(College.class, collegeid);
	 

	  if(college!=null) {
		  
			 System.out.println("College ID "+college.getCollageId());
			 System.out.println("College Name  "+college.getCollageName() );
			 System.out.println("College Address "+college.getCollageAddress());
			 System.out.println("-------------------------------------------------------------------------------");		  
		
		     List<Student> list=college.getStudents();
		  System.out.println("..................................Student Detail..................................");
		     for(Student student:list) {
		    	 System.out.println("Student Roll        "+student.getStudentRoll());
		    	 System.out.println("Student Name     "+student.getStudentName());
		    	 System.out.println("Student Email     "+student.getEmail());
		    	 System.out.println("Student Mobile   "+student.getMobileNumber());
		    	 System.out.println("Student Address  "+student.getAddress());
		    	 System.out.println("student College   "+student.getCollege().getCollageName());
		    	 
		    	 System.out.println("--------------------------------------------------------\n");
		     }
		  
		  
		  
	  }
	  else {
			CollegeException collegeException=new CollegeException("College Is Not  Fund By Given College  ID");
			throw collegeException;
	  }
		
		
		 
	em.close(); 
	}

	@Override
	public College getCollegeDetailbyRoll(int roll) throws StudentException {
	 College college=null;
	 
	  EntityManager em= EMUtility.provideEntityManager();
	  Student student=em.find(Student.class, roll);
		if(student!=null) {
			
			college=student.getCollege();
			 System.out.println("College ID "+college.getCollageId());
			 System.out.println("College Name  "+college.getCollageName() );
			 System.out.println("College Address "+college.getCollageAddress());
			int count=0;
			for(Student stu:college.getStudents()) {
				
				count=count+1;
				
			}
		  System.out.println("Number OF Student "+count);
			
		}
		else {
			
			StudentException exception=new StudentException("Student Is Not  Fund By Given Student  Roll");
			throw exception;
		}
		
		return college;
	}

	@Override
	public void CollegeAndStudent(int collegeid, Student student) throws CollegeException, StudentException {
	
		
	}
	
	
	public void deleteParent(int CollegeId) {
	 EntityManager em=	EMUtility.provideEntityManager();
	 College college=em.find(College.class, CollegeId);
	 em.getTransaction().begin();
	 
	 
	 em.remove(college);
	 
	 em.getTransaction().commit();
	 em.close();
	}
	

	
}
