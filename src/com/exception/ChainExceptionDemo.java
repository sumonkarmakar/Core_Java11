// Demonstrate exception chaining.
package com.exception;

class ChainExceptionDemo {

    static void demoproc() {
        // create an exception
        NullPointerException e = new NullPointerException("top layer");
        // add a cause
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            // display top level excpetion
            System.out.println("Caught: " + e);

            // display cause exception
            System.out.println("Original Cause: " + e.getCause());
        }
    }
}
