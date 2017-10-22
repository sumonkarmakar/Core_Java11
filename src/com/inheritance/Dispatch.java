// Dynamic method dispatch
package com.inheritance;

class A8 {

    void callme() {
        System.out.println("Inside A's callme method");
    }
}

class B8 extends A8 {

    void callme() {
        System.out.println("Inside B's callme method");
    }
}

class C8 extends A8 {

    void callme() {
        System.out.println("Inside C's callme method");
    }
}

class Dispatch {

    public static void main(String args[]) {
        A8 a = new A8();		// object of type A
        B8 b = new B8();		// object of type B
        C8 c = new C8();		// Object of type C
        A8 r;

        r = a;		// r refers to an A object 
        r.callme();	// Call A's version of call me

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}
