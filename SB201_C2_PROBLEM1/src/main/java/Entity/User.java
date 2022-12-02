package Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
 
	@Id
	private int userId;
	private String userName;
	private String emailId;

	@Embedded
	@ElementCollection()
	List<PhoneNumber> phoneNumbers=new ArrayList<>();

	public User(int userId, String userName, String emailId, List<PhoneNumber> phoneNumbers) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.phoneNumbers = phoneNumbers;
	}

	public User() {
		super();
	}

	public User(String userName, String emailId, List<PhoneNumber> phoneNumbers) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.phoneNumbers = phoneNumbers;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + ", phoneNumbers="
				+ phoneNumbers + "]";
	}
	
	
	
	
	
	
	
}
