package Bean;

import java.util.ArrayList;
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
	 private String name;
	 private String location;
	 
	 @OneToMany(cascade = CascadeType.ALL)
	 private List<Phone> phones=new ArrayList<>();

	public User(int userId, String name, String location, List<Phone> phones) {
		super();
		this.userId = userId;
		this.name = name;
		this.location = location;
		this.phones = phones;
	}

	public User(String name, String location, List<Phone> phones) {
		super();
		this.name = name;
		this.location = location;
		this.phones = phones;
	}

	public User() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", location=" + location + ", phones=" + phones + "]";
	}
	 
	 
	 
}
