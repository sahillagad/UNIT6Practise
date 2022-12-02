package Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int depID;
	private String depName;
	private String location;
	public Department(int depID, String depName, String location) {
		super();
		this.depID = depID;
		this.depName = depName;
		this.location = location;
	}
	public Department() {
		super();
	}
	public Department(String depName, String location) {
		super();
		this.depName = depName;
		this.location = location;
	}
	public int getDepID() {
		return depID;
	}
	public void setDepID(int depID) {
		this.depID = depID;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [depID=" + depID + ", depName=" + depName + ", location=" + location + "]";
	}
	
	
	
}
