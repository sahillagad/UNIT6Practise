package Bean;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DrivingLicence {
 
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
    private int DrivingLicenceNumber;
	private LocalDate DateOFIssue;
	private LocalDate ExpirationDate;
	private String StateName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Person person;

	public DrivingLicence(int drivingLicenceNumber, LocalDate dateOFIssue, LocalDate expirationDate, String stateName,
			Person person) {
		super();
		DrivingLicenceNumber = drivingLicenceNumber;
		DateOFIssue = dateOFIssue;
		ExpirationDate = expirationDate;
		StateName = stateName;
		this.person = person;
	}

	public DrivingLicence(LocalDate dateOFIssue, LocalDate expirationDate, String stateName, Person person) {
		super();
		DateOFIssue = dateOFIssue;
		ExpirationDate = expirationDate;
		StateName = stateName;
		this.person = person;
	}

	public DrivingLicence() {
		super();
	}

	public int getDrivingLicenceNumber() {
		return DrivingLicenceNumber;
	}

	public void setDrivingLicenceNumber(int drivingLicenceNumber) {
		DrivingLicenceNumber = drivingLicenceNumber;
	}

	public LocalDate getDateOFIssue() {
		return DateOFIssue;
	}

	public void setDateOFIssue(LocalDate dateOFIssue) {
		DateOFIssue = dateOFIssue;
	}

	public LocalDate getExpirationDate() {
		return ExpirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		ExpirationDate = expirationDate;
	}

	public String getStateName() {
		return StateName;
	}

	public void setStateName(String stateName) {
		StateName = stateName;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "DrivingLicence [DrivingLicenceNumber=" + DrivingLicenceNumber + ", DateOFIssue=" + DateOFIssue
				+ ", ExpirationDate=" + ExpirationDate + ", StateName=" + StateName + ", person=" + person + "]";
	}

	
	 
}
