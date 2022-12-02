package Bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// entity class or persistence class
@Entity
public class Student1 {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int roll;
	    private String name;
	    private int marks;



	    
	    
	    @Embedded
	    @ElementCollection
	    private List<Address> addresses=new ArrayList<>();

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		public Student1() {
			super();
		}

		public Student1(String name, int marks, List<Address> addresses) {
			super();
			this.name = name;
			this.marks = marks;
			this.addresses = addresses;
		}

		public Student1(int roll, String name, int marks, List<Address> addresses) {
			super();
			this.roll = roll;
			this.name = name;
			this.marks = marks;
			this.addresses = addresses;
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


		public List<Address> getAddresses() {
			return addresses;
		}

		public void setAddresses(List<Address> addresses) {
			this.addresses = addresses;
		}

		@Override
		public String toString() {
			return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", addresses=" + addresses + "]";
		}

	    
	    
	    
	     
	
	 
}
