package star_pattern;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		System.out.println("Enter n");
		int n = new Scanner(System.in).nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
			
		}
		
		
		
	
}
	