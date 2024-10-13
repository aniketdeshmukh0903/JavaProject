package sdet_qa;
public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[]= {"Aniket","sanket","Java","c","Java"};
		boolean f=false;
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i]==s[j]) {
					System.out.println("Duplicate element found that is "+s[i]);
					f=true;
				}
			}
		}
		if(f==false) {
			System.out.println("Duplicate element is not found");
		}
		
//		Hashset langs=new Hashset();
//		boolean f=false;
//		for(String l:s) {
//			if(lans.add(l)==f) {
//				System.out.println("Found duplicate element");
//				f=true;
//			}
//		}
//		if(f==false) {
//			System.out.println("Not found duplicate");
//		}
	}
}
	

