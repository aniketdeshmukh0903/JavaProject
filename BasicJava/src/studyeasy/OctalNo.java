package studyeasy;

import java.util.Scanner;

public class OctalNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		System.out.println("Binary number is");
		String b= "";
		while(n>0) {
			int r= n%8;
			b = r + b;
			n=n/8;
		}
			
		System.out.print(b);
	}
}