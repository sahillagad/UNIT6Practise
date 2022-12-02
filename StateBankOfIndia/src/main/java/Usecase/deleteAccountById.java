package Usecase;

import java.util.Scanner;

import Dao.stateBankDAO;
import Dao.stateBankDAOImpl;

public class deleteAccountById {

	
	
	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Account Id");
		int accountId= sc.nextInt();
		
		
		stateBankDAO dao=new stateBankDAOImpl();
	     
	 String s=dao.deleteAccountById(accountId);
		
	 System.out.println(s);
	
		
		
		
	}
}
