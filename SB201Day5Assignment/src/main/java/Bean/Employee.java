package Bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int empID;
	 private String name;
	 private String gender;
	 private int salary;
	 
	 @Embedded
	 @ElementCollection
	 private Set<Address> addresses=new HashSet<>();

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	public Employee(String name, String gender, int salary, Set<Address> addresses) {
		super();
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.addresses = addresses;
	}
	
	
	

	public Employee(int empID, String name, String gender, int salary, Set<Address> addresses) {
		super();
		this.empID = empID;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.addresses = addresses;
	}




	public Employee() {
		super();
	}




	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
