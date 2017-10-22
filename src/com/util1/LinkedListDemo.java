// Demonstrate LinkedList
package com.util1;

import java.util.*;

class LinkedListDemo {

    public static void main(String args[]) {
        // create a linked list
        LinkedList l1 = new LinkedList();
        // add elements to the linked list
        l1.add("F");
        l1.add("B");
        l1.add("D");
        l1.add("E");
        l1.add("C");
        l1.addLast("Z");
        l1.addFirst("A");
        l1.add(1, "A2");
        System.out.println("Original content of l1: " + l1);
        // remove elements from the linked list
        l1.remove("F");
        l1.remove(2);
        System.out.println("Content of l1 after deletion: " + l1);
        // remove first and last element
        l1.removeFirst();
        l1.removeLast();
        System.out.println("l1 after deleting first and last element: " + l1);
        // get and set a value
        Object val = l1.get(2);
        l1.set(2, (String) val + " Changed");
        System.out.println("l1 After change: " + l1);
    }
}
