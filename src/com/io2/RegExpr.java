// A Simple Pattern Matching Program.
package com.io2;

import java.util.regex.*;

class RegExpr {

    public static void main(String args[]) {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");

        found = mat.matches();		// check for a match

        System.out.println("Testing Java against java.");
        if (found) {
            System.out.println("Matches");
        } else {
            System.out.println("No Match.");
        }

        System.out.println();

        System.out.println("Testing Java against Java 2.");
        mat = pat.matcher("Java 2");			// Create a new Matcher

        found = mat.matches();		// check for a match

        if (found) {
            System.out.println("Matches");
        } else {
            System.out.println("No Match.");
        }
    }
}
