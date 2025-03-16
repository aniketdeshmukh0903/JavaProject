package aniket;

public class StringReverse {
	public static void main(String[] args) {
		String s="ANIKET uyu";
		int i = 0;
		int j=s.length()-1;
		char arr[]=s.toCharArray();
		while(i<j) {
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
					
		}
		s=new String(arr);
		System.out.println(s);
	}

}


