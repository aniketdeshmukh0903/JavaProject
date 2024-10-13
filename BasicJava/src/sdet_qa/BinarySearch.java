package sdet_qa;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {1,2,3,4,5,6,7,8,9};
		
		boolean flag =false;
		
		int search=10;
		int l=0;
		int h=a.length-1;
		
		while(l<=h) {
			int m=(l+h)/2;
			if(a[m]==search) {
				System.out.println("Element found.");
				flag=true;
				break;
			}
			if(a[m]<search) {
				l=m+1;
			}
			if(a[m]>search) {
				h=m-1;
			}
		}
		if(flag==false) {
			System.out.println("element not found");
		}
		
		//Approach 2
		System.out.println(Arrays.binarySearch(a, 8));
	}

}
