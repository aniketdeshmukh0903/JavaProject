package aniket;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0 ) {
				sum=(sum+i);
			}
			
		}
	
		if(n==sum) {
			System.out.println("The given number is perfect number");
		}
		else {
			System.out.println("The give number is not perfect number");
		}
	}


}
