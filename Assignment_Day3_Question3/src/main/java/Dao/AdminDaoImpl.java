package Dao;

import javax.persistence.EntityManager;

import Bean.Employee;
import Utility.EMUtility;

public class AdminDaoImpl implements AdminDao{

	@Override
	public void save(Employee emp) {

		EntityManager em=EMUtility.provideEntityManager();
		
		em.getTransaction().begin();
		
		
		em.persist(emp);
		System.out.println("Save Employee......");
		
		em.getTransaction().commit();
	}

	@Override
	public String getAddressOfEmployee(int empId) {
	String result="NOt Find Employee Data Due To Some Error";
	
		EntityManager em=EMUtility.provideEntityManager();
	    Employee employee= em.find(Employee.class,empId);
	 
	     if(employee!=null) {
	    	 
	    	 result="Employee Address is "+employee.getAddress();
	    	 
	     }
	     else {
	    	 
	    	 result ="Employee Not Found By Given Employee Id";
	     }
	 
		
		
	return result;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		String result="NOt Find Employee Data Due To Some Error";
		
		EntityManager em=EMUtility.provideEntityManager();
		
	    Employee employee=em.find(Employee.class,empId);
		
		if(employee !=null) {
			em.getTransaction().begin();;
			
			employee.setSalary((employee.getSalary()+bonus));
		    result="Employee Id "+empId+" is bouns Add successfully ";   
	
		    em.getTransaction().commit();
		}
	
	
		em.close();
		return result;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		 boolean b=false;
		 
	
			
			EntityManager em=EMUtility.provideEntityManager();
			
		    Employee employee=em.find(Employee.class,empId);
		 
		 
		    em.getTransaction().begin();
		    if(employee!=null) {
		    	
		    	em.remove(employee);
		    	b=true;
		    	
		    }
	
		    em.getTransaction().commit();
		    em.close();
		
		 return b;
		
	}

	
	
	
	
}
