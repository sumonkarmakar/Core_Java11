// Timing for program execution.
package com.javalang;

class Elapsed {

    public static void main(String args[]) {
        long start, end;
        System.out.println("Timing for a loop from 0 to 1,000,000");
        start = System.currentTimeMillis();		// get starting time
        for (int i = 0; i < 1000000; i++);
        end = System.currentTimeMillis();	// get ending time
        System.out.println("Elapsed time: " + (end - start));
    }
}
