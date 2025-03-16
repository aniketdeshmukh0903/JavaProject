package basicb;

import java.util.Scanner;

public class FibonnachiNumberOrnot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		boolean f=false;
		
		
		int n1=0,n2=1,sum=0;
		if(n==0) {
			f=true;
			
		}
		else if(n==1) {
			 f=true;
		}
		else {
			for(int i=2;i<30;i++) {
				sum=n1+n2;
				
				n1=n2;
				n2=sum;
				
				if(n==sum) {
					f=true;
				}
		}
		

	}
		System.out.println("the given number is fibbonaci number is : "+f);

}
}
