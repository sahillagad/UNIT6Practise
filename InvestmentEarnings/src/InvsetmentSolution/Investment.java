package InvsetmentSolution;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Investment {
	
	
	public static void main(String[] args) {
		
		DecimalFormat decimalFormat=new DecimalFormat("0.00");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Buying Price Per Share");
		double buyingPrice=sc.nextDouble();
		
		int day=1;
		double closingPrice;
		while(true) {
			
			System.out.println("Enter The Closing Price For Day "+day+" any negative value to leave: ");
			
			closingPrice=sc.nextDouble();
			
			if(closingPrice<0) {
				
				break;
			}
			else {
				
				double earnings=closingPrice-buyingPrice;
				if(earnings>0) {
					System.out.println("After Day "+day+" You Earned "+decimalFormat.format(earnings)+" Per Share");
				}
				else if(earnings<0) {
					
					System.out.println("After Day "+day+" You Lost "+ decimalFormat.format(-earnings)+" Per Share");
				}
				
				else if(earnings==0) {
					
					System.out.println("After Day "+day+" You Have no earning Per Share..");
				}
			}
			day=day+1;
		}
		
        sc.close();		
		
		
		
		
		
		
		
		
		
		
	}
	

}
