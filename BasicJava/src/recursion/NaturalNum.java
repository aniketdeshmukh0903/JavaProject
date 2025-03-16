package recursion;

import java.util.Scanner;

public class NaturalNum {
	static int natural(int a,int b) {
		if(a>b)
			return 1;
		System.out.print(a+" ");
		return natural(a+1,b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting num");
		a=sc.nextInt();
		System.out.println("Enter last number");
		b=sc.nextInt();
		natural(a,b);
	}

}
