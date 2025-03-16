package aniket;

public class CCCOccurance {
	public static void main(String[] args) {
		String s = "aniket DADA Sanket uare";

		int[] arr = new int[26];

		char[] ch = s.toUpperCase().toCharArray();

		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];

			if (c >= 'A' && c <= 'Z') {
				arr[c - 'A']++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				System.out.println((char) (i + 'a') + ": " + arr[i]);
			}
		}
	}
}
