// Demonstrate various vector operation
package com.util1;

import java.util.*;

class VectorDemo {

    public static void main(String args[]) {
        // initial size is 3,increment by 2
        Vector v = new Vector(3, 2);
        System.out.println("Initial Size: " + v.size());
        System.out.println("Initial Capacity: " + v.capacity());
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("Capacity after four additioms: " + v.capacity());
        v.addElement(new Double(5.45));
        System.out.println("Current capacity: " + v.capacity());
        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        System.out.println("Current capacity: " + v.capacity());
        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));
        System.out.println("Current capacity: " + v.capacity());
        v.addElement(new Integer(10));
        v.addElement(new Integer(11));
        System.out.println("First Element: " + (Integer) v.firstElement());
        System.out.println("Last Element: " + (Integer) v.lastElement());
        if (v.contains(new Integer(3))) {
            System.out.println("Vector Conatins 3.");
        }
        // Enumerate the elements in the vector.
        Enumeration vEnum = v.elements();
        System.out.println("\nElements in vector: ");
        while (vEnum.hasMoreElements()) {
            System.out.print(vEnum.nextElement() + " ");
        }
        System.out.println();
    }
}
