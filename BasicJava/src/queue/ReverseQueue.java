package queue;

import java.util.LinkedList;

class DynamicQueue {
    private LinkedList<Integer> list;

    public DynamicQueue() {
        list = new LinkedList<>();
    }

    public void enqueue(int data) {
        list.addLast(data);
    }

    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

public class ReverseQueue {

    public static void main(String[] args) throws Exception {
        DynamicQueue queue = new DynamicQueue();
        for (int i = 1; i <= 6; i++) {
            queue.enqueue(i * 10);
        }
        queue.display();
        reverseQueue(queue);
        queue.display();
    }

    public static void reverseQueue(DynamicQueue queue) throws Exception {
        if (queue.isEmpty()) {
            return;
        }
        int element = queue.dequeue();
        reverseQueue(queue);
        queue.enqueue(element);
    }
}
