package star_pattern;

public class RightPascalsTrianglr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2;i>=0;i--) {
			for(int j=0;j<=i-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}
}
