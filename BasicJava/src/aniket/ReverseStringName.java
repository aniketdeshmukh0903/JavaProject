package aniket;

public class ReverseStringName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc def ghi";
		String ans = "";
		String rev = "";
		int currentwordstart = 0;
		int i;
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {

				int currentwordend = i - 1;
				for (int j = currentwordstart; j <= currentwordend; j++) {
					rev = str.charAt(j) + rev;
				}
				ans = ans + rev + " ";
				rev = "";
				currentwordstart = i + 1;
			}
		}

		int currentwordend = i - 1;
		for (int j = currentwordstart; j <= currentwordend; j++) {
			rev = str.charAt(j) + rev;
		}
		ans = ans + rev;

		System.out.println(ans);
	}
}

