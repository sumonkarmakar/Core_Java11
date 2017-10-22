// A Superclass Variable can reference a subclass variable
package com.inheritance;

class ColorBox extends Box {

    int color;

    public ColorBox(double w, double h, double d, int c) {
        width = w;
        height = h;
        depth = d;
        color = c;
    }

}

class RefDemo {

    public static void main(String args[]) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Volume of weightbox is " + vol);
        System.out.println("Weight of weightbox is " + weightbox.weight);
        System.out.println();;

        // assign Box Weight reference to Box
        plainbox = weightbox;
        vol = plainbox.volume();	// OK, volume is defined in box

        System.out.println("Volume of plaintbox is " + vol);

//		System.out.println("Weight of plainbox is " + plainbox.weight);
    }
}
