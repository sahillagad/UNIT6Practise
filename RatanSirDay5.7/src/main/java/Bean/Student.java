package Bean;

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
	    private Address address;
	    //has relation
	    
		public Student(int roll, String name, int marks, Address address) {
			super();
			this.roll = roll;
			this.name = name;
			this.marks = marks;
			this.address = address;
		}

		public Student(String name, int marks, Address address) {
			super();
			this.name = name;
			this.marks = marks;
			this.address = address;
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

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
		}
	    
	    
	    
	    
	     
	
	 
}
