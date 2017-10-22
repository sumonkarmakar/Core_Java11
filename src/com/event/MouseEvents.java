// Demonstrate the Mouseevents
package com.event;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author HP
 */
public class MouseEvents extends Applet implements MouseListener, MouseMotionListener {

    String msg = " ";
    int mouseX = 0, mouseY = 0;

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse Clicked";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse Entered";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent me) {
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse Exited";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Down";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Up";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*";
        showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
    }

    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }
}
