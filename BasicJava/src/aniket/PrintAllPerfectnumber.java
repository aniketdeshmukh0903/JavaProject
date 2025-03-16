package aniket;

import java.util.Scanner;

public class PrintAllPerfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		for(int j=1;j<=n;j++) {
		int sum=0;
		for(int i=1;i<j;i++) {
			if(j%i==0 ) {
				sum=(sum+i);
			}
			
		}
		
		if(j==sum) {
			System.out.println(j);
		}
		
	}


}
}
