package recursion;

import java.util.Scanner;

public class SumOfTwoNum {
	static int sum(int a,int b)
	{
		if(b==0)
			return a;
		return 1+sum(a,b-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		System.out.println(sum(a,b));
	}

}
