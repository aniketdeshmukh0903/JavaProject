package studyeasy;

import java.util.Scanner;

public class SumPrime {
	public static void main(String[] args) {
		int cn;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			cn=i;
			int k=0;
		
			for(int j=1;j<=cn;j++) {
				if(cn%j==0) {
					k++;
				}
			}
			
				if(k==2) {
					System.out.println(i);
					sum = sum+i;
				}
				
			}
		
		System.out.println(sum);
		}
	}