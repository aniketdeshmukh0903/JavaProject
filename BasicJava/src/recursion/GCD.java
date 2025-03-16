package recursion;

import java.util.Scanner;

public class GCD {
	static int gcd (int a,int b) {
		if(a%b==0)
			return b;
		return gcd(b,a%b);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second");
		b=sc.nextInt();
		System.out.println(gcd(a,b));
	}

}
