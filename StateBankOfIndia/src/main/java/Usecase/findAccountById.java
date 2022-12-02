package Usecase;

import java.util.Scanner;

import Bean.Account;
import Dao.stateBankDAO;
import Dao.stateBankDAOImpl;

public class findAccountById {

	
	public static void main(String[] args) {
		
	

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Account Id");
	int accountId= sc.nextInt();
	
	
	stateBankDAO dao=new stateBankDAOImpl();
     
       Account account=dao.findAccountById(accountId);
        System.out.println(account);   
 
 

	
}
}
