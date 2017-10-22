// Use find() to find a subsequence.
package com.io2;

import java.util.regex.*;

class RegExpr2 {

    public static void main(String args[]) {
        Pattern pat = Pattern.compile("Java");
        Matcher mat = pat.matcher("Java 2");

        System.out.println("Looking for Java in Java 2.");

        if (mat.find()) {
            System.out.println("Subsequence Found.");
        } else {
            System.out.println("No Match.");
        }
    }
}
