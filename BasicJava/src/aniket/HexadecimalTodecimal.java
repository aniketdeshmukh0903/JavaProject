package aniket;

import java.util.Scanner;

public class HexadecimalTodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a hexadecimal number");
		String s = sc.nextLine();

		int length = s.length();
		int digit =0;
		int decimal=0;
		for(int i=0;i<length;i++) {
			char ch=s.charAt(i);
			
			if(ch>=0 && ch<=9) {
				digit =ch-0;
			}
			else {
				digit =ch -'A' +10;
			}
			decimal=decimal*16 +digit;
		}
		System.out.println(decimal);
	}

}
