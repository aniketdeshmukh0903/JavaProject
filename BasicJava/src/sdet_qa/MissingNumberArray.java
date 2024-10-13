package sdet_qa;

public class MissingNumberArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,5,6,7,8,9,10};
		int s1=0;
		for(int i=0;i<a.length;i++) {
			s1=s1+a[i];
		}
		System.out.println("Sum of array "+ s1);
		int s2=0;
		for(int i=1;i<=10;i++) {
			s2=s2+i;
		}
		System.out.println("Sum of range "+ s2);
		System.out.println("Missing number is  "+(s2-s1));
	}

}
