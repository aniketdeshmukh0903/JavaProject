package aniket;

public class MinMaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5,6,7,8};
		
			int max=a[0];
			for(int i=0;i<a.length-1;i++) {
				if(a[i]>max) {
					max=a[i];
				}
				
		}
			System.out.println("Maximum element of array "+max);
			int min=a[0];
			for(int i=0;i<a.length-1;i++) {
				if(a[i]<min) {
					min=a[i];
				}
		
			}
			System.out.println("Maximum element of array "+min);

	}

}
