
package com.event;

import java.applet.*;
import java.awt.event.*;

/**
 *
 * @author HP
 */
public class AdapterDemo extends Applet{
    public void init(){
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));
    }
}
class MyMouseAdapter extends MouseAdapter{
    AdapterDemo adapterDemo;
    public MyMouseAdapter(AdapterDemo adapterDemo){
        this.adapterDemo = adapterDemo;
    }
    
    public void mouseClicked(MouseEvent me){
        adapterDemo.showStatus("Mouse Clicked");
    }
}

class MyMouseMotionAdapter extends MouseAdapter{
     AdapterDemo adapterDemo;
    public  MyMouseMotionAdapter(AdapterDemo adapterDemo){
        this.adapterDemo = adapterDemo;
    }
    
    public void mouseClicked(MouseEvent me){
        adapterDemo.showStatus("Mouse Clicked");
    }
}
