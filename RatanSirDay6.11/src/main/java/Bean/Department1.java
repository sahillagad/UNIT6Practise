package Bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Department1 {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int depId;
	 private String depName;
	 private String depLocation;
	 
	 
	 @OneToMany(cascade = CascadeType.ALL,mappedBy = "department",fetch = FetchType.EAGER)
	 private List<Employee1> depart=new ArrayList<>();


	public Department1(int depId, String depName, String depLocation, List<Employee1> depart) {
		super();
		this.depId = depId;
		this.depName = depName;
		this.depLocation = depLocation;
		this.depart = depart;
	}


	public Department1(String depName, String depLocation, List<Employee1> depart) {
		super();
		this.depName = depName;
		this.depLocation = depLocation;
		this.depart = depart;
	}


	public Department1() {
		super();
	}


	public int getDepId() {
		return depId;
	}


	public void setDepId(int depId) {
		this.depId = depId;
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


	public List<Employee1> getDepart() {
		return depart;
	}


	public void setDepart(List<Employee1> depart) {
		this.depart = depart;
	}


	@Override
	public String toString() {
		return "Department1 [depId=" + depId + ", depName=" + depName + ", depLocation=" + depLocation + ", depart="
				+ depart + "]";
	}

	 
	 
	 

	 
	 
	 
}
