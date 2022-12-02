package Bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String name;
	private int marks;
	
	
	@Embedded
	@ElementCollection
	@JoinTable(name = "StudentAddress" ,joinColumns =  @JoinColumn(name="StudentID"))
	List<Address> list=new ArrayList<>();


	public Student(int sid, String name, int marks, List<Address> list) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
		this.list = list;
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


	public List<Address> getList() {
		return list;
	}


	public void setList(List<Address> list) {
		this.list = list;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + ", list=" + list + "]";
	}
	
	
	
	
}
