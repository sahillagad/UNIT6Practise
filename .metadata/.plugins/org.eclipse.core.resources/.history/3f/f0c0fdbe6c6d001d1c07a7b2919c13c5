package Bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Student {

	       
	       @Id
	       @GeneratedValue(strategy = GenerationType.IDENTITY)
	      private int Roll;
	      private String name;
	      private int marks;
	      
	      
	      @Embedded
	      @ElementCollection(fetch = FetchType.EAGER)
	       List<Add> adds=new ArrayList<>();


		public Student(int roll, String name, int marks, List<Add> adds) {
			super();
			Roll = roll;
			this.name = name;
			this.marks = marks;
			this.adds = adds;
		}


		public Student() {
			super();
		}


		public int getRoll() {
			return Roll;
		}


		public void setRoll(int roll) {
			Roll = roll;
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


		public List<Add> getAdds() {
			return adds;
		}


		public void setAdds(List<Add> adds) {
			this.adds = adds;
		}


		@Override
		public String toString() {
			return "Student [Roll=" + Roll + ", name=" + name + ", marks=" + marks + ", adds=" + adds + "]";
		}
	       
	      
	      
	      
	      
	       
	      
	
}
