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
	  @GeneratedValue(strategy = GenerationType.AUTO)
      private int depId;
	  private String Dname;
	  private String Location;
	  
	  @OneToOne(cascade = CascadeType.ALL)
	  private Employee employee;

	public Department(int depId, String dname, String location, Employee employee) {
		super();
		this.depId = depId;
		Dname = dname;
		Location = location;
		this.employee = employee;
	}

	public Department(String dname, String location, Employee employee) {
		super();
		Dname = dname;
		Location = location;
		this.employee = employee;
	}

	public Department() {
		super();
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getDname() {
		return Dname;
	}

	public void setDname(String dname) {
		Dname = dname;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [depId=" + depId + ", Dname=" + Dname + ", Location=" + Location + ", employee=" + employee
				+ "]";
	}
	  
	  
	
	 
}
