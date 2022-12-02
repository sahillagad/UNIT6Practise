package Bean;

import java.time.LocalDate;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RTO {
	             @Id
	             private int RigstrationID;  
	             
	             @Embedded
				 private Person person;
				 private String vechicalNumber;
				 private LocalDate dateRegistration;
				 private String color;
				public RTO(Person person, String vechicalNumber, LocalDate dateRegistration, String color) {
								super();
								this.person = person;
								this.vechicalNumber = vechicalNumber;
								this.dateRegistration = dateRegistration;
								this.color = color;
				}
				public RTO() {
					super();
				}
				
				
				
				public RTO(int rigstrationID, Person person, String vechicalNumber, LocalDate dateRegistration,
						String color) {
					super();
					RigstrationID = rigstrationID;
					this.person = person;
					this.vechicalNumber = vechicalNumber;
					this.dateRegistration = dateRegistration;
					this.color = color;
				}
				public Person getPerson() {
					return person;
				}
				public void setPerson(Person person) {
					this.person = person;
				}
				public String getVechicalNumber() {
					return vechicalNumber;
				}
				public void setVechicalNumber(String vechicalNumber) {
					this.vechicalNumber = vechicalNumber;
				}
				public LocalDate getDateRegistration() {
					return dateRegistration;
				}
				public void setDateRegistration(LocalDate dateRegistration) {
					this.dateRegistration = dateRegistration;
				}
				public String getColor() {
					return color;
				}
				public void setColor(String color) {
					this.color = color;
				}
				@Override
				public String toString() {
					return "RTO [RigstrationID=" + RigstrationID + ", person=" + person + ", vechicalNumber="
							+ vechicalNumber + ", dateRegistration=" + dateRegistration + ", color=" + color + "]";
				}
			
	
	
	
}
