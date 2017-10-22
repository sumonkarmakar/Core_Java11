// Index of demo
package com.string;

class IndexOfDemo1 {

    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("one two one");
        int i;
        i = sb.indexOf("one");
        System.out.println("First Index: " + i);
        i = sb.lastIndexOf("one");
        System.out.println("Last Index: " + i);
    }
}
