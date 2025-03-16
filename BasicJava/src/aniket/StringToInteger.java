package aniket;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="1234";
		
		int i=0,num=0;
		for(int j=0;j<str.length();j++) {
			char ch=str.charAt(j);
			 int digit = ch - '0';
			 
			 num = num * 10 + digit;
			 
			 
		}
		System.out.println(num);
		

	}

}
