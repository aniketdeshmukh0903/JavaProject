package aniket;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,3,2,5,1};
		for(int i=1;i<a.length;i++) {
			int c=a[i];
			int j=i-1;
			while(j >=0 && c<a[j]) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=c;
		}
		System.out.print(Arrays.toString(a));
	}

}
