// Using trim() to proceeds commands.
package com.string;

import java.io.*;

class UseTrim {

    public static void main(String args[]) throws IOException {
        // create a BufferedReader using System.in.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter 'stop' to quit.");
        System.out.println("Enter state: ");
        do {
            str = br.readLine();
            str = str.trim();			// remmove whitespace
            if (str.equals("Illinois")) {
                System.out.println("Capital is Springfield.");
            } else if (str.equals("Missouri")) {
                System.out.println("Capital is Jefferson City.");
            } else if (str.equals("California")) {
                System.out.println("Capital is Sacramento");
            }
            if (str.equals("Washington")) {
                System.out.println("Capital is Olympia");
            }
            //.......
        } while (!str.equals("stop"));
    }
}
