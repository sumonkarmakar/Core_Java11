// Demonstrate Gregorian Calendar
package com.util2;

import java.util.*;

class GregorianCalendarDemo {

    public static void main(String args[]) {
        String months[] = {
            "Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "Jul", "Aug",
            "Sep", "Oct", "Nov", "Dec"};
        int year;
        // Create a Gregorian Calendar initialized with the 
        // current date and time in the default
        // locale and timezone
        GregorianCalendar gcalendar = new GregorianCalendar();

        // Display current time and date information.
        System.out.print("Date: ");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gcalendar.get(Calendar.YEAR));

        System.out.print("Time: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));

        // Test if the current year is a leap year
        if (gcalendar.isLeapYear(year)) {
            System.out.println("The Current year is a leap year.");
        } else {
            System.out.println("The Current year is not a leap year.");
        }
    }
}
