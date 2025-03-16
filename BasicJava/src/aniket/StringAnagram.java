package aniket;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String str1=sc.nextLine();
		System.out.println("Enter second string");
		String str2=sc.nextLine();
		str1=str1.replaceAll("\\s", "");
		str2=str2.replaceAll("\\s", "");
			if(str1.length() !=str2.length()) {
				System.out.println("false");
			}
			else {
				char c1[]=str1.toLowerCase().toCharArray();
				char c2[]=str2.toLowerCase().toCharArray();
				Arrays.sort(c1);
				Arrays.sort(c2);
				if(Arrays.equals(c1, c2)) {
					System.out.println("String is Anagram");
				}
				else {
					System.out.println("String is not anagram");
				}
			}

		}
	}
