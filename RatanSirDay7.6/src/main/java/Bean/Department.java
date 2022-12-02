package Bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Department {
          
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptID;
	private String depName;
	private String location;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Employee employee;

	public Department(int deptID, String depName, String location, Employee employee) {
		super();
		this.deptID = deptID;
		this.depName = depName;
		this.location = location;
		this.employee = employee;
	}

	public Department(String depName, String location, Employee employee) {
		super();
		this.depName = depName;
		this.location = location;
		this.employee = employee;
	}

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [deptID=" + deptID + ", depName=" + depName + ", location=" + location + ", employee="
				+ employee + "]";
	}
	
	
	
	 
	
	
}
