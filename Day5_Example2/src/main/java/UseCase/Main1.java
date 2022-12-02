package UseCase;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import Bean.Address;
import Bean.Employee;
import Utility.EMUtility;

public class Main1 {

	public static void main(String[] args) {
		
	
	EntityManager em= EMUtility.provideEntityManager();	

	
	
	List<Address> address=new ArrayList<>();
	
 Address	address1= new Address("pune","MH","421301","Home Address");
 Address	address2 =new Address("Mumbai","MH","432897","Office Address");
 Address	address3=new Address("Nashik", "MH", "655433","Office Address");
	
	
 
 address.add(address1);
 address.add(address2);
 address.add(address3);
	Employee employee=new Employee();
	employee.setEname("Ram");
	employee.setAddresses(address);
	employee.setSalary(50000);
	
	
	
	em.getTransaction().begin();
	


	em.persist(employee);
	
	
	
	
		
	em.getTransaction().commit();	
		
		
		
	}
}
