

import java.util.Scanner;

public class PrintOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		while(n>0) {
			int d=n%10;
			if(d%2==0) {
				System.out.println("Even Number "+d);
			}
			else {
				System.out.println("Odd Number "+d);
			}
			n=n/10;
			
		}			

	}

}
