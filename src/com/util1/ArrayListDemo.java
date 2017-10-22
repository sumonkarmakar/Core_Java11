// Demonstrate Array List
package com.util1;

import java.util.*;

class ArrayListDemo {

    public static void main(String args[]) {
        // create array list
        ArrayList a1 = new ArrayList();
        System.out.println("Initial size of a1: " + a1.size());
        // add element to the array list
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(1, "A2");
        System.out.println("Size of a1 after additions: " + a1.size());
        // display the array list
        System.out.println("Contents of a1: " + a1);
        // remove element from the list
        a1.remove("F");
        a1.remove(2);
        System.out.println("Size of a1 after deletion: " + a1.size());
        System.out.println("Contents of a1: " + a1);
    }
}
