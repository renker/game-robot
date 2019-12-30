package com.renker.game;

import java.awt.AWTException;

import com.renker.game.robot.GameRobot;
import com.renker.game.script.ActivityScript;

public class ScriptTest {
	public static void main(String[] args) throws AWTException {
		
		GameRobot robot = new GameRobot();
		long startTime = System.currentTimeMillis();
		ActivityScript ac = new ActivityScript(robot);
	}
}
