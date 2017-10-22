// Show date and time using only date methods.
package com.util2;

import java.util.Date;

class DateDemo {

    public static void main(String args[]) {
        // Instance of a Date object
        Date date = new Date();
        // display time and date using toString()
        System.out.println(date);

        // Display no of milliseconds since midnight, january 1,1970 GMT
        long msec = date.getTime();
        System.out.println("Milliseconds since Jan. 1, 1970 GMT = " + msec);
    }
}
