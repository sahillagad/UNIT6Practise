package Bean;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// entity class or persistence class
@Entity
public class Student {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int roll;
	    private String name;
	    private int marks;


	    @Embedded
	    @AttributeOverrides({
	    	@AttributeOverride(name="city",column=@Column(name = "HomeCity")),
	    	@AttributeOverride(name="state",column=@Column(name = "HomeState")),
	    	@AttributeOverride(name = "pincode",column =@Column(name="HomePincode") )
	    })
	    private Address HomeAddress;
	    //has relation
	    
	    @Embedded 
	    @AttributeOverrides({
	    	 @AttributeOverride(name = "city",column = @Column(name="OfficeCity")),
	    	@AttributeOverride(name = "state",column = @Column(name="OfficeState")),
	    	@AttributeOverride(name = "pincode",column=@Column(name = "OfficePincode"))
	    	
	    })
	    private Address OfficeAddress;

		public Student(int roll, String name, int marks, Address homeAddress, Address officeAddress) {
			super();
			this.roll = roll;
			this.name = name;
			this.marks = marks;
			HomeAddress = homeAddress;
			OfficeAddress = officeAddress;
		}

		public Student() {
			super();
		}

		public Student(String name, int marks, Address homeAddress, Address officeAddress) {
			super();
			this.name = name;
			this.marks = marks;
			HomeAddress = homeAddress;
			OfficeAddress = officeAddress;
		}

		public int getRoll() {
			return roll;
		}

		public void setRoll(int roll) {
			this.roll = roll;
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

		public Address getHomeAddress() {
			return HomeAddress;
		}

		public void setHomeAddress(Address homeAddress) {
			HomeAddress = homeAddress;
		}

		public Address getOfficeAddress() {
			return OfficeAddress;
		}

		public void setOfficeAddress(Address officeAddress) {
			OfficeAddress = officeAddress;
		}

		@Override
		public String toString() {
			return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", HomeAddress=" + HomeAddress
					+ ", OfficeAddress=" + OfficeAddress + "]";
		}
	    

	    
	    
	     
	
	 
}
