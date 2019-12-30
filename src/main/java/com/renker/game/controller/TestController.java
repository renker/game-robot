package com.renker.game.controller;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renker.game.GameRobot;
import com.renker.game.compare.Point;

@RestController
public class TestController {
	@RequestMapping("click")
	public String click(){
		try {
			GameRobot robot = new GameRobot();
			long startTime = System.currentTimeMillis();
			Point p2 = robot.findPoint("D:/screenImage/part2.png");
			System.out.println("消耗时长："+(System.currentTimeMillis()-startTime));
			robot.mouseMove(p2);
			Thread.sleep(1000);
			Robot rb = new Robot();
			rb.setAutoDelay(200);
			rb.setAutoWaitForIdle(true);
			rb.keyPress(KeyEvent.BUTTON1_MASK);
			rb.keyRelease(KeyEvent.BUTTON1_MASK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "success";
	}
}
