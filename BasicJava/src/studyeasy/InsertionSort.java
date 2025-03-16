package studyeasy;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,4,3,6,8,1};
		for(int i=1;i<a.length;i++) {
			int j=i-1;
			int temp=a[i];
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		
			
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +" ");
		}

	}

}
