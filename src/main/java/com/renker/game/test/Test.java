package com.renker.game.test;

import com.renker.game.compare.model.Point;
import com.renker.game.robot.GameRobot;

public class Test {
	public static void main(String[] args){
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
			
			// ===================================
			Point p2 = robot.findPoint("D:/screenImage/part2.png");
			robot.mouseMove(p2);
			Thread.sleep(1000);
			
			robot.mouseLeftClick();
			Thread.sleep(3000);
			robot.mouseLeftClick();
			
			
			
			System.out.println(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
