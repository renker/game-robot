package com.renker.game.robot;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.renker.game.compare.model.Point;
import com.renker.game.exception.ScriptException;

public class EventRobot extends AbstractRobot{
	
	private Logger log = LoggerFactory.getLogger(EventRobot.class);

	public EventRobot() throws AWTException {
		super();
	}
	
	/**
	   * 鼠标左键单击
	 */
	public void mouseLeftClick(){
		super.mousePress(KeyEvent.BUTTON1_MASK);
		super.mouseRelease(KeyEvent.BUTTON1_MASK);
	}
	
	public void mouseLeftDoubleClick() {
		mouseLeftClick();
		mouseLeftClick();
	}
	
	/**
	   * 鼠标右键单击
	 */
	public void mouseRightClick() {
		super.mousePress(KeyEvent.BUTTON3_MASK);
		super.mouseRelease(KeyEvent.BUTTON3_MASK);
	}
	
	public void mouseRightDoubleClick() {
		mouseRightClick();
		mouseRightClick();
	}
	
	public void F1() {
		super.keyPress(KeyEvent.VK_F1);
		super.keyRelease(KeyEvent.VK_F1);
	}
	
	public void F2() {
		super.keyPress(KeyEvent.VK_F2);
		super.keyRelease(KeyEvent.VK_F2);
	}
	
	public void F3() {
		super.keyPress(KeyEvent.VK_F3);
		super.keyRelease(KeyEvent.VK_F3);
	}
	
	public void F4() {
		super.keyPress(KeyEvent.VK_F4);
		super.keyRelease(KeyEvent.VK_F4);
	}
	
	public void F5() {
		super.keyPress(KeyEvent.VK_F5);
		super.keyRelease(KeyEvent.VK_F5);
	}
	
	public void F6() {
		super.keyPress(KeyEvent.VK_F6);
		super.keyRelease(KeyEvent.VK_F6);
	}
	
	public void F7() {
		super.keyPress(KeyEvent.VK_F7);
		super.keyRelease(KeyEvent.VK_F7);
	}
	
	public void F8() {
		super.keyPress(KeyEvent.VK_F8);
		super.keyRelease(KeyEvent.VK_F8);
	}
	
	public void F9() {
		super.keyPress(KeyEvent.VK_F9);
		super.keyRelease(KeyEvent.VK_F9);
	}
	
	public void tab() {
		super.keyPress(KeyEvent.VK_TAB);
		super.keyRelease(KeyEvent.VK_TAB);
	}
	
	public void mouseMove(Point point){
		if(point== null) {
			throw new ScriptException("未找到坐标");
		}
		Point center = point.center();
		log.debug("指针移动至 x="+center.getX() + ", y="+center.getY());
		this.mouseMove(center.getX(), center.getY());
	}
	
}
