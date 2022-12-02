package Dao;

import java.util.List;

import Bean.College;
import Bean.Student;
import Exception.CollegeException;
import Exception.StudentException;

public interface AdminDao {


	public String insertStudent(Student student) throws StudentException;
	public Student getStudentById(int roll)throws StudentException;
	public List<Student>  getAllStudent()throws StudentException;
	public String insertCollege(College college)throws CollegeException;
	public List<College> getAllCollege()throws CollegeException;
	public College getCollegeBycollageId(int collageId)throws CollegeException;
	public String addCollegeExisting(int collegeId,int roll)throws CollegeException,StudentException;
	public String updateStudent(int roll)throws StudentException;
	public String updateCollege(int collegeid)throws CollegeException;
	public void getStudentDetailbyCollegeId(int collegeid) throws CollegeException;
	public College getCollegeDetailbyRoll(int roll)throws StudentException;
	public void CollegeAndStudent(int collegeid,Student student)throws CollegeException,StudentException;
	
	
	
	
	
	
}
