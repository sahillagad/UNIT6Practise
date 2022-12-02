package Usecase;

import java.util.Scanner;

import BEAN.PRODUCT;
import DAO.AdminDao;
import DAO.AdminDaoImpl;

public class SearchProduct {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Product Id");
	    int productId=sc.nextInt();
		
	      
		
		AdminDao dao=new AdminDaoImpl();
		PRODUCT product= dao.getProductById(productId);
		
		System.out.println(product);
		
		
	}
}
