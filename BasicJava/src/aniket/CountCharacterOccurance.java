package aniket;

public class CountCharacterOccurance {
	public static void main(String[] args) {
		String s = "programmmmming";

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			boolean alreadyCounted = false;
			for (int k = 0; k < i; k++) {
				if (s.charAt(k) == ch) {
					alreadyCounted = true;
					break;
				}
			}

			if (alreadyCounted == false) {
				int count = 0;

				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) == ch) {
						count++;
					}
				}

				System.out.println(ch + ": " + count);
			}
		}
	}
}
