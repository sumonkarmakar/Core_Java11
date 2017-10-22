// Demonstrate method overloading
package com.method;

class OverloadDemo2 {

    void test() {
        System.out.println("No Parameter");
    }

    // Overload test for two integer parameter.
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    // Overload test for a double parameter.
    double test(double a) {
        System.out.println("Inside test(double) a: " + a);
        return a * a;
    }
}

class Overload2 {

    public static void main(String args[]) {
        OverloadDemo2 ob = new OverloadDemo2();
        double result;
        int i = 88;

        // call all versions of test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        ob.test(i);		// this will invoke test(double)
        ob.test(123.2);	// this will invoke test(double)
    }
}
