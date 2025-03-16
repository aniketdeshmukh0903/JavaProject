package numberpattern;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Write N");
		int N=sc.nextInt();
		
		for(int i=2;i<=N;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
				
				
			}
			if(isPrime==true) {
				System.out.println(i);
			}
			
			
		}

	}

}
