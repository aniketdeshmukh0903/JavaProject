package star_pattern;

public class HollowReverseTriangle {

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
	}

}