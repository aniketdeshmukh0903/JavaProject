package sdet_qa;

public class MaxAndMinElementArray {

	public static void main(String[] args) {
		int a[]= {20,30,40,100};
		// TODO Auto-generated method stub
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum Element "+max);
		
		int min=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum Element "+min);
	}

}
