package numberpattern;

import java.util.Scanner;

public class InterestingCodeAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter n");
		int n=sc.nextInt();
		
		for (int i = 0; i < n; i++) {
            
            char ch = (char) ('A' + (n - 1 - i));

            for (int j = 0; j <= i; j++) {
                System.out.print((char) (ch+ j));
            }
            System.out.println(); 
        }
		

	}

}
