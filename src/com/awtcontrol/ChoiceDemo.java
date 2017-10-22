// Demonstrate choiceList
package com.awtcontrol;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author HP
 */
public class ChoiceDemo extends Applet implements ItemListener {
    
    Choice os, browser;
    String msg = " ";
    
    public void init() {
        // TODO start asynchronous download of heavy resources
        os = new Choice();
        browser = new Choice();

        // add item to the os list
        os.add("Windows 98/XP");
        os.add("Windows NT/2000");
        os.add("Solaris");
        os.add("MacOS");

        // add item to the browser list
        browser.add("Netscape 3.x");
        browser.add("Netscape 4.x");
        browser.add("Netscape 5.x");
        browser.add("Netscape 6.x");
        
        browser.add("Internet Explorer 4.0");
        browser.add("Internet Explorer 5.0");
        browser.add("Internet Explorer 6.0");
        
        browser.add("Lynx 2.4");
        
        browser.select("Netscape 4.x");

        // add choice list to the window
        add(os);
        add(browser);

        // register to receive item events
        os.addItemListener(this);
        browser.addItemListener(this);
    }

    // TODO overwrite start(), stop() and destroy() methods
    @Override
    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }
    
    public void paint(Graphics g) {
        msg = "Current OS: ";
        msg += os.getSelectedItem();
        g.drawString(msg, 6, 120);
        msg = "Current Browser: ";
        msg += browser.getSelectedItem();
        g.drawString(msg, 6, 140);
    }
}
