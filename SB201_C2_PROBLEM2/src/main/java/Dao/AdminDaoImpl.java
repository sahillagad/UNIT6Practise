package Dao;

import javax.persistence.EntityManager;

import Entity.Course;
import Entity.Student;
import Exception.CourseException;
import Exception.StudentException;
import Utility.EMUtility;

public class AdminDaoImpl implements AdminDao{

	@Override
	public void addCourse(Course course) {
		
	 EntityManager em=EMUtility.provideEntityManager();
		
	 em.getTransaction().begin();
	 
	 
	 em.persist(course);
	 
	 
		
	em.getTransaction().commit();	
	em.close();
	}

	@Override
	public void getStudent(int roll_no) throws StudentException{
	
		 EntityManager em=EMUtility.provideEntityManager();
		 
		 Student student=em.find(Student.class, roll_no);
		 
		 if(student!=null) {
	
			 System.out.println("Roll No "+student.getRollNo()  );
			 System.out.println("Name "+student.getName());
			 System.out.println("Mobile "+student.getMobile()  );
			 System.out.println("Email "+student.getEmail() );
		     
			 
			 Course course=em.find(Course.class, student.getCourse().getCourseId());
		System.out.println("Course Id  "+course.getCourseId());
		System.out.println("Course Name "+course.getCourseName());
		System.out.println("Course Duration "+course.getDuration()+" Month's");
		System.out.println("Course Fee "+course.getFee());
			   
		 }
		 else {
			 StudentException exception=new StudentException("Student Not Found By Given Id");
          throw exception;
		 }
		
		 em.close();
	}

	@Override
	public void getCourse(int course_id) throws CourseException {
		 EntityManager em=EMUtility.provideEntityManager();
		 
		 
		 Course course=em.find(Course.class, course_id);
		 if(course!=null) {
							 System.out.println("Course Id  "+course.getCourseId());
						System.out.println("Course Name "+course.getCourseName());
						System.out.println("Course Duration "+course.getDuration()+" Month's");
						System.out.println("Course Fee "+course.getFee());
		 }
		 
		 else {
			 CourseException courseException=new CourseException("Course Not Found By Given Id");
			 throw courseException;
			 
		 }
		 
		em.close();
	}

	
}
