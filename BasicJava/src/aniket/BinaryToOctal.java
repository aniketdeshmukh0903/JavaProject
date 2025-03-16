package aniket;

import java.util.Scanner;

public class BinaryToOctal {

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
			p = p * 2;
			n = n / 10;
		}

		int k = c;

		int ans = 0;
		int placevalue = 1;
		while (k > 0) {

			int rem = k % 8;

			ans = ans + rem * placevalue;

			k = k / 8;
			placevalue = placevalue * 10;
		}
		System.out.println(ans);

	}

}
