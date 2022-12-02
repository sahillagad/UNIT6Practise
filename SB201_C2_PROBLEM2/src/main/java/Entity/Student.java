package Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int rollNo;
	private String name;
	private String mobile;
	private String email;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Course course;

	
	
	public Student(int rollNo, String name, String mobile, String email, Course course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.course = course;
	}

	public Student(String name, String mobile, String email, Course course) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.course = course;
	}

	public Student() {
		super();
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", course="
				+ course + "]";
	}


	
	
	
	
}
