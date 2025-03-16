package recursion;

import java.util.Scanner;

public class PowerValue {
	static int power(int a,int b)
	{
		if(b==1)
			return a;
		return a*power(a,b-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base number");
		a=sc.nextInt();
		System.out.println("Enter power value");
		b=sc.nextInt();
		p=power(a,b);
		System.out.println(p + " Is the power value");
	}

}
