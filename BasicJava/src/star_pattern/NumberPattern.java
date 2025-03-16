package star_pattern;

public class NumberPattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.print("  ");
			}
			for(int p=1;p<=i;p++) {
				System.out.print(p);
			}
			System.out.println();
		}
	
	
	}

}
