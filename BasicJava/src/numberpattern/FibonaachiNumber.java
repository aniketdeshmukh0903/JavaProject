package numberpattern;

import java.util.Scanner;

public class FibonaachiNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

       
        int a = 1, b = 1;

        
        if (N == 1 || N == 2) {
            System.out.println("The " + N + "th Fibonacci number is: 1");
        } else {
            int c;
            

            for (int i = 1; i < N; i++) {
                c = a + b; 
                a = b; 
                b = c;
            }
            
            System.out.println("The " + N + "th Fibonacci number is: " + a);
        }
    }
}
