// Demonstarte various algorithms.
package com.util1;

import java.util.*;

class AlgorithmsDemo {

    public static void main(String args[]) {
        // create and initiate linked list
        LinkedList l1 = new LinkedList();
        l1.add(new Integer(-8));
        l1.add(new Integer(20));
        l1.add(new Integer(-12));
        l1.add(new Integer(8));
        // create a reverse order comperator
        Comparator r = Collections.reverseOrder();
        // Sort list by using the comperator
        Collections.sort(l1, r);
        // Get iterator
        Iterator li = l1.iterator();
        System.out.print("List sorted in reversed:: ");
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();
        Collections.shuffle(l1);
        // display randomized list
        li = l1.iterator();
        System.out.print("List Shuffled: ");
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();
        System.out.println("Minimum: " + Collections.min(l1));
        System.out.println("Maximum: " + Collections.max(l1));
    }
}
