package sdet_qa;

import java.util.Scanner;

public class SwapNumber {
	public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	
//	int t=a;
//	a=b;
//	b=t;
//	
//	System.out.println("Swapped numbers are " +a+"  "+b);
	
	// Method  2 with + _ operator
//	a=a+b;
//	b=a-b;
//	a=a-b;
//	
//	System.out.println("Swapped numbers are " +a+"  "+b);
	
	// Method 3 using * and/ operator
	
//	a=a*b;
//	b=a/b;
//	a=a/b;
//	
//	System.out.println("Swapped numbers are " +a+"  "+b);
	
	// Usimg bitwiswe operator
	
//	a=a^b;
//	b=a^b;
//	a=a^b;
//	
//	System.out.println("Swapped numbers are " +a+"  "+b);
	
	// Using single statement
	
	b=a+b-(a=b);
	System.out.println("Swapped numbers are " +a+"  "+b);
			
}
}