package Usecase;

import java.util.Scanner;

import BEAN.PRODUCT;
import DAO.AdminDao;
import DAO.AdminDaoImpl;

public class ADDPRODUCT {

	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Product Name");
	 	String productName=  sc.next();
	
	 	System.out.println("Enter Product Quantity");
	     int quanity=sc.nextInt();
		
		System.out.println("Enter Product Price");
		int productPrice=sc.nextInt();
		
	 
		PRODUCT product=new PRODUCT(productName, quanity, productPrice);
		
		AdminDao dao=new AdminDaoImpl();
		
		dao.AddProducts(product);
		
		
		
		
		
		
	}
	
	
}
