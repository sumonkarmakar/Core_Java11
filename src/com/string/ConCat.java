// Using Concatenation to prevent long lines
package com.string;

class ConCat {

    public static void main(String args[]) {
        String longStr = "This could have been "
                + " a very long line that would have "
                + "wrapped around. But String Concatenation "
                + "prevent this.";
        System.out.println(longStr);
    }
}
