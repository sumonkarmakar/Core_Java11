// Call this file boxdemo.java
package com.class1;

class Box {

    double width;
    double height;
    double depth;
}
// This class declares an object of type box.

class BoxDemo {

    public static void main(String args[]) {
        Box mybox = new Box();
        double vol;
        // assign values to my box's instance variable
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        // compute the volume of box
        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("Volume is " + vol);
    }
}
