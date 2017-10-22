// Demonstarte toFegrees() and toRadians().
package com.javalang;

class Angles {

    public static void main(String args[]) {
        double theta = 120.0;
        System.out.println(theta + " degrees is " + Math.toRadians(theta) + " radians.");
        theta = 1.1312;
        System.out.println(theta + " radians is " + Math.toDegrees(theta) + " degrees.");
    }
}
