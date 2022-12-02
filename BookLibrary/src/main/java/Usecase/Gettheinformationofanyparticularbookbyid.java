package Usecase;

import java.util.Scanner;

import Bean.Book;
import Dao.AdminDao;
import Dao.AdminDaoImpl;
import Exception.BookException;

public class Gettheinformationofanyparticularbookbyid {

	
	
	public static void main(String[] args) {
		
 Scanner sc=new Scanner(System.in);
		 
		 
		
		 
		 System.out.println("Enter Book Id");
		 int bookId=sc.nextInt();
		
		 AdminDao dao=new AdminDaoImpl();
		 try {
		Book book= dao.GetBookBYId(bookId);
		
		System.out.println(book);
		 } catch (BookException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
