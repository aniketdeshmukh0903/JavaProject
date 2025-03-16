package aniket;

import java.util.Scanner;

public class HexadecimalToBinary {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number");
        String hex = sc.nextLine(); 
        int decimal = 0;
        int length = hex.length();
        
        for (int i = 0; i < length; i++) {
            char ch = hex.charAt(i);
            int digit;
            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';  
            } else {
                digit = ch - 'A' + 10;  
            }
            decimal = decimal * 16 + digit;  
        }

        int ans=0;
    	int placevalue=1;
    	
    	while(decimal>0) {
    		
    		int rem=decimal%2;
    		
    		ans=ans+rem*placevalue;
    		
    		decimal=decimal/2;
    		placevalue=placevalue*10;
    	}
    	System.out.println(ans);
    }
}


