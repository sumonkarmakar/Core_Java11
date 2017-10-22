// Use find() to find multiple subsequence.
package com.io2;

import java.util.regex.*;

class RegExpr3 {

    public static void main(String args[]) {
        Pattern pat = Pattern.compile("test");
        Matcher mat = pat.matcher("test 1 2 3 ");

        while (mat.find()) {
            System.out.println("test found at index " + mat.start());
        }
    }
}
