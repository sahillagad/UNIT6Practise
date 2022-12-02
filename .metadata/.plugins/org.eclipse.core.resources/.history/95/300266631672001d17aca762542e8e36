package Usecase;

import javax.persistence.EntityManager;

import Bean.Address;
import Bean.Employee;
import Utility.EMUtility;

public class AddNewAddress {
	
	public static void main(String[] args) {
		
		EntityManager em=EMUtility.provideEntityManager();
	 Employee employee=  em.find(Employee.class, 1);
		
	Address address=new Address();
	address.setCity("Hydrabad");
	address.setPincode("654425");
	address.setState("Karantak");
	address.setEmployee(employee);

	 em.getTransaction().begin();
		
	 employee.setAddress(address);
	

		
		em.getTransaction().commit();
		
	}

}
