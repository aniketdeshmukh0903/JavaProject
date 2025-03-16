package aniket;

import java.util.Scanner;

public class OneToNStrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int k = sc.nextInt();
        
        for (int n = 1; n <= k; n++) {
            int c = n;
            int f;
            int sum = 0;
            int temp = n;
            
            while (temp > 0) {
                int l = temp % 10;
                f = 1;
                
                for (int i = 1; i <= l; i++) {
                    f = f * i; 
                }
                
                sum = sum + f; 
                temp = temp / 10; 
            }
            
            if (c == sum) { 
                System.out.println(c); 
            }
        }
        
       
    }
}
