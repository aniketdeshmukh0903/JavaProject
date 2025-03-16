package queue;

import java.util.LinkedList;

public class QueueUsingLL {
    LinkedList<Integer> queue;

    QueueUsingLL() {
        queue = new LinkedList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void enqueue(int data) {
        queue.addLast(data);
    }

    public void dequeue() {
        if (!isEmpty()) {
            queue.removeFirst();
        } else {
            System.out.println("Queue is empty, cannot dequeue.");
        }
    }

    public int getFront() {
        if (!isEmpty()) {
            return queue.getFirst();
        } else {
            System.out.println("Queue is empty, no front element.");
            return -1; 
        }
     }

    public static void main(String[] args) {
        QueueUsingLL queue = new QueueUsingLL();

        for (int i = 1; i <= 6; i++) {
            queue.enqueue(i);
        }

        queue.dequeue();
        queue.dequeue();
        queue.enqueue(8);

       
        while (!queue.isEmpty()) {
            System.out.println(queue.getFront());
            queue.dequeue();
        
        }
    }
}


