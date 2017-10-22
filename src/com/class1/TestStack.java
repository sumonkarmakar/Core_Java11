// Improve stack class that uses the length array number.
package com.class1;

class Stack {

    private int stck[];
    private int tos;
// Allocate and initialize stack

    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }
    // Push an item into the stack

    void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Stack is Full..");
        } else {
            stck[++tos] = item;
        }
    }
    // Pop an item from the stack

    int pop() {
        if (tos < 0) {
            System.out.println("Stack Unedrflow...");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

class TestStack {

    public static void main(String args[]) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);
        // push some number into the stack
        for (int i = 0; i < 5; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            mystack2.push(i);
        }
        // pop those number off the stack
        System.out.println("Stack in mystack1: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack1.pop());
        }

        System.out.println("Stack in mystack2: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(mystack2.pop());
        }
    }
}
