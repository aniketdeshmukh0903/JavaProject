package recursion;

import java.util.Scanner;

public class CountDigit {
    
    static int count(int num) {
        if (num < 10) 
            return 1;
        return 1 + count(num / 10);
    }

    public static void main(String[] args) {
        int num, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        num = sc.nextInt();
        c = count(num);
        System.out.println(c + " is the total number of digits.");
       
    }
}
