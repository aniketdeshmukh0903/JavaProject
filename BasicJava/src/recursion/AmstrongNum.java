package recursion;

import java.util.Scanner;

public class AmstrongNum {
	static int arm(int n)
	{
		if(n<10)
			return n*n*n;
		return (n%10)*(n%10)*(n%10)+arm(n/10);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		num=sc.nextInt();
		r=arm(num);
		if(num==r)
			System.out.println(num+" is an amrstrong number");
		else
			System.out.println(num+" is not an amstrong number");

	}

}
