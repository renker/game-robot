package com.renker.game.robot.script;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.springframework.util.ResourceUtils;

import com.renker.game.SpringHolder;
import com.renker.game.compare.ComparePicture;
import com.renker.game.compare.model.Point;
import com.renker.game.exception.ScriptException;
import com.renker.game.robot.EventRobot;

public abstract class AbstractScript extends EventRobot implements Script{
	
	/** 源点 */
	protected Point origin;
	/** 任务点 */
	protected Point task;
	
	public AbstractScript() throws AWTException {
		super();
		origin = searchPoint(SpringHolder.config().getOrigin());
		task = searchPoint(SpringHolder.config().getTask());
	}
	
	public abstract void run();
	
	public BufferedImage image(String pathname){
		try {
			File file = ResourceUtils.getFile(pathname);
			return ImageIO.read(file);
		} catch (Exception e) {
			throw new ScriptException("找不到文件 "+pathname,e);
		}
		
	}

//	/** 在屏幕寻找源点 */
//	public Point originPoing(int index){
//		int withd = Toolkit.getDefaultToolkit().getScreenSize().width;
//		int height = Toolkit.getDefaultToolkit().getScreenSize().height;
//		Rectangle rect = new Rectangle(0, 0, withd, height);
//		BufferedImage screen = this.createScreenCapture(rect);
//		
//		ComparePicture cp = new ComparePicture();
//		Point point = cp.matching(screen, image(SpringHolder.config().getOrigin()));
//		if(point != null){
//			origin = point;
//			return point;
//		} else {
//			throw new ScriptException("找不到源点，请检查");
//		}
//	}
	
	public Point searchPoint(String pathname){
		int withd = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		Rectangle rect = new Rectangle(0, 0, withd, height);
		BufferedImage screen = this.createScreenCapture(rect);
		
		ComparePicture cp = new ComparePicture();
		Point point = cp.matching(screen, image(pathname));
		if(point != null){
			return point;
		} else {
			throw new ScriptException("找不到源点，请检查");
		}
	}
}
