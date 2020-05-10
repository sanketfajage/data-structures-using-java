package com.sf.ds;

public class StackUsingLinkedList {

    Node top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    public void push(int element) {
        Node temp = new Node();
        temp.setData(element);

        temp.next = top;
        top = temp;
    }

    public void pop() {
        top = top.next;
    }

    public void pick() {
        System.out.println(top.data);
    }

    public void display() {
        while (top != null) {
            System.out.println(top.data);
            top = top.next;
        }
    }

    private class Node {
        int data;
        Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node top) {
            this.next = top;
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(10);
        stackUsingLinkedList.push(20);
        stackUsingLinkedList.push(30);
        stackUsingLinkedList.push(40);
        stackUsingLinkedList.push(50);
        stackUsingLinkedList.pop();
        stackUsingLinkedList.display();
    }
}
