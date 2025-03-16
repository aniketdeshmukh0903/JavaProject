package aniket;

import java.util.Scanner;

public class FindSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Main string");
		String str1=sc.nextLine();
		System.out.println("Enter substring");
		String str2=sc.nextLine();
		
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		int find=0;
		for(int i=0;i<ch1.length;i++) {
			int k=i,j=0;
			while	(k<ch1.length	&&	j<ch2.length	&&	ch1[k]==ch2[j]) {
				j++;
				k++;
			}
			if(j==ch2.length) {
				find++;
				System.out.println(	find + " times "+str2 + " present between " + i+ " to " +k + " indexs");
			}
			
		}
		if(find==0) {
			System.out.println("Npot found");
		}

	}

}
