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

    boolean isEmpty() {  //check if stack is empty or not
        return top == null;
    }


    public int peek()  //return top element in a stack

    {
        if (!isEmpty()) {  // If stack is not empty , return the top element
            return top.data;

        } else
            System.out.println("Stack is empty");

        return -1;
    }

    void pop()// Remove a key from given queue
    {
        if (top == null) {
            System.out.println("\n Stack is empty");
            return;
        }
        top = top.next;

    }
    public void printData()
        {
            if (top == null) {
                System.out.printf("Stack is empty");
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
        System.out.println("\nAdding Element in Stack: ");
        obj.printData();
        System.out.printf("\n\nTop of Element is: %d\n",obj.peek());
        obj.printData();
        System.out.println("\n\nRemoving Element in Stack: ");
        obj.pop();
        obj.pop();
        obj.pop();
        obj.printData();


    }
}

