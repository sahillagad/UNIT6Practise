package Dao;

import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import Bean.Employee;
import Exception.EmployeeException;
import Utility.EMUtility;

public class AdminDaoImpl implements AdminDao {

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
	 Employee empl=null;    
     EntityManager em=EMUtility.provideEntityManager();
     
     try {
     
     Query query= em.createQuery("Select e from Employee e where e.name=?1 AND e.address=?2");
     query.setParameter(1, employee.getName());
     query.setParameter(2,employee.getAddress());
     
     Object object=query.getSingleResult();
 	 System.out.println("Employee Is Already Present.....");
	 
     }
     catch (Exception e) {
	
     
    	 
    	 em.getTransaction().begin();
    	 
    	 em.persist(employee);
          empl=employee;	 
    	 
    	 em.getTransaction().commit();
    	 
    	 
    
 
 	
 	}
      
    
	 
	 
	 
	
	 
	 return empl;
	}

	@Override
	public Employee getEmployeeById(int emplId) throws EmployeeException {
	Employee employee=null;
		
		EntityManager em=EMUtility.provideEntityManager();
		
		
		Query query= em.createQuery("Select e from Employee e where e.eid=?1");
		
		query.setParameter(1, emplId);
		
		 employee=(Employee)query.getSingleResult();
 
		 return employee;
		
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		Employee employee=null;
		EntityManager em=EMUtility.provideEntityManager();
		em.getTransaction().begin();
		
		Employee employee2= em.find(Employee.class,empId);
		
		Query query= em.createQuery("delete from Employee e where e.eid=?1");
		query.setParameter(1, empId);
		
		
	   int i= query.executeUpdate(); 
		
	   if(i>0) {
		   
		   employee=employee2;
	   }
		em.getTransaction().commit();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		
		Employee empl=null;
		EntityManager em=EMUtility.provideEntityManager();
		em.getTransaction().begin();
		
		Query query=em.createQuery("Update Employee e set e.name=?1,e.address=?2,e.salary=?3 where e.eid=?4");
		query.setParameter(1,employee.getName());
		query.setParameter(2,employee.getAddress());
		query.setParameter(3,employee.getSalary());
		query.setParameter(4,employee.getEid());
		
		
		int x= query.executeUpdate();
		
		if(x>0) {
			
			empl=employee;
		}
		
		else {
			System.out.println("Employee Detail Not Update");
			
		}
		
		em.getTransaction().commit();;
		return empl;
		
	}
	

}
