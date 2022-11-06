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

    private Node rear = null;
    private Node front = null;
    private int count = 0;

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


    public static void main(String[] args) {
        QueueOperation queueOperation = new QueueOperation();
        System.out.println("Implementation of Queue Using Linked List");
        queueOperation.enqueue(56);
        queueOperation.enqueue(30);
        queueOperation.enqueue(70);
        System.out.println("Peek Element is: " + queueOperation.peek());
    }



}



















