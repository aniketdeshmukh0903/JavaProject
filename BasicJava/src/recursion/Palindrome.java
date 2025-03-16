package recursion;

import java.util.Scanner;

public class Palindrome {
	static int pal(int n,int sum)
	{
		if(n==0)
			return sum;
		sum=(sum*10)+(n%10);
		return pal(n/10,sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0,p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		num=sc.nextInt();
		p=pal(num,sum);
		if(num==p)
			System.out.println(num+ " is a palindrome number");
		else
			System.out.println(num+ " is not a palindrome number");
	}

}
