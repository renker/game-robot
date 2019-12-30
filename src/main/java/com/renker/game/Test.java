package com.renker.game;

import com.renker.game.compare.Point;

public class Test {
	public static void main(String[] args){
		try {
			GameRobot robot = new GameRobot();
			long startTime = System.currentTimeMillis();
			Point p2 = robot.findPoint("D:/screenImage/part2.png");
			Point g2 = robot.findPoint("D:/screenImage/game2.png");
			System.out.println("消耗时长："+(System.currentTimeMillis()-startTime));
			robot.mouseMove(g2);
			Thread.sleep(1000);
			
			//robot.leftDoubleClick();
			robot.leftClick();
			
			robot.delay(200);
			
			robot.rightClick();
			
//			Robot rb = new Robot();
//			rb.mousePress(KeyEvent.BUTTON1_MASK);
//			rb.mousePress(KeyEvent.BUTTON1_MASK);
//			rb.delay(100);
//			rb.mousePress(KeyEvent.BUTTON1_MASK);
//			rb.mousePress(KeyEvent.BUTTON1_MASK);
			
			System.out.println(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
