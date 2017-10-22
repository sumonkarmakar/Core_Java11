// Use Parameters
package com.applet;

import java.applet.*;
import java.awt.*;

/**
 *
 * @author HP
 */
public class ParamDemo extends Applet {

    String fontName;
    int fontSize;
    float leading;
    boolean active;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    // TODO overwrite start(), stop() and destroy() methods
    public void start() {
        String param;
        fontName = getParameter("fontName");
        if (fontName == null) {
            fontName = "Not Found";
        }
        param = getParameter("fontSize");
        try {
            if (param != null) {
                fontSize = Integer.parseInt(param);
            } else {
                fontSize = 0;
            }
        } catch (NumberFormatException e) {
            fontSize = -1;
        }

        param = getParameter("leading");
        try {
            if (param != null) {
                leading = Float.valueOf(param).floatValue();
            } else {
                leading = 0;
            }
        } catch (NumberFormatException e) {
            leading = -1;
        }

        param = getParameter("accountEnabled");
        if (param != null) {
            active = Boolean.valueOf(param).booleanValue();
        }
    }

    public void paint(Graphics g) {
        g.drawString("Font Name: ", 0, 10);
        g.drawString("Font Size: ", 0, 26);
        g.drawString("Leading: ", 0, 42);
        g.drawString("Account Acitve: ", 0, 58);
    }
}
