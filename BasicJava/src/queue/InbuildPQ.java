package queue;

import java.util.PriorityQueue;

public class InbuildPQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,3,7,6,9,10,1,2};
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
			
			
		}
		while(!pq.isEmpty()) {
			System.out.println(pq.peek());
			pq.poll();
		}

	}

}
