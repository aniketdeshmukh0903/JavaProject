package linkedlist;

import java.util.LinkedList;
import java.util.Arrays;

public class IterateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l = new LinkedList<String>();

		l.add("aa");
		l.add("aB");
		l.addFirst("AC");
		
		for(String i:l) {
			System.out.println(i);
		}
		 
		 

	}

}
