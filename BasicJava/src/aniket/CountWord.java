package aniket;

public class CountWord {

	public static void main(String[] args) {

		String str = "Aniket ishwar deshmukh";

		String empty = "";

		int n = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {

				empty = empty + n + " ";
				n = 0;
			} else {
				n++;
			}
		}

		empty = empty + n;
		System.out.println(str);
		System.out.println(empty);
	}
}
