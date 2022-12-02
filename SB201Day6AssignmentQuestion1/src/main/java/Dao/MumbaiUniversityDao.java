package Dao;

import java.util.List;


import Bean.College;
import Bean.Student;

public interface MumbaiUniversityDao {

	public String registerStudent(Student student);
	public String registerCollege(College collage);
	public void addStudentExisting(int collegeId,Student student);
	public Student getStudentByRoll(int Roll);
	public List<Student> getAllStudentOfCollageID(int collageId);
	public List<College> getCollegeList();
	public void GetCollegeDetail(int CollegeId);
   public void getCollegeByName(String CollegeName);
   public List<Object[]> getStudentNameANDMobileNumber(String name);
  public College getCollegeBYId(int collegeId);
   public void UpdateStudent(Student student);
   public void UpdateCollege(College college);
void addStudentExisting(int collegeId, int studentId);
   
   
   
	
	
}
