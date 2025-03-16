package basicb;

import java.util.Scanner;

public class DecimalBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		System.out.println("Binary number is");
		String b= "";
		while(n>0) {
			int r= n%2;
			b = r + b;
			n=n/2;
		}
			
		System.out.print(b);
	}
}

