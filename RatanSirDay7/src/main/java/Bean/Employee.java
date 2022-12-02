package Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
             
	             @Id
	             @GeneratedValue(strategy =GenerationType.IDENTITY )
	             private int eid;
	             private String name;
	             private int salary;
				public Employee(int eid, String name, int salary) {
					super();
					this.eid = eid;
					this.name = name;
					this.salary = salary;
				}
				public Employee(String name, int salary) {
					super();
					this.name = name;
					this.salary = salary;
				}
				public Employee() {
					super();
				}
				public int getEid() {
					return eid;
				}
				public void setEid(int eid) {
					this.eid = eid;
				}
				public String getName() {
					return name;
				}
				public void setName(String name) {
					this.name = name;
				}
				public int getSalary() {
					return salary;
				}
				public void setSalary(int salary) {
					this.salary = salary;
				}
				@Override
				public String toString() {
					return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
				}
}
