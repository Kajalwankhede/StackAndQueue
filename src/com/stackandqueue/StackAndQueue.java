package com.stackandqueue;
import static java.lang.System.exit;
public class StackAndQueue {
        private class Node { //Linked list node
            int data; // integer data
            Node next; // reference variable Node type
        }
          Node top;     // create global top reference variable global
        StackAndQueue() {
            this.top = null;
        }
        public void push(int a) // insert at the beginning
        {
            Node temp = new Node();     // create new node temp and allocate memory
            if (temp == null) {
                System.out.print("\nHeap Overflow");
                return;
            }
            temp.data = a;
            temp.next = top;
            top = temp;
        }
        public void printData()
        {
            if (top == null) {
                System.out.printf("\nStack Underflow");
                exit(1);
            }
            else {
                Node temp = top;
                while (temp != null) {
                    System.out.print(temp.data); // print node data
                    temp = temp.next;      // assign temp next to temp
                    if(temp != null)
                        System.out.print("--");
                }
            }
        }

    public static void main(String[] args)
    {
        StackAndQueue obj = new StackAndQueue();
        System.out.println("\nStack and Queue Operation");
        obj.push(70);
        obj.push(30);
        obj.push(56);
        obj.printData();


    }
}

