package aniket;

import java.util.Scanner;

public class OctaltoBinary {

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
		int ans = 0;
		int placevalue = 1;

		while (c > 0) {

			int rem = c % 2;

			ans = ans + rem * placevalue;

			c = c / 2;
			placevalue = placevalue * 10;
			
		}
		System.out.println(ans);

	}

}
