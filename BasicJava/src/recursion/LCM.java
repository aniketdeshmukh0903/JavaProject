package recursion;

import java.util.Scanner;

public class LCM {
	static int lcm(int a,int b,int m)
	{
		m=m+b;
		if((m%a==0) && (m%b==0))
			return m;
		return lcm(a,b,m);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,m=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		System.out.println(lcm(a,b,m));

	}

}
