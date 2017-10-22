// Demonstrate Buttons
package com.awtcontrol;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author HP
 */
public class ButtonDemo extends Applet implements ActionListener{

    String msg = " ";
    Button yes,no,maybe;
    
    public void init() {
        // TODO start asynchronous download of heavy resources
        yes = new Button("Yes");
        no = new Button("No");
        maybe = new Button("Undecided");
        
        add(yes);
        add(no);
        add(maybe);
        
        yes.addActionListener(this);
        no.addActionListener(this);
        maybe.addActionListener(this);
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if(str.equals("Yes")){
            msg = "You pressed yes";
        }
        else if(str.equals("No")){
            msg = "You pressed no";
        }
        else{
            msg = "You pressed undecided.";
        }
        repaint();
    }
    
    public void paint(Graphics g){
        g.drawString(msg, 6, 100);
    }
}
