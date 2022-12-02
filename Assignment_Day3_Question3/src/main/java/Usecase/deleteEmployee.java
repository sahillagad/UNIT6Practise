package Usecase;

import java.util.Scanner;

import Dao.AdminDao;
import Dao.AdminDaoImpl;

public class deleteEmployee {
public static void main(String[] args) {
	
	
	
	Scanner sc=new Scanner(System.in);
	

	System.out.println("Enter Employee Id that you want to delete");
     int empid= sc.nextInt();
	
     
     AdminDao dao=new AdminDaoImpl();
     
     boolean c= dao.deleteEmployee(empid);
		 
   
     
     if(c==true) {
    	 
    	  System.out.println("Employee Delete Successfully"); 	 
    	 
     }
     else {
    	 
    	 System.out.println("Employee not  Delete");
     }
	
	
	
}

}
