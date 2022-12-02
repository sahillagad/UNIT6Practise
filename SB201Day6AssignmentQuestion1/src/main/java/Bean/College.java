package Bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY) 
	  private int collegeId;
	  private String collegeName;
	  private  String collegeAddress;

	  @OneToMany(cascade = CascadeType.ALL)
	   private List<Student> students=new ArrayList<>();

	public College(int collegeId, String collegeName, String collegeAddress, List<Student> students) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
		this.students = students;
	}

	public College() {
		super();
	}

	public College(String collegeName, String collegeAddress, List<Student> students) {
		super();
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
		this.students = students;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeAddress() {
		return collegeAddress;
	}

	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}






	  
}
