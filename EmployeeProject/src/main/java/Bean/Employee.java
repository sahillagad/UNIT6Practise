package Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int eid;
	private String ename;
	private double salary;
	private String dep;
	public Employee(int eid, String ename, double salary, String dep) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.dep = dep;
	}
	public Employee() {
		super();
	}
	public Employee(String ename, double salary, String dep) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.dep = dep;
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
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", dep=" + dep + "]";
	}
	
	
	
	
	
}
