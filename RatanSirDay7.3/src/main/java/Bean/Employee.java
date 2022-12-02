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
	     private String name;
	     private int salary;
	     
	     @OneToOne(cascade = CascadeType.ALL)
	     private Address address;

		public Employee(int eid, String name, int salary, Address address) {
			super();
			this.eid = eid;
			this.name = name;
			this.salary = salary;
			this.address = address;
		}

		public Employee(String name, int salary, Address address) {
			super();
			this.name = name;
			this.salary = salary;
			this.address = address;
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

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
		}
	     
	     
	     
	     
	     
}
