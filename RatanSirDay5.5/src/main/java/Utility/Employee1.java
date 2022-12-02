package Utility;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Employee1 {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int Id;
	 private String name;
	 private double salary;
	 
	 
	 @Embedded
	 @AttributeOverrides({
		 @AttributeOverride(name = "city",column =  @Column(name="HomeCity")),
		 @AttributeOverride(name = "state",column = @Column(name="HomeState")),
		 @AttributeOverride(name = "pincode",column = @Column(name="HomePincode"))
	 })
	 private Address1 HomeAddress;
	 
	 
	 
	 
	 @Embedded
	 @AttributeOverrides({
		 @AttributeOverride(name = "city",column = @Column(name="OfficeCity")),
		 @AttributeOverride(name = "state",column = @Column(name="OfficeState")),
		 @AttributeOverride(name = "pincode",column = @Column(name="OfficePincode"))
	 })
	 private Address1 OfficeAddress;




	public Employee1(int id, String name, double salary, Address1 homeAddress, Address1 officeAddress) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
		HomeAddress = homeAddress;
		OfficeAddress = officeAddress;
	}




	public Employee1(String name, double salary, Address1 homeAddress, Address1 officeAddress) {
		super();
		this.name = name;
		this.salary = salary;
		HomeAddress = homeAddress;
		OfficeAddress = officeAddress;
	}




	public int getId() {
		return Id;
	}




	public void setId(int id) {
		Id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	public Address1 getHomeAddress() {
		return HomeAddress;
	}




	public void setHomeAddress(Address1 homeAddress) {
		HomeAddress = homeAddress;
	}




	public Address1 getOfficeAddress() {
		return OfficeAddress;
	}




	public void setOfficeAddress(Address1 officeAddress) {
		OfficeAddress = officeAddress;
	}




	@Override
	public String toString() {
		return "Employee1 [Id=" + Id + ", name=" + name + ", salary=" + salary + ", HomeAddress=" + HomeAddress
				+ ", OfficeAddress=" + OfficeAddress + "]";
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
