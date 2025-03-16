package studyeasy;

import java.util.Scanner;

public class SumOfEvenDigit {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number");
			int n=sc.nextInt();
			int i;
			int s=0;
			while( n>0) {
				i=n%10;
				if(i%2==0) {
					s=s+i;
				}
				n=n/10;
		
		
	}
			System.out.println("The total Even digit present in the number is "+s);
}
}