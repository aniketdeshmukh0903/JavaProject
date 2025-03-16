package numberpattern;

import java.util.Scanner;

public class CodePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
	for(int i=1;i<=n;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
