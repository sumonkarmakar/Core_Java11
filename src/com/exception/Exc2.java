// Using try & catch
package com.exception;

class Exc2 {

    public static void main(String args[]) {
        int d, a;
        try {
            // monitor a block of code.
            d = 0;
            a = 42 / d;
            System.out.println("This will not printed.");
        } catch (ArithmeticException e) {
            // catch divide-by-zero error
            System.out.println("Division by zero.");
        }
        System.out.println("After Catch Statement.");
    }
}
