package numberpattern;

import java.util.Scanner;

public class AlphaPatern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		 
		for (int i = 0; i < n; i++) {
			char ch = (char) (65+i);
           
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
           
            System.out.println();
	}

}
}
