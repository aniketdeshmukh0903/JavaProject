package aniket;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a binary number");
	int n=sc.nextInt();
	int ans=0;
	int placevalue=1;
	
	while(n>0) {
		
		int rem=n%2;
		
		ans=ans+rem*placevalue;
		
		n=n/2;
		placevalue=placevalue*10;
	}
	
//	String c=" ";
//	
//	while(n>0) {
//		int rem=n%2;
//		c=rem+c;
//		n=n/2;
//		
//	}
	System.out.println(ans);	
}
}
