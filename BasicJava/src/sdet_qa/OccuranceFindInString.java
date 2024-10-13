package sdet_qa;

public class OccuranceFindInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java Programming Java Oops";
		int i=s.length();
		int j=s.replace("a", "").length();
	
		
		int l=(i-j);
		System.out.println("The occurance of 'a' in give string is "+l+" Times");

	}

}
