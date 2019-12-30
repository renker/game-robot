package com.renker.game.test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test1 {
	public static void main(String[] args) {  
        JFrame frame = new JFrame();  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setUndecorated(true);  
        frame.setBounds(500, 500, 300, 300);  
//        AWTUtilities.setWindowOpaque(frame, false);  
  
        JPanel pane = new JPanel() {  
  
            @Override  
            public void paint(Graphics g) {  
                super.paint(g);  
  
                g.setColor(Color.red);  
                g.fill3DRect(10, 10, 100, 100, true);  
            }  
        };  
        frame.addMouseMotionListener(new MouseAdapter() {
        	private Point lastPoint = null;  
      
            @Override  
            public void mouseDragged(MouseEvent e) {  
            	if(lastPoint == null) {
            		lastPoint = e.getLocationOnScreen();
            	}
                Point point = e.getLocationOnScreen();  
                int offsetX = point.x - lastPoint.x;  
                int offsetY = point.y - lastPoint.y;  
                Rectangle bounds = frame.getBounds();
                bounds.x += offsetX;  
                bounds.y += offsetY;  
                frame.setBounds(bounds);  
                lastPoint = point;  
            }  
		});
  
        frame.setContentPane(pane);  
  
        frame.setVisible(true);  
    }  
}
