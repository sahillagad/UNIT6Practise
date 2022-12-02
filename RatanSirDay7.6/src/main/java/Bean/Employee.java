package Bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int eid;
	 private String eName;
	 private int Salary;
	 
	 
	 @OneToOne(cascade = CascadeType.ALL)
	 private Department department;


	public Employee(int eid, String eName, int salary, Department department) {
		super();
		this.eid = eid;
		this.eName = eName;
		Salary = salary;
		this.department = department;
	}


	public Employee(String eName, int salary, Department department) {
		super();
		this.eName = eName;
		Salary = salary;
		this.department = department;
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public int getSalary() {
		return Salary;
	}


	public void setSalary(int salary) {
		Salary = salary;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", Salary=" + Salary + ", department=" + department + "]";
	} 
	 
	 
	 
}
