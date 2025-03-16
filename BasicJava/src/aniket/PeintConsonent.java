package aniket;

import java.util.Scanner;

public class PeintConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String vowels = "";
        String consonants = "";
		for(int j=1;j<s.length();j++) {
			char ch = s.charAt(j);
			
			
			 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
		                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				 vowels = vowels+ch;
			}
			else {
				consonants =consonants+ch;
			}
		}
		System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

	}

}
