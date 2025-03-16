package linkedlist;

	class LinkedListDemo {
		static Node head=null;
 // head of list

	    /* Linked list Node*/
	     class Node {
	        int data;
	        Node next;

	        // Constructor to create a new node
	        // Next is by default initialized
	        // as null
	        Node(int d)
	        {
	        	data = d;
	        	next=null;
	        }
	    }
	    
	    
	    public void add(int data) {
	    	 Node new_node = new Node(data); 
	    	
	    	 if(head==null) {
	    		 head=new_node;
	    		 return;
	    		 
	    	 }
	    	 
	    	 Node temp=head;
	    	 while(temp.next!=null) {
	    		temp=temp.next;
	    	 }
	    	 temp.next=new_node;
	    	 
	    	 
	    	
	    }
	    
	    
	    public void printll(Node head){
	    	Node temp= head;
	    	while(temp!=null) {
	    		System.out.println(temp.data);
	    		
	    		temp=temp.next;
	    	}
	    }
	    
	    public static void main(String[] args) {
	    	LinkedListDemo ll=new LinkedListDemo();
	    	ll.add(10);
	    	ll.add(20);
	    	ll.add(30);
	    	
	    	ll.printll(head);
		}
	}

	
	

