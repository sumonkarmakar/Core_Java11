// Demonstrate ButtonList
package com.awtcontrol;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author HP
 */
public class ButtonList extends Applet implements ActionListener{

    String msg = " ";
    Button bList[] = new Button[3];
    
    public void init() {
        // TODO start asynchronous download of heavy resources
        Button yes = new Button("Yes");
        Button no = new Button("No");
        Button maybe = new Button("Undecided");
        
        bList[0] = (Button)add(yes);
        bList[1] = (Button)add(no);
        bList[2] = (Button)add(maybe);
        
        for(int i=0;i<3;i++){
            bList[i].addActionListener(this);
        }
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent ae) {
        for(int i=0;i<3;i++){
            if(ae.getSource()==bList[i]){
                msg="You pressed " + bList[i].getLabel();
            }
        }
        repaint();
    }
    
    public void paint(Graphics g){
        g.drawString(msg, 6, 100);
    }
}
