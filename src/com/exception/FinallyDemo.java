// Demonstrate finally
package com.exception;

/**
 *
 * @author HP
 */
public class FinallyDemo {
    // Through ab exception out of the method.

    static void procA() {
        try {
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA's Finally");
        }
    }
    // Return from within a try block.

    static void procB() {
        try {
            System.out.println("inside procB");
            return;
        } finally {
            System.out.println("procB's Finally");
        }
    }
    // Execute a try block normally.

    static void procC() {
        try {
            System.out.println("inside procC");
            return;
        } finally {
            System.out.println("procC's Finally");
        }
    }

    public static void main(String args[]) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception Caught.");
        }
        procB();
        procC();
    }

}
