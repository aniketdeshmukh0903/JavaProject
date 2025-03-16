package studyeasy;

import java.util.Scanner;

public class SumOfDigit {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number");
			int n=sc.nextInt();
			int i;
			int s=0;
			while( n>0) {
				i=n%10;
					s=s+i;
				n=n/10;
		
		
	}
			System.out.println("The sum of digit in the number is "+s);
}
}