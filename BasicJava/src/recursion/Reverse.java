package recursion;

import java.util.Scanner;

public class Reverse {
	static String reverse(String na,int l,String rev)
	{
		if (l<0)
			return rev;
		rev=rev+na.charAt(l);
		return reverse(na,l-1,rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String na,rev="";
		int l;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entrer a string");
		na=sc.next();
		l=na.length();
		System.out.println(reverse(na,l-1,rev));
	}

}
