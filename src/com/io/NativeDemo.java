// A Simple Example that uses a native method.
package com.io;

public class NativeDemo {

    int i;

    public static void main(String args[]) {
        NativeDemo ob = new NativeDemo();
        ob.i = 10;
        System.out.println("This is ob.i before the native method: " + ob.i);
        ob.test();			// call a native method
        System.out.println("This is ob.i after the native method: " + ob.i);
    }
    // declare native method

    public native void test();
    // load DLL that contains static method

    static {
        System.out.println("NativeDemo");
    }
}
