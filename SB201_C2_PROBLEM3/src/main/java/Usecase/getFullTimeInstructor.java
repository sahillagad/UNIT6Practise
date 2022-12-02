package Usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Entity.FullTimeInstructor;
import Utility.EMUtility;

public class getFullTimeInstructor {

	public static void main(String[] args) {
		
		EntityManager em= EMUtility.provideEntityManager();
		
		Query query=em.createQuery("Select F from FullTimeInstructor F");
		List<FullTimeInstructor> instructors= query.getResultList();
		
		for(FullTimeInstructor fti:instructors) {
			
			System.out.println(fti);
		}
		
		
		
	}

}
