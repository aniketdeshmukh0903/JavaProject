package aniket;

import java.util.Scanner;

public class DecimalToOctal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number");
		int n=sc.nextInt();
		int ans=0;
		int placevalue=1;
		
	while(n>0) {
			
			int rem=n%8;
			
			ans=ans+rem*placevalue;
			
			n=n/8;
			placevalue=placevalue*10;
		}
		System.out.println(ans);
		
	}


}
