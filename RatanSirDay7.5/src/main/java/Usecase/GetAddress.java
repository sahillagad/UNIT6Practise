package Usecase;

import javax.persistence.EntityManager;

import Bean.Address;
import Utility.EMUtility;

public class GetAddress {
public static void main(String[] args) {
	
 EntityManager em=	EMUtility.provideEntityManager();
	
	
             Address address=   em.find(Address.class,1 );

              System.out.println(address);
}

}
