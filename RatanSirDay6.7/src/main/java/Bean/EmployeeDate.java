package Bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EmployeeDate {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emplID;
	private String name;
	private double salary;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private DepartmentDate department;

	public EmployeeDate(int emplID, String name, double salary, DepartmentDate department) {
		super();
		this.emplID = emplID;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public EmployeeDate() {
		super();
	}

	public EmployeeDate(String name, double salary, DepartmentDate department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public int getEmplID() {
		return emplID;
	}

	public void setEmplID(int emplID) {
		this.emplID = emplID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public DepartmentDate getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDate department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmployeeDate [emplID=" + emplID + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ "]";
	}
	
	
	
	
}
