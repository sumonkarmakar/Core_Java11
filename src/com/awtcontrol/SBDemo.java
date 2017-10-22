// Demonstrate Scroll Bars
package com.awtcontrol;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author HP
 */
public class SBDemo extends Applet implements AdjustmentListener,MouseMotionListener{

    String msg = " ";
    Scrollbar vertSB,horzSB;
    public void init() {
        // TODO start asynchronous download of heavy resources
        int width = Integer.parseInt(getParameter("width"));
        int height = Integer.parseInt(getParameter("height"));
        
        vertSB = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, height);
        horzSB = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, width);
        
        add(vertSB);
        add(horzSB);
        
        // register to receive adjustment events
        vertSB.addAdjustmentListener(this);
        horzSB.addAdjustmentListener(this);
        
        addMouseMotionListener(this);
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void adjustmentValueChanged(AdjustmentEvent ae) {
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
        vertSB.setValue(y);
        horzSB.setValue(x);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        
    }
    
    public void paint(Graphics g){
        msg = "Vertical: " + vertSB.getValue();
        msg+="Horizontal: " + horzSB.getValue();
        g.drawString(msg, 6, 160);
        // show current mouse drag position
        g.drawString("*", horzSB.getValue(), vertSB.getValue());
    }
}
