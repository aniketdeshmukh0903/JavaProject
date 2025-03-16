package sdet_qa;

import java.util.Scanner;

public class ArrayPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int j=0;
		int n=sc.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("prime number present in array");
		for(int i=0;i<n;i++)
		{boolean prime=true;
			for(int k=2;k<a[i];k++) {
			if(a[i]%k==0) {
			prime=false;
				
				}
			}
			if(prime==true) {
				System.out.print(a[i]+" ");
				}
			}
		}
		

	}
