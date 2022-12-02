package Usecase;

import java.time.LocalDate;
import java.util.Scanner;

import Bean.Book;
import Dao.AdminDao;
import Dao.AdminDaoImpl;
import Exception.BookException;

public class CreateanewBook {
 
	 public static void main(String[] args) {
		
		 
		 
		 Scanner sc=new Scanner(System.in);
		 
		 
		
		 
		 System.out.println("Enter Book Name");
		 String bookName=sc.next();
		 
		 System.out.println("Enter Book Auther Name");
		 String bookAutherName=sc.next();
		 
		 System.out.println("Enter Book Publication");
		 String publication=sc.next();
		 
		 System.out.println("Enter Book category");
		 String category=sc.next();
		 
		 
		 System.out.println("Enter Book Page");
		 int page= sc.nextInt();
		 
		 
		 System.out.println("Enter Book Price");
		 double price=sc.nextDouble();
		 
		 LocalDate date=LocalDate.now();
		 
		 Book book=new Book(bookName, bookAutherName, publication, category, page, price, date);
		 
		 
		 AdminDao dao=new AdminDaoImpl();
		 try {
		String b= dao.CraeteBook(book);
		System.out.println(b);
		 } catch (BookException e) {
			
			e.printStackTrace();
		}
		 
		 
		 
	}
	
	
}
