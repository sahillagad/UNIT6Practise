package BEAN;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

				@Id
				@GeneratedValue(strategy = GenerationType.IDENTITY)
				private int empID;
				private String name;
				private double salary;
				
				
				public Employee() {
					super();
				}


				public Employee(String name, double salary) {
					super();
					this.name = name;
					this.salary = salary;
				}


				public Employee(int empID, String name, double salary) {
					super();
					this.empID = empID;
					this.name = name;
					this.salary = salary;
				}


				public int getEmpID() {
					return empID;
				}


				public void setEmpID(int empID) {
					this.empID = empID;
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


				@Override
				public String toString() {
					return "Employee [empID=" + empID + ", name=" + name + ", salary=" + salary + "]";
				}
}
