package sdet_qa;

import java.util.Arrays;

public class SortArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,1,4,3,8,5};
		System.out.println("Array bofore sorting "+Arrays.toString(a));
		int n=a.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Array after sorting "+Arrays.toString(a));
		
	}

}
