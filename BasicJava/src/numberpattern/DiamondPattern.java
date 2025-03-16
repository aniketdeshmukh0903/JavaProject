package numberpattern;

import java.util.Scanner;

public class DiamondPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int k=n-1;
		
		for (int j=1;j<=n; j++)  
		{  
		for (int i=1; i<=k; i++)  
		{  
		System.out.print(" ");  
		}  
		k--;  
		for (int i=1; i<=2*j-1;i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}
		k=1;
		for (int j=n-1;j>= 1; j--)  
		{  
		for (int i=1; i<=k; i++)  
		{  
		System.out.print(" ");  
		}  
		k++;  
		for (int i=1; i<=2*j-1;i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}
	}
}
