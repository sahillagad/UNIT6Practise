package Bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Employee1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String ename;
	private double salary;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Department1 department;

	public Employee1(int eid, String ename, double salary, Department1 department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.department = department;
	}

	public Employee1() {
		super();
	}

	public Employee1(String ename, double salary, Department1 department) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.department = department;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department1 getDepartment() {
		return department;
	}

	public void setDepartment(Department1 department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", department=" + department + "]";
	}


	
	
}
