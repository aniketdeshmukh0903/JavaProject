package aniket;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String n = sc.nextLine();
		String s = n;
		int i = 0;
		int j = s.length() - 1;
		char arr[] = s.toCharArray();
		while (i < j) {
			if (arr[i] == arr[j]) {
				i++;
				j--;
			} else {
				System.out.println("String is not palindrome");
			}
		}

		if (i >= j) {
			System.out.println("String is Palindrome");
		}

	}
}