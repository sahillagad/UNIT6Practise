package Dao;

import javax.persistence.EntityManager;

import Bean.Account;
import EMUtility.EMutility;

public class stateBankDAOImpl implements stateBankDAO {

	@Override
	public Account findAccountById(int id) {
		
		Account account=null;
		

		EntityManager em= EMutility.provideEntityManager();
		
		 account= em.find(Account.class,id);
     
		
		 
		
		return account;
	}

	@Override
	public String saveAccount(Account account) {
		
		String result="Account Is Not Save...";
		
		
		EntityManager em= EMutility.provideEntityManager();
		
		em.getTransaction().begin();
		
		
		em.persist(account);
		result="Account Is Save Sussessfully...";
		em.getTransaction().commit();
		return result;
		
	}

	@Override
	public String deleteAccountById(int id) {
		
		String result="Account Delete Failed...";
		Account account=null;
		

		EntityManager em= EMutility.provideEntityManager();
		
		 account= em.find(Account.class,id);
		 em.getTransaction().begin();
		 if(account!=null) {
			 
			 em.remove(account);
 			 result="Account is delete Sussessfully...";
 	 
		 }
		 em.getTransaction().commit();
		
	
		 return result;
	}

	@Override
	public String withdrawFromAccount(double amount, int accountId) {
		
		String result="Withdraw From Account Failed...";
		Account account=null;
		

		EntityManager em= EMutility.provideEntityManager();
		
		 account= em.find(Account.class,accountId);
		 em.getTransaction().begin();
		 if(account!=null) {
			 
		
			 if(account.getBalance()>=amount) {
				 account.setBalance((account.getBalance()-amount));
				 result ="Amount Withdraw Sussessfully...";		 
			 }
			 
			 
 	 
		 }
		 em.getTransaction().commit();
		
	
		 return result;
	}

	@Override
	public String depositInAccount(double amount, int accountId) {
		String result="deposit In Account Failed...";
		Account account=null;
		

		EntityManager em= EMutility.provideEntityManager();
		
		 account= em.find(Account.class,accountId);
		 em.getTransaction().begin();
		 if(account!=null) {
			 
		
			
				 account.setBalance((account.getBalance()+amount));
				 result ="Amount deposit Sussessfully...";		 
			
			 
			 
 	 
		 }
		 em.getTransaction().commit();
		
	
		 return result;
	}

}
