package numberpattern;

import java.util.Scanner;

public class CharacterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter N ");
	        int n = sc.nextInt();
	        
	       
	        for (int i=0; i<n; i++) {
	            
	            for (int j=0; j<=i; j++) {
	               
	                System.out.print((char) (65 + i + j)); 
	                
	            }
	            
	            System.out.println();
	        }

	}

}
