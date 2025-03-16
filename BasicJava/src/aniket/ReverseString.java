package aniket;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.next();
		System.out.println("Reverse String");
		for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
		
	}

}
