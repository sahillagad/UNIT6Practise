package BudgetAllocation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Budget_Allocation {
 
	 
	public static void main(String[] args) {
		
		Scanner  sc=new Scanner(System.in);
		
		System.out.println("How much can you spend?");
         double total= sc.nextDouble();
         
         double sum=0;
         int i=0;
         ArrayList<Double> proportion=new ArrayList<>();
         
        		 
		System.out.println("Enter Your Proportion of various expenses");
		System.out.println("The system stops if cumulative proportion exceeds 100%");
		
	       
		do {
			System.out.println("Your Proportion of excepence "
					+( i+1 )+":");
			
			double value=sc.nextDouble();
			proportion.add(value);
			sum=sum+proportion.get(i);
			i++;
			
		} while (sum<=100);
		sc.close();
		
		if(sum>100) {
			double cumnlativeSum=0.0;
			
			for(int j=0;j<proportion.size()-1;j++) {
				
				cumnlativeSum=cumnlativeSum+proportion.get(j);
			}
              
			proportion.set(proportion.size()-1,100.0-cumnlativeSum);
		
	  }
		for(double value:proportion) {
			
			double expense=(value*(total/100.00));
		
			System.out.println("Your "+value+" equals "+expense);
		}
		

		
	}
}
