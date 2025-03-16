package aniket;

public class StringPanagram {
	public static void main(String[] args) {
		String str="the quick brown fox jumps over a lazy dogs";
		int arr[]=new int[26];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			 if (ch >= 'a' && ch <= 'z') {
				 arr[ch - 'a'] = 1;
			 }
		}
		 boolean Pangram = true;
	        for (int i = 0; i < 26; i++) {
	            if (arr[i] == 0) {
	                Pangram = false;
	                break;
	            }
	        }
	        if (Pangram) {
	            System.out.println("The string is a pangram.");
	        } else {
	            System.out.println("The string is not a pangram.");
	        }
	}
}
