package recursion;

import java.util.Scanner;

public class EvenNumber {
	
	static int even(int a,int b) {
		if(a>b)
			return 0;
		System.out.println(a+" ");
			return even(a+2,b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting number");
		a=sc.nextInt();
		System.out.println("Enter last number");
		b=sc.nextInt();
		if(a%2==0)
		{
			a=a;
			
		}
		else {
			a=a+1;
		}
		even(a,b);

	}

}
