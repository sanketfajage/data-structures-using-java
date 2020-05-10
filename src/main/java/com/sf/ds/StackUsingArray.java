package com.sf.ds;

public class StackUsingArray {

    private static final int SIZE = 5;

    int top = -1;
    int[] array = new int[SIZE];

    public void push(int element) {
        if (top < array.length) {
            top++;
            array[top] = element;
        } else {
            throw new RuntimeException("stack overflow");
        }
    }

    public void pop() {
        if (top == -1) {
            throw new RuntimeException("stack underflow");
        } else {
            top--;
        }
    }

    public void pick() {
        System.out.println(array[top]);
    }

    public void display() {
        for (int value : array) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray();
        stackUsingArray.push(10);
        stackUsingArray.push(20);
        stackUsingArray.push(30);
        stackUsingArray.pop();
        stackUsingArray.pick();
        stackUsingArray.push(40);
        stackUsingArray.push(50);
        stackUsingArray.display();
    }
}
