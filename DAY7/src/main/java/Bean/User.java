package Bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String Username;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Phone>  phoneList;


	public User(int userId, String username, List<Phone> phoneList) {
		super();
		this.userId = userId;
		Username = username;
		this.phoneList = phoneList;
	}


	public User() {
		super();
	}


	public User(String username, List<Phone> phoneList) {
		super();
		Username = username;
		this.phoneList = phoneList;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUsername() {
		return Username;
	}


	public void setUsername(String username) {
		Username = username;
	}


	public List<Phone> getPhoneList() {
		return phoneList;
	}


	public void setPhoneList(List<Phone> phoneList) {
		this.phoneList = phoneList;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", Username=" + Username + ", phoneList=" + phoneList + "]";
	}
	
	 
	
	
	
	
	
	 
	
	  
	 
}
