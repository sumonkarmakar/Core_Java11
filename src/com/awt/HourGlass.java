// Draw Polygon
package com.awt;

import java.applet.*;
import java.awt.*;

/**
 *
 * @author HP
 */
public class HourGlass extends Applet{
    public void paint(Graphics g){
        int xpoints[] = {30,200,30,200,30};
        int ypoints[] = {30,30,200,200,30};
        int num = 5;
        
        g.drawPolygon(xpoints, ypoints, num);
    }
}
