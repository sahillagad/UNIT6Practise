package Bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Department {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int depid;
	private String depName;
    private String depLocation;
    
    
    
    @ManyToMany(cascade = CascadeType.ALL)
     private List<Employee> employees=new ArrayList<>();



	public Department(int depid, String depName, String depLocation, List<Employee> employees) {
		super();
		this.depid = depid;
		this.depName = depName;
		this.depLocation = depLocation;
		this.employees = employees;
	}



	public Department() {
		super();
	}



	public Department(String depName, String depLocation, List<Employee> employees) {
		super();
		this.depName = depName;
		this.depLocation = depLocation;
		this.employees = employees;
	}



	public int getDepid() {
		return depid;
	}



	public void setDepid(int depid) {
		this.depid = depid;
	}



	public String getDepName() {
		return depName;
	}



	public void setDepName(String depName) {
		this.depName = depName;
	}



	public String getDepLocation() {
		return depLocation;
	}



	public void setDepLocation(String depLocation) {
		this.depLocation = depLocation;
	}



	public List<Employee> getEmployees() {
		return employees;
	}



	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}



	@Override
	public String toString() {
		return "Department [depid=" + depid + ", depName=" + depName + ", depLocation=" + depLocation + ", employees="
				+ employees + "]";
	}
    
    
     
	
	
}
