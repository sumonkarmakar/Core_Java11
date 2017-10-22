// A Simple Mailing list Example
package com.util1;

import java.util.*;

class Address {

    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String n, String s, String c, String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    public String toString() {
        return name + "\n" + street + "\n" + city + " " + state + " " + code;
    }
}

class MailList {

    public static void main(String args[]) {
        LinkedList m1 = new LinkedList();
        // add element to the linked list
        m1.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        m1.add(new Address("Ralph baker", "1142 Malph Lane", "Mahomet", "IL", "61853"));
        m1.add(new Address("Tom Carlton", "867 Elm st", "Champaign", "IL", "61820"));
        Iterator itr = m1.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element + "\n");
        }
        System.out.println();
    }
}
