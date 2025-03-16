package star_pattern;

public class HollowDiamond {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=10;j++) {
				if(j+i==5 || j-i==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=4;i>=0;i--) {
			for(int j=0;j<=10;j++) {
				if(j+i==5 || j-i==5) {
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