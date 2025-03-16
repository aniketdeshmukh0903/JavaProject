package recursion;

import java.util.Scanner;

public class Dec_bin {
	static int dec(int n,String s)
	{
		if(n==0)
			return (Integer.parseInt(s));
			s=Integer.toString(n%2)+s;
		return dec(n/2,s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String s="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		n=sc.nextInt();
		System.out.println(dec(n,s));

	}

}
