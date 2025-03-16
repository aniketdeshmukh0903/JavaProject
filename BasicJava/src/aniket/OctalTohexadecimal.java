package aniket;

import java.util.Scanner;

public class OctalTohexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number");
		int n = sc.nextInt();
		int c = 0;
		int p = 1;
		while (n > 0) {
			int m = n % 10;
			c = c + (m * p);
			p = p * 8;
			n = n / 10;
		}
		int rem;
		String str = "";
		char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		while (c > 0) {
			rem = c % 16;
			str = hex[rem] + str;
			c = c / 16;
		}
		System.out.println(str);
	}

}
