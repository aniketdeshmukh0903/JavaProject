package sdet_qa;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		
		int search=5;
		for(int i=0;i<a.length;i++) {
			if(search==a[i]) {
				System.out.println("Element found at index "+i);
				break;
			}
		}
		

	}

}
