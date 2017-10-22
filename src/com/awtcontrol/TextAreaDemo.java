// Demonstrate Text Area
package com.awtcontrol;

import java.applet.*;
import java.awt.*;

/**
 *
 * @author HP
 */
public class TextAreaDemo extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        String val = "There are two ways of constructing " +
                   "a software design.\n" +
                   "One way is to make it so simple\n" + 
                   "And the other way is to make it complicated\n" +
                   "that there are no obvious deficiencies.\n\n" +
                   "         -C.A.R.Hoare\n\n" +
                   "There is an old story about the person who wished\n" +
                   "his computer were as easy as his telephone.\n" +
                   "That wish has come true, \n" +
                   " since I no longer know how to use my telephone.\n\n" +
                   "     -Bjarne Strouustrup, AT&T, (inventor of C++)";
        
        TextArea text = new TextArea(val, 10, 30);
        add(text);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
