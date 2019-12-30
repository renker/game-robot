//package com.renker.game.test;
//
//import java.awt.Point;
//import java.awt.Rectangle;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//public class MoveWindowListener   extends MouseAdapter{
//
//	private Point lastPoint = null;  
//	  
//    @Override  
//    public void mousePressed(MouseEvent e) {  
//        lastPoint = e.getLocationOnScreen();  
//    }  
//
//    @Override  
//    public void mouseDragged(MouseEvent e) {  
//        Point point = e.getLocationOnScreen();  
//        int offsetX = point.x - lastPoint.x;  
//        int offsetY = point.y - lastPoint.y;  
//        Rectangle bounds = FreeLoginUI.this.getBounds();  
//        bounds.x += offsetX;  
//        bounds.y += offsetY;  
//        FreeLoginUI.this.setBounds(bounds);  
//        lastPoint = point;  
//    }  
//}
