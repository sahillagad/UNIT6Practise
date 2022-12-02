package Dao;

import Bean.Book;
import Exception.*;

public interface AdminDao {

	
	  public Book GetBookBYId(int BookId)throws BookException;
	  public String CraeteBook(Book book)throws BookException;
	  public String DeleteBook(int BookId) throws BookException;
	  public String UpdateBookPrice(int BookId,double price)throws BookException;
	  
	  
	  
	  
	  
	  
	  
}
