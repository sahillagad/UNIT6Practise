package Bean;

import javax.persistence.Entity;

@Entity
public class SalaryEmployee extends Employee{

	 private int salary;

	public SalaryEmployee(int salary) {
		super();
		this.salary = salary;
	}

	public SalaryEmployee() {
		// TODO Auto-generated constructor stub
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SalaryEmployee [salary=" + salary + "]";
	}
	 
	 
	 
}
