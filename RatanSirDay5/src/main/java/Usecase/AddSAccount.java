package Usecase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;

import Bean.Account;
import Utility.EMUtility;

public class AddSAccount {

	public static void main(String[] args) {
		
		List<Account> accounts=new ArrayList<>();
		
		accounts.add(new Account("sahil", 10000));
		accounts.add(new Account("Ram", 100));
		accounts.add(new Account("Raj", 700));
		accounts.add(new Account("Rani", 20000));
		accounts.add(new Account("Bhsakar", 100000));
		accounts.add(new Account("manasi", 100));
		
		EntityManager em=EMUtility.provideEntityManager();
		
		em.getTransaction().begin();
		
		
		
		
		for(Account account:accounts) {
			
			em.persist(account);
		}
		
		
		em.getTransaction().commit();
		
		
		
	}
}
