package Day4;

import java.util.Scanner;

public class InputTacking1 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Write Principal Value");
		int principal= sc.nextInt();
		
		System.out.println("Write Rate Of Interest");
		float interest=sc.nextFloat();
		
		System.out.println("Write Number Of Month");
		int time=sc.nextInt();
		
		
		float simpleinterest=((principal*interest*time)/100);
		
		System.out.println("the Simple Interest is "+simpleinterest);
	
		
		
		
		
	} 
	
	
	
}
