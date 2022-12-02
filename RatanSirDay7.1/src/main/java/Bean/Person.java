package Bean;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int PersonId;
	private String Name;
	private String address;
	private int Age;
	private LocalDate dateBirth;
	private String  Gender;
	 
	
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "person")
     private DrivingLicence drivingLicence;



	public Person(int personId, String name, String address, int age, LocalDate dateBirth, String gender,
			DrivingLicence drivingLicence) {
		super();
		PersonId = personId;
		Name = name;
		this.address = address;
		Age = age;
		this.dateBirth = dateBirth;
		Gender = gender;
		this.drivingLicence = drivingLicence;
	}



	public Person(String name, String address, int age, LocalDate dateBirth, String gender,
			DrivingLicence drivingLicence) {
		super();
		Name = name;
		this.address = address;
		Age = age;
		this.dateBirth = dateBirth;
		Gender = gender;
		this.drivingLicence = drivingLicence;
	}



	public Person() {
		super();
	}



	public int getPersonId() {
		return PersonId;
	}



	public void setPersonId(int personId) {
		PersonId = personId;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getAge() {
		return Age;
	}



	public void setAge(int age) {
		Age = age;
	}



	public LocalDate getDateBirth() {
		return dateBirth;
	}



	public void setDateBirth(LocalDate dateBirth) {
		this.dateBirth = dateBirth;
	}



	public String getGender() {
		return Gender;
	}



	public void setGender(String gender) {
		Gender = gender;
	}



	public DrivingLicence getDrivingLicence() {
		return drivingLicence;
	}



	public void setDrivingLicence(DrivingLicence drivingLicence) {
		this.drivingLicence = drivingLicence;
	}



	@Override
	public String toString() {
		return "Person [PersonId=" + PersonId + ", Name=" + Name + ", address=" + address + ", Age=" + Age
				+ ", dateBirth=" + dateBirth + ", Gender=" + Gender + ", drivingLicence=" + drivingLicence + "]";
	}


	
	
	   
}
