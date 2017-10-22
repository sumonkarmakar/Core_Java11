// Demonstrate StatusWindow
package com.applet;

import java.applet.*;
import java.awt.*;


/**
 *
 * @author HP
 */
public class StatusWindow extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        setBackground(Color.cyan);
    }

    // TODO overwrite start(), stop() and destroy() methods
    
    public void paint(Graphics g){
        g.drawString("This is in the applet window", 10 , 20);
        showStatus("This is shown in the status window");
    }
}
