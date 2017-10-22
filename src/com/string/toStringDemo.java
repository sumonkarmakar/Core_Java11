// Over toString() for Box classes.
package com.string;

class Box {

    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public String toString() {
        return "Dimension are " + width + " by "
                + depth + " by " + height + " . ";
    }
}

class toStringDemo {

    public static void main(String args[]) {
        Box b = new Box(10, 12, 14);
        String s = " Box b: " + b;			// concatenate Box Object
        System.out.println(b);				// convert Box to string
        System.out.println(s);
    }
}
