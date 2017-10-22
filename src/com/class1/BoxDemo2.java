// This class declares two box objects.
package com.class1;

class Box2 {
    double width;
    double height;
    double depth;
}

class BoxDemo2 {

    public static void main(String args[]) {
        Box2 mybox1 = new Box2();
        Box2 mybox2 = new Box2();
        double vol;

        // assign box value to mybox1's instance variable.
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        // assign box value to mybox2's instance variable.
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        // compute volume of first box.
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Volume is " + vol);
        // compute volume of first box.
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume is " + vol);
    }
}
