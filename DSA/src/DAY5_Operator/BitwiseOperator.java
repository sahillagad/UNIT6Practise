package DAY5_Operator;

import java.util.HashMap;
import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {

//		 String[] arr= {"SSSSEEEECCCCEECCCC", "CCCCCSSSSEEECCCCSS","SSSSSEEESSCCCCCCCS","EESSSSCCCCCCSSEEEE"};
//		 st
//		 for(int i=0;i<arr.length;i=i+1) {
			 String s1="SSSSEEEECCCCEECCCCCCCCCSSSSEEECCCCSSSSSSSEEESSCCCCCCCSEESSSSCCCCCCSSEEEE";
			 int notpad=Integer.MIN_VALUE;
 			 for(int j=0;j<s1.length();j=j+1) {
              int count=0;
			 if(s1.charAt(j)=='C') {
				 
				 for(int k=j;k<s1.length()-1;k=k+1) {
					  
					  if((s1.charAt(k)=='C')) {
						  count++;
					 }
					  else {
						  break;
					  }
				  }
			 }
			 if(count>=notpad) {
				 notpad=count;
			 }	 
		 }
		System.out.println(notpad);
 
		HashMap<String, Integer> map=new HashMap<>();
	}
	}
	
	
//}
