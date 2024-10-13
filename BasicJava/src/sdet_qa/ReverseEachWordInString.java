package sdet_qa;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String str="How are youu";
//		String[] words=str.split(" ");
//		String reverse="";
//		for(String w:words) {
//			String rw="";
//			for(int i=w.length()-1;i>=0;i--) {
//				rw=rw+w.charAt(i);
//			}
//			reverse=reverse+rw+" ";
//		}
//		System.out.println(reverse);

		String[] words=str.split("\\s");
		
		String rw="";
		for(String w:words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			
			rw=rw+sb.toString()+" ";
		}
		System.out.println(rw);
	}

}
