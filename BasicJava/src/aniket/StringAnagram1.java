package aniket;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram1 {

	static String removeSpaces(String str) {
		char[] ch = str.toCharArray();

		String nstr = "	";

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != '	')
				nstr = nstr + ch[i];

		}
		return nstr;

	}

	static String toLowerCase(String str) {

		char[] ch = str.toCharArray();
		String nstr = "	";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				nstr = nstr + ((char) ch[i] + 32);
			} else {
				nstr = nstr + ch[i];

			}
		}
		return str;

	}

	static String sort(String str) {

		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char t = ch[i];
					ch[i] = ch[j];
					ch[j] = t;
				}
			}
		}
		String st = new String(ch);
		return str;

	}

	static boolean compare(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		else {
			s1 = toLowerCase(s1);
			s2 = toLowerCase(s2);
			s1 = sort(s1);
			s2 = sort(s2);
			char ch1[] = s1.toCharArray();
			char ch2[] = s2.toCharArray();
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String s1 = sc.nextLine();
		System.out.println("Enter second string");
		String s2 = sc.nextLine();
		s1 = removeSpaces(s1);
		s2 = removeSpaces(s2);
		boolean b = compare(s1, s2);
		if (b)
			System.out.println("string	is	anagram");
		else
			System.out.println("not	an	anagram");
	}
}
