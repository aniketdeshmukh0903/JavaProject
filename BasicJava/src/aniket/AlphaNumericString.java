package aniket;

public class AlphaNumericString {
	public static void main(String[] args) {
		String str = "abc123   000012?,.,.11";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				sum+= (ch - '0');

			}

		}
		System.out.println(sum);
	}
}
