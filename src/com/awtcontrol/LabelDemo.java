// Demonstrate Labels
package com.awtcontrol;

import java.applet.*;
import java.awt.*;

/**
 *
 * @author HP
 */
public class LabelDemo extends Applet {

    public void init() {
        // TODO start asynchronous download of heavy resources
        Label one = new Label();
        Label two = new Label();
        Label three = new Label();
        
        add(one);
        add(two);
        add(three);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
