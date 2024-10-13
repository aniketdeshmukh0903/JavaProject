package sdet_qa;

import java.util.Scanner;

public class CheckPrimeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit");
		int n=sc.nextInt();
		int j=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
			j++;
			}
						
			}
		if(j ==2) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not prime nuber");
		}

	
}
}
		