package sdet_qa;

import java.util.Scanner;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int odd=0;
		int Even=0;
		
		
		while(n>0) {
			int r=n%10;
			if(r%2==0) {
				Even++;
			}
			else {
				odd++;
			}
			n=n/10;
		}
		System.out.println("Even digits "+Even);
		System.out.println("Odd digits "+odd);
	}

}
