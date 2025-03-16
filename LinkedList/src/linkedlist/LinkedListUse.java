package linkedlist;

import java.util.Scanner;

public class LinkedListUse {
	public static Node<Integer> createLinkedList() {

		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		// Node<Integer> n4=new Node<>(40);
		n1.next = n2;
		// System.out.println("n1 "+n1+" data "+n1.data+" next "+n1.next);
		n2.next = n3;
		// System.out.println("n2 "+n2+" data "+n2.data+" next "+n2.next);

		// System.out.println("n3 "+n3+" data "+n3.data+" next "+n3.next);
		// System.out.println("n4 "+n4+" data "+n4.data+" next "+n4.next);
		return n1;

	}

	public static void print(Node<Integer> head) {
		// System.out.println("print"+head);
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

		System.out.println();
		// System.out.println(head.data);
		// System.out.println(head.next);
		// System.out.println(head.next.data);
		// System.out.println(head.next.next.data);
	}
	
	
	public static int lenght(Node<Integer> head) {
		int count=0;
	//	Node<Integer> temp=head;
		while(head!=null) {
			count++;
			head=head.next;
		}
		return count;
	}
	
	public static Node<Integer> takeinput(){
		Scanner s= new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> head=null,tail=null;
		while(data!=-1) {
			Node<Integer> currentNode=new Node<Integer>(data);
			if(head==null) {
				head=currentNode;
				tail=currentNode;
			}else {
//				Node<Integer> tail=head;
//				while(tail.next!=null) {
//					tail=tail.next;
//				}
//				tail.next=currentNode;
				tail.next=currentNode;
				tail=currentNode;
			}
			data=s.nextInt();
		}
		return head;
	}
	
	public static Node<Integer> insert(Node<Integer>head,int elem,int pos) {
		Node<Integer> nodeToBeInserted=new Node<Integer>(elem);
		if(pos==0) {
			nodeToBeInserted.next=head;
			return nodeToBeInserted; 
		}else {
		int count=0;
		Node<Integer> prev=head;
		while(count<pos-1&&prev!=null) {
			count++;
			prev=prev.next;
		}
		if(prev!=null) {
		nodeToBeInserted.next=prev.next;
		prev.next=nodeToBeInserted;
		}
		return head;
	}
	}
//	public static Node<Integer> deleteNode(Node<Integer> head,int pos){  // Fixed class name
//		if(head==null) {
//			return head;
//			
//		}
//		if(pos==0) {
//			return head.next;
//		}
//		int count=0;
//		Node<Integer> currHead=head;
//		while(currHead!=null &&count<(pos-1)) {
//			currHead=currHead.next;
//		}
//		if(currHead==null || currHead.next==null) {
//			return head;
//		}
//		currHead.next=currHead.next.next;
//		return head;
//	}

	public static void main(String[] args) {

		Node<Integer> head = takeinput();
		
		// System.out.println("Main"+head);
		head=insert(head,80,2);
		
		print(head);
//		System.out.println(lenght(head));
//		System.out.println("AID");
//		print(head);

		// TODO Auto-generated method stub
//		Node<Integer> n1=new Node<>(10);
//		System.out.println(n1);
//		System.out.println(n1.data);
//		System.out.println(n1.next);

	}

}
