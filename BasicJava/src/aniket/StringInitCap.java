package aniket;

public class StringInitCap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ANIKETII sHWAR DESHMUKH  j";
		String result = "";
		boolean capitalizeNext = true;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == ' ') {
				result = result + ch;
				capitalizeNext = true;
			} else {

				if (capitalizeNext==true) {
					result = result + Character.toUpperCase(ch);
					capitalizeNext = false;
				} else {
					result = result + ch;
				}
			}
		}

		System.out.println(result);
	}
}
