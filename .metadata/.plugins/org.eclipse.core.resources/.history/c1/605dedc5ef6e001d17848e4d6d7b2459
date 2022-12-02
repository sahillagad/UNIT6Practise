package Bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	
	       @Id
	      @GeneratedValue(strategy = GenerationType.IDENTITY)
	       private int eid;
	       private String eName;
	       private double eSalary;
	      
	       
	       @ManyToMany(cascade = CascadeType.ALL)
	       List<Department> departments=new ArrayList<>();


		public Employee(int eid, String eName, double eSalary, List<Department> departments) {
			super();
			this.eid = eid;
			this.eName = eName;
			this.eSalary = eSalary;
			this.departments = departments;
		}


		public Employee(String eName, double eSalary, List<Department> departments) {
			super();
			this.eName = eName;
			this.eSalary = eSalary;
			this.departments = departments;
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


		public String geteName() {
			return eName;
		}


		public void seteName(String eName) {
			this.eName = eName;
		}


		public double geteSalary() {
			return eSalary;
		}


		public void seteSalary(double eSalary) {
			this.eSalary = eSalary;
		}


		public List<Department> getDepartments() {
			return departments;
		}


		public void setDepartments(List<Department> departments) {
			this.departments = departments;
		}


		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", eName=" + eName + ", eSalary=" + eSalary + ", departments=" + departments
					+ "]";
		}
	       
	       
	       
	       
	       
	       
	   
}
