// Using reverse() to reverse a StringBuffer
package com.string;

class ReverseDemo {

    public static void main(String args[]) {
        StringBuffer s = new StringBuffer("abcdef");
        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}
