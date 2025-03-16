package sdet_qa;

import java.util.Arrays;
import java.util.Scanner;


public class HollowSquare {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of an array");
        int n=sc.nextInt();
        int[] a =new int[n];
        System.out.println("Enter elements in array");
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }

        bubbleSort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
    }

    
    public static void bubbleSort(int[] a) {
        int n = a.length-1;
        for(int i=0;i<n;i++) {
    		for	(int j=0;j<n-i;j++) {
    			if(a[j]>a[j+1]) {
    				int temp=a[j];
    				a[j]=a[j+1];
    				a[j+1]=temp;
    			}
                }
            }
      
        }
    }
