package basicb;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        
        int N = sc.nextInt();
        
      
        int integralPart = 0;

        for (int i = 0; i * i <= N; i++) {
            integralPart = i; 
        }
        
        
        System.out.println(integralPart);
        
       
    }
}
