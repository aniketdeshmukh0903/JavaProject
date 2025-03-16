package studyeasy;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,3,6,7};
		int []b= {2,4,8,9};
		
		int i=0;
		int j=0;
		int k=0;
		
		int c[]=new int [a.length+b.length];
		while(i<a.length && k<b.length) {
			
			if(a[i]<b[i]) {
				c[k]=a[i];
				k++;
				i++;
				
			}
			else {
				c[k]=b[j];
				j++;
				k++;
				
			}
		}
		while(i<a.length) {
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length) {
			c[k]=b[i];
			j++;
			k++;
		}
		
		for(int p=0;p<c.length;p++) {
			System.out.print(c[p]+" ");
			
		}

	}

}
