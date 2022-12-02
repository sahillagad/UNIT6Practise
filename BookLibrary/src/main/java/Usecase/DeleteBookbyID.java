package Usecase;

import java.util.Scanner;

import Dao.AdminDao;
import Dao.AdminDaoImpl;
import Exception.BookException;

public class DeleteBookbyID {

	public static void main(String[] args) {
		
 Scanner sc=new Scanner(System.in);
		 
		 
		
		 
		 System.out.println("Enter Book Id");
		 int bookId=sc.nextInt();
		
		 AdminDao dao=new AdminDaoImpl();
		 try {
		String b= dao.DeleteBook(bookId);
		
		System.out.println(b);
		 } catch (BookException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
