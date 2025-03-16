package aniket;


import java.util.Scanner;

public class OneToNArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int k = sc.nextInt();
        
        for (int n = 1; n <= k; n++) {
            int c = n; 
            int sum = 0;
            int digits = 0;
            int tem=n;
            while(tem>0) {
            	tem=tem/10;
            	digits++;
            	
            }
            
            int temp = n; 
            
            while (temp > 0) {
                int l = temp % 10; 
                
               
                int power = 1;
                for (int i = 0; i < digits; i++) {
                    power =power*l; 
                }
                
                sum = sum+power; 
                temp = temp/10; 
            }
            
            if (c == sum) { 
                System.out.println(c);
            }
        }
    }
}
