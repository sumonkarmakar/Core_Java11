
package com.awt;

import java.applet.*;
import java.awt.*;

/**
 *
 * @author HP
 */
public class FontInfo extends Applet {

    public void paint(Graphics g){
        Font f = g.getFont();
        String fontName = f.getName();
        String fontFamily = f.getFamily();
        int fontSize = f.getSize();
        int fontStyle = f.getStyle();
        
        String msg = "Family: " + fontName;
        msg+=",Font: " + fontFamily;
        msg+=",Size: " + fontSize + ", Style";
        if((fontStyle & Font.BOLD)==Font.BOLD)
            msg+="Bold";
        if((fontStyle & Font.ITALIC)==Font.ITALIC)
            msg+="Italic";
        if((fontStyle & Font.PLAIN)==Font.PLAIN)
            msg+="Plain";
        g.drawString(msg, 4, 16);
    }
}
