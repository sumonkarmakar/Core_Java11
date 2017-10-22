// Demonstrate BorderLayout
package com.awtcontrol;

import java.applet.*;
import java.awt.*;

/**
 * @author HP
 *
 */
public class BorderLayoutDemo extends Applet {
	public void init() {
		setLayout(new BorderLayout());
		add(new Button("This is across the top."),BorderLayout.NORTH);
		add(new Button("The footer message might go here."),BorderLayout.SOUTH);
		add(new Button("Right."),BorderLayout.EAST);
		add(new Button("Left."),BorderLayout.WEST);
		
		String msg = "The reasonable man adapts " +
					"himself to the world;\n "+
				  "the unreasonable one persists in " +
				  "trying to adapt the world to himself.\n " +
				  "Therefore all progress depends " +
				  "on the unreasonable man.\n\n"+
				  "      -George Bernard Shaw\n\n";
		add(new TextArea(msg),BorderLayout.CENTER);
	}
}
