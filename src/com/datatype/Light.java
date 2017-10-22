
package com.datatype;

/**
 *
 * @author HP
 */
public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        
        lightspeed = 18600;
        days = 1000;
        seconds = days*24*60*60;
        distance = lightspeed*seconds;
        
        System.out.print("In " + days);
        System.out.print(" days light wil l travel about");
        System.out.println(distance + " miles.");
    }
}
