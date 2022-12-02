package Usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Entity.FullTimeInstructor;
import Entity.PartTimeInstructor;
import Utility.EMUtility;

public class getParttimeInstructor {
public static void main(String[] args) {
	
	
	EntityManager em= EMUtility.provideEntityManager();
	
	Query query=em.createQuery("Select F from PartTimeInstructor F");
	List<PartTimeInstructor> instructors= query.getResultList();
	
	for(PartTimeInstructor fti:instructors) {
		
		System.out.println(fti);
	}
	
	
}
}
