package Usecase;

import javax.persistence.EntityManager;

import Bean.Department1;
import Bean.Employee1;
import Utility.EMUtility;

public class Add {
public static void main(String[] args) {
	

     EntityManager em=	EMUtility.provideEntityManager();
	
     Department1 depart=new Department1();
     depart.setDepName("HR");
    
     Department1 depart1=new Department1();
     depart1.setDepName("IT");
     
     Department1 depart2=new Department1();
     depart2.setDepName("Sales");
     
    Employee1 e1=new Employee1("Sahil", 50000);
    Employee1 e2=new Employee1("Ram",45000);
    Employee1 e3=new Employee1("Rani",67000);
    Employee1 e4=new Employee1("Raj", 47000);
    
    
     
     
     depart.getEmployees().add(e3);
     depart.getEmployees().add(e2);
     
     
     depart1.getEmployees().add(e1);
     
     depart2.getEmployees().add(e4);
     
     
     em.getTransaction().begin();
	
     em.persist(e1);
     em.persist(e2);
     em.persist(e3); 
     em.persist(e4);
     
     em.persist(depart);
     em.persist(depart1);
     em.persist(depart2); 
     
     em.getTransaction().commit();
	
	
	em.close();
}
}
