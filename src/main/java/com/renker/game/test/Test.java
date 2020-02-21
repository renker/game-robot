package com.renker.game.test;

import com.renker.game.compare.model.Point;
import com.renker.game.robot.GameRobot;

public class Test {
	public static void main(String[] args){
		int [][] position = {{200,250},{600,240},{190,420},{630,490}};
		try {
			GameRobot robot = new GameRobot();
			long startTime = System.currentTimeMillis();
//			Point p = robot.findPoint("D:/screenImage/part5.png");
//			System.out.println("消耗时长："+(System.currentTimeMillis()-startTime));
//			robot.mouseMove(p);
			Thread.sleep(1000);		
			
//			robot.mouseLeftClick();
//			Thread.sleep(200);
//			robot.mouseLeftClick();
//			
			while (true) {
				for (int i = 0; i < 4; i++) {
					robot.mouseMove(position[i][0],position[i][1]);
					robot.mouseLeftClick();
					Thread.sleep(60000);
				}
			}
			
			
//			// ===================================
//			Point p2 = robot.findPoint("D:/screenImage/part2.png");
//			robot.mouseMove(p2);
//			Thread.sleep(1000);
//			
//			robot.mouseLeftClick();
//			Thread.sleep(3000);
//			robot.mouseLeftClick();
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
