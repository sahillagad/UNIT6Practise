package BEAN;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

	              @Id
	              @GeneratedValue(strategy = GenerationType.IDENTITY)
	              private int depID;
	              private String name;
	              private String location;
	              
	              @OneToMany(cascade = CascadeType.ALL)
	              private List<Employee> employees =new ArrayList<>();

				public Department(int depID, String name, String location, List<Employee> employees) {
					super();
					this.depID = depID;
					this.name = name;
					this.location = location;
					this.employees = employees;
				}

				public Department() {
					super();
				}

				public Department(String name, String location, List<Employee> employees) {
					super();
					this.name = name;
					this.location = location;
					this.employees = employees;
				}

				public int getDepID() {
					return depID;
				}

				public void setDepID(int depID) {
					this.depID = depID;
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

				public List<Employee> getEmployees() {
					return employees;
				}

				public void setEmployees(List<Employee> employees) {
					this.employees = employees;
				}

				@Override
				public String toString() {
					return "Department [depID=" + depID + ", name=" + name + ", location=" + location + ", employees="
							+ employees + "]";
				}
}
