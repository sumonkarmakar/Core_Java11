// Use split()
package com.io2;

import java.util.regex.*;

class RegExpr9 {

    public static void main(String args[]) {
        // Match Lower case words.

        Pattern pat = Pattern.compile("[ ,.!]");

        String strs[] = pat.split("one two,alpha9 12!done.");

        for (int i = 0; i < strs.length; i++) {
            System.out.println("Next Token: " + strs[i]);
        }
    }
}
