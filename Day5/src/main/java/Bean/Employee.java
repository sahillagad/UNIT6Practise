package Bean;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity
public class Employee {

	
	    @Id 
	     @GeneratedValue(strategy = GenerationType.AUTO)
	    private int eid;
	    private String ename;
	    private int salary;
	
	    
	    @Embedded
	    @AttributeOverrides({
	    	
	    	@AttributeOverride(name="state" ,column = @Column(name="homeState")),
	    	@AttributeOverride(name="city" ,column = @Column(name="homecity")),
	    	@AttributeOverride(name="pincode" ,column = @Column(name="homePincode"))
	    	
	    	
	    	
	    }) 
	    private Address Homeaddress;


	    @Embedded
    @AttributeOverrides({
	    	
	    	@AttributeOverride(name="state" ,column = @Column(name="officeState")),
	    	@AttributeOverride(name="city" ,column = @Column(name="officecity")),
	    	@AttributeOverride(name="pincode" ,column = @Column(name="officePincode"))
	    	
	    	
	    	
	    }) 
	    private Address OfficeAddress;
	    
		public Employee(int eid, String ename, int salary, Address address) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.salary = salary;
			this.Homeaddress = address;
		}


		public Employee() {
			super();
		}




		public Employee(int eid, String ename, int salary, Address homeaddress, Address officeAddress) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.salary = salary;
			Homeaddress = homeaddress;
			OfficeAddress = officeAddress;
		}


		
		
		public Employee(String ename, int salary, Address homeaddress, Address officeAddress) {
			super();
			this.ename = ename;
			this.salary = salary;
			Homeaddress = homeaddress;
			OfficeAddress = officeAddress;
		}


		public int getEid() {
			return eid;
		}


		public Address getHomeaddress() {
			return Homeaddress;
		}


		public void setHomeaddress(Address homeaddress) {
			Homeaddress = homeaddress;
		}


		public Address getOfficeAddress() {
			return OfficeAddress;
		}


		public void setOfficeAddress(Address officeAddress) {
			OfficeAddress = officeAddress;
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


		public int getSalary() {
			return salary;
		}


		public void setSalary(int salary) {
			this.salary = salary;
		}


		public Address getAddress() {
			return Homeaddress;
		}


		public void setAddress(Address address) {
			this.Homeaddress = address;
		}


		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", address=" + Homeaddress + "]";
		}
	    
	    
	    
}
