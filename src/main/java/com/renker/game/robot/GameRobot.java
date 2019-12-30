package com.renker.game.robot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.renker.game.compare.ComparePicture;
import com.renker.game.compare.Point;

public class GameRobot extends EventRobot{
	
	public GameRobot() throws AWTException {
		super();
	}
	
	/**
	 * 截图
	 * @return
	 */
	public BufferedImage printscreen(){
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
	
	/**
	 * 寻找点
	 * @param partPath
	 * @return
	 */
	public Point findPoint(String partPath){
		ComparePicture cp = new ComparePicture();
		try {
			return cp.matchingPartAtPosition(printscreen(), ImageIO.read(new File(partPath)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}	
