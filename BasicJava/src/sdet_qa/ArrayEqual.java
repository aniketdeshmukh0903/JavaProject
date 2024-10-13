package sdet_qa;
import java.util.Arrays;
import java.lang.reflect.Array;

public class ArrayEqual {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6};
		int []b= {1,2,3,4,5,6};
		
		
			boolean status = Arrays.equals(a,b);
			
			if(status==true) {
				System.out.println("Arrays are equal");
			}
			else {
				System.out.println("Arrays are Not equal");
			}
	
	}

}
