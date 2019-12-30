package com.renker.game;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.renker.game.compare.ComparePicture;
import com.renker.game.compare.Point;

public class GameRobot extends Robot{
	
	public GameRobot() throws AWTException {
		super();
	}
	
	public BufferedImage windows(){
		int withd = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		Rectangle rect = new Rectangle(0, 0, withd, height);
		BufferedImage screenImage = this.createScreenCapture(rect);
		
		try {
			File file = new File("D:/screenImage/test.png");
			if(!file.getParentFile().exists()){
				file.getParentFile().mkdirs();
			}
			ImageIO.write(screenImage, "png", file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return screenImage;
	}
	
	public Point findPoint(String partPath){
		ComparePicture cp = new ComparePicture();
		try {
			return cp.matchingPartAtPosition(windows(), ImageIO.read(new File(partPath)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public void leftClick(){
		this.mousePress(KeyEvent.BUTTON1_MASK);
		this.mouseRelease(KeyEvent.BUTTON1_MASK);
	}
	
	public void rightClick(){
		this.mousePress(KeyEvent.BUTTON3_MASK);
		this.mouseRelease(KeyEvent.BUTTON3_MASK);
	}
	
	public void leftDoubleClick(){
		this.mousePress(KeyEvent.BUTTON1_MASK);
		this.mouseRelease(KeyEvent.BUTTON1_MASK);
		this.delay(100);
		this.mousePress(KeyEvent.BUTTON1_MASK);
		this.mouseRelease(KeyEvent.BUTTON1_MASK);
	}
	
	public void rightDoubleClick(){
		this.mousePress(KeyEvent.BUTTON3_MASK);
		this.mousePress(KeyEvent.BUTTON3_MASK);
		this.delay(100);
		this.mouseRelease(KeyEvent.BUTTON3_MASK);
		this.mouseRelease(KeyEvent.BUTTON3_MASK);
	}
	
	
	public void mouseMove(Point point){
		Point center = point.center();
		this.mouseMove(center.getX(), center.getY());
	}
}	
