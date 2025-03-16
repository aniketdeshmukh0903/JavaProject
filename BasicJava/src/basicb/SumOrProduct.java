package basicb;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N and C");
       
        int N = scanner.nextInt();
        int C = scanner.nextInt();
        
        
        int result = 0;
        
        if (C == 1) {
            
            result = 0;
            for (int i = 1; i <= N; i++) {
            	result = result + i;
            }
            System.out.println(result);
        } else if (C == 2) {
            
            result = 1;
            for (int i = 1; i <= N; i++) {
                result =result * i;
            }
            System.out.println(result);
        } else {
            
            System.out.println(-1);
        }
        
       
    }
}
