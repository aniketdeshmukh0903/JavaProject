package star_pattern;

public class HolowHourglassPattern {
	public static void main(String[] args) {
		for(int i=5;i>=0;i--) {
			for(int j=0;j<=10;j++) {
				if(j+i==5 || j-i==5 || (i==5 && j%2==0)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=0;j<=10;j++) {
				if(j+i==5 || j-i==5 || (i==5 && j%2==0)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}