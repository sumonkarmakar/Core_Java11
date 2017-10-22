// Draw Ellipse
package com.awt;

import java.applet.*;
import java.awt.*;

/**
 *
 * @author HP
 */
public class Ellipse extends Applet{
    public void paint(Graphics g){
        g.drawOval(10, 10, 50, 50);
        g.fillOval(100, 10, 75, 50);
        g.drawOval(190, 10, 90, 30);
        g.fillOval(70, 90, 140, 100);
    }
}
