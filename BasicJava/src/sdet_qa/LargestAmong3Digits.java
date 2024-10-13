package sdet_qa;

import java.util.Scanner;

public class LargestAmong3Digits {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		
		System.out.println("Enter second Number");
		int b=sc.nextInt();
		
		System.out.println("Enter third Number");
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("First Number is largest");
		}
		else if(b>a&& b>c) {
			System.out.println("Second number is largest");
			
		}
		else {
			System.out.println("Third number is largest");
		}
		
		
		//Using ternary operator
//		int largest=c>(a>b?a:b)?c:(a>b?a:b);
//		System.out.println(largest+" is largest number");
	}
}
