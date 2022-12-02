package Bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department1 {

	
	      @Id
          @GeneratedValue(strategy = GenerationType.IDENTITY) 
	      private int depid;
	      private String depName;
	      

	      
	      @OneToMany
	      List<Employee1> employees=new ArrayList<>();


		public Department1(int depid, String depName, List<Employee1> employees) {
			super();
			this.depid = depid;
			this.depName = depName;
			this.employees = employees;
		}


		public Department1() {
			super();
		}


		public int getDepid() {
			return depid;
		}


		public void setDepid(int depid) {
			this.depid = depid;
		}


		public String getDepName() {
			return depName;
		}


		public void setDepName(String depName) {
			this.depName = depName;
		}


		public List<Employee1> getEmployees() {
			return employees;
		}


		public void setEmployees(List<Employee1> employees) {
			this.employees = employees;
		}


		@Override
		public String toString() {
			return "Department1 [depid=" + depid + ", depName=" + depName + ", employees=" + employees + "]";
		}
	      
	      
	      
	      
	       
	      
	      
	      
	      
}
