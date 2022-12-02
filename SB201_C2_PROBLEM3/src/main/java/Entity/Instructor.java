package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class  Instructor {
 
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY )
         int instructorId;
	    String instructorName;
		public Instructor(int instructorId, String instructorName) {
			super();
			this.instructorId = instructorId;
			this.instructorName = instructorName;
		}
		public Instructor() {
			super();
		}
		
		
		public Instructor(String instructorName) {
			super();
			this.instructorName = instructorName;
		}
		public int getInstructorId() {
			return instructorId;
		}
		public void setInstructorId(int instructorId) {
			this.instructorId = instructorId;
		}
		public String getInstructorName() {
			return instructorName;
		}
		public void setInstructorName(String instructorName) {
			this.instructorName = instructorName;
		}
		@Override
		public String toString() {
			return "Instructor [instructorId=" + instructorId + ", instructorName=" + instructorName + "]";
		}

	   
	    
	     
	 
	 

   	
}
