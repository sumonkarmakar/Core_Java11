// Demonstrate CheckboxGroup
package com.awtcontrol;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author HP
 */
public class CBGroup extends Applet implements ItemListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    String msg = " ";
    Checkbox Win98, winNT, solaris, mac;
    CheckboxGroup cbg;

    public void init() {
        // TODO start asynchronous download of heavy resources
        cbg = new CheckboxGroup();
        Win98 = new Checkbox("Windows 98/XP", cbg, true);
        winNT = new Checkbox("Windows NT/2000", cbg, false);
        solaris = new Checkbox("Solaris", cbg, false);
        mac = new Checkbox("MacOS", cbg, false);

        add(Win98);
        add(winNT);
        add(solaris);
        add(mac);
        
        Win98.addItemListener(this);
        winNT.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }
    
    public void paint(Graphics g){
        msg = "Current Selection: ";
        msg+=cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg, 6, 100);
    }
}
