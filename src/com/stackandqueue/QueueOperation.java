package com.stackandqueue;
import static java.lang.System.exit;
public class QueueOperation {
    private class Node {
        int data;
        Node next;


        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    private static Node rear = null;
    private static Node front = null;
    private static int count = 0;

    public void enqueue(int data) {
        Node node = new Node(data);
        System.out.println("Insert data into Queue:  " + data);
        if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        count++;
    }

    public int peek() {
        if (front == null) {
            exit(-1);
        }
        return front.data;
    }

    public static int dequeue()     // delete at the beginning
    {
        if (front == null)
        {
            System.out.println("\nQueue Underflow");
            exit(-1);
        }

        Node temp = front;
        System.out.printf("Removing element fromqueue: %d\n", temp.data);
        front = front.next;
        if (front == null) {   // if the list becomes empty
            rear = null;
        }
        count -= 1;
        return temp.data;// return the removed item
    }

    public static void main(String[] args) {
        QueueOperation queueOperation = new QueueOperation();
        System.out.println("Implementation of Queue Using Linked List");
        queueOperation.enqueue(56);
        queueOperation.enqueue(30);
        queueOperation.enqueue(70);
        queueOperation.dequeue();
        queueOperation.dequeue();
        System.out.println("Peek Element is: " + queueOperation.peek());

    }

}
