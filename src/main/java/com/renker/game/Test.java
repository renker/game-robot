package com.renker.game;

import com.renker.game.compare.Point;
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
			
			robot.mouseLeftDoubleClick();
			
			
			System.out.println(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
