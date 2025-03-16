package aniket;

import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number");
		int n=sc.nextInt();
		int rem;
		String str="";
		char hex[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(n>0) {
			rem=n%16;
			str=hex[rem]+str;
			n=n/16;
		}
		System.out.println(str);

	}

}
