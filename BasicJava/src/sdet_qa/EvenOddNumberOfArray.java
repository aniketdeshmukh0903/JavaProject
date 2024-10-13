package sdet_qa;

public class EvenOddNumberOfArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		System.out.println("Even number");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
			}
		System.out.println("Odd number");
			for(int j=0;j<a.length;j++) {
				if(a[j]%2!=0) {
					System.out.println(a[j]);
				}
		}
		// TODO Auto-generated method stub

	}
}

