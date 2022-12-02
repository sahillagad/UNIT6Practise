package Usecase;

import java.util.Scanner;

import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;

public class getAllEmployee {

	public static void main(String[] args) {
		

		
		EmployeeDao dao=new EmployeeDaoImpl();
		dao.getAllEmployee();
		
		
		
		
	}
}
