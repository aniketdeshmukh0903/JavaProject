package sdet_qa;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {6,2,3,1,5,8,7};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}

	}

}
