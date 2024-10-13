package sdet_qa;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="jfhdjf   fdjhfdfh   jsfsjf  kff";
		
		str=str.replaceAll("\\s", "");
		System.out.println("After removing spaces "+str);
	}

}
