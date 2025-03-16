package aniket;

import java.util.Scanner;

public class CountOCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		int count=0;
		
		
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				count ++;
			}
			
		}
		System.out.println(count);
	}

}
