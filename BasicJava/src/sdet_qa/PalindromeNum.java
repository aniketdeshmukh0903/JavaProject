package sdet_qa;

import java.util.Scanner;

public class PalindromeNum {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int r=0;
	while(n>0) {
		r=r*10 + n%10;
		n=n/10;
	}
	if(n==r) {
		System.out.println("Number is palindrome ");
	}
	else {
		System.out.println("Number is not palindrome ");
	}
}
}
