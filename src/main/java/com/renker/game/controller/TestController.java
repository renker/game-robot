package com.renker.game.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renker.game.compare.Point;
import com.renker.game.robot.GameRobot;

@RestController
public class TestController {
	@RequestMapping("test")
	public String test() {
		try {
			GameRobot robot = new GameRobot();
			long startTime = System.currentTimeMillis();
			Point p = robot.findPoint("D:/screenImage/part.png");
			System.out.println("消耗时长："+(System.currentTimeMillis()-startTime));
			robot.mouseMove(p);
			Thread.sleep(1000);
			
			robot.mouseLeftClick();
			Thread.sleep(200);
			robot.mouseLeftClick();
			
			Thread.sleep(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "success";
	}
}
