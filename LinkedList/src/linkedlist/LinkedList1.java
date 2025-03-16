package linkedlist;

import java.util.LinkedList;
import java.util.Arrays;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();

		l.add("aa");
		l.add("aB");
		l.addFirst("AC");

		l.addFirst("D");
		l.addAll(2, Arrays.asList("E"));

		System.out.println(l);
		System.out.println("Removing element");
		l.remove("B");
		l.remove(4);
		l.removeFirst();
		l.removeLast();
		System.out.println(".... After removing");
		System.out.println(l);
		
		System.out.println("........");
		l.add("Geeks");
		l.add("Geeks");
		l.add(1, "For");
		System.out.println("I LinkedList " + l);
		l.add("Geeks");
		l.add("Geeks");
		l.add(1, "Geeks");

		

		System.out.println("Updatd LinkedList " + l);

		l.remove();
		System.out.println(l);
		System.out.println(
				"....r");

		l.clear();
		System.out.println("iterating");
		System.out.println(l);

		l.add("Geeks");
		l.add("Geeks");
		l.add(1, "For");
		
		System.out.println(l);
		System.out.println("...a....");

		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i) + " ");

		}
		l.clear();
		System.out.println("ll to array");

		l.add("Ani");
		l.add("Shi");
		l.add("san");
		l.add("Deshmukh");
		System.out.println(l);
	Object[] v = l.toArray();
		 for (int i = 0; i < v.length; i++) {
	            System.out.print(v[i] + " ");
		}
//
//		System.out.println("The size of the ll is: " + l.size());
//		l.removeFirst();
//		System.out.println(l);
//		l.removeLast();
//		System.out.println(l);
//		System.out.println(l.getFirst());
//		System.out.println(l.getLast());
//		System.out.println(l.get(1));
//		l.getLast();
//
//		l.clear();
//		System.out.println(l);

	}
}
