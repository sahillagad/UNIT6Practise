package Bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String name;
	private int marks;
	
	
	/*
	 * one Student 
	 * Many Addresss
	 * 
	 * 
	 */
	
 
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name =  "addId")
	private Address address;
	




	public Student(String name, int marks, Address address) {
		super();
		this.name = name;
		this.marks = marks;
		this.address = address;
	}


	public Student(int sid, String name, int marks, Address address) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}


	public Student() {
		super();
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}



	
	
	
	
}
