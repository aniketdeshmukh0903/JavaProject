package recursion;

import java.util.Scanner;

public class ProductOfNum {
	static int product(int a,int b)
	{
		if(b==1)
			return a;
		return a+product(a,b-1);
		
	}
	public static void main(String[] args) {
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		System.out.println(product(a,b));
	}
}
