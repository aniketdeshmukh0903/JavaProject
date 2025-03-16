package basicb;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        String[] words = s.split(" ");  
        String rev = "";

        for (int i = words.length - 1; i >= 0; i--) {
            rev += words[i];  
            if (i > 0) {
                rev += " ";              
                }
        }

        System.out.println(rev);  
    }
}
