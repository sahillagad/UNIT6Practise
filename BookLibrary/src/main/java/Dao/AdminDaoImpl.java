package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transaction;

import Bean.Book;
import EMUtility.EMutility;
import Exception.*;


public class AdminDaoImpl implements AdminDao{

	@Override
	public Book GetBookBYId(int BookId) throws BookException {
 
		Book book=null;
		EntityManager em=EMutility.provideEntityManager();
		
	   EntityTransaction et= em.getTransaction();
	 	
	   et.begin();
	      
	           book=em.find(Book.class,BookId);   
	               
	      
	   et.commit();
		
	   if(book==null) {
		   
		   BookException bookException=new BookException("Book Is  Not Found By Given Id");
		   throw bookException;
		   
	   }
	   
	      
	    em.close();
	   
		return book;
	}

	@Override
	public String CraeteBook(Book book) throws BookException {
		
	String result="Book is Not Craeted...";
	
	
	  
	EntityManager em=EMutility.provideEntityManager();
	
	   EntityTransaction et= em.getTransaction();
	   
	   et.begin();
	    
	   
	   em.persist(book);
		result="Book Is Craeted.....";
		
		
		et.commit();
	   em.close();
		
		
		return result;
	}

	@Override
	public String DeleteBook(int BookId) throws BookException {
	String result="Book Is Not Deleted...";
	Book book=null;
	EntityManager em=EMutility.provideEntityManager();
	
   EntityTransaction et= em.getTransaction();
 	
   et.begin();
      
           book=em.find(Book.class,BookId);   
               
       
       if(book!=null) {
    	  
    	
    	
    	   em.remove(book);
    	   result="Book Is Deleted Successfully...";
    	  
    	   
       }	 
       else {
    	   
		   BookException bookException=new BookException("Book Is  Not Found By Given Id");
		   throw bookException;
       }
    	 
    	et.commit(); 
		return result;
	}

	@Override
	public String UpdateBookPrice(int BookId,double price) throws BookException {
		String result="Book Is Not Update...";
		
		Book book=null;
		EntityManager em=EMutility.provideEntityManager();
		
	   EntityTransaction et= em.getTransaction();
	 	
	   et.begin();
	      
	           book=em.find(Book.class,BookId);   
	               
	       
	     
	       if(book!=null) {
	    	 
	    	 
	    	   book.setPrice(price);
	    	   result="Book Is Update Successfully....";
	    	   
	       }
	       else {
	    	   
	    	   
			   BookException bookException=new BookException("Book Is  Not Found By Given Id");
			   throw bookException;
	       }
	    	 
	    	et.commit(); 
			return result;
	}

	
	
	
	
	
}
