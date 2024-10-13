package sdet_qa;

public class ReverseString {

	public static void main(String[] args) {
		String s="ABCD";
		String rev="";
//		StringBuffer sb = new StringBuffer(s);
//		System.out.println(sb.reverse());
		
		//Using string concatination
//		int len=s.length();
//		
//		for(int i=len-1;i>=0;i--) {
//			rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
		
	//	using Array
		
		char a[] = s.toCharArray();
		int len=s.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println(rev);
		
	}
}
