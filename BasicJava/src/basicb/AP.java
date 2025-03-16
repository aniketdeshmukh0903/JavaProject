package basicb;
import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X");
 
        int x = sc.nextInt();
        int count = 0; 
        int n = 1; 

       
        while (count < x) {
            int term = 3 * n + 2;
            if (term % 4 != 0) { 
                System.out.print(term + " ");
                count++;
            }
            n++;
        }

       
    }
}
