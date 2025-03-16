package studyeasy;

import java.util.Scanner;

public class DigitOfNumber {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number");
			int n=sc.nextInt();
			while( n>0) {
				System.out.println(n%10);
				n=n/10;
			}
			
	}
}
