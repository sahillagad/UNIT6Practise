package Usecase;

import java.util.Scanner;

import Dao.AdminDao;
import Dao.AdminDaoImpl;
import Exception.BookException;

public class UpdateBookbyIDbydoublingtheprice {

	
	
	public static void main(String[] args) {
		
 Scanner sc=new Scanner(System.in);
		 
		 
		
		 
		 System.out.println("Enter Book Id");
		 int bookId=sc.nextInt();
		 
		 System.out.println("Enter Price");
		 double price=sc.nextDouble();
		
		 AdminDao dao=new AdminDaoImpl();
		 try {
		String b= dao.UpdateBookPrice(bookId, price);
		
		System.out.println(b);
		 } catch (BookException e) {
			
			e.printStackTrace();
		}
		
		
	}
}

