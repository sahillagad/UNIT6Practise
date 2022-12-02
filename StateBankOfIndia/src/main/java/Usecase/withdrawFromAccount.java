package Usecase;

import java.util.Scanner;

import Dao.stateBankDAO;
import Dao.stateBankDAOImpl;

public class withdrawFromAccount {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Account Id");
		int accountId= sc.nextInt();
		
		
		System.out.println("Enter Withdraw Amount");
		int amount=sc.nextInt();
		
		
		stateBankDAO dao=new stateBankDAOImpl();
		String s= dao.withdrawFromAccount(amount, accountId);
		System.out.println(s);
		
		
		
	}
}
