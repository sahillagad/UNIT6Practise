package Usecase;

import java.text.DateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Bean.Account;
import Dao.stateBankDAO;
import Dao.stateBankDAOImpl;

public class saveAccount {

	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Email Id ");
		String email= sc.next();
		
		
		System.out.println("Enter Address");
		String address=sc.next();
		
		
		
		System.out.println("Enter Account Balance");
		double balance=sc.nextDouble();
		
		 
		System.out.println("Enter Account Create Date (Write Date In formate DD/MM/YYYY)");
        String createDate=sc.next();		
		
		DateTimeFormatter patter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date=LocalDate.parse(createDate,patter);
		
		
		Account account=new Account(email, address, balance, date);
		
		
		stateBankDAO dao=new stateBankDAOImpl();
		
	 	String s=dao.saveAccount(account);
		System.out.println(s);

	}
}



