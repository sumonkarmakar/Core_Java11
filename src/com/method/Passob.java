// Object may be passed to methods.
package com.method;
class Test {
    int a,b;
    Test(int i,int j)
    {
            a = i;
            b = j;
    }
	// Return True if o is equal to the invoking object
    boolean equals(Test o)
    {
        if(o.a==a && o.b==b)
            return true;
        else
            return false;
    }
}
class Passob
{
    public static void main(String args[])
    {
        Test ob1 = new Test(100,22);
        Test ob2 = new Test(100,22);
        Test ob3 = new Test(-1,-1);
        System.out.println("ob1 == ob2: " + ob1.equals(ob2));
        System.out.println("ob1 == ob3: " + ob1.equals(ob3));

    }

}
