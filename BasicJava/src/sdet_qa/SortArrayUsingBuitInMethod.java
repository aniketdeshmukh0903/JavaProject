package sdet_qa;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayUsingBuitInMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {1,3,2,7,5,6,4};
//		System.out.println("Array before sorting "+Arrays.toString(a));
//		Arrays.parallelSort(a);
//		System.out.println("Array after sorting "+Arrays.toString(a));
	
//		System.out.println("Array before sorting "+Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("Array after sorting "+Arrays.toString(a));
		
		System.out.println("Array before sorting "+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array after sorting "+Arrays.toString(a));
	
	}
	

}
