// Object Passing by Reference
package com.method;

class Test3 {

    int a, b;

    Test3(int i, int j) {
        a = i;
        b = j;
    }
    // Pass an object

    void meth(Test3 o) {
        o.a *= 2;

        o.b /= 2;
    }
}

class CallByRef {

    public static void main(String args[]) {
        Test3 ob = new Test3(15, 20);

        System.out.println("ob.a amd ob.b before call:" + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a amd ob.b after call:" + ob.a + " " + ob.b);
    }
}
