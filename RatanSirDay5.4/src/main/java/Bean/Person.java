package Bean;

import java.time.LocalDate;

import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Person {

   
	private String name;

	private String mobile;
	@Embedded
	private Address address;
	private LocalDate dateOfBirth;
	
	
	
	
	public Person(String name, String mobile, Address address, LocalDate dateOfBirth) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}
	public Person() {
		super();
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
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", mobile=" + mobile + ", address=" + address + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}
	
	
	
	
	
}
