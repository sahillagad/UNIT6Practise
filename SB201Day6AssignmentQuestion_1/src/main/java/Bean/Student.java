package Bean;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PreRemove;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Student {

	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentRoll;
	private String studentName;
	private String mobileNumber;
	private String email;

	@Embedded
	 private Address address;
	
	

     @ManyToOne()
     private College college;

  
   

	public Student(int studentRoll, String studentName, String mobileNumber, String email, Address address,College college) {
		super();
		this.studentRoll = studentRoll;
		this.studentName = studentName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.address = address;
		this.college = college;
	}


	public Student(String studentName, String mobileNumber, String email, Address address, College college) {
		super();
		this.studentName = studentName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.address = address;
		this.college = college;
	}


	public Student() {
		super();
	}


	public int getStudentRoll() {
		return studentRoll;
	}


	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public College getCollege() {
		return college;
	}


	public void setCollege(College college) {
		this.college = college;
	}


	@Override
	public String toString() {
		return "Student [studentRoll=" + studentRoll + ", studentName=" + studentName + ", mobileNumber=" + mobileNumber
				+ ", email=" + email + ", address=" + address + ", college=" + college + "]";
	}
     
     
  	
	 
}
