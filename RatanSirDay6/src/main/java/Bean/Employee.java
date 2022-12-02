package Bean;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Employee {

	
	       @Id
	       @GeneratedValue(strategy = GenerationType.IDENTITY)
	       private int eid;
	       private String name;
	       private double salary;
	       
	       
	       @Embedded
	       @ElementCollection
	       @JoinTable(name = "Employee_detail",joinColumns = @JoinColumn(name="EmploueeID"))
	       Set<Address> addresses=new HashSet<>();


		public Employee(int eid, String name, double salary, Set<Address> addresses) {
			super();
			this.eid = eid;
			this.name = name;
			this.salary = salary;
			this.addresses = addresses;
		}


		public Employee() {
			super();
		}

		

		public Employee(String name, double salary, Set<Address> addresses) {
			super();
			this.name = name;
			this.salary = salary;
			this.addresses = addresses;
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


		public double getSalary() {
			return salary;
		}


		public void setSalary(double salary) {
			this.salary = salary;
		}


		public Set<Address> getAddresses() {
			return addresses;
		}


		public void setAddresses(Set<Address> addresses) {
			this.addresses = addresses;
		}


		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", addresses=" + addresses + "]";
		}
	       
	       
	       
	       
}
