package recursion;

import java.util.Scanner;

public class SumOfDigit {
	static int sum(int num)
	{
		if(num<10)
			return num;
		return(num%10)+sum(num/10);
		
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		num=sc.nextInt();
		s=sum(num);
		System.out.println(s+ " Is the sum of digit "+num);
	}

}
