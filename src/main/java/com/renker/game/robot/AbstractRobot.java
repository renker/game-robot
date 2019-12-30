package com.renker.game.robot;

import java.awt.AWTException;
import java.awt.Robot;

import com.renker.game.utils.RandomUtils;

public class AbstractRobot extends Robot{

	public AbstractRobot() throws AWTException {
		super();
	}
	
	@Override
	public synchronized void mousePress(int buttons) {
		super.mousePress(buttons);
		this.delay(RandomUtils.delay());
	}
	
	@Override
	public synchronized void mouseRelease(int buttons) {
		super.mouseRelease(buttons);
		this.delay(RandomUtils.delay());
	}
	
	@Override
	public synchronized void keyPress(int keycode) {
		super.keyPress(keycode);
		this.delay(RandomUtils.delay());
	}
	
	@Override
	public synchronized void keyRelease(int keycode) {
		super.keyPress(keycode);
		this.delay(RandomUtils.delay());
	}
	
	@Override
	public synchronized void mouseMove(int x, int y) {
		this.delay(RandomUtils.mouseMoveDelay());
		super.mouseMove(x, y);
	}
	
}
