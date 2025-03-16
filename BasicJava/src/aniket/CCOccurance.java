package aniket;

public class CCOccurance {
	public static void main(String[] args) {
		String s = "aniketd DADA";
		int[] arr = new int[26];
		int[] arr2=new int[26];
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			
			char c = ch[i];
			if ((c >= 'A' && c <= 'Z')) {
				arr[c - 'A']++;
			}
			else if((c >= 'a' && c <= 'z')) {
				arr2[c - 'a']++;
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				System.out.println((char) (i + 'A')+ ": " + arr[i]);
			}
		}
			for (int k = 0; k < arr2.length; k++) {
				if (arr2[k] > 0) {
					System.out.println((char) (k + 'a')+ ": " + arr2[k]);
				}
		}
	}
}
